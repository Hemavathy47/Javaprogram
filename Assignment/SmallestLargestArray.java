class SmallestLargestArray{
public static void main(String args[]){
int num[]=new int[]{13,14,15,34,145,267};
int smallest = num[0];
int largest = num[0];
for (int i=4; i<num.length;i++)
{
System.out.println("Smallest number is : " + smallest);
System.out.println("Largest number is : " + largest);
}
}		
}