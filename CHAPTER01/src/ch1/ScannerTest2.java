package ch1;

import java.util.Scanner;

public class ScannerTest2 {
	public static void main(String[] args) {
		System.out.println("�̸� ���� ���� ü���� ��ĭ���� �����ؼ� �Է��Ͻÿ�");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		System.out.println("����� �̸��� "+name+"�̰�,");
		
		String city = scanner.next();
		System.out.println("����� ��°���" +city+"�̰�,");
		
		int age = scanner.nextInt();
		System.out.println("����� ���̴�"+age+"�̰�,");
		
		int weight = scanner.nextInt();
		System.out.println("�����Դ�"+weight+"�Դϴ�.");
		
		scanner.close();
		
	}
}
