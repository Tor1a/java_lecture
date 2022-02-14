package ch1;
class Shape {
   public Shape() {}
   public void draw() {
      System.out.println("Shape Draw");
   }
}
class Line extends Shape {
   public void draw() {
      System.out.println("Line Draw");
   }
}
class Rect extends Shape {
   @Override 
   public void draw() {
      System.out.println("Rect Draw");
   }
}
class Circle extends Shape {
   @Override
   public void draw() {
      System.out.println("Circle Draw");
   }
}

public class MethodOverridingEx {
   static void paint(Shape s) {
      s.draw();
   }
   public static void main(String[] args) {
      //override �� �̸�, ����Ÿ��, �Ű����� ���� ���ƾ� �Ѵ�.  ������.
      Shape shape = new Shape();
      shape.draw();
      Line line = new Line();
      line.draw();
      
      paint(new Circle());
      paint(new Rect());
   }
}










