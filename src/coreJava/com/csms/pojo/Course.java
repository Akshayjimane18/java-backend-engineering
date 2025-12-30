package coreJava.com.csms.pojo;

public class Course {
	private String courseId;
	private String courseName;
	private String courseDescription;
	private int courseDuration;
	private int courseFess;
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	public int getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}
	public int getCourseFess() {
		return courseFess;
	}
	public void setCourseFess(int courseFess) {
		this.courseFess = courseFess;
	}
	@Override
	public String toString() {
		return "CourseId20168 [courseId=" + courseId + ", courseName="
				+ courseName + ", courseDescription=" + courseDescription
				+ ", courseDuration=" + courseDuration + ", courseFess="
				+ courseFess + "]";
	}
	

}
