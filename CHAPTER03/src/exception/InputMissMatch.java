package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMissMatch {
	public static void main(String[] args) {
		System.out.println("���� 3���� �Է��ϸ� �� ���� ���ؼ� ����մϴ�.");
		Scanner sc = new Scanner(System.in);
		int sum =0;
		for(int i=0;i<3;i++) {
			try {
				sum+=sc.nextInt();
			}catch(InputMismatchException e){
				System.out.println("������ �ƴϿ���");
			}
			
			
		}
		System.out.println(sum);
		sc.close();
	}
}
