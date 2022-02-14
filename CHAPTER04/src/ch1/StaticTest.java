package ch1;

import java.util.Scanner;

class CurrencyConverter{
	//private은 다른데서 사용 불가능 만약 쓰고 싶으면 getter/setter를 만들어서 사용한다
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
		System.out.println("1달러에 해당하는 환율을 입력하세요");
		double tempRate = sc.nextDouble();
		CurrencyConverter.setRate(tempRate);
		System.out.println("백만원 달러로 바꾸면"+CurrencyConverter.toDollar(100000));
		System.out.println("백달러는"+CurrencyConverter.toWon(100));
		
	}
}
