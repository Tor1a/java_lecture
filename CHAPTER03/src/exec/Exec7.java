package exec;

public class Exec7 {
   public static void main(String[] args) {
      int sum = 0;
      int intArray[] = new int[10];
      for(int i = 0;i<intArray.length;i++) {
         intArray[i] = (int)(Math.random()*10+1);
      }
      for(int j = 0;j<intArray.length;j++) {
         System.out.print(intArray[j]+"  ");
         sum+=intArray[j];
      }
      System.out.println("Æò±ÕÀº " + (double)sum/intArray.length);
   }
}