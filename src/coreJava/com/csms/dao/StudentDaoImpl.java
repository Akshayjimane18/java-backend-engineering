package coreJava.com.csms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import coreJava.com.csms.pojo.Student;
import coreJava.com.csms.utility.DBUtility;

public class StudentDaoImpl implements StudentDao {

	@Override
	public boolean addStudent(Student stud) {
		boolean b=false;
		Connection conn=null;
		try{
			conn=DBUtility.getDBConnection();
			String sql="insert into student20168  values(?,?,?,?,?,?,?,?)";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1,stud.getStdId());
			pstmt.setString(2,stud.getStdName());
			pstmt.setString(3, stud.getStdAddress());
			pstmt.setString(4, stud.getStdContact());
			pstmt.setString(5, stud.getStdEmailId());
			pstmt.setString(6, stud.getStdqualification());
			pstmt.setString(7,stud.getStdUsername());
			pstmt.setString(8, stud.getStdPswd());
			int i=pstmt.executeUpdate();
			if(i>0){
				b=true;
			}
			else
			{
				b=false;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return b;
	}

	@Override
	public boolean updateStudent(Student stud) {
		boolean b=false;
		Connection conn=null;
		try{
			conn=DBUtility.getDBConnection();
			String sql="update student set std_name=?,std_address=?,std_contact=?,std_emailid=?,std_qualification=?,std_username=?,std_pswd=? where std_stdid=?" ;
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,stud.getStdName());
			pstmt.setString(2, stud.getStdAddress());
			pstmt.setString(3, stud.getStdContact());
			pstmt.setString(4, stud.getStdEmailId());
			pstmt.setString(5, stud.getStdqualification());
			pstmt.setString(6,stud.getStdUsername());
			pstmt.setString(7, stud.getStdPswd());
			pstmt.setInt(8,stud.getStdId());
			int i=pstmt.executeUpdate();
			if(i>0){
				b=true;
			}
			else
			{
				b=false;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return b;
	}

	@Override
	public boolean deleteStudent(int stdId) {
		// TODO Auto-generated method stub
		boolean b=false;
		Connection conn=null;
		try{
			conn=DBUtility.getDBConnection();
			String sql="delete from student20168 where std_id=?";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1,stdId);
			int i=pstmt.executeUpdate();
			if(i>0){
				b=true;
			}
			else
			{
				b=false;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return b;
			
		
		
	}

	@Override
	public Student getStudentById(int stdId) {
		Student stud=null;

		Connection conn=null;
		try{
			conn=DBUtility.getDBConnection();
			String sql="select std_id,std_name,std_address,std_contact,std_emailid,std_qualification,std_username,std_pswd";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, stdId);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				stud=new Student();
				stud.setStdId(rs.getInt("std_id"));
				stud.setStdName(rs.getString("std_name"));
				stud.setStdAddress(rs.getString("std_ddress"));
				stud.setStdContact(rs.getString("std_Contact"));
				stud.setStdEmailId(rs.getString("std_emailid"));
				stud.setStdqualification(rs.getString("std_qualification"));
				stud.setStdUsername(rs.getString("std_username"));
				
				
				
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return stud ;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

}
