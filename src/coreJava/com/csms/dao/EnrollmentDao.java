package coreJava.com.csms.dao;

import java.util.List;

import coreJava.com.csms.pojo.Enrollment;

public interface EnrollmentDao {
	boolean addEnrollment(Enrollment enroll);
	boolean updateEnrollment(Enrollment enroll);
	boolean deleteEnrollment(int enrollmentId);
	boolean getEnrollmentById(int enrollmentId);
	List<Enrollment> getAllEnrollments();
}
