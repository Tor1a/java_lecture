package ch1exec;

import java.util.Scanner;

public class Exec2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("2�ڸ��� ���� �Է�: ");
		int num = sc.nextInt();
		if(num%10 == num%10) {
			System.out.println("10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		}else {
			System.out.println("10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
		}
	}
}
