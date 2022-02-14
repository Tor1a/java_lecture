package ch1303;
//class Blue {
//	public void blueFlag() {
//		while(true) {
//			System.out.println("청기올려");
//		}
//	}
//}
//class White {
//	public void whiteFlag() {
//		while(true) {
//			System.out.println("백기올려");
//		}
//	}
//}
class Blue extends Thread {
	public void run() {
		while(true) {
			System.out.println("청기올려");
		}
	}
}
class White extends Thread {
	public void run() {
		while(true) {
			System.out.println("백기올려");
		}
	}
}
// JVM으로 하여금 개별 실행을 관리하게 할려면 Thread를 만들어써야한다.
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





