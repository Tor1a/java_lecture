package exec01;

import java.util.Scanner;

class CountThread implements Runnable {
	@Override
	public void run() {
		System.out.println("스레드 실행시작");
		for(int i=0;i<=10;i++) {
			System.out.print(i+"==");
		}
		System.out.println("스레드 종료");
	}
	
}

public class CountThreadEx {
	
	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		System.out.println("아무키나 입력===>");
		scanner.nextLine();
		scanner.close();
		
		Thread th = new Thread(new CountThread());
		th.start();
	}
}








