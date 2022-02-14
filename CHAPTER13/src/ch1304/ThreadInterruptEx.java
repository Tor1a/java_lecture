package ch1304;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//Thread�� �����ϴ� �ΰ��� ��� Thread ���
//Runnable�� ����
class TimerRunnable implements Runnable {
	private JLabel timerLabel;
	private boolean flag = false;
	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	public void end() {
		flag = true;
	}
	@Override
	public void run() {
		//�����ڵ� �ۼ�
		int num = 0;
		while(true) {
			this.timerLabel.setText(Integer.toString(num));
			num++;
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				notify();
			}
		}
	}
}
public class ThreadInterruptEx extends JFrame {
	public ThreadInterruptEx() {
		this.setTitle("Thread Interrupt");
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		JLabel timerLabel = new JLabel("0");
		timerLabel.setFont(new Font("���� ���",Font.BOLD,30));
		contentPane.add(timerLabel);
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		Thread th = new Thread(runnable);
		th.start();
		JButton stopBtn = new JButton("STOP");
		contentPane.add(stopBtn);
		stopBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//stopBtn.setEnabled(false);
				//runnable.end();
				//th.interrupt();
				th.notify();
			}
		});
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new ThreadInterruptEx();
	}
}









