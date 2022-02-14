package ch1;

import java.util.Scanner;

public class while1 {
   public static void main(String[] args) {
      // 평균은  (3 + 6 + 8)  / 3
      int sum = 0;
      int count = 0;
      Scanner scanner  = new Scanner(System.in);
      System.out.println("정수를 입력하세요. -1을 누르면 종료합니다.");
      int num = scanner.nextInt();
      while(num != -1) {
         sum+=num;
         count++;
         num=scanner.nextInt();
      }
      System.out.println("입력한 정수의 갯수는 "+count+"이고");
      System.out.println("평균은 "+  sum/count+"입니다.");
      scanner.close();
   }
}


