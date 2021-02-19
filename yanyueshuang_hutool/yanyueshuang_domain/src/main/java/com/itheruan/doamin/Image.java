package com.itheruan.doamin;


public class Image{
	
	
	private Integer imgaeid;
	private String imagename;
	private Integer imageuserid;
	private User user;
	private boolean flaguser;//是否属于当前登录的用户
	
	public Integer getImgaeid() {
		return imgaeid;
	}
	public void setImgaeid(Integer imgaeid) {
		this.imgaeid = imgaeid;
	}
	public String getImagename() {
		return imagename;
	}
	public void setImagename(String imagename) { 
		this.imagename = imagename;
	}
	public Integer getImageuserid() {
		return imageuserid;
	}
	public void setImageuserid(Integer imageuserid) {
		this.imageuserid = imageuserid;
	}
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	public boolean isFlaguser() {
		return flaguser;
	}
	public void setFlaguser(boolean flaguser) {
		this.flaguser = flaguser;
	}
	
	@Override
	public String toString() {
		return "Image [imgaeid=" + imgaeid + ", imagename=" + imagename + ", imageuserid=" + imageuserid + ", user="
				+ user + ", flaguser=" + flaguser + "]";
	}
	
	
	
}

