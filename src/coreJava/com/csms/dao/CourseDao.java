package coreJava.com.csms.dao;

import coreJava.com.csms.pojo.Course;

import java.util.List;



public interface CourseDao {
	boolean addCourse(Course course);
	boolean updateCourse(Course course);
	boolean deleteCourse(String courseId);
	boolean getCourseById(String courseId);
	List<Course> getAllCourse();

}
