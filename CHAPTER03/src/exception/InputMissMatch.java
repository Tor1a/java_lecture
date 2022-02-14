package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMissMatch {
	public static void main(String[] args) {
		System.out.println("정수 3개를 입력하면 그 값을 더해서 출력합니다.");
		Scanner sc = new Scanner(System.in);
		int sum =0;
		for(int i=0;i<3;i++) {
			try {
				sum+=sc.nextInt();
			}catch(InputMismatchException e){
				System.out.println("정수가 아니에요");
			}
			
			
		}
		System.out.println(sum);
		sc.close();
	}
}
