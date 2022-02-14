package ch1;

class Point02 {
   private int x;
   private int y;

   public Point02() {
      this.x = 0;
      this.y = 0;
   }

   public Point02(int x, int y) {
      this.x = x;
      this.y = y;
   }

   public void showPoint() {
      System.out.println("(" + x + "," + y + ")");
   }
}

class ColorPoint02 extends Point02 {
   private String color;

   public ColorPoint02(int x, int y, String color) {
      super(x, y);
      this.color = color;
   }

   public void showColorPoint() {
      System.out.print(color + "==");
      showPoint();

   }
}

public class SuperEx {
   public static void main(String[] args) {
      ColorPoint02 cp02 = new ColorPoint02(10, 15, "red");
      cp02.showColorPoint();

   }
}