package ch1;
interface PhoneInterface {
   public abstract void sendCall();
   public abstract void receiveCall();
   default void prntLogo() {
      System.out.println("==== phone =====");
   }
}
interface MobilePhoneInterface extends PhoneInterface {
   public abstract void sendSMS();
   public abstract void receiveSMS();
}

interface MP3Interface {
   void play();
   void stop();
}

class PDA {
   public int calculate (int x, int y) {
      return x+y;
   }
}
class SamsungPhone extends PDA implements MobilePhoneInterface, MP3Interface   {
   @Override
   public void sendCall() {
      System.out.println("따르릉 따르릉");
   }
   @Override
   public void receiveCall() {
      System.out.println("전화 받아라");
   }
   @Override
   public void play() {
      System.out.println("음악 플레이");
   }
   @Override
   public void stop() {
      System.out.println("음악 끝");
   }
   @Override
   public void sendSMS() {
      System.out.println("문자 발송");
   }

   @Override
   public void receiveSMS() {
      System.out.println("문자 왔어요");
   }
}

public class InterfaceEx {
   public static void main(String[] args) {
      SamsungPhone sp = new SamsungPhone();
      sp.sendCall();
      sp.receiveCall();
      sp.prntLogo();
      sp.calculate(10, 10);
      sp.play();
      sp.stop();
      sp.sendSMS();
      sp.receiveSMS();
   }
}




