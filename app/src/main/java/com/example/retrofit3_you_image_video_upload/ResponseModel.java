package com.example.retrofit3_you_image_video_upload;


import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


public class ResponseModel implements Serializable {

	@SerializedName("status")
	private int status;

	@SerializedName("success")
	private boolean success;

	@SerializedName("data")
	private DataModel data;

	public void setStatus(int status){
		this.status = status;
	}

	public int getStatus(){
		return status;
	}

	public void setSuccess(boolean success){
		this.success = success;
	}

	public boolean isSuccess(){
		return success;
	}

	public void setData(DataModel data){
		this.data = data;
	}

	public DataModel getData(){
		return data;
	}

	@Override
 	public String toString(){
		return 
			"ResponseModel{" + 
			"status = '" + status + '\'' + 
			",success = '" + success + '\'' + 
			",data = '" + data + '\'' + 
			"}";
		}
}