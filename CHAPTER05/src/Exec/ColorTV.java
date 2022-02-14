package Exec;

class TV {
   private int size;
   public TV(int size) { // 생성자도 결국 메서드
      this.size=size;
   }
   protected int getSize() {
      return size;
   }
}

public class ColorTV extends TV {
   private int colors;
   public ColorTV(int size, int colors) {
      super(size);
      this.colors = colors;
   }
   public void printProperty() {
      System.out.println("size는 "+getSize()+"이고 컬러는 "+colors+"인 TV");
   }
   public static void main(String[] args) {
      ColorTV myTV = new ColorTV(32,1024);
      myTV.printProperty();
   }
}