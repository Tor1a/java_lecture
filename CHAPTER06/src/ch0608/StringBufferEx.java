package ch0608;

public class StringBufferEx {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("this");
		sb.append(" is a pen"); // �߰��ϱ�
		System.out.println(sb);
		sb.insert(7, " my"); // 7�� index�ڿ� �߰�
		System.out.println(sb);
		String str = sb.toString(); // ���ڿ��� ��ȯ
		System.out.println(str);
		sb.replace(8,  11, "your ");// 8~11 ���̸� �ش�Ǵ� ���ڿ��� ��ȯ
		System.out.println(sb);
		sb.setLength(3);
		System.out.println(sb);
	}
}
