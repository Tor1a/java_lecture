package ch1;

public class for1 {
   public static void main(String[] args) {
      int sum = 0;
      int total = 10;
      // for문은 조건이 명확할때 for를 주로 많이 쓴다.
      // while문은 조건이 명확하지 않을때
      for(int i = 1;i<=total;i++) {
         sum += i;
         System.out.print(i);
         if(i<=total-1) {
            System.out.print("+");
         } else {
            System.out.print("=");
            System.out.print(sum);
         }
      }
   }
}