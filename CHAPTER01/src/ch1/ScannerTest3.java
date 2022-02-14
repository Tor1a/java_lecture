package ch1;

import java.util.Scanner;

public class ScannerTest3 {
	public static void main(String[] args) {
		System.out.println("정수를 입력하세요");
		
		Scanner scanner = new Scanner(System.in);
		
		int time = scanner.nextInt();
		int sec = time%60;
		int min = (time/60) % 60;
		int hour = (time/60);
		System.out.println(time+"은");
		System.out.print(hour+"시간");
		System.out.print(min+"분");
		System.out.print(sec+"초");
		scanner.close();
		
		
	}
}
