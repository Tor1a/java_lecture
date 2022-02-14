package ch1002;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
// interface �� ������ �ϴ°Ŵ�...
// �������� Ŭ������ ����� ���� �������� ������Ʈ�� �ٿ��� ����....

public class IndependentEventListener extends JFrame {
   public IndependentEventListener() {
      this.setTitle("����Ŭ���� �̺�Ʈ ������");
      this.setSize(500,300);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Container contentPane = this.getContentPane();
      contentPane.setLayout(new FlowLayout());
      JButton btn = new JButton("Action");
      JButton btn02 = new JButton("Action02");
      btn.addActionListener(new MyActionListener());
      btn02.addActionListener(new MyActionListener());
      contentPane.add(btn);
      contentPane.add(btn02);
      this.setVisible(true);
   }
   // Ŭ������ ���ο� �����ؼ� ��ġ ���ó�� ���.....
   private class MyActionListener implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent e) {
         //System.out.println(e);
         JButton btn = (JButton)e.getSource();
         System.out.println(btn.getText());
      }
   }
   public static void main(String[] args) {
      new IndependentEventListener();
   }
}