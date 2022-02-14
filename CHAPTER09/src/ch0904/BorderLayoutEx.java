package ch0904;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame{
	public BorderLayoutEx(){
		this.setTitle("BorderLayout Ex");
		this.setSize(300, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new BorderLayout(20,20));
		contentPane.add(new JButton("clac"),BorderLayout.CENTER);
	}
	public static void main(String[] args) {
		BorderLayoutEx blex = new BorderLayoutEx();
	}
}
