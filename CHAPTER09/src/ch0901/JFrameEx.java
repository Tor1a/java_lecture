package ch0901;

import javax.swing.JFrame;

public class JFrameEx extends JFrame {
	public JFrameEx() { // ������ �Լ� 
		this.setTitle("ó�� ������ Swing Frame");
		this.setSize(300,300);
		this.setVisible(true);
		//JFrame�� �⺻������ �ϳ��� container�� ������ �ִ�. add�� ���� componet
		// comtentpane component�� container�ȿ� �������� ȭ�鿡 ���δ�
	}
	public static void main(String[] args) {
		JFrameEx jFrameEx = new JFrameEx();
	}
}
