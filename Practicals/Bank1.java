package set;

public class Bank1 implements Comparable<Bank1>{
	long accountNo;
	String customerName;
	double balance;
	int customerAge;
	
	public Bank1 (long accountNo,String customerName,double balance,int customerAge) {
	super();
	this.accountNo=accountNo;
	this.customerName = customerName;
	this.balance = balance;
	this.customerAge = customerAge;

}
	@Override
	public int compareTo(Bank1 b) {
		// TODO Auto-generated method stub
		if(customerAge == b .customerAge )
		return 0;
		else if (customerAge > b.customerAge)
			return 1;
		else
			return -1;
		}
	}
	
    
