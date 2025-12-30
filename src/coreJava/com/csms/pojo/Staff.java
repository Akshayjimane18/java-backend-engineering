package coreJava.com.csms.pojo;

public class Staff {
	private int staffId;
	private String staffName;
	private String staffAddress;
	private String staffContact;
	private String staffEmailId;
	private String staffqualification;
	private String staffUsername;
	private String staffPswd;
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getStaffAddress() {
		return staffAddress;
	}
	public void setStaffAddress(String staffAddress) {
		this.staffAddress = staffAddress;
	}
	public String getStaffContact() {
		return staffContact;
	}
	public void setStaffContact(String staffContact) {
		this.staffContact = staffContact;
	}
	public String getStaffEmailId() {
		return staffEmailId;
	}
	public void setStaffEmailId(String staffEmailId) {
		this.staffEmailId = staffEmailId;
	}
	public String getStaffqualification() {
		return staffqualification;
	}
	public void setStaffqualification(String staffqualification) {
		this.staffqualification = staffqualification;
	}
	public String getStaffUsername() {
		return staffUsername;
	}
	public void setStaffUsername(String staffUsername) {
		this.staffUsername = staffUsername;
	}
	public String getStaffPswd() {
		return staffPswd;
	}
	
	public void setStaffPswd(String staffPswd) {
		this.staffPswd = staffPswd;
	}
	@Override
	public String toString() {
		return "Staff [staffId=" + staffId + ", staffName=" + staffName
				+ ", staffAddress=" + staffAddress + ", staffContact="
				+ staffContact + ", staffEmailId=" + staffEmailId
				+ ", staffqualification=" + staffqualification
				+ ", staffUsername=" + staffUsername + ", staffPswd="
				+ staffPswd + "]";
	}
	
	

}
