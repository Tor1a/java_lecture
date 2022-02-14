package ch0607;

public class StringEx {
	public static void main(String[] args) {
		String a = " c#";
		String b = ", c++";
		System.out.println(a+"의 길이는"+a.length());
		System.out.println(b+"의 길이는"+b.length());
		a= a.concat(b); // concat()은 문자열 연결
		System.out.println(a);
		a = a.trim(); // 공백 제거
		System.out.println(a);
		a = a.replace("c#", "java"); // 앞에 매개변수를 뒤의 매개변수 문자열로 바꾸기
		System.out.println(a);
		
		String strArray [] = a.split(",");
		System.out.println(strArray[0]);
		System.out.println(strArray[1]);
		a = a.substring(4);  // index 5번부터 끝까지
		System.out.println(a);
		char c= a.charAt(0); // 해당 index에 대한 문자 리턴
		System.out.println(c);
		//db 질의를 
	}
}
