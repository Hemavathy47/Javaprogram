
import java.util.Scanner;

class Bank{
private String accountName;
private int accountNum;
private float amt;

public String getAccountName(){
return accountName;
}
public void setAccountName(String accountName){
this.accountName=accountName;
}
public int getAccountNum(){
return accountNum;
}
public void setAccountNum(int accountNum){
this.accountNum=accountNum;
}
public float getAmt(){
return amt;
}
public void setAmt(float amt){
this.amt = amt;

}
}

public  class EncapsulationExample {
	
public static void main(String[]args){
//TODO auto generated method stub
Scanner s= new Scanner (System.in);
System.out.println("Enter Account name");
String accountName= s.nextLine();
System.out.println("Enetr Account Number ");
int accountNum = s.nextInt();
System.out.println("Enter Amount");
float amt = s.nextFloat();

Bank b= new Bank();
//setting values
b.setAccountName(accountName);
b.setAccountNum(accountNum);
b.setAmt(amt);

//getting value
System.out.println("Account Name is : " + b.getAccountName());
System.out.println("Account Number is : " + b.getAccountNum());
System.out.println("Account Amt is : " + b.getAmt());
}
}
