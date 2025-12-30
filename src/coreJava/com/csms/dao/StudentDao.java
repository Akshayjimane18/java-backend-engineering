package coreJava.com.csms.dao;

import java.util.List;

import coreJava.com.csms.pojo.Student;

public interface StudentDao {
	boolean addStudent(Student stud);
	boolean updateStudent(Student stud);
	boolean deleteStudent(int stdId);
	Student getStudentById(int stdId);
	List<Student> getAllStudent();

}
