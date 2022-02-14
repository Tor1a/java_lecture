package exec;

import java.util.Scanner;

public class Exec8 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("1~100사이의 정수를 입력하시오");
      int num =  scanner.nextInt();
      int intArray[] = new int[num]; //입력된 갯수만큼의 배열을 생성
      for(int i=0;i<intArray.length;i++) {
         int random =  (int)(Math.random()*100+1);
         for(int j = 0;j < i; j++) {
            if(intArray[j] == random) {
               i--;
               continue;
            }
         }
         intArray[i] = random;
      }
      for(int k = 0;k<intArray.length;k++) {
         System.out.print(intArray[k]+" ");
      }
   }
}