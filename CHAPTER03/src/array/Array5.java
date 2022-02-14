package array;

public class Array5 {
	public static void main(String[] args) {
		//다차원 배열
		double score [][] = {
				{3.3,3.4},
				{4.2,3.8},
				{3.7,3.2},
				{3.9,4.1}
		};// 1학년
		System.out.println(score[3][0]);
		double sum =0;
		for(int year =0; year<score.length;year++) {
			for(int term=0;term<score[year].length;term++) {
				sum+=score[year][term];
			}
		}
		int yearTotal = score.length;
		int termTotal = score[0].length;
		System.out.println("총점은"+sum+"입니다.");
		System.out.println("평균은"+sum/(yearTotal*termTotal)+"입니다.");
	}
}
