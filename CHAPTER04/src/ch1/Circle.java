package ch1;

public class Circle {
	// Circle에 대한 성사진 또는 문서 작업 / 설계도
	int radius;
	String name;
	// 특정 기술 즉 속성을 정의
	
	Circle() {
		//생성자 함수 생성 즉 instance를 만들때 어떤 행동이나 특징을 가지게 하고 싶을 때 생성자 함수를 만든다.
	}
	double getArea() {
		return radius*radius*3.14;
	}
	// 메서드 정의
	public static void main(String[] args) {
		Circle pizza;
		pizza = new Circle(); // instance 메모리에 올리기
		pizza.name = "자바피자";
		pizza.radius = 12;
		double area = pizza.getArea();
		System.out.println("내가 만든 Circle의 이름은 "+pizza.name+"이고 반지름은"+pizza.radius+"이고 면적은"+area+"이다");
		
		Circle donut = new Circle();
		donut.name ="던킨";
		donut.radius = 5;
		double area2 = donut.getArea();
		System.out.println("내가 만든 Circle의 이름은"+donut.name+"이고");
		
	}
}
