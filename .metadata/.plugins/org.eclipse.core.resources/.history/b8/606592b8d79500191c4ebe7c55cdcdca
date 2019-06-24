package org.action;

import org.DAO.loginDAO;
import org.model.member;

import com.opensymphony.xwork2.ActionSupport;

public class loginAction extends ActionSupport{

	//抓login.jsp的資料
	private String user_id;
	private String user_password;
	
	public String execute() throws Exception{
		//new loginDAO
		loginDAO DAO=new loginDAO();
		
		//將jsp的資料 丟給DAO.checkID核對，並將結果 丟給member
		member m=DAO.checkID(user_id, user_password);
		
		System.out.println(m);
		//如果"資料庫"有帳號密碼(null) 回傳success
		if(m != null)
		{
			return SUCCESS;
		}
		
		else
		{
			return ERROR;
		}
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

	public static void main(String[] args) {
	

	}

}
