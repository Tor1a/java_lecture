package ch1;

import java.util.Scanner;

public class SwitchCaseTest {
	public static void main(String[] args) {
		String grade;
		System.out.println("점수를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		if(score>=90) {
			grade="A";
		}else if(score>=80) {
			grade="B";
		}else if(score>=70) {
			grade="C";
		}else if(score>=60) {
			grade="D";
		}else {
			grade="F";
		}
		System.out.println("당신의 학점은"+grade+"입니다.");
		scanner.close();
	}
}
