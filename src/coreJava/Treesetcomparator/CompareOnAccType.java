package coreJava.Treesetcomparator;

import java.util.Comparator;

public class CompareOnAccType implements Comparator<Account> {

	@Override
	public int compare(Account a1, Account a2) {
		// TODO Auto-generated method stub
		return a1.getAcType().compareTo(a2.getAcType());
	}

}
