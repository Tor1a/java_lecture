package ch0607;

public class StringEx {
	public static void main(String[] args) {
		String a = " c#";
		String b = ", c++";
		System.out.println(a+"�� ���̴�"+a.length());
		System.out.println(b+"�� ���̴�"+b.length());
		a= a.concat(b); // concat()�� ���ڿ� ����
		System.out.println(a);
		a = a.trim(); // ���� ����
		System.out.println(a);
		a = a.replace("c#", "java"); // �տ� �Ű������� ���� �Ű����� ���ڿ��� �ٲٱ�
		System.out.println(a);
		
		String strArray [] = a.split(",");
		System.out.println(strArray[0]);
		System.out.println(strArray[1]);
		a = a.substring(4);  // index 5������ ������
		System.out.println(a);
		char c= a.charAt(0); // �ش� index�� ���� ���� ����
		System.out.println(c);
		//db ���Ǹ� 
	}
}
