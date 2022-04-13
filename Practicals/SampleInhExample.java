class Vehicle{
String type= "4-wheeler";
String brand= "ford";
}
class Car extends Vehicle{
String modelname="abc123";
}
class SampleInhExample{
public static void main(String[] args){
Car c = new Car();
System.out.println("Car brand is : " + c.brand);
System.out.println("Car model is : " + c.modelname);
}
}
