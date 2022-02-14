package ch1;

public class Circle4 {
	int radius;
	Circle4(int radius){
		this.radius = radius;
	}
	double getArea() {
		return radius*radius*3.13;
	}
	public static void main(String[] args) {
//		Circle4 c1 = new Circle4(1);
//		Circle4 c2 = new Circle4(2);
//		Circle4 c3 = new Circle4(3);
//		Circle4 c4 = new Circle4(4);
//		Circle4 c5 = new Circle4(5);
		
		Circle4 circleArray[] = new Circle4[5];
		for(int i=0;i<5;i++) {
			circleArray[i] = new Circle4(i+1);
		}
		System.out.println(circleArray[2].getArea());
	}
}
