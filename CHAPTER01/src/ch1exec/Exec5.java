package ch1exec;

import java.util.Scanner;

public class Exec5 {
	public static void main(String[] args) {
		System.out.println("������ ���� ������ �Է��Ͻÿ�");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a< (b+c) && b< (a+c) && c < (a+b)) {
			System.out.println("�ﰢ���� �˴ϴ�.");
		}else {
			System.out.println("�ﰢ���� �ȵ˴ϴ�");
		}
	}
}
