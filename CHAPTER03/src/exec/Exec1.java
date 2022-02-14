package exec;

public class Exec1 {
   public static void main(String[] args) {
      int i=0;
      int k=0;
      int sum=0;
      int sum02 = 0;
      int sum03 = 0;
      while(i<100) {
         sum+=i;
         i+=2;
      }
      System.out.println(sum);
      
      for(int j=0;j<100;j+=2) {
         sum02+=j;
      }
      System.out.println(sum02);
      
      do {
         if(k>=99) {
            break;
         }
         sum03+=k;
         k+=2;
      } while(true);
      System.out.println(sum03);
   }
}


