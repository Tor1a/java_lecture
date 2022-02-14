package ch1004;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
//����ٰ� Ŭ���� �����ϴ� ���   �������� Ŭ������ ����

public class MouseListenerEx extends JFrame {
   private JLabel label = new JLabel("Hello");
   public MouseListenerEx() {
      this.setTitle("MouseListener");
      this.setSize(300,300);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Container contentPane = this.getContentPane();
      /* ����ٰ� �����ϴ� ��� �͸� Ŭ������ ���� ���� ���� ����̱�� �ϳ� �ϳ��� �� �� �ִٴ� ������ �ִ�.*/
      contentPane.addMouseListener(new MyMouseListener());
      contentPane.setLayout(null);
      label.setSize(50,20);
      label.setLocation(100, 100);
      contentPane.add(label);
      this.setVisible(true);
   }
   // ���� Ŭ������ �̿�
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
   
   // ����ٰ� �����ϴ� ���   ���� Ŭ����  �θ� Ŭ������ ����� ������ �����ϴٶ�� ������ �ִ�.
   public static void main(String[] args) {
      new MouseListenerEx();
   }
}



