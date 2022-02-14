package ch1303;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
class FlickLabel extends JLabel implements Runnable {
	private long delay;
	public FlickLabel(String txt, long delay) {
		super(txt);
		this.setOpaque(true); //ºÒÅõ¸í Ã³¸®.
		this.delay = delay;
		Thread th = new Thread(this);
		th.start();
	}
	@Override
	public void run() {
		int num = 0;
		while(true) {
			if(num==0) {
				this.setBackground(Color.YELLOW);
			} else {
				this.setBackground(Color.GREEN);
			}
			if(num==0) {
				num=1;
			} else {
				num=0;
			}
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
				return;
			}
		}
	}
}

public class FlickLabelEx extends JFrame {
	public FlickLabelEx() {
		this.setTitle("Thread");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,300);

		FlickLabel flickLabel01 = new FlickLabel("±ôºý01", 500);
		JLabel label = new JLabel("¾Æ¹«°Íµµ ¾Æ´Ô");
		FlickLabel flickLabel02 = new FlickLabel("±ôºý02", 300);
		
		
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout()); // BorderLayout
		contentPane.add(flickLabel01);
		contentPane.add(label);
		contentPane.add(flickLabel02);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new FlickLabelEx();
	}
}







