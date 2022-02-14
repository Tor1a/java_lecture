package exec;

import java.util.Scanner;

public class Exec5 {
   public static void main(String[] args) {
      int intArray[] = new int[10];//10개짜리 배열 생성
      Scanner scanner = new Scanner(System.in);
      System.out.println("10개의 정수를 입력하시오.");
      for(int i = 0;i<intArray.length;i++) {
         intArray[i] = scanner.nextInt();
      }
      System.out.println("입력한 정수 중 3의 배수는 ");
      for(int j = 0;j<intArray.length;j++) {
         if(intArray[j]%3==0) {
            System.out.println(intArray[j] + " ");
         }
      }
      scanner.close();
   }
}