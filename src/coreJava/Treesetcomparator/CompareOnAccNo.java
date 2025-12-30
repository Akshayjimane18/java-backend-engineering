package coreJava.Treesetcomparator;

import java.util.Comparator;

public  class CompareOnAccNo implements Comparator<Account>{

	

	
	public int compare(Account a1,Account a2) {
		// TODO Auto-generated method stub
		return a1.getAcNo()-a2.getAcNo();
	}

}
