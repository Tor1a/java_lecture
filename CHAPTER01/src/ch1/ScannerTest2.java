package ch1;

import java.util.Scanner;

public class ScannerTest2 {
	public static void main(String[] args) {
		System.out.println("이름 도시 나이 체중을 빈칸으로 구분해서 입력하시오");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		System.out.println("당신의 이름은 "+name+"이고,");
		
		String city = scanner.next();
		System.out.println("당신이 사는곳은" +city+"이고,");
		
		int age = scanner.nextInt();
		System.out.println("당신의 나이는"+age+"이고,");
		
		int weight = scanner.nextInt();
		System.out.println("몸무게는"+weight+"입니다.");
		
		scanner.close();
		
	}
}
