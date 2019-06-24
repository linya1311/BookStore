package org.DAO;

import java.util.List;

import org.DBconn.Conn;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import org.model.member;

public class memberDAO {

	//新增會員
	public static void add(String id,String password,String email) {
		
		member m=new member(id,password,email);
		
		Session s=Conn.getSession(); //連線
		
		Transaction t=s.beginTransaction(); //交易開始
		
		s.save(m); //放入資料
		
		t.commit(); //離開 (儲存)
	}
	
	
	//確認帳號 信箱
	public static String checkId(String name,String email)
	{
		Session se=Conn.getSession();
			
		String sql1="select * from member where user_id='"+name+"'";
		String sql2="select * from member where user_email='"+email+"'";
				
		SQLQuery q=se.createSQLQuery(sql1);
		SQLQuery q2=se.createSQLQuery(sql2);
		q.addEntity("m", member.class);
		q2.addEntity("m", member.class);
		
		List li=q.list();  //這是id
		List li2=q2.list(); //這是email
		
		String a="";
		String b="";
		if(li.size()!=0)
			a="a";  //資料庫有同樣id
		else
			a="a2"; //資料庫沒有同樣id 
		
		
		if(li2.size()!=0)
			b="b";  //資料庫有同樣email
		else
			b="b2"; //資料庫沒有同樣email
		
		return a+b;
		}
	

	//確認帳號
	public static boolean checkId(String name)
	{
		Session se=Conn.getSession();
			
		String sql1="select * from member where user_id='"+name+"'";
		String sql2="select * from member where user_email='"+name+"'";
		String sql3;


		if( name.indexOf("@") > -1)
			sql3=sql2;
		else
			sql3=sql1;		
		
		
		SQLQuery q=se.createSQLQuery(sql3);
			
		q.addEntity("m", member.class);
		
		List li=q.list();
			
		boolean b;

		if(li.size()!=0)
		{
			b=true;
		}
		else
		{
			b=false;
		}
		return b;
		}
	
	public static void main(String[] args) {
		//測試資料是否能成功放入資料庫 (帳號,密碼,信箱)
		//memberDAO.add("aa","1234","aa@yahoo.com");
		
		//確認資料庫是否有 同名的帳號或信箱
		System.out.println(memberDAO.checkId("asdasd","as@asd"));

	}

}
