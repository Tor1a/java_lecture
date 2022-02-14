package array;

import java.util.Scanner;

public class Array2 {
   public static void main(String[] args) {
      int intArray[] = new int[5]; // 길이 5개의 배열 생성
      Scanner scanner = new Scanner(System.in);
      int max = 0;
      for(int i = 0;i<5;i++) {
         intArray[i] = scanner.nextInt();
         if(intArray[i] > max) {
            max = intArray[i];
         }
      }
      scanner.close();
      //System.out.println(intArray);// 메모리에 할당된 주소값을 해쉬코드로 반환
      //값을 출력할때는 반드시 intArray[0]
      for(int j=0;j<5;j++) {
         System.out.print(intArray[j]);
      }
      System.out.println("제일 큰 숫자는 "+max+"입니다.");
      System.out.println("intArray의 길이는 "+intArray.length);
   }
}