package ch1;

public class HelloWorld2 {

	// main이 실행을 담당한다.
	// 즉 main은 두개가 존재하면 안된다
	
	public static int sum(int n, int m) {
		return n+m;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		int s = sum(10,20);
		// 션부 선언할때 규칙
		// 웬만하면 영어로 한글로 써도 됨
		int a = 10;
		int 첫번째 = 10;
		// 띄어쓰기 안됨, 특수문자 안됨(+,$ 허용) 예약어 if, else 안됨
		System.out.println(s);
		
		// java는 변수명 앞에 타입을 먼저 정의한다.
		// 타입을 벗어난 다른 값을 넣을 수 없다.
		/*
		int i = 12;
		int s;
		s=20;
		char a = 'a';
		System.out.println(i);
		System.out.println(s);
		System.out.println(a);
		*/
		// 클래스 내에 선언된 변수를 멤버변수 또는 속성(properties)이라고 한다.
	}

}
