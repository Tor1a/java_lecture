package exec;

import java.util.Scanner;

public class Exec3 {
	public static void main(String[] args) {
		System.out.println("������ �Է��Ͻÿ�");
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		for(int i=num; i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.println("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
