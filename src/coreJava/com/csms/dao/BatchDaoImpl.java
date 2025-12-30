package coreJava.com.csms.dao;

import coreJava.com.csms.pojo.Batch;
import coreJava.com.csms.utility.DBUtility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


public class BatchDaoImpl implements BatchDao{

	@Override
	public boolean addBatch(Batch batch) {
		boolean b=false;
		Connection conn=null;
		try{
			conn= DBUtility.getDBConnection();
			String sql="insert into euiry20168 values(?,?,?,?,?)";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,batch.getBatchId());
			pstmt.setString(2,batch.getCourseId());
			pstmt.setInt(3, batch.getBatchStrength());
			pstmt.setInt(4, batch.getBatchDuration());
			pstmt.setInt(5, batch.getBatchTime());
			
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
	public boolean updateBatch(Batch batch) {
		boolean b=false;
		Connection conn=null;
		try{
			conn=DBUtility.getDBConnection();
			String sql="update batch20168 set course_id=?,batch_strenght=?,batch_duration=?,batch_time=? where batch_id=?";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1,batch.getCourseId());
			pstmt.setInt(2, batch.getBatchStrength());
			pstmt.setInt(3, batch.getBatchDuration());
			pstmt.setInt(4, batch.getBatchTime());
			pstmt.setString(5,batch.getBatchId());
			
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
	public boolean deleteBatch(String batchId) {
		boolean b=false;
		Connection conn=null;
		try{
			conn=DBUtility.getDBConnection();
			String sql="delete from batch20168 where batch_id=?";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,batchId);
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
	public boolean getBatchById(String BatchId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Batch> getAllBatches() {
		// TODO Auto-generated method stub
		return null;
	}

}
