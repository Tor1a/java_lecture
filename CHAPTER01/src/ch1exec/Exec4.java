package ch1exec;

import java.util.Scanner;

public class Exec4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 3���� �Է��ϼ���");
		int first = sc.nextInt();
		int second = sc.nextInt();
		int third = sc.nextInt();
		// 33 100 20
		int middle = first;
		if ((first >= second && first <= third) || (first>=third && first<= second)){
			middle = first;
		} else if((second >=first && second<=third) || (second>=third && second<=first)) {
			middle = second;
		} else {
			middle = third;
		}
		System.out.println("�߰�����"+middle+"�Դϴ�.");
		sc.close();
	}
}
