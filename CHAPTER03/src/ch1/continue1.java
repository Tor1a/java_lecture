package ch1;

import java.util.Scanner;

public class continue1 {
   public static void main(String[] args) {
      //continue  조건 만족했을때  반복문을 건너띄기
      //break 조건 만족하면 반복문 빠져 나가기
      // 다섯
      Scanner scanner = new Scanner(System.in);
      System.out.println("다섯개의 정수를 입력하세요. 양수의 합만 출력해 드립니다.");
      int sum = 0;
      for(int i=0;i<5;i++) {
         int num = scanner.nextInt();
         if(num<=0) {
            continue;
         } else {
            sum+=num;
         }
      }
      System.out.println("양수의 합은 "+sum+"입니다.");
      scanner.close();
   }
}