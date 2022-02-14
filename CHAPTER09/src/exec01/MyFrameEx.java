package exec0901;

import javax.swing.JFrame;

public class MyFrameEx extends JFrame {
   
   public MyFrameEx() {
      this.setTitle("Let's Study JAVA");
      this.setSize(400,200);
      this.setVisible(true);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setLocationRelativeTo(null);
      //this.setLocationRelativeTo(null);
   }
   
   
   public static void main(String[] args) {
      new MyFrameEx();
   }
}