package ch0905;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutEx extends JFrame{
	public GridLayoutEx() {
		this.setTitle("GridLayout Ex");
		this.setSize(300, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = this.getContentPane();
		GridLayout grid = new GridLayout(4,2);
		grid.setVgap(10);
		contentPane.setLayout(grid);
		contentPane.add(new JLabel("�̸�"));
		contentPane.add(new JTextField(""));
		contentPane.add(new JLabel("�й�"));
		contentPane.add(new JTextField(""));
		contentPane.add(new JLabel("�а�"));
		contentPane.add(new JTextField(""));
		contentPane.add(new JLabel("����"));
		contentPane.add(new JTextField(""));
		
	}
	
	public static void main(String[] args) {
		GridLayoutEx gridEx = new GridLayoutEx();
	}
}
