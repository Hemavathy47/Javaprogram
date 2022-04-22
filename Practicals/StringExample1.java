public class StringExample1{
public void show(){
char []arr={'j','a','v','a'};
String s= new String(arr); //convert ch array to String
System.out.println("Value is : " + s);
System.out.println(arr);
}

public void myfunction(){
String m= "Ratan";//String literal
String m1= "Mamta B";
String m3= "Mamta B";
String m4= "Sachin";
String m2= new String ("Mamta");//String new keyword
System.out.println(m.equals(m1));//false
System.out.println(m.equals(m2));//true
System.out.println(m2.equals(m1));//false
System.out.println(m.equalsIgnoreCase(m2));//true
System.out.println(m == m2);
System.out.println(m3 == m1);
System.out.println(m.compareTo(m4));
System.out.println(m1.compareTo(m3));
System.out.println(m4.compareTo(m));

}
public void display(){
String s = "Anudip" + "Foundation";
System.out.println(s); //String s = new stringBuildder()).append("Anudip").append("Foundation").toString();
String s1 = 80 + 45 + "Mamta" + 20 + 10;
System.out.println(s.concat(s1));
}
	
public static void main(String[]args){
StringExample1 obj = new StringExample1();
obj.show();
obj.myfunction();
}
}