package exec;

import java.util.Scanner;

public class Exec9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int intArray[] = new int[num];
		for(int i=0; i<intArray.length;i++) {
			int random = (int)(Math.random()*100+1);
			for(int j=0; j<i;j++) {
				if(intArray[j] == random) {
					i--;
					continue;
				}
			}
		}
	}
}
