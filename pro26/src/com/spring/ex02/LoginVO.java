package com.spring.ex02;

public class LoginVO {
	private String userID;
	private String userName;
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public LoginVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginVO(String userID, String userName) {
		super();
		this.userID = userID;
		this.userName = userName;
	}
	
	
}
