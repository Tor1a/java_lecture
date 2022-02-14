package CH1001;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// interface�� ������ �ϴ°Ŵ�
// �������� Ŭ������ ����� ���� �������� ������Ʈ�� �ٿ��� ����...
class MyActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("Ŭ��");
		JButton btn = (JButton)e.getSource(); //
		System.out.println(btn.getAction());
		
	}
	
}

public class IndependentEventListener extends JFrame {
	public IndependentEventListener() {
		this.setTitle("����Ŭ���� �̺�Ʈ ������");
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		JButton btn = new JButton("Acction");
		JButton btn02 = new JButton("Acction02");
		btn.addActionListener(new MyActionListener());
		btn02.addActionListener(new MyActionListener());
		contentPane.add(btn);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new IndependentEventListener();
	}
}
