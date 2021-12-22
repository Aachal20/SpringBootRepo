package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("empDAO")
public class EmployeeDAO {
	private static final String GET_EMP_COUNT="SELECT COUNT(*) FROM EMP";
	//HAS -A Property
	@Autowired
	DataSource ds;
	
	//method with persistence logic
	public int getEmpsCount()throws Exception{
		System.out.println("Injected datasource object class name:::"+ds.getClass());
		//get pooled jdbc connection object
		Connection con=ds.getConnection();
		//create PreparedStatemet obj having sql query
		PreparedStatement ps =con.prepareStatement(GET_EMP_COUNT);
		//EXECUTE the query
		ResultSet rs = ps.executeQuery();
		//process the resultset
		int count=0;
		if(rs.next()) 
			count=rs.getInt(1);
		//close jdbc object
		 rs.close();
		 ps.close();
		 con.close();
		 return count;
	}//method

}//class


