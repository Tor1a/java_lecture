package ch1;

public class for1 {
   public static void main(String[] args) {
      int sum = 0;
      int total = 10;
      // for���� ������ ��Ȯ�Ҷ� for�� �ַ� ���� ����.
      // while���� ������ ��Ȯ���� ������
      for(int i = 1;i<=total;i++) {
         sum += i;
         System.out.print(i);
         if(i<=total-1) {
            System.out.print("+");
         } else {
            System.out.print("=");
            System.out.print(sum);
         }
      }
   }
}