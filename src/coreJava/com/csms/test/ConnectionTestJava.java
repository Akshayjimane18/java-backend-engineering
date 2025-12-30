package coreJava.com.csms.test;

import coreJava.com.csms.utility.DBUtility;

import java.sql.Connection;

public class ConnectionTestJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Connection c= DBUtility.getDBConnection();
			if(c==null){
				System.out.println("connection is not established");
				
			}
			else{
				System.out.println("connection established");
			}
				
	

	}

}
