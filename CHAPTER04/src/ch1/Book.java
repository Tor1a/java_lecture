package ch1;

public class Book {
   String title;
   String author;
   
   void show() {
      System.out.println("������ "+title+"=== ���ڴ�"+author);
   }
   //������ �����.....
   //this�� ��ü�� ����Ű�� ���ݷ����� ���⵵ �ϰ� �ڱ��ڽ��� ������ �Լ��� ȣ���Ҷ��� ����.
   Book() {
      this("�������","���ڹ̻�"); 
      // �Լ� ȣ���ϵ��� this();�� ȣ���ؼ� �� �� �ִ�. �ֳ��ϸ� �����ڵ� �ᱹ �Լ� �� �޼��� �̱⶧���̴�.
      System.out.println("����Ʈ ������ �Դϴ�.");
   }
   Book(String title) {
      this(title,"���ڹ̻�");
      //this.title = title;
      //this.author = "���ڹ̻�";
   }
   Book(String title, String author) {
      this.title = title;
      this.author = author;
   }
   public static void main(String[] args) {
      Book littlePrince = new Book("�����","�߶��㺣��");
      Book chunhyang = new Book("������");
      Book slamDunk = new Book(); // default Constructor�� �⺻�� �����ڰ� ������ ����.
      //System.out.println(littlePrince.title+"==="+littlePrince.author);
      //System.out.println(chunhyang.title+"==="+chunhyang.author);
      //System.out.println(slamDunk.title+"==="+slamDunk.author);
      littlePrince.show();
      chunhyang.show();
      slamDunk.show();
   }
}