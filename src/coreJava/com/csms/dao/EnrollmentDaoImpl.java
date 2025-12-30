package coreJava.com.csms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import coreJava.com.csms.pojo.Enrollment;
import coreJava.com.csms.utility.DBUtility;

public class EnrollmentDaoImpl implements EnrollmentDao {

	@Override
	public boolean addEnrollment(Enrollment enroll) {
		// TODO Auto-generated method stub
		boolean b=false;
		Connection conn=null;
		try{
			conn=DBUtility.getDBConnection();
			String sql="insert into student20168 values(?,?,?,?)";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, enroll.getEnrollId());
			pstmt.setInt(2,enroll.getStdId());
			pstmt.setString(3, enroll.getBatchId());
			pstmt.setString(4, enroll.getEnrollDate());
			
			int i=pstmt.executeUpdate();
			if(i>0){
				b=true;
			}
			else
			{
				b=false;
			}
		}
		catch(Exception e1){
			e1.printStackTrace();
		}
		finally{
			try {
				conn.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		return b;
	}

	@Override
	public boolean updateEnrollment(Enrollment enroll) {
		boolean b=false;
		Connection conn=null;
		try{
			conn=DBUtility.getDBConnection();
			String sql="update enrollment20168 set std_id=?,batch_id=?,enroll_date=? where enroll_id=?";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			
			pstmt.setInt(1,enroll.getStdId());
			pstmt.setString(2, enroll.getBatchId());
			pstmt.setString(3, enroll.getEnrollDate());
			pstmt.setInt(4, enroll.getEnrollId());
			
			int i=pstmt.executeUpdate();
			if(i>0){
				b=true;
			}
			else
			{
				b=false;
			}
		}
		catch(Exception e1){
			e1.printStackTrace();
		}
		finally{
			try {
				conn.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		return b;
	}

	@Override
	public boolean deleteEnrollment(int enrollmentId) {
		boolean b=false;
		Connection conn=null;
		try{
			conn=DBUtility.getDBConnection();
			String sql="delete from enrollment20168 where enrollment_id=?";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1,enrollmentId);
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
	public boolean getEnrollmentById(int enrollmentId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Enrollment> getAllEnrollments() {
		// TODO Auto-generated method stub
		return null;
	}

}
