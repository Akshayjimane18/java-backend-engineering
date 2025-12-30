package coreJava.com.csms.pojo;

public class Enquiry {
	private int enqId;
	private String enqName;
	private String enqAddress;
	private String enqContact;
	private String enqEmailId;
	private String enqQualification;
	private String courseId;
	public int getEnqId() {
		return enqId;
	}
	public void setEnqId(int enqId) {
		this.enqId = enqId;
	}
	public String getEnqName() {
		return enqName;
	}
	public void setEnqName(String enqName) {
		this.enqName = enqName;
	}
	public String getEnqAddress() {
		return enqAddress;
	}
	public void setEnqAddress(String enqAddress) {
		this.enqAddress = enqAddress;
	}
	public String getEnqContact() {
		return enqContact;
	}
	public void setEnqContact(String enqContact) {
		this.enqContact = enqContact;
	}
	public String getEnqEmailId() {
		return enqEmailId;
	}
	public void setEnqEmailId(String enqEmailId) {
		this.enqEmailId = enqEmailId;
	}
	public String getEnqQualification() {
		return enqQualification;
	}
	public void setEnqQualification(String enqQualification) {
		this.enqQualification = enqQualification;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	@Override
	public String toString() {
		return "Enquiry20168 [enqId=" + enqId + ", enqName=" + enqName
				+ ", enqAddress=" + enqAddress + ", enqContact=" + enqContact
				+ ", enqEmailId=" + enqEmailId + ", enqQualification="
				+ enqQualification + ", courseId=" + courseId + "]";
	}
	
	
	

}
