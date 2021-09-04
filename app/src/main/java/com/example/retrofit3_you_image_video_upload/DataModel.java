package com.example.retrofit3_you_image_video_upload;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


public class DataModel implements Serializable {

	@SerializedName("id")
	private String id;

	@SerializedName("deletehash")
	private String deletehash;

	@SerializedName("account_id")
	private Object accountId;

	@SerializedName("account_url")
	private Object accountUrl;

	@SerializedName("ad_type")
	private Object adType;

	@SerializedName("ad_url")
	private Object adUrl;

	@SerializedName("title")
	private Object title;

	@SerializedName("description")
	private Object description;

	@SerializedName("name")
	private String name;

	@SerializedName("type")
	private String type;

	@SerializedName("width")
	private int width;

	@SerializedName("height")
	private int height;

	@SerializedName("size")
	private int size;

	@SerializedName("views")
	private int views;

	@SerializedName("section")
	private Object section;

	@SerializedName("vote")
	private Object vote;

	@SerializedName("bandwidth")
	private int bandwidth;

	@SerializedName("animated")
	private boolean animated;

	@SerializedName("favorite")
	private boolean favorite;

	@SerializedName("in_gallery")
	private boolean inGallery;

	@SerializedName("in_most_viral")
	private boolean inMostViral;

	@SerializedName("has_sound")
	private boolean hasSound;

	@SerializedName("is_ad")
	private boolean isAd;

	@SerializedName("nsfw")
	private Object nsfw;

	@SerializedName("link")
	private String link;

	@SerializedName("tags")
	private List<Object> tags;

	@SerializedName("mp4_size")
	private int mp4Size;

	@SerializedName("processing")
	private ProcessingModel processing;

	@SerializedName("datetime")
	private int datetime;

	@SerializedName("mp4")
	private String mp4;

	@SerializedName("hls")
	private String hls;

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setDeletehash(String deletehash){
		this.deletehash = deletehash;
	}

	public String getDeletehash(){
		return deletehash;
	}

	public void setAccountId(Object accountId){
		this.accountId = accountId;
	}

	public Object getAccountId(){
		return accountId;
	}

	public void setAccountUrl(Object accountUrl){
		this.accountUrl = accountUrl;
	}

	public Object getAccountUrl(){
		return accountUrl;
	}

	public void setAdType(Object adType){
		this.adType = adType;
	}

	public Object getAdType(){
		return adType;
	}

	public void setAdUrl(Object adUrl){
		this.adUrl = adUrl;
	}

	public Object getAdUrl(){
		return adUrl;
	}

	public void setTitle(Object title){
		this.title = title;
	}

	public Object getTitle(){
		return title;
	}

	public void setDescription(Object description){
		this.description = description;
	}

	public Object getDescription(){
		return description;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setWidth(int width){
		this.width = width;
	}

	public int getWidth(){
		return width;
	}

	public void setHeight(int height){
		this.height = height;
	}

	public int getHeight(){
		return height;
	}

	public void setSize(int size){
		this.size = size;
	}

	public int getSize(){
		return size;
	}

	public void setViews(int views){
		this.views = views;
	}

	public int getViews(){
		return views;
	}

	public void setSection(Object section){
		this.section = section;
	}

	public Object getSection(){
		return section;
	}

	public void setVote(Object vote){
		this.vote = vote;
	}

	public Object getVote(){
		return vote;
	}

	public void setBandwidth(int bandwidth){
		this.bandwidth = bandwidth;
	}

	public int getBandwidth(){
		return bandwidth;
	}

	public void setAnimated(boolean animated){
		this.animated = animated;
	}

	public boolean isAnimated(){
		return animated;
	}

	public void setFavorite(boolean favorite){
		this.favorite = favorite;
	}

	public boolean isFavorite(){
		return favorite;
	}

	public void setInGallery(boolean inGallery){
		this.inGallery = inGallery;
	}

	public boolean isInGallery(){
		return inGallery;
	}

	public void setInMostViral(boolean inMostViral){
		this.inMostViral = inMostViral;
	}

	public boolean isInMostViral(){
		return inMostViral;
	}

	public void setHasSound(boolean hasSound){
		this.hasSound = hasSound;
	}

	public boolean isHasSound(){
		return hasSound;
	}

	public void setIsAd(boolean isAd){
		this.isAd = isAd;
	}

	public boolean isIsAd(){
		return isAd;
	}

	public void setNsfw(Object nsfw){
		this.nsfw = nsfw;
	}

	public Object getNsfw(){
		return nsfw;
	}

	public void setLink(String link){
		this.link = link;
	}

	public String getLink(){
		return link;
	}

	public void setTags(List<Object> tags){
		this.tags = tags;
	}

	public List<Object> getTags(){
		return tags;
	}

	public void setMp4Size(int mp4Size){
		this.mp4Size = mp4Size;
	}

	public int getMp4Size(){
		return mp4Size;
	}

	public void setProcessing(ProcessingModel processing){
		this.processing = processing;
	}

	public ProcessingModel getProcessing(){
		return processing;
	}

	public void setDatetime(int datetime){
		this.datetime = datetime;
	}

	public int getDatetime(){
		return datetime;
	}

	public void setMp4(String mp4){
		this.mp4 = mp4;
	}

	public String getMp4(){
		return mp4;
	}

	public void setHls(String hls){
		this.hls = hls;
	}

	public String getHls(){
		return hls;
	}

	@Override
 	public String toString(){
		return 
			"DataModel{" + 
			"id = '" + id + '\'' + 
			",deletehash = '" + deletehash + '\'' + 
			",account_id = '" + accountId + '\'' + 
			",account_url = '" + accountUrl + '\'' + 
			",ad_type = '" + adType + '\'' + 
			",ad_url = '" + adUrl + '\'' + 
			",title = '" + title + '\'' + 
			",description = '" + description + '\'' + 
			",name = '" + name + '\'' + 
			",type = '" + type + '\'' + 
			",width = '" + width + '\'' + 
			",height = '" + height + '\'' + 
			",size = '" + size + '\'' + 
			",views = '" + views + '\'' + 
			",section = '" + section + '\'' + 
			",vote = '" + vote + '\'' + 
			",bandwidth = '" + bandwidth + '\'' + 
			",animated = '" + animated + '\'' + 
			",favorite = '" + favorite + '\'' + 
			",in_gallery = '" + inGallery + '\'' + 
			",in_most_viral = '" + inMostViral + '\'' + 
			",has_sound = '" + hasSound + '\'' + 
			",is_ad = '" + isAd + '\'' + 
			",nsfw = '" + nsfw + '\'' + 
			",link = '" + link + '\'' + 
			",tags = '" + tags + '\'' + 
			",mp4_size = '" + mp4Size + '\'' + 
			",processing = '" + processing + '\'' + 
			",datetime = '" + datetime + '\'' + 
			",mp4 = '" + mp4 + '\'' + 
			",hls = '" + hls + '\'' + 
			"}";
		}
}