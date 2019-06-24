package org.DBconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Conn {
	//hi 用的連線方式
	public static Session getSession() {
		Configuration c=new Configuration().configure(); //���cfg.xml
		SessionFactory sf=c.buildSessionFactory(); //���hbm.xml

		Session s=sf.openSession();
		
		return s; 	
	}
	
	//JDBC的連線方式
	public static Connection getConn()
	{
		String url="jdbc:mysql://localhost:3306/book";
		String user="root";
		String password="11111";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection(url,user,password);			
			System.out.println("連線正常");
			
			return conn;
		} catch (ClassNotFoundException e) {
			System.out.println("no driver");
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
			System.out.println("Conn.java有問題");
			e.printStackTrace();
			return null;
		}
	}	
	
	public static void main(String[] args) {
		System.out.println(Conn.getSession());
	}

	
	
}