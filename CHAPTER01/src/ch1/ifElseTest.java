package ch1;

import java.util.Scanner;

public class ifElseTest {
	public static void main(String[] args) {
		Scanner scaneer = new Scanner(System.in);
		System.out.println("���ڸ� �Է��Ͻÿ�");
		int num = scaneer.nextInt();
		String result;
		result = num % 3==0 ? "3�� ���" : "3�� ��� �ƴ�";
		System.out.println(result);
		
		// ���� ���ϱ�... 4�� �������� ���� 100���� �������� ���� �ƴ�.. 400���� �������� ����
		// ���� �Է¹ް� �������� �ƴ��� �Ǵ��ϱ�
		
		
	}
}
