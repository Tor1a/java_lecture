package ch1exec;

import java.util.Scanner;

public class Exec3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ݾ��� �Է��ϼ���");
		int num =sc.nextInt();
		System.out.println("5������"+num/50000+"��");
		num%=50000;
		System.out.println("������"+num/10000+"��");
		num%=10000;
		System.out.println("õ����"+num/1000+"��");
		num%=1000;
		System.out.println("���"+num/100+"��");
		num%=100;
		System.out.println("���ʿ�"+num/50+"��");
		num%=50;
		System.out.println("�ʿ�"+num/10+"��");
		num%=10;
		System.out.println("�Ͽ�"+num/1+"��");
		sc.close();
		
	}
}
