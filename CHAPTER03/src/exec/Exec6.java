package exec;

import java.util.Scanner;

public class Exec6 {
   public static void main(String[] args) {
      int unit[] = {50000,10000,1000,500,100,50,10,1};
      System.out.println("�ݾ��� �Է��Ͻø� �ɰ� �帳�ϴ�.");
      Scanner scanner = new Scanner(System.in);
      int money = scanner.nextInt();
      for(int i=0;i<unit.length;i++) {
         int remain =  money/unit[i];
         if(remain > 0) {
            System.out.println(unit[i]+"�� "+remain+"��");
            money=money % unit[i];
         }
      }
      scanner.close();
   }
}