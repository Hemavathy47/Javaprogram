interface Printable{
   void print();
}
interface Showable{
   void show();
}
class MultipleInheritance implements Printable,Showable{
public void print(){System.out.println("birds are eating");}
public void show(){System.out.println("birds are flying");}


public static void main(String args[]){
MultipleInheritance obj = new MultipleInheritance();
obj.print();
obj.show();
}
}

