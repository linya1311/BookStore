package org.action;

import org.DAO.memberDAO;
import org.model.member;

import com.opensymphony.xwork2.ActionSupport;

public class memberAction extends ActionSupport {
	
	//抓join_2.jsp的資料
	private String user_id;
	private String user_password;
	private String user_email;
		
	public String execute() throws Exception{
	
		String a=memberDAO.checkId(user_id,user_email);
		
		
		if(a.equals("ab")){
			return ERROR;
		}else if(a.equals("ab2")){
			return "ID_error";
		}
		else if(a.equals("a2b")){
			return "EMAIL_error";
		}
		else if(a.equals("a2b2")) {
			return SUCCESS;
		}
		return null;
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

	public static void main(String[] a) {
		
	}
}
