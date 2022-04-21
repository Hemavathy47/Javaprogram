abstract class Shapes{
abstract getarea();
}
class Rectangle extends Shapes{
void getarea(){System.out.println("A=L+B");}
}
void getsides(){System.out.println("4 sides");}

class Triangle extends Shapes{
void getarea(){System.out.println("A=HB/2");}
}
void getsides(){System.out.println("3 sides");}

class Square extends Shapes{
void getarea(){System.out.println("A=a^2");}
}
class AbstractionShapes{
public static void main(String args[]){
Shape s = new Rectangle();
s.getarea();
}
}

