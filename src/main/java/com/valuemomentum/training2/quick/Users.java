package com.valuemomentum.training2.quick;

public class Users {
	
	private int uid;
	private String username;
	private String password;
	private String type;
	public Users() {
		
	}
	public Users(int uid, String username, String password, String type) {
		super();
		this.uid = uid;
		this.username = username;
		this.password = password;
		this.type = type;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	

}
