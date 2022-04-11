class DuplicateElement{
public static void main(String args[]){
int[]element=new int[]{1,2,3,4,5,5,7,10,9,10};
System.out.println("duplicate elements in the given array:");
for(int i=0;i<element.length;i++){
for(int j=i+1;j<element.length;j++){
if(element[i]==element[j])
System.out.println(element[j]);
}
}
}
}
