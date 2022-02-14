package array;

public class Array4 {
   //상수 대신 쓸 수 있는 열거형 데이터
   enum Week {Mon,Tue,Wed,Thu,Fri,Sat,Sun}
   public static void main(String[] args) {
      int intArray[] = new int[5];
      String fruits[] = {"plum","peach","banana","cherry"};
      int sum = 0;
      for(int i = 0;i<intArray.length;i++) {
         intArray[i] = i*3;
      }
      // for each 문  배열 반복문........
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