package ch1;

import java.util.Scanner;

class CurrencyConverter{
	//private�� �ٸ����� ��� �Ұ��� ���� ���� ������ getter/setter�� ���� ����Ѵ�
	private static double rate;
	public static void setRate(double rate) {
		CurrencyConverter.rate = rate;
	}
	public static double toDollar(double won) {
		return won/rate;
	}
	public static double toWon(double dollar) {
		return dollar*rate;
	}
//	public static void setRate(double r) {
//		rate =r;
//	}
}

public class StaticTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1�޷��� �ش��ϴ� ȯ���� �Է��ϼ���");
		double tempRate = sc.nextDouble();
		CurrencyConverter.setRate(tempRate);
		System.out.println("�鸸�� �޷��� �ٲٸ�"+CurrencyConverter.toDollar(100000));
		System.out.println("��޷���"+CurrencyConverter.toWon(100));
		
	}
}
