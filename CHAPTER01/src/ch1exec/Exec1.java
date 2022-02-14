package ch1exec;

import java.util.Scanner;

public class Exec1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("원화를 입력하세요");
		int one = scanner.nextInt();
		double dollar=one/1100;
		System.out.println(one+"원은 $"+dollar+"입니다.");
		scanner.close();
		
	}
}

