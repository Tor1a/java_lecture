package array;

import java.util.Scanner;

public class Array3 {
   public static void main(String[] args) {
      int intArray[] = new int[5];
      int sum = 0;
      int total = intArray.length;
      Scanner scanner = new Scanner(System.in);
      System.out.println(total+"개의 정수를 입력하시오");
      for(int i=0;i<total;i++) {
         intArray[i] = scanner.nextInt();
      }
      for(int j=0;j<total;j++) {
         sum += intArray[j];
      }
      double avg = (double)(sum/total);
      System.out.println("입력한 정수의 평균은 "+avg+"입니다.");
   }
}