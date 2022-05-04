class Student{
int studentId;
String StudentName,courseName,centerName;
Address addr;//aggregation

public Student(int studentid,String StudentName,String CenterName,String CourseName,String Addr);
this.studentId=studentId;
this.studentName=studentName;
this.courseName=courseName;
this.centerName=courseName;
this.addr=addr;
}

class Address{
String street,city,state,country;
int pincode;

public Address(String street,String city,String state,String country,int pincode);
this.street=street;
this.city=city;
this.state=state;
this.country=country;
this.pincode=pincode;
}
}
public void display(){
System.out.println("Id is :" +studentId + " " +
"Name is : " + studentName + " " + "Course is :" + CourseName + " " + " Center is :" + CenterName);
System.out.println(addr.street + " " addr.city + " " + " addr.state " + " addr.country + " " + addr.pincode);
}
}

class AggregrationExample{
public static void main(String[] args){
Address a = new Address("XXZ street","mumbai","MH","india");
Address a1 = new Address("ABC Road", "Chennai","TN","india");

Student s= new Student(101,"Mamta","Java","Chennai",a);
Student s1= new Student (102,"Ram",."Net","Kolkata",a1);

s.display();
s1.display();

}
}



