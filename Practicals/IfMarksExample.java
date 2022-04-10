import java.util.Scanner;
class IfMarksExample{
public void show(){
Scanner s = new Scanner(System.in);
System.out.println("Enter marks");
int marks = s.nextInt();

if(marks>35&&marks<45){
System.out.println("Its D grade");
}
else if(marks>=45&&marks<55){
System.out.println("Its C grade");
}
else if(marks>=50&&marks<75){
System.out.println("Its B grade");
}
else if(marks>=75&&marks<85){
System.out.println("Its A grade");
}
else if(marks>=85&&marks<100){
System.out.println("Its O grade");
}
else{
System.out.println("Its fail/absent");
}
}
public static void main(String args[]){
IfMarksExample s = new IfMarksExample();
s.show();
}
}


 