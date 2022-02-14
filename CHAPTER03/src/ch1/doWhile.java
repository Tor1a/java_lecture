package ch1;

public class doWhile {
   public static void main(String[] args) {
      char _char = 'a';
      do {
         System.out.print(_char);
         _char = (char)(_char+1);
      } while ( _char <= 'z');
   }
}