package ch1303;

public class MainThread {
	public static void main(String[] args) {
		//main�޼��嵵 �ϳ��� �����带 ������ �ִ�.
		//���ε� �ϳ��� task�� �����ϰ� �ִ� Thread�̴�.
		System.out.println("���ε� �ϳ��� �������.=="+Thread.currentThread().getName());
		System.out.println("������ �ּҿ켱������.=="+Thread.MIN_PRIORITY);
		System.out.println("������ �ִ�켱������.=="+Thread.MAX_PRIORITY);
		System.out.println("������ �߰���.=="+Thread.NORM_PRIORITY);
		System.out.println("���� �������� �������� �켱����.=="+Thread.currentThread().getPriority());
		System.out.println("���� �������� �������� id.=="+Thread.currentThread().getId());
		System.out.println("���� �������� �������� ����.=="+Thread.currentThread().getState());
	}
}
