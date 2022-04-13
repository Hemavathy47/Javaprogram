class Sample1{
int a;
String name;
double b = 5.5;
Sample1(){
System.out.println("i am default contructor");
}
Sample1(int a,String name,double b){
a=a;
name=name;
b=b;
}
public static void main(String args[]){
Sample1 s = new Sample1();
System.out.println(s.a +" "+s.name +" "+ s.b);
}
}