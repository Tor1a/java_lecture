package ch1303;
//class Blue {
//	public void blueFlag() {
//		while(true) {
//			System.out.println("û��÷�");
//		}
//	}
//}
//class White {
//	public void whiteFlag() {
//		while(true) {
//			System.out.println("���÷�");
//		}
//	}
//}
class Blue extends Thread {
	public void run() {
		while(true) {
			System.out.println("û��÷�");
		}
	}
}
class White extends Thread {
	public void run() {
		while(true) {
			System.out.println("���÷�");
		}
	}
}
// JVM���� �Ͽ��� ���� ������ �����ϰ� �ҷ��� Thread�� ��������Ѵ�.
public class ThreadTest {
	public static void main(String[] args) {
		White w = new White();
		Blue b = new Blue();
		//w.whiteFlag();
		//b.blueFlag();
		w.start();
		b.start();
	}
}





