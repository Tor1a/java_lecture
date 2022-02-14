package exec02;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame {
   public BorderLayoutEx() {
      this.setTitle("BorderLayout");
      this.setSize(400,300);
      this.setVisible(true);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setLocationRelativeTo(null);
      Container contentPane = this.getContentPane(); // 원래 가지고 있는 container를 찾아준다. 이건 바꿀 수 있다.
      contentPane.setLayout(new BorderLayout(10,10));
      contentPane.add(new JButton("North"),BorderLayout.NORTH);
      contentPane.add(new JButton("South"),BorderLayout.SOUTH);
      contentPane.add(new JButton("West"),BorderLayout.WEST);
      contentPane.add(new JButton("Center"),BorderLayout.CENTER);
      contentPane.add(new JButton("East"),BorderLayout.EAST);
      
      
   }
   
   
   public static void main(String[] args) {
      BorderLayoutEx blex = new BorderLayoutEx();
   }
}