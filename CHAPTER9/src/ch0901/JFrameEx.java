package ch0901;

import javax.swing.JFrame;

public class JFrameEx extends JFrame {
	public JFrameEx() { // 생성자 함수 
		this.setTitle("처음 만들어보는 Swing Frame");
		this.setSize(300,300);
		this.setVisible(true);
		//JFrame은 기본적으로 하나의 container를 가지고 있다. add를 통해 componet
		// comtentpane component는 container안에 들어가야지만 화면에 보인다
	}
	public static void main(String[] args) {
		JFrameEx jFrameEx = new JFrameEx();
	}
}
