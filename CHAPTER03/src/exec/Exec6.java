package exec;

import java.util.Scanner;

public class Exec6 {
   public static void main(String[] args) {
      int unit[] = {50000,10000,1000,500,100,50,10,1};
      System.out.println("금액을 입력하시면 쪼개 드립니다.");
      Scanner scanner = new Scanner(System.in);
      int money = scanner.nextInt();
      for(int i=0;i<unit.length;i++) {
         int remain =  money/unit[i];
         if(remain > 0) {
            System.out.println(unit[i]+"원 "+remain+"개");
            money=money % unit[i];
         }
      }
      scanner.close();
   }
}