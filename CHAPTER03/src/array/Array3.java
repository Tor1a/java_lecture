package array;

import java.util.Scanner;

public class Array3 {
   public static void main(String[] args) {
      int intArray[] = new int[5];
      int sum = 0;
      int total = intArray.length;
      Scanner scanner = new Scanner(System.in);
      System.out.println(total+"���� ������ �Է��Ͻÿ�");
      for(int i=0;i<total;i++) {
         intArray[i] = scanner.nextInt();
      }
      for(int j=0;j<total;j++) {
         sum += intArray[j];
      }
      double avg = (double)(sum/total);
      System.out.println("�Է��� ������ ����� "+avg+"�Դϴ�.");
   }
}