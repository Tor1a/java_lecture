package ch01;

class Person04 {}
class Student04 extends Person04 {}
class Researcher extends Person04 {}
class Professor extends Researcher{}

public class InstanceOfEx {
   static void printType(Person04 p) {
      if(p instanceof Person04) {
         System.out.println("Person�Դϴ�.");
      }
      if(p instanceof Student04) {
         System.out.println("Student�Դϴ�.");
      }
      if(p instanceof Researcher) {
         System.out.println("Researcher�Դϴ�.");
      }
      if(p instanceof Professor) {
         System.out.println("Professor�Դϴ�.");
      }
      System.out.println("========");
   }
   public static void main(String[] args) {
      //static���� �ҷ��� �� �Լ��� �ݵ�� static�̾�� �Ѵ�.
      //��ü�� type�� ���ϴ°�
      printType(new Student04());
      printType(new Researcher());
      printType(new Professor());
   }
}








