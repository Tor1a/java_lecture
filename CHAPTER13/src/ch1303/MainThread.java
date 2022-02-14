package ch1303;

public class MainThread {
	public static void main(String[] args) {
		//main메서드도 하나의 스레드를 가지고 있다.
		//메인도 하나의 task를 수행하고 있는 Thread이다.
		System.out.println("메인도 하나의 스레드다.=="+Thread.currentThread().getName());
		System.out.println("스레드 최소우선순위값.=="+Thread.MIN_PRIORITY);
		System.out.println("스레드 최대우선순위값.=="+Thread.MAX_PRIORITY);
		System.out.println("스레드 중간값.=="+Thread.NORM_PRIORITY);
		System.out.println("현재 진행중인 스레드의 우선순위.=="+Thread.currentThread().getPriority());
		System.out.println("현재 진행중인 스레드의 id.=="+Thread.currentThread().getId());
		System.out.println("현재 진행중인 스레드의 상태.=="+Thread.currentThread().getState());
	}
}
