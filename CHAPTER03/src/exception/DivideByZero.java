package exception;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		int num1;
		int num2;
		System.out.println("숫자를 입력하시오");
		num1 = sc.nextInt();
		System.out.println("어떤 수로 나눌껀가요?");
		num2 = sc.nextInt();
		try {
			System.out.println(num1+"을"+num2+"로 나누면"+(num1/num2)+"입니다.");
			break;
		}catch(ArithmeticException e) {
			// 예외 발생했을때 처리해야하는 문장
			System.out.println("정수를 0으로 나눌 수는 없어요");
		}
		}
		sc.close();

	}
	
	//try {} catch finally
	// 예외 발생한곳으로 던저버리는 throw exception
}
