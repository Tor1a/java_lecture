package array;

public class Array5 {
	public static void main(String[] args) {
		//������ �迭
		double score [][] = {
				{3.3,3.4},
				{4.2,3.8},
				{3.7,3.2},
				{3.9,4.1}
		};// 1�г�
		System.out.println(score[3][0]);
		double sum =0;
		for(int year =0; year<score.length;year++) {
			for(int term=0;term<score[year].length;term++) {
				sum+=score[year][term];
			}
		}
		int yearTotal = score.length;
		int termTotal = score[0].length;
		System.out.println("������"+sum+"�Դϴ�.");
		System.out.println("�����"+sum/(yearTotal*termTotal)+"�Դϴ�.");
	}
}
