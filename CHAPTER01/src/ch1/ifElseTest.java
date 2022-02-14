package ch1;

import java.util.Scanner;

public class ifElseTest {
	public static void main(String[] args) {
		Scanner scaneer = new Scanner(System.in);
		System.out.println("숫자를 입력하시오");
		int num = scaneer.nextInt();
		String result;
		result = num % 3==0 ? "3의 배수" : "3의 배수 아님";
		System.out.println(result);
		
		// 윤년 구하기... 4로 떨어지면 윤년 100으로 떨어지면 윤년 아님.. 400으로 떨어지면 윤년
		// 연도 입력받고 윤년인지 아닌지 판단하기
		
		
	}
}
