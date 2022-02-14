package exec08;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;


class WordGame extends JPanel {
   public WordGame() {
      this.setBackground(Color.GRAY);
      this.setOpaque(true);
      this.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
      this.add(new JButton("열기"));
      this.add(new JButton("닫기"));
      this.add(new JButton("나가기"));
   }

public static void main(String[] args) {
	
}
}
class SouthPanel extends JPanel {
   public SouthPanel() {
      this.setBackground(Color.YELLOW);
      this.setOpaque(true);
      this.setLayout(new FlowLayout(FlowLayout.LEFT,5,5));
      this.add(new JButton("WordInput"));
      this.add(new JTextField(15));
   }
}
class CenterPanel extends JPanel {
   public CenterPanel() {
      this.setBackground(Color.WHITE);
      this.setOpaque(true);
      this.setLayout(null);
      for(int i = 0;i<10;i++) {
         JLabel label = new JLabel("*");
         label.setSize(20,20);
         label.setForeground(Color.RED);
         label.setLocation((int)Math.round(Math.random()*200+50), (int)Math.round(Math.random()*200+50));
         this.add(label);
      }
   }
}
public class WordGame extends JFrame {
   public WordGame() {
      this.setTitle("GridLayout");
      this.setSize(300,400);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setLocationRelativeTo(null);

      Container contentPane = this.getContentPane(); 
      contentPane.setLayout(new BorderLayout());
      contentPane.add(new NorthPanel(),BorderLayout.NORTH);
      contentPane.add(new SouthPanel(),BorderLayout.SOUTH);
      contentPane.add(new CenterPanel(),BorderLayout.CENTER);
      
      this.setVisible(true); // 다른 Container 또는 Component를 먼저 로딩하고 마지막에 보이게 하기 위해서 아래쪽에 적어두는게 좋다.
   }
   public static void main(String[] args) {
      new WordGame();
   }
}



