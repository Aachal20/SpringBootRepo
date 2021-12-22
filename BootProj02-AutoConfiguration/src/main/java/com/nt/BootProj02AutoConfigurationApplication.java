package com.nt;

import java.beans.PropertyVetoException;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.nt.dao.EmployeeDAO;

@SpringBootApplication
public class BootProj02AutoConfigurationApplication {
  
	//working with datasource c3p0 object
	@Bean
	 public DataSource createDs() throws Exception {
		ComboPooledDataSource cds = new ComboPooledDataSource();
		cds.setDriverClass("oracle.jdbc.driver.OracleDriver");
		cds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
		cds.setUser("system");
		cds.setPassword("manager");
		return cds;
		 
	 }
	public static void main(String[] args) throws Exception {
		//get IOC Container
		ApplicationContext ctx =SpringApplication.run(BootProj02AutoConfigurationApplication.class, args);
	   //get DAO class obj ref
		EmployeeDAO dao =ctx.getBean("empDAO",EmployeeDAO.class);
		//invoke the method
		//System.out.println("datasource object::" +ds.getClass());
		try {
			System.out.println("emps counts::" +dao.getEmpsCount());
		}catch(SQLException se) {
			se.printStackTrace();
		}
		//close container
		((ConfigurableApplicationContext) ctx).close();
		//Injected datasource object class name:::class org.apache.tomcat.jdbc.pool.DataSource
       //Injected datasource object class name::::
	  //Injected datasource object class name:::class org.apache.commons.dbcp2.BasicDataSource
		//Injected datasource object class name:::class com.zaxxer.hikari.HikariDataSource
	}
	}
