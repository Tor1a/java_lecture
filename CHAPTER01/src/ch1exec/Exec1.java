package ch1exec;

import java.util.Scanner;

public class Exec1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��ȭ�� �Է��ϼ���");
		int one = scanner.nextInt();
		double dollar=one/1100;
		System.out.println(one+"���� $"+dollar+"�Դϴ�.");
		scanner.close();
		
	}
}

