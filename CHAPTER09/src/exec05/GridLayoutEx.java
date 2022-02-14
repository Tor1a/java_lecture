package exec05;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GridLayoutEx extends JFrame {
   public GridLayoutEx() {
      this.setTitle("GridLayout");
      this.setSize(800,300);
      this.setVisible(true);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setLocationRelativeTo(null);
      
      Container contentPane = this.getContentPane();
      contentPane.setLayout(new GridLayout(4,4));
      Color colors[] = {Color.RED,Color.BLUE,Color.YELLOW,Color.ORANGE,
                    Color.PINK,Color.GRAY,Color.GREEN,Color.MAGENTA,
                    Color.LIGHT_GRAY,Color.BLACK,Color.RED,Color.BLUE,
                    Color.YELLOW,Color.ORANGE,Color.PINK,Color.GRAY
         };
      for(int i = 0;i<16;i++) {
         JLabel labels = new JLabel("label"+i);
         labels.setOpaque(true); //불투명 처리 하겠다
         //labels.setBackground(colors[i]);
         
         labels.setBackground(new Color(
                                 (int)Math.round(Math.random()*255),
                                 (int)Math.round(Math.random()*255),
                                 (int)Math.round(Math.random()*255))
               );
         contentPane.add(labels);
         //System.out.println(Math.round(Math.random()*255));
      }
      
   }
   public static void main(String[] args) {
      GridLayoutEx glex = new GridLayoutEx();
   }
}

















