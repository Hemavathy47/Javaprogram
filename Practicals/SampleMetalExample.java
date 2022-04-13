class Metal{
String weight = "95";
String colour = "silver";
}
class Elements extends Metal{
String modelname = "hue";
}
class SampleMetalExample{
public static void main(String[] args){
Elements e = new Elements();
System.out.println("Elements modelname is : " + e.modelname);
}
}