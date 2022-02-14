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
      this.add(new JButton("����"));
      this.add(new JButton("�ݱ�"));
      this.add(new JButton("������"));
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
      
      this.setVisible(true); // �ٸ� Container �Ǵ� Component�� ���� �ε��ϰ� �������� ���̰� �ϱ� ���ؼ� �Ʒ��ʿ� ����δ°� ����.
   }
   public static void main(String[] args) {
      new WordGame();
   }
}



