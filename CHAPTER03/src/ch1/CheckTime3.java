package ch1;

public class CheckTime3 {
   public static void main(String[] args) {
      int sum = 0;
      for(int i = 1;i<=100;i++) {
         if(i%3==0) {
            sum+=i;
         } else {
            continue;
         }
      }
      System.out.println("1~100사시의 3의 배수의 합은 "+sum+"입니다.");
   }
}