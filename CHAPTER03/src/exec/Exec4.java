package exec;

import java.util.Scanner;

public class Exec4 {
   public static void main(String[] args) {
      System.out.println("���ĺ� �ҹ��ڸ� �ϳ� �Է��Ͻÿ�");
      Scanner scanner = new Scanner(System.in);
      //String str = scanner.next();
      char _char = scanner.next().charAt(0);
      //System.out.println(_char);
      for(char i = _char;i>='a';i--) {
         for(char j='a';j<=i;j++) {
            System.out.print(j);
         }
         System.out.println();
      }
   }
}