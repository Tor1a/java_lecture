package ch1;

public class Book {
   String title;
   String author;
   
   void show() {
      System.out.println("제목은 "+title+"=== 저자는"+author);
   }
   //생성자 만들기.....
   //this는 객체를 가리키는 레펀런스로 쓰기도 하고 자기자신의 생성자 함수를 호출할때도 쓴다.
   Book() {
      this("제목없음","작자미상"); 
      // 함수 호출하듯이 this();를 호출해서 쓸 수 있다. 왜냐하면 생성자도 결국 함수 즉 메서드 이기때문이다.
      System.out.println("디폴트 생성자 입니다.");
   }
   Book(String title) {
      this(title,"작자미상");
      //this.title = title;
      //this.author = "작자미상";
   }
   Book(String title, String author) {
      this.title = title;
      this.author = author;
   }
   public static void main(String[] args) {
      Book littlePrince = new Book("어린왕자","쌩떽쥐베리");
      Book chunhyang = new Book("춘향전");
      Book slamDunk = new Book(); // default Constructor는 기본에 생성자가 없을때 쓴다.
      //System.out.println(littlePrince.title+"==="+littlePrince.author);
      //System.out.println(chunhyang.title+"==="+chunhyang.author);
      //System.out.println(slamDunk.title+"==="+slamDunk.author);
      littlePrince.show();
      chunhyang.show();
      slamDunk.show();
   }
}