package coreJava.com.csms.pojo;

public class Batch {
	private String batchId;
	private String courseId;
	private int batchStrength;
	private int batchDuration;
	private int batchTime;
	public String getBatchId() {
		return batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public int getBatchStrength() {
		return batchStrength;
	}
	public void setBatchStrength(int batchStrength) {
		this.batchStrength = batchStrength;
	}
	public int getBatchDuration() {
		return batchDuration;
	}
	public void setBatchDuration(int batchDuration) {
		this.batchDuration = batchDuration;
	}
	public int getBatchTime() {
		return batchTime;
	}
	public void setBatchTime(int batchTime) {
		this.batchTime = batchTime;
	}
	@Override
	public String toString() {
		return "Batch20168 [batchId=" + batchId + ", courseId=" + courseId
				+ ", batchStrength=" + batchStrength + ", batchDuration="
				+ batchDuration + ", batchTime=" + batchTime + "]";
	}
	

}
