package ch1;

public class Circle2 {

	int radius;
	String name;
	
	Circle2(){
		radius =10;
		name  = "noname";
	}
	Circle2(int r,String n){
		radius =r;
		name =n;
	}
	//오버로딩 같은 이름의 함수를 여러개 만들어 쓰기
	double getArea() {
		return radius*radius*3.14;
	}
	public static void main(String[] args) {
		Circle2 pizza = new Circle2();
		System.out.println(pizza.radius);
		System.out.println(pizza.name);
		
		Circle2 donut = new Circle2(20, "던킨");
		System.out.println(donut.radius);
		System.out.println(donut.name);
	}
	
}
