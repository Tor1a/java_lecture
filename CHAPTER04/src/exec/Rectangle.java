package exec;

public class Rectangle {
   private int x;
   private int y;
   private int width;
   private int height;
   
   public Rectangle(int x, int y, int width, int height) {
      this.x = x;
      this.y = y;
      this.width = width;
      this.height = height;
   }
   public void show() {
      System.out.println("("+x+","+y+")���� ũ�Ⱑ "+width+"x"+height+"�� �簢��");
   }
   
   public int square() {
      return width*height;
   }
   
   public boolean contains(Rectangle r) {
      if( x < r.x && y < r.y) {
         if(   (x + width) > (r.x + r.width)  && (y + height) > (r.y + r.height) ) {
            return true;
         }
      } 
      return false;
   }
   
   public static void main(String[] args) {
      Rectangle myRect = new Rectangle(2, 2, 8, 7);
      Rectangle innerRect = new Rectangle(5,5,100,2);
      myRect.show();
      if(myRect.contains(innerRect)) {
         System.out.println("innerRect�� myRect�� ���Ե˴ϴ�.");
      } else {
         System.out.println("innerRect�� myRect�� ���Ե��� �ʽ��ϴ�.");
      }
   }
}






