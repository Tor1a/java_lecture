package ch1;

class shape2{
	public void paint() {
		draw();
	}
	public void draw() {
		System.out.println("shape");
	}
}
class Circle02 extends shape02{
	
}

public class MethodOverridingEx2 {
	public static void main(String[] args) {
		shapw02 s= new  Circle02();
		s.paint; // override 는 실행시(run time)에 결정된다. 독정 바인딩된다. override된게 우선 실행된다.
				
	}
}
