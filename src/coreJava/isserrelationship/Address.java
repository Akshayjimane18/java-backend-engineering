package coreJava.isserrelationship;

public class Address {
	String aptName;
	int flatNo;
	String street,area;
	public String getaptName() {
		return aptName;
	}
	public void setaptName(String aptName) {
		this.aptName = aptName;
	}
	public int getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "Address [aptName=" + aptName + ", flatNo=" + flatNo
				+ ", street=" + street + ", area=" + area + "]";
	}
	
	

}
