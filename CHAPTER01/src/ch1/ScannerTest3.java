package ch1;

import java.util.Scanner;

public class ScannerTest3 {
	public static void main(String[] args) {
		System.out.println("������ �Է��ϼ���");
		
		Scanner scanner = new Scanner(System.in);
		
		int time = scanner.nextInt();
		int sec = time%60;
		int min = (time/60) % 60;
		int hour = (time/60);
		System.out.println(time+"��");
		System.out.print(hour+"�ð�");
		System.out.print(min+"��");
		System.out.print(sec+"��");
		scanner.close();
		
		
	}
}
