package exec;

import java.util.Scanner;

public class Exec8 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("1~100������ ������ �Է��Ͻÿ�");
      int num =  scanner.nextInt();
      int intArray[] = new int[num]; //�Էµ� ������ŭ�� �迭�� ����
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