package ch1;

public class Circle {
	// Circle�� ���� ������ �Ǵ� ���� �۾� / ���赵
	int radius;
	String name;
	// Ư�� ��� �� �Ӽ��� ����
	
	Circle() {
		//������ �Լ� ���� �� instance�� ���鶧 � �ൿ�̳� Ư¡�� ������ �ϰ� ���� �� ������ �Լ��� �����.
	}
	double getArea() {
		return radius*radius*3.14;
	}
	// �޼��� ����
	public static void main(String[] args) {
		Circle pizza;
		pizza = new Circle(); // instance �޸𸮿� �ø���
		pizza.name = "�ڹ�����";
		pizza.radius = 12;
		double area = pizza.getArea();
		System.out.println("���� ���� Circle�� �̸��� "+pizza.name+"�̰� ��������"+pizza.radius+"�̰� ������"+area+"�̴�");
		
		Circle donut = new Circle();
		donut.name ="��Ų";
		donut.radius = 5;
		double area2 = donut.getArea();
		System.out.println("���� ���� Circle�� �̸���"+donut.name+"�̰�");
		
	}
}
