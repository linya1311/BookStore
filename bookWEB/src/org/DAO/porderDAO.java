package org.DAO;

import org.DBconn.Conn;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.porder;

public class porderDAO {

	//新增訂單
	public static void add(porder p) {
		Session s=Conn.getSession(); //連線
		
		Transaction t=s.beginTransaction(); //交易開始
		
		s.save(p); //放入資料
		
		t.commit(); //離開 (儲存)
		
		
	}
	public static void main(String[] args) {
		porder p=new porder("玲玲","A",5);
		porderDAO.add(p);

	}

}
