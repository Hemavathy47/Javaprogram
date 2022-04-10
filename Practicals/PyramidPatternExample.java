class PyramidPatternExample{
public void pattern(int num){
for(int i=0;i<num;i++){
for(int j=0;j<=1;j++){
System.out.println("*");
}
}
}
public static void main(String args[]){
PyramidPatternExample p=new PyramidPatternExample();
int num=5;
p.pattern(num);
}
}
