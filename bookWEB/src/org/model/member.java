package org.model;

public class member {
	private String user_id; //使用者的帳號
	private String user_password; //使用者的密碼
	private String user_email; //使用者的信箱email
	
	
	public member() {}
	
	public member(String id,String password) {
		
		CharSequence a="@";
		if(id.contains(a)) {
			this.user_id=id;
		} else {
			this.user_email=id;
		}
		
		this.user_password=password;
	}

	public member(String id,String password,String email) {
		
		this.user_id=id;
		this.user_password=password;
		this.user_email=email;
	}

	public String getUser_id() {
		return user_id;
	}


	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}


	public String getUser_password() {
		return user_password;
	}


	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}


	public String getUser_email() {
		return user_email;
	}


	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	


	
	
}
