package exception;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		int num1;
		int num2;
		System.out.println("���ڸ� �Է��Ͻÿ�");
		num1 = sc.nextInt();
		System.out.println("� ���� ����������?");
		num2 = sc.nextInt();
		try {
			System.out.println(num1+"��"+num2+"�� ������"+(num1/num2)+"�Դϴ�.");
			break;
		}catch(ArithmeticException e) {
			// ���� �߻������� ó���ؾ��ϴ� ����
			System.out.println("������ 0���� ���� ���� �����");
		}
		}
		sc.close();

	}
	
	//try {} catch finally
	// ���� �߻��Ѱ����� ���������� throw exception
}
