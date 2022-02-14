package ch0608;

public class StringBufferEx {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("this");
		sb.append(" is a pen"); // 추가하기
		System.out.println(sb);
		sb.insert(7, " my"); // 7번 index뒤에 추가
		System.out.println(sb);
		String str = sb.toString(); // 문자열로 변환
		System.out.println(str);
		sb.replace(8,  11, "your ");// 8~11 사이를 해당되는 문자열로 변환
		System.out.println(sb);
		sb.setLength(3);
		System.out.println(sb);
	}
}
