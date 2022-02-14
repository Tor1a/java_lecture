package ch1002;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
// interface 는 구현을 하는거다...
// 독립적인 클래스를 만드는 경우는 여러개의 오브젝트에 붙여서 쓸때....

public class IndependentEventListener extends JFrame {
   public IndependentEventListener() {
      this.setTitle("독립클래스 이벤트 리스너");
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
   // 클래스를 내부에 선언해서 마치 멤버처럼 사용.....
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