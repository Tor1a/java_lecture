package ch0906;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NullContainerEx extends JFrame{
	public NullContainerEx() {
		this.setTitle("NullContainer Ex");
		this.setSize(300, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = this.getContentPane();
		//contentPane.setLayout(null);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Hello Swing");
		JButton btn = new JButton("click");
//		btn.setSize(100, 50);
//		btn.setLocation(10,100);
//		btn.setBounds(10,10, 100,50);
//		contentPane.add(btn);
		for(int i=0; i<10;i++) {
			JButton btns = new JButton("btn"+i);
			btns.setSize(50, 20);
			btns.setLocation((i%5)*60, (i/5)*30);
			contentPane.add(btns); 
		}
	}
	public static void main(String[] args) {
		NullContainerEx nullEx = new NullContainerEx();
	}
}
