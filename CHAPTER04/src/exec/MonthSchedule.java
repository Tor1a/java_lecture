package exec;

import java.util.Scanner;

class Day {
   private String work; // private 속성을 외부에서 가져다 쓸려면 method를 이용한다.
   // 객체의 default값은 null이당.  char = 'a'
   public String get() {
      return work;
   }
   public void set(String work) {
      this.work = work;
   }
   public void show() {
      if(work == null) {
         System.out.println("할일이 없습니다.");
      } else {
         System.out.println(work + "일이 있습니다.");
      }
   }
}


public class MonthSchedule {
    private Scanner scanner;
    private Day days[];
    private int nDays;
    // 생성자
    public MonthSchedule(int nDays) {
       this.nDays = nDays;
       this.days = new Day[nDays]; // 길이 30개 짜리의 배열이 생성
       scanner = new Scanner(System.in);
       for(int i=0;i<days.length;i++) {
          days[i] = new Day();
       }
    }
    public void input() {
       System.out.println("날짜(1~30)?");
       int day = scanner.nextInt();
       System.out.println("할일 (빈칸없이 입력)?");
       String work = scanner.next();
       day--;  //이렇게 하는 이유가 1~30 배열은 0~29   배열은 항상 0부터 시작함으로 -1을 해준다.
       days[day].set(work);
    }
    public void view() {
       System.out.println("날짜(1~30)?");
       int day = scanner.nextInt();
       day--;
       System.out.println((day+1)+"의 할 일은 ");
       days[day].show();
    }
    public void finish() {
       scanner.close();
       System.out.println("finish");
    }
    public void run() {
       System.out.println("===이번달 스케쥴 프로그램===");
       while(true) {
          System.out.println("할일(입력:1,보기:2,끝내기:3)");
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
                System.out.println("1,2,3 중 하나만 입력하세요.");
          }
          System.out.println("============");
       }
    }
    public static void main(String[] args) {
       MonthSchedule august = new MonthSchedule(31);
       august.run();
    }
}


























