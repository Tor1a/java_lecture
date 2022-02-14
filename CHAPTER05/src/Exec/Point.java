package Exec;

class Point {
   private int x;
   private int y;
   
   public int getX() {
      return x;
   }
   public void setX(int x) {
      this.x = x;
   }
   public int getY() {
      return y;
   }
   public void setY(int y) {
      this.y = y;
   }
   public Point(int x,int y) {
      this.x = x;
      this.y = y;
   }
   protected void move(int x, int y) {
      this.x = x; 
      this.y = y;
   }
}

public class ColorPoint extends Point {
   //����� ��Ҵ� �θ�� �ű��....
   private String color;
   public ColorPoint(int x, int y, String color) {
      super(x,y);
      this.color = color;
   }
   public void setXY(int changeX, int changeY) {
      move(changeX,changeY);
   }
   public void setColor(String color) {
      this.color = color;
   }
   public String toString() {
      return this.color+"���� ("+getX()+","+getY()+")�� ��";
   }
   public static void main(String[] args) {
      ColorPoint cp = new ColorPoint(5,5,"YELLOW");
      cp.setXY(10, 20);
      cp.setColor("RED");
      String str = cp.toString();
      System.out.println(str + " �Դϴ�.");
   }
   
}











