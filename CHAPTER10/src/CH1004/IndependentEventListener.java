package ch1004;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
//여기다가 클래스 선언하는 방법   독립적인 클래스로 생성

public class MouseListenerEx extends JFrame {
   private JLabel label = new JLabel("Hello");
   public MouseListenerEx() {
      this.setTitle("MouseListener");
      this.setSize(300,300);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Container contentPane = this.getContentPane();
      /* 여기다가 선언하는 방법 익명 클래스로 선언 가장 쉬운 방법이기는 하나 하나만 쓸 수 있다는 단점이 있다.*/
      contentPane.addMouseListener(new MyMouseListener());
      contentPane.setLayout(null);
      label.setSize(50,20);
      label.setLocation(100, 100);
      contentPane.add(label);
      this.setVisible(true);
   }
   // 내부 클래스를 이용
   class MyMouseListener implements MouseListener {
      @Override
      public void mouseClicked(MouseEvent e) {
         int tempX = e.getX();
         int tempY = e.getY();
         label.setLocation(tempX, tempY);
      }
      @Override
      public void mousePressed(MouseEvent e) {}
      @Override
      public void mouseReleased(MouseEvent e) {}
      @Override
      public void mouseEntered(MouseEvent e) {}
      @Override
      public void mouseExited(MouseEvent e) {}
   }
   
   // 여기다가 선언하는 방법   내부 클래스  부모 클래스의 멤버에 접근이 가능하다라는 장점이 있다.
   public static void main(String[] args) {
      new MouseListenerEx();
   }
}



