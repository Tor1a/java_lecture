package ch1302;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;


// Thread 를 구현하는 방법 
// 1. Runnable 를 구현한다.
// 2. run()  메서드를 오버라이딩 해줘야 한다.
// 3. start() 메서들 호출하면 thread가 동작한다.
class TimerRunnable implements Runnable {
	private JLabel timerLabel;
	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	// run() 메서드를 오버라이딩....
	public void run() {
		int num = 0;
		while(true) {// 무한 루프
			this.timerLabel.setText(Integer.toString(num));
			num++;
			// 1초동안 대기 시킨다...
			try {
				Thread.sleep(100);// 대기시키기....
			} catch (InterruptedException e) {
				e.printStackTrace();
				return;  //모든 함수는 return을 만나면 그 즉시 종료
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
		timerLabel.setFont(new Font("맑은 고딕",Font.BOLD,30));
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout()); // BorderLayout
		
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		Thread th = new Thread(runnable); // 스레드 생성자 함수의 매개변수로 Runnable을 구현한 객체를 넣어준다.
		
		contentPane.add(timerLabel);
		th.start();
		
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new ThreadTimerEx();
	}
}





