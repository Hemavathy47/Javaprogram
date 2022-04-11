class OddEvenNumbers{
public static void main(String[]args){
int[]num = new int[]{1,9,8,6,5,2,88};
System.out.println("Even and Odd numbers in the given array");
for(int i=0;i<num.length;i++){
for(int j=0;j<num.length;j++){
if(num[i]%2==0){
if(num[j]%2!=0){
System.out.println(num[i]);
System.out.println(num[j]);
}
}
}
}
}
}