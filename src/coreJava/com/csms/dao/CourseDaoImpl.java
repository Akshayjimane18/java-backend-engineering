package coreJava.com.csms.dao;

import coreJava.com.csms.pojo.Course;
import coreJava.com.csms.utility.DBUtility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


public class CourseDaoImpl implements CourseDao {

	@Override
	public boolean addCourse(Course course) {
		// TODO Auto-generated method stub
		boolean b=false;
		Connection conn=null;
		try{
			conn= DBUtility.getDBConnection();
			String sql="insert into courseuiry20168 values(?,?,?,?,?,)";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,course.getCourseId());
			pstmt.setString(2,course.getCourseName());
			pstmt.setString(3, course.getCourseDescription());
			pstmt.setInt(4, course.getCourseDuration());
			pstmt.setInt(5, course.getCourseFess());
			
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
	public boolean updateCourse(Course course) {
		boolean b=false;
		Connection conn=null;
		try{
			conn=DBUtility.getDBConnection();
			String sql="update course20168 set course_name=?,course_description=?,course_duration=?,course_fees=? where course_id=? ";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1,course.getCourseName());
			pstmt.setString(2, course.getCourseDescription());
			pstmt.setInt(3, course.getCourseDuration());
			pstmt.setInt(4, course.getCourseFess());
			pstmt.setString(5,course.getCourseId());
			
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
	public boolean deleteCourse(String courseId) {
		boolean b=false;
		Connection conn=null;
		try{
			conn=DBUtility.getDBConnection();
			String sql="delete from course20168 where course_id=?";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,courseId);
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
	public boolean getCourseById(String courseId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Course> getAllCourse() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
