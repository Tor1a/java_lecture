package array;

public class Array4 {
   //��� ��� �� �� �ִ� ������ ������
   enum Week {Mon,Tue,Wed,Thu,Fri,Sat,Sun}
   public static void main(String[] args) {
      int intArray[] = new int[5];
      String fruits[] = {"plum","peach","banana","cherry"};
      int sum = 0;
      for(int i = 0;i<intArray.length;i++) {
         intArray[i] = i*3;
      }
      // for each ��  �迭 �ݺ���........
      for(String fruit:fruits) {
         System.out.println(fruit);
      }
      for(int item : intArray) {
         System.out.println(item);
         sum+=item;
      }
      for(Week day : Week.values()) {
         System.out.println(day);
      }
      //System.out.println(sum);
   }
}