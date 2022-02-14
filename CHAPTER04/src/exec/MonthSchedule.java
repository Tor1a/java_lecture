package exec;

import java.util.Scanner;

class Day {
   private String work; // private �Ӽ��� �ܺο��� ������ ������ method�� �̿��Ѵ�.
   // ��ü�� default���� null�̴�.  char = 'a'
   public String get() {
      return work;
   }
   public void set(String work) {
      this.work = work;
   }
   public void show() {
      if(work == null) {
         System.out.println("������ �����ϴ�.");
      } else {
         System.out.println(work + "���� �ֽ��ϴ�.");
      }
   }
}


public class MonthSchedule {
    private Scanner scanner;
    private Day days[];
    private int nDays;
    // ������
    public MonthSchedule(int nDays) {
       this.nDays = nDays;
       this.days = new Day[nDays]; // ���� 30�� ¥���� �迭�� ����
       scanner = new Scanner(System.in);
       for(int i=0;i<days.length;i++) {
          days[i] = new Day();
       }
    }
    public void input() {
       System.out.println("��¥(1~30)?");
       int day = scanner.nextInt();
       System.out.println("���� (��ĭ���� �Է�)?");
       String work = scanner.next();
       day--;  //�̷��� �ϴ� ������ 1~30 �迭�� 0~29   �迭�� �׻� 0���� ���������� -1�� ���ش�.
       days[day].set(work);
    }
    public void view() {
       System.out.println("��¥(1~30)?");
       int day = scanner.nextInt();
       day--;
       System.out.println((day+1)+"�� �� ���� ");
       days[day].show();
    }
    public void finish() {
       scanner.close();
       System.out.println("finish");
    }
    public void run() {
       System.out.println("===�̹��� ������ ���α׷�===");
       while(true) {
          System.out.println("����(�Է�:1,����:2,������:3)");
          int menu = scanner.nextInt();
          switch(menu) {
             case 1:
               input();
               break;
             case 2:
                view();
                break;
             case 3: 
                finish();
                return;
             default : 
                System.out.println("1,2,3 �� �ϳ��� �Է��ϼ���.");
          }
          System.out.println("============");
       }
    }
    public static void main(String[] args) {
       MonthSchedule august = new MonthSchedule(31);
       august.run();
    }
}


























