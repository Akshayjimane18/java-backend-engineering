package coreJava.comparatordemo;

public class Account {
	private int acNo;
	private double Balance;
	private String acType;
	public int getAcNo() {
		return acNo;
	}
	public void setAcNo(int acNo) {
		this.acNo = acNo;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	public String getAcType() {
		return acType;
	}
	public void setAcType(String acType) {
		this.acType = acType;
	}
	@Override
	public String toString() {
		return "Account [acNo=" + acNo + ", Balance=" + Balance + ", acType="
				+ acType + "]";
	}
	
	
	
	

}

