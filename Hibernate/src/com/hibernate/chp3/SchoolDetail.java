package com.hibernate.chp3;

import javax.persistence.Embeddable;

@Embeddable
public class SchoolDetail {

	private String schoolAddress;
	private boolean isPublicShool;
	private int studneCount;
	
	public String getSchoolAddress() {
		return schoolAddress;
	}
	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}
	public boolean isPublicShool() {
		return isPublicShool;
	}
	public void setPublicShool(boolean isPublicShool) {
		this.isPublicShool = isPublicShool;
	}
	public int getStudneCount() {
		return studneCount;
	}
	public void setStudneCount(int studneCount) {
		this.studneCount = studneCount;
	}
	
	
}
