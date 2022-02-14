package ch1306;
class SharedBoard {
	private int sum = 0;
	//줄세우기...
	//스레드는 비동기 뭐가 어떻게 실행될지 모른다.
	//매서드 앞에 synchronized를 붙이면 동기화가 된다. 
	synchronized public void add() {
		int n = sum;
		Thread.yield();
		n+=10;
		sum = n;
		System.out.println(Thread.currentThread().getName()+"  :  "+sum);
	}
}
class StudentThread extends Thread {
	private SharedBoard board;
	public StudentThread(String name, SharedBoard board) {
		super(name); // 이름 출력하기용...
		this.board = board;
	}
	public void run() {
		for(int i = 0;i<10;i++) {
			this.board.add();
		}
	}
}

public class SynchronizedEx {
	public static void main(String[] args) {
		SharedBoard board = new SharedBoard();
		StudentThread th01 = new StudentThread("장성호", board);
		StudentThread th02 = new StudentThread("장동건", board);
		th01.start();
		th02.start();
	}
}
