package exec07;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


class NorthPanel extends JPanel {
   public NorthPanel() {
      this.setBackground(Color.LIGHT_GRAY);
      this.setOpaque(true); //������ ó��
      this.setLayout(new FlowLayout());// FlowLayout
      this.add(new JLabel("�����Է�"));
      this.add(new JTextField(20));
   }
}
class SouthPanel extends JPanel {
   public SouthPanel() {
      this.setBackground(Color.YELLOW);
      this.setOpaque(true); //������ ó��
      this.setLayout(new FlowLayout());// FlowLayout
      this.add(new JLabel("�����"));
      this.add(new JTextField(20));
   }
}
class CenterPanel extends JPanel {
   public CenterPanel() {
      this.setBackground(Color.RED);
      this.setOpaque(true); //������ ó��
      this.setLayout(new GridLayout(4,4,5,5));// �׸��� ���̾ƿ� ()
      this.add(new JButton("0"));
      this.add(new JButton("1"));
      this.add(new JButton("2"));
      this.add(new JButton("3"));
      this.add(new JButton("4"));
      this.add(new JButton("5"));
      this.add(new JButton("6"));
      this.add(new JButton("7"));
      this.add(new JButton("8"));
      this.add(new JButton("9"));
      this.add(new JButton("CE"));
      this.add(new JButton("���"));
      this.add(new JButton("+"));
      this.add(new JButton("-"));
      this.add(new JButton("x"));
      this.add(new JButton("/"));
   }
}
public class Calc extends JFrame {
   //container
   public Calc() {
      this.setTitle("GridLayout");
      this.setSize(300,300);
      this.setVisible(true);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setLocationRelativeTo(null);
      
      Container contentPane = this.getContentPane(); // container (componet)
      contentPane.setLayout(new BorderLayout());
      contentPane.add(new NorthPanel(),BorderLayout.NORTH);
      contentPane.add(new SouthPanel(),BorderLayout.SOUTH);
      contentPane.add(new CenterPanel(),BorderLayout.CENTER);
   }
   
   public static void main(String[] args) {
      new Calc();
   }
}





