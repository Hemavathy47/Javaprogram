import java.util.Scanner;
class SwitchExample{
public void show(){
Scanner s = new Scanner(System.in);
System.out.println("Enter day");
int day = s.nextInt();
switch(day){
case 1:
System.out.println("Its me MONDAY...");
break;
case 2:
System.out.println("Its me TUESDAY...");
break;
case 3:
System.out.println("Its me WEDNESDAY...");
break;
case 4:
System.out.println("Its me THURSDAY...");
break;
case 5:
System.out.println("Its me FRIDAY...");
break;
case 6:
System.out.println("Its me SATURDAY...");
break;
case 7:
System.out.println("Its me SUNDAY...");
break;
default:
System.out.println("Incorrect day...");
}
}
public static void main(String args[]){
SwitchExample s = new SwitchExample();
s.show();
}
}
