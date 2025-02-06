package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.example.model.Student;
@Repository
public class Database 
{
	public Student Student(Student student) throws ClassNotFoundException, SQLException
	{
		String sql="insert into tony values(?,?,?,?)";
		String url="jdbc:mysql://localhost:3306/bus";
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection con=DriverManager.getConnection(url,"root","Bhargav@2001");
    	PreparedStatement pst=con.prepareStatement(sql);
    	pst.setInt(1, student.getId());
    	pst.setString(2, student.getName());
    	pst.setString(3, student.getEmail());
    	pst.setString(4, student.getAddress());
    	int row=pst.executeUpdate();
    	System.out.println(row+"row inserted successfully");
    	return student;
    	
	}
}
