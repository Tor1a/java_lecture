package array;

public class Array6 {
   public static void main(String[] args) {
      int intArray[][] = {{1,3,4},{1,2,3,4},{3,2},{4,4,4,4,4}}; // 선언과 동시에 할당
      
      int intArray02[][];  // 빈 배열 선언
      intArray02 = new int[4][];  // 배열의 길이를 4개로 한정하겠다.
      intArray02[0] = new int[3]; // 배열의 첫번째 요소로 다시 배열길이 3개짜리로 선언하겠다
      intArray02[1] = new int[4]; // 배열의 두번째 요소로 다시 배열길이 4개짜리로 선언하겠다
      intArray02[2] = new int[2]; // 배열의 세번째 요소로 다시 배열길이 2개짜리로 선언하겠다
      intArray02[3] = new int[5]; // 배열의 네번째 요소로 다시 배열길이 5개짜리로 선언하겠다

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