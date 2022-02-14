package exec04;

import java.awt.Color;
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
      Color colors[] = {Color.RED,Color.BLUE,Color.YELLOW,Color.ORANGE,
            Color.PINK,Color.GRAY,Color.GREEN,Color.MAGENTA,Color.LIGHT_GRAY,Color.BLACK};
      for(int i = 0;i<10;i++) {
         JButton btns = new JButton("btn"+i);
         btns.setBackground(colors[i]);
         contentPane.add(btns);
      }
   }
   public static void main(String[] args) {
      GridLayoutEx glex = new GridLayoutEx();
   }
}

















