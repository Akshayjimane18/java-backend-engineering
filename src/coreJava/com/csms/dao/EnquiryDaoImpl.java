package coreJava.com.csms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import coreJava.com.csms.pojo.Enquiry;
import coreJava.com.csms.utility.DBUtility;


public class EnquiryDaoImpl implements EnquiryDao
{

	@Override
	public boolean addEnquiry(Enquiry enq) {
		// TODO Auto-generated method stub
		boolean b=false;
		Connection conn=null;
		try{
			conn=DBUtility.getDBConnection();
			String sql="insert into enquiry20168 (enq_name,enq_Address,enq_contact,enq_emailid,enq_qualification,enq_courseid) values(?,?,?,?,?,?)";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,enq.getEnqName());
			pstmt.setString(2,enq.getEnqAddress());
			pstmt.setString(3, enq.getEnqContact());
			pstmt.setString(4, enq.getEnqEmailId());
			pstmt.setString(5, enq.getEnqQualification());
			pstmt.setString(6, enq.getCourseId());
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

}
