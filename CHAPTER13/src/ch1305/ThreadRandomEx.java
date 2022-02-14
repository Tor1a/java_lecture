package ch1305;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;


class RandomThread extends Thread {
	private Container contentPane;
	private boolean flag = false;
	public RandomThread(Container contentPane) {
		this.contentPane = contentPane;
	}
	
	public void run() {
		while(true) {
			int x = (int)(Math.random()*this.contentPane.getWidth());
			int y = (int)(Math.random()*this.contentPane.getHeight());
			JLabel label = new JLabel("JAVA");
			label.setSize(80,30);
			label.setLocation(x,y);
			this.contentPane.add(label);
			//System.out.println("fdfdsf");
			this.contentPane.repaint();
			try {
				Thread.sleep(100);
				if(flag) {
					return;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
				return;
			}
		}
	}
}


public class ThreadRandomEx extends JFrame {
	public ThreadRandomEx() {
		this.setTitle("Thread Interrupt");
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = this.getContentPane();
		contentPane.setLayout(null);
		
		RandomThread th = new RandomThread(contentPane);
		th.start();
		contentPane.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				th.interrupt();
			}
		});
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new ThreadRandomEx();
	}
}







