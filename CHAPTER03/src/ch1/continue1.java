package ch1;

import java.util.Scanner;

public class continue1 {
   public static void main(String[] args) {
      //continue  ���� ����������  �ݺ����� �ǳʶ��
      //break ���� �����ϸ� �ݺ��� ���� ������
      // �ټ�
      Scanner scanner = new Scanner(System.in);
      System.out.println("�ټ����� ������ �Է��ϼ���. ����� �ո� ����� �帳�ϴ�.");
      int sum = 0;
      for(int i=0;i<5;i++) {
         int num = scanner.nextInt();
         if(num<=0) {
            continue;
         } else {
            sum+=num;
         }
      }
      System.out.println("����� ���� "+sum+"�Դϴ�.");
      scanner.close();
   }
}