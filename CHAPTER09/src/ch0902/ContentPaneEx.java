package ch0902;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame {
	// ������ �����
	public ContentPaneEx() {
		this.setTitle("ContentPaneEx��JFrame");
		this.setSize(300, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ��� ���۳�Ʈ���� �����̳ʾȿ� �߰��ؼ� ����
		Container contentPane= this.getContentPane(); // ��ġ������
		contentPane.setLayout(new FlowLayout()); // container�� ��ġ������(component�� ��� ��ġ�Ұ��� �����Ѵ�)
		contentPane.setBackground(Color.orange);
		this.add(new JButton("��ư1"));
		this.add(new JButton("��ư2"));
		this.add(new JButton("��ư3"));
	}
	public static void main(String[] args) {
		ContentPaneEx contentPaneEx = new ContentPaneEx();
	}
}