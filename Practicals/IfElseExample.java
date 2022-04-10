import java.util.Scanner; //import scanner class

class IfElseExample{
public void display(){
// int age = 30;
Scanner s = new Scanner (System.in); // create a scanner object
System.out.println("Enter age");
int age = s.nextInt(); // read user input

if(age >=18){
//true
System.out.println("You are eligible");
}
else{
// false
System.out.println("You are not eligible");
}
}
public static void main(String args[]){
IfElseExample obj = new IfElseExample();
obj.display();
}
}

