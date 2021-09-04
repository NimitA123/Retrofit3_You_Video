package com.example.retrofit3_you_image_video_upload;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


public class ProcessingModel implements Serializable {

	@SerializedName("status")
	private String status;

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"ProcessingModel{" + 
			"status = '" + status + '\'' + 
			"}";
		}
}