package coreJava.com.csms.dao;

import java.util.List;

import coreJava.com.csms.pojo.Staff;



public interface StaffDao {
	boolean addStaff(Staff stf);
	boolean updateStaff(Staff stf);
	boolean deleteStaff(int staffId);
	StaffDao getStaffById(int staffId);
	List<StaffDao> getAllStaff();

}
