package ch1;

import java.util.Scanner;

public class while1 {
   public static void main(String[] args) {
      // �����  (3 + 6 + 8)  / 3
      int sum = 0;
      int count = 0;
      Scanner scanner  = new Scanner(System.in);
      System.out.println("������ �Է��ϼ���. -1�� ������ �����մϴ�.");
      int num = scanner.nextInt();
      while(num != -1) {
         sum+=num;
         count++;
         num=scanner.nextInt();
      }
      System.out.println("�Է��� ������ ������ "+count+"�̰�");
      System.out.println("����� "+  sum/count+"�Դϴ�.");
      scanner.close();
   }
}


