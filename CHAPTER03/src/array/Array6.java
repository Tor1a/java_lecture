package array;

public class Array6 {
   public static void main(String[] args) {
      int intArray[][] = {{1,3,4},{1,2,3,4},{3,2},{4,4,4,4,4}}; // ����� ���ÿ� �Ҵ�
      
      int intArray02[][];  // �� �迭 ����
      intArray02 = new int[4][];  // �迭�� ���̸� 4���� �����ϰڴ�.
      intArray02[0] = new int[3]; // �迭�� ù��° ��ҷ� �ٽ� �迭���� 3��¥���� �����ϰڴ�
      intArray02[1] = new int[4]; // �迭�� �ι�° ��ҷ� �ٽ� �迭���� 4��¥���� �����ϰڴ�
      intArray02[2] = new int[2]; // �迭�� ����° ��ҷ� �ٽ� �迭���� 2��¥���� �����ϰڴ�
      intArray02[3] = new int[5]; // �迭�� �׹�° ��ҷ� �ٽ� �迭���� 5��¥���� �����ϰڴ�

      intArray[0][0] = 1;
      intArray[0][1] = 3;
      intArray[0][2] = 4;
      
      intArray[1][0] = 1;
      intArray[1][1] = 2;
      intArray[1][2] = 3;
      intArray[1][3] = 4;
      
      
      
      System.out.println(intArray[0].length);
      System.out.println(intArray[1].length);
      System.out.println(intArray[2].length);
      System.out.println(intArray[3].length);
   }
}