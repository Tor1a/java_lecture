package ch1;

import java.util.Scanner;


public class SwitchCase2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String grade;
		System.out.println("점수를 입력하세요");
		int score = scanner.nextInt();
		switch(score / 10) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
			default: // else
			grade = "F";
		}
		System.out.println("당신의 학점은 "+grade+"입니다");
		scanner.close();
		
	}
}
