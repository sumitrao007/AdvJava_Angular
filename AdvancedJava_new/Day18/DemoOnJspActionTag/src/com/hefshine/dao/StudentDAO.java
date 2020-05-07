package com.hefshine.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.hefshine.bean.Student;
import com.hefshine.bean.User;

public class StudentDAO {
	
	private String DB_URL = "jdbc:mysql://localhost:3306/studentdb";
	private String USERNAME = "root";
	private String PASSWORD = "";
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	
	public void OpenDb() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);

			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public boolean CheckUser(User u) {
		boolean status=false;
		OpenDb();
		String query="select * from user where username=? and password=?";
		
		
		try {
			pst = con.prepareStatement(query);
			pst.setString(1, u.getUsername());
			pst.setString(2, u.getPassword());
			 rs= pst.executeQuery();
			
			while(rs.next()) {
				status=true;
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			CloseDB();
		}
		
		
		
		return status;
		
	}
	
	public List<Student> getAllStudent(){
		List<Student> arrayList=new ArrayList<Student>();
		Student s=null;
		String query="select * from student";
		OpenDb();
		
		try {
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rs= pst.executeQuery();
			
			while(rs.next()) {
				s=new Student();
				s.setRollnumber(rs.getInt("roll_number"));
				s.setFirstname(rs.getString("first_name"));
				s.setLastname(rs.getString("last_name"));
				arrayList.add(s);
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			CloseDB();
		}
		
		
		return arrayList;		
		
	}
	
	public void CloseDB() {
		try {
			if(con!=null) {
				con.close();
				con=null;
			}
			if(pst!=null) {
				pst.close();
				pst=null;
			}
			if(rs!=null) {
				rs.close();
				rs=null;
			}
		}catch (Exception e) {
		e.printStackTrace();
		}
	}


}
