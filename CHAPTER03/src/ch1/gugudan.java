package ch1;

public class gugudan {
   public static void main(String[] args) {
      //���� for�� ��ø for ��
      // ���� ǥ�� �Ҷ��� for  ��/��  2�� for 
      // ������ ǥ���Ҷ�  3�� for��
      for(int i = 1; i < 10;i++) {
         for(int j= 1; j < 10; j++) {
            System.out.print(i + "x" + j + "=" + i*j);
            System.out.print('\t');
         }
         System.out.println();
      }
   }
}
// 2 x 1 = 2 ; 2 x 2 = 4; 2 x 3 = 6; 2 x 4 = 8;
// 3 x 1 = 3 ; 3 x 2 = 6; 3 X 3 = 9; 3 x 4 = 12