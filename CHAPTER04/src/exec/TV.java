package exec;

public class TV {
   private String maker;
   private int year;
   private int size;
   
   public TV() {
      
   }
   public TV(String maker,int year, int size) {
      this.maker = maker;
      this.year = year;
      this.size = size;
   }
   
   public void show() {
      System.out.println(maker+"���� ���� "+ year+"���� "+size+"��ġ TV");
   }
   
   public static void main(String[] args) {
      TV myTv = new TV("LG",2021,32);
      myTv.show();
   }
}
