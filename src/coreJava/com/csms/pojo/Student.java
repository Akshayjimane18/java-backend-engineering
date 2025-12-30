package coreJava.com.csms.pojo;

public class Student {
	private int stdId;
	private String stdName;
	private String stdAddress;
	private String stdContact;
	private String stdEmailId;
	private String stdqualification;
	private String stdUsername;
	private String stdPswd;
	public int getStdId() {
		return stdId;
	}
	
	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdAddress() {
		return stdAddress;
	}
	public void setStdAddress(String stdAddress) {
		this.stdAddress = stdAddress;
	}
	public String getStdContact() {
		return stdContact;
	}
	public void setStdContact(String stdContact) {
		this.stdContact = stdContact;
	}
	public String getStdEmailId() {
		return stdEmailId;
	}
	public void setStdEmailId(String stdEmailId) {
		this.stdEmailId = stdEmailId;
	}
	public String getStdqualification() {
		return stdqualification;
	}
	public void setStdqualification(String stdqualification) {
		this.stdqualification = stdqualification;
	}
	public String getStdUsername() {
		return stdUsername;
	}
	public void setStdUsername(String stdUsername) {
		this.stdUsername = stdUsername;
	}
	public String getStdPswd() {
		return stdPswd;
	}
	public void setStdPswd(String stdPswd) {
		this.stdPswd = stdPswd;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName
				+ ", stdAddress=" + stdAddress + ", stdContact=" + stdContact
				+ ", stdEmailId=" + stdEmailId + ", stdqualification="
				+ stdqualification + ", stdUsername=" + stdUsername
				+ ", stdPswd=" + stdPswd + "]";
	}
	
	

}
