package array;

import java.util.Scanner;

public class Array2 {
   public static void main(String[] args) {
      int intArray[] = new int[5]; // ���� 5���� �迭 ����
      Scanner scanner = new Scanner(System.in);
      int max = 0;
      for(int i = 0;i<5;i++) {
         intArray[i] = scanner.nextInt();
         if(intArray[i] > max) {
            max = intArray[i];
         }
      }
      scanner.close();
      //System.out.println(intArray);// �޸𸮿� �Ҵ�� �ּҰ��� �ؽ��ڵ�� ��ȯ
      //���� ����Ҷ��� �ݵ�� intArray[0]
      for(int j=0;j<5;j++) {
         System.out.print(intArray[j]);
      }
      System.out.println("���� ū ���ڴ� "+max+"�Դϴ�.");
      System.out.println("intArray�� ���̴� "+intArray.length);
   }
}