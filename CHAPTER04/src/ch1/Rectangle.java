package ch1;

import java.util.Scanner;

public class Rectangle {
	int width;
	int height;
	
	int getArea() {
		return width*height;
	}
	
	public static void main(String[] args) {
		System.out.println("���� ���̸� �Է��ϼ���");
		Rectangle rect = new Rectangle();
		Scanner sc = new Scanner(System.in);
		rect.width = sc.nextInt();
		rect.height = sc.nextInt();
		int area = rect.getArea();
		System.out.println("�簢���� ������"+area+"�Դϴ�.");
		sc.close();
	}
}
