package ch1306;
class Food {
   synchronized public void receiveOrder(String Waiter) {
		for(int i=0;i<5;i++) {
			System.out.println(Waiter+"�� �ֹ��� �޽��ϴ�.");
		}
		System.out.println(Waiter+"�� �ֹ��� �ֹ濡 �����մϴ�.");
		System.out.println("====");
	}
   synchronized public void makeFood(String Chef) {
		for(int i=0;i<5;i++) {
			System.out.println(Chef+"�� ������ ����ϴ�.");
		}
		System.out.println(Chef+"�� ������ �� ��������ϴ�.");
		System.out.println("====");
	}
}
class Waiter extends Thread {
	String Waiter;
	Food food;
	public Waiter(String Waiter,Food food) {
		this.Waiter= Waiter;
		this.food = food;
	}
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			food.receiveOrder(Waiter);
		}
	}
}
class Chef extends Thread {
	String Chef;
	Food food;
	public Chef(String Chef,Food food) {
		this.Chef= Chef;
		this.food = food;
	}
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			food.makeFood(Chef);
		}
	}
}
public class Restaurant {
	public static void main(String[] args) {
		Food food = new Food();
		Waiter waiter = new Waiter("������ ��������",food);
		Chef chef = new Chef("�丮�� ������",food);
		waiter.start();
		chef.start();
	}
}






