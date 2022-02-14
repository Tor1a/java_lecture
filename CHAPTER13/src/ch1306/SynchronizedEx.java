package ch1306;
class SharedBoard {
	private int sum = 0;
	//�ټ����...
	//������� �񵿱� ���� ��� ������� �𸥴�.
	//�ż��� �տ� synchronized�� ���̸� ����ȭ�� �ȴ�. 
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
		super(name); // �̸� ����ϱ��...
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
		StudentThread th01 = new StudentThread("�强ȣ", board);
		StudentThread th02 = new StudentThread("�嵿��", board);
		th01.start();
		th02.start();
	}
}
