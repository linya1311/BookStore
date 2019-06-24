package org.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.DBconn.Conn;

import org.model.member;

public class loginDAO {
	
	public static member checkID(String id,String password) {
		Connection conn=Conn.getConn();
		
		String sql1="select * from member where user_id=? and user_password=?";
		String sql2="select * from member where user_email=? and user_password=?";
		String sql3;
		
		String a="user_id";
		String b="user_email";
		String c;
		if( id.indexOf("@") > -1) {
			sql3=sql2;
			c=b;
		} else { 
			sql3=sql1;
			c=a;
		}
		
		try {
			
			PreparedStatement ps=conn.prepareStatement(sql3);
			ps.setString(1, id);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				if(rs.getString(c).equals(id) && rs.getString("user_password").equals(password))
				{
					member m=new member();
				
				//rs.getString("name") rs.getString("password")資料庫的資料
				//※要核對table名字
				
				if(c.equals(a))
					m.setUser_id(rs.getString("user_id"));
				else if(c.equals(b))
					m.setUser_email(rs.getString("user_email"));
				
				
				m.setUser_password(rs.getString("user_password"));
				
				return m;
				}
				return null;
			}
			else {
				return null;
			}
		} catch (SQLException e) {
			System.out.println("loginDAO有問題");
			return null;
		}
		
	}
	
	public static void main(String []args) {
		
		//資料庫有找到資料才會傳"member的資料"，
		//System.out.println(loginDAO.checkID("asdasd", "asdasdasd"));
		
	}
}
