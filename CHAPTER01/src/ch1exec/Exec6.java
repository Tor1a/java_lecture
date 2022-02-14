package ch1exec;

import java.util.Scanner;

public class Exec6 {
	public static void main(String[] args) {
		System.out.println("1부터 99사이의 정수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int clap =0;
		int num = sc.nextInt();
		int first = num/10;
		int second = num%10;
		if(first % 3 ==0 && first !=0) {
			clap ++;
		}if (second %3==0 && second !=0) {
			clap ++;
		}if(clap==1) {
			System.out.println("박수 짝");
		}else if(clap==2) {
			System.out.println("박수 짝짝");
		}
	}
}
