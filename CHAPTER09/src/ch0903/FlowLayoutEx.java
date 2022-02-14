package ch0903;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame{
	public FlowLayoutEx() {
		this.setTitle("FlowLayout 연습");
		this.setSize(300, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//기본셋팅
		
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
		contentPane.add(new JButton("ADD"));
		contentPane.add(new JButton("SUB"));
		contentPane.add(new JButton("DIV"));
		contentPane.add(new JButton("MUL"));
		contentPane.add(new JButton("CLAC"));
	}
	public static void main(String[] args) {
		FlowLayoutEx flex = new FlowLayoutEx();
	}
}
