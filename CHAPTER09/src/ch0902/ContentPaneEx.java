package ch0902;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame {
	// 생성자 만들기
	public ContentPaneEx() {
		this.setTitle("ContentPaneEx과JFrame");
		this.setSize(300, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 모든 컴퍼넌트들은 컨테이너안에 추가해서 쓴다
		Container contentPane= this.getContentPane(); // 배치관리자
		contentPane.setLayout(new FlowLayout()); // container는 배치관리자(component를 어떻게 배치할건지 결정한다)
		contentPane.setBackground(Color.orange);
		this.add(new JButton("버튼1"));
		this.add(new JButton("버튼2"));
		this.add(new JButton("버튼3"));
	}
	public static void main(String[] args) {
		ContentPaneEx contentPaneEx = new ContentPaneEx();
	}
}