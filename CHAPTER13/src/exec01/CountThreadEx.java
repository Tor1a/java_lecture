package exec01;

import java.util.Scanner;

class CountThread implements Runnable {
	@Override
	public void run() {
		System.out.println("������ �������");
		for(int i=0;i<=10;i++) {
			System.out.print(i+"==");
		}
		System.out.println("������ ����");
	}
	
}

public class CountThreadEx {
	
	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		System.out.println("�ƹ�Ű�� �Է�===>");
		scanner.nextLine();
		scanner.close();
		
		Thread th = new Thread(new CountThread());
		th.start();
	}
}








