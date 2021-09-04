package com.example.retrofit3_you_image_video_upload;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.VideoView;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private VideoView mtvGallery;
    private Button MBtnOpenGallery;
    private Button mBtnUploadGallery;
    private String imagePath;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        mtvGallery = findViewById(R.id.imageView);
        MBtnOpenGallery = findViewById(R.id.btnGallery);
        mBtnUploadGallery = findViewById(R.id.btnUpload);
        MBtnOpenGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isPermissionGranted()){
                    openGallery();
                }
                else{
                    requestPermission();
                }
            }
        });
        /* 1.*/
        mBtnUploadGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ApiService apiService = Network.getInstance().create(ApiService.class);
                File file = new File(imagePath);
                RequestBody requestBody = RequestBody.create(MediaType.parse("/Video"), file);// here image is representing i am uploading
                // MultipartBody.Part part = MultipartBody.Part.createFormData()
                MultipartBody.Part part  = MultipartBody.Part.createFormData("Video", file.getName(), requestBody);
                apiService.uploadImage(part).enqueue(new Callback<ResponseModel>() {
                    @Override
                    public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                        Toast.makeText(MainActivity.this, "Image SuccessFully Uploaded", Toast.LENGTH_LONG).show();

                    }

                    @Override
                    public void onFailure(Call<ResponseModel> call, Throwable t) {

                    }
                });
            }
        });
    }

    private void requestPermission() {
        String[] permission = new String[]{Manifest.permission.READ_EXTERNAL_STORAGE};
        ActivityCompat.requestPermissions(MainActivity.this,  permission, 100 );
    }

    private void openGallery() {
        /**** to ope some one activity use this code to open camera and gallery****/
        Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
        resultFromGalleryActivity.launch(intent); // open gallery activity
        //   startActivityForResult(intent);
    }
    /**** open the gallery and capture the result .Result is nothing but a selected images***/



private ActivityResultLauncher<Intent> resultFromGalleryActivity = registerForActivityResult(
        new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
@Override
public void onActivityResult(ActivityResult result) {
        if (result.getData() != null) {
        Uri selectedVideoUrl = result.getData().getData();
        Log.d("Dipu", selectedVideoUrl.toString());
        mtvGallery.setVideoURI(selectedVideoUrl);
        mtvGallery.requestFocus();
        mtvGallery.start();
        getPathFromUri(selectedVideoUrl);
        }
        }
        }
        );
    /* Get actual path of the image from the selected URI Ex path = data/wdejdendjed/dxcde93*/



    private Cursor getPathFromUri(Uri SelectedImageUri) {
        String[] filePath = {MediaStore.Video.Media.DATA};

        Cursor c = getContentResolver().query(SelectedImageUri, filePath,
                null, null, null);
        c.moveToFirst();
        int columnIndex = c.getColumnIndex(filePath[0]);
        imagePath = c.getString(columnIndex);
        return c;
    }

    private boolean isPermissionGranted(){
        return ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.READ_EXTERNAL_STORAGE)== PackageManager.PERMISSION_GRANTED;
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        /**** to handle permission****/
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(grantResults[0]== PackageManager.PERMISSION_GRANTED){
            openGallery();
        }
        else{
            Toast.makeText(MainActivity.this, "Permission denied", Toast.LENGTH_LONG).show();
        }
    }

}