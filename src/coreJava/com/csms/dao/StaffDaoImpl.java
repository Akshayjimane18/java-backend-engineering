package coreJava.com.csms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import coreJava.com.csms.pojo.Staff;
import coreJava.com.csms.utility.DBUtility;

public class StaffDaoImpl implements StaffDao{

	@Override
	public boolean addStaff(Staff stf) {
		// TODO Auto-generated method stub
		boolean b=false;
		Connection conn=null;
		try{
			conn=DBUtility.getDBConnection();
			String sql="insert into stfuiry20168 values(?,?,?,?,?,?,?,?)";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1,stf.getStaffId());
			pstmt.setString(2,stf.getStaffName());
			pstmt.setString(3, stf.getStaffContact());
			pstmt.setString(4, stf.getStaffEmailId());
			pstmt.setString(5, stf.getStaffqualification());
			pstmt.setString(6, stf.getStaffUsername());
			pstmt.setString(7, stf.getStaffPswd());
			pstmt.setString(8, stf.getStaffAddress());
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
	public boolean updateStaff(Staff stf) {
		// TODO Auto-generated method stub
		boolean b=false;
		Connection conn=null;
		try{
			conn=DBUtility.getDBConnection();
			String sql="update staff20168 set staff_name=?,staff_contact=?,staff_emailid=?,staff_qualification=?,staff_username=?,staff_pswd=?,staff_address=? where staff_id=?";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1,stf.getStaffName());
			pstmt.setString(2, stf.getStaffContact());
			pstmt.setString(3, stf.getStaffEmailId());
			pstmt.setString(4, stf.getStaffqualification());
			pstmt.setString(5, stf.getStaffUsername());
			pstmt.setString(6, stf.getStaffPswd());
			pstmt.setString(7, stf.getStaffAddress());
			pstmt.setInt(8,stf.getStaffId());
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
	public boolean deleteStaff(int staffId) {
		boolean b=false;
		Connection conn=null;
		try{
			conn=DBUtility.getDBConnection();
			String sql="delete from staff20168 where staff_id=?";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1,staffId);
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
	public StaffDao getStaffById(int staffId) {
		Staff stf=null;
		
		Connection conn=null;
		try{
			conn=DBUtility.getDBConnection();
			String sql="select std_id,std_name,std_address,std_contact,std_emailid,std_qualification,std_username,std_pswd";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, staffId);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				stf=new Staff();
				stf.setStaffId(rs.getInt("staff_id"));
				stf.setStaffName(rs.getString("staff_name"));
				stf.setStaffAddress(rs.getString("staff_ddress"));
				stf.setStaffContact(rs.getString("staff_Contact"));
				stf.setStaffEmailId(rs.getString("staff_emailid"));
				stf.setStaffqualification(rs.getString("staff_qualification"));
				stf.setStaffUsername(rs.getString("staff_username"));
				stf.setStaffPswd(rs.getString("staff_paswd"));
				
				
				
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
		return (StaffDao) stf;
	}
	

	@Override
	public List<StaffDao> getAllStaff() {
		// TODO Auto-generated method stub
		return null;
	}

}
