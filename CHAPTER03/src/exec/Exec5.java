package exec;

import java.util.Scanner;

public class Exec5 {
   public static void main(String[] args) {
      int intArray[] = new int[10];//10��¥�� �迭 ����
      Scanner scanner = new Scanner(System.in);
      System.out.println("10���� ������ �Է��Ͻÿ�.");
      for(int i = 0;i<intArray.length;i++) {
         intArray[i] = scanner.nextInt();
      }
      System.out.println("�Է��� ���� �� 3�� ����� ");
      for(int j = 0;j<intArray.length;j++) {
         if(intArray[j]%3==0) {
            System.out.println(intArray[j] + " ");
         }
      }
      scanner.close();
   }
}