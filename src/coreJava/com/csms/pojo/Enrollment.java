package coreJava.com.csms.pojo;

public class Enrollment {
	private int enrollId;
	private int stdId;
	private String batchId;
	private String enrollDate;
	public int getEnrollId() {
		return enrollId;
	}
	public void setEnrollId(int enrollId) {
		this.enrollId = enrollId;
	}
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getBatchId() {
		return batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
	public String getEnrollDate() {
		return enrollDate;
	}
	public void setEnrollDate(String enrollDate) {
		this.enrollDate = enrollDate;
	}
	@Override
	public String toString() {
		return "Enrollment20168 [enrollId=" + enrollId + ", stdId=" + stdId
				+ ", batchId=" + batchId + ", enrollDate=" + enrollDate + "]";
	}
	
	

}
