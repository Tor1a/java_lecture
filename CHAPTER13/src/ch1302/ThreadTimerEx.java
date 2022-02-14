package ch1302;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;


// Thread �� �����ϴ� ��� 
// 1. Runnable �� �����Ѵ�.
// 2. run()  �޼��带 �������̵� ����� �Ѵ�.
// 3. start() �޼��� ȣ���ϸ� thread�� �����Ѵ�.
class TimerRunnable implements Runnable {
	private JLabel timerLabel;
	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	// run() �޼��带 �������̵�....
	public void run() {
		int num = 0;
		while(true) {// ���� ����
			this.timerLabel.setText(Integer.toString(num));
			num++;
			// 1�ʵ��� ��� ��Ų��...
			try {
				Thread.sleep(100);// ����Ű��....
			} catch (InterruptedException e) {
				e.printStackTrace();
				return;  //��� �Լ��� return�� ������ �� ��� ����
			}
		}
	}
}

public class ThreadTimerEx extends JFrame {
	public ThreadTimerEx() {
		this.setTitle("Thread");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,300);
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("���� ���",Font.BOLD,30));
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout()); // BorderLayout
		
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		Thread th = new Thread(runnable); // ������ ������ �Լ��� �Ű������� Runnable�� ������ ��ü�� �־��ش�.
		
		contentPane.add(timerLabel);
		th.start();
		
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new ThreadTimerEx();
	}
}





