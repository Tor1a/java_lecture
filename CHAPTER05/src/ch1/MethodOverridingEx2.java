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
		s.paint; // override �� �����(run time)�� �����ȴ�. ���� ���ε��ȴ�. override�Ȱ� �켱 ����ȴ�.
				
	}
}
