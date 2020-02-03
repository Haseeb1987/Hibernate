package com.hibernate.crud;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery (name="CRUD.getById",  query="from CRUD where userId = ?")
//@NamedNativeQuery (name="CRUD.getByUserName", query="select * from CRUD where userName = ?", resultClass=CRUD.class)
public class CRUD {
	@Id 
	@GeneratedValue
	private int userId;
	private String userName;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
