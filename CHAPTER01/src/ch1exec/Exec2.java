package ch1exec;

import java.util.Scanner;

public class Exec2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("2자리수 정수 입력: ");
		int num = sc.nextInt();
		if(num%10 == num%10) {
			System.out.println("10의 자리와 1의 자리가 같습니다.");
		}else {
			System.out.println("10의 자리와 1의 자리가 다릅니다.");
		}
	}
}
