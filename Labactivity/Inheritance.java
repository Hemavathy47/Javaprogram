class Employee{
String name;
String Address;
int Id;
int Salary;
public Employee(String name,String Address, int Id,int  Salary)
{
Name=name;
Address=address;
Id=id;
Salary=salary;
}
public void Employe(){
System.out.println("Name="+name);
System.out.println("Address="+address);
System.out.println("Id="+id);
System.out.println("Salary="+salary);
}
class Manager extends employee{
public Manager(String Name,String Address,int id,Int Salary)
{
super(Name,Address,Id,Salary);
}
public void Manager(){
System.out.println("Name+"+name);
System.out.println("Address="+address);
System.out.println("id="+id);
System.out.println("Salary="+salary);
}
class Trainee extends Employee{
public Trainee(String Name,String Address,int Id,int Salary)
{
super (name,Address,Id,Salary);
}
public void Trainee(){
System.out.println("Name="+name);
System.out.println("Salary="+salary);
System.out.println("Address="+Address);
System.out.println("id="+id);
}
}
class inheritance
{
public static void main(String args[])
{
Employe obj = new Employe("Jack","MumbaiIndia",29846,65000);
obj.employe();
Manager man = new Manager("Varun","MumbaiIndia",23456,100000);
man.Manager();
Trainee train = new Trainee("Ohm","MumbaiIndia",67895,45000);
train.Trainee();
}
}
}
}

