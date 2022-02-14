package ch1exec;

import java.util.Scanner;

public class Exec5 {
	public static void main(String[] args) {
		System.out.println("세변의 값을 정수로 입력하시오");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a< (b+c) && b< (a+c) && c < (a+b)) {
			System.out.println("삼각형이 됩니다.");
		}else {
			System.out.println("삼각형이 안됩니다");
		}
	}
}
