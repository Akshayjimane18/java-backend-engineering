package coreJava.Treesetcomparator;

import java.util.Comparator;

public class CompareOnAccBalance implements Comparator<Account> {

	@Override
	public int compare(Account a1,Account a2) {
		// TODO Auto-generated method stub
		return (int)(a1.getBalance()-a2.getBalance());
	}
	

}
