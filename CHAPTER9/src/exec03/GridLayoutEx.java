package exec03;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx extends JFrame {
   public GridLayoutEx() {
      this.setTitle("GridLayout");
      this.setSize(800,300);
      this.setVisible(true);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setLocationRelativeTo(null);
      
      Container contentPane = this.getContentPane();
      contentPane.setLayout(new GridLayout(1,10));
      /*
      contentPane.add(new JButton("btn01"));
      contentPane.add(new JButton("btn02"));
      contentPane.add(new JButton("btn03"));
      contentPane.add(new JButton("btn04"));
      contentPane.add(new JButton("btn05"));
      contentPane.add(new JButton("btn06"));
      contentPane.add(new JButton("btn07"));
      contentPane.add(new JButton("btn08"));
      contentPane.add(new JButton("btn09"));
      contentPane.add(new JButton("btn10"));
      */
      for(int i = 0;i<10;i++) {
         contentPane.add(new JButton("btn"+i));
      }
   }
   public static void main(String[] args) {
      GridLayoutEx glex = new GridLayoutEx();
   }
}

















