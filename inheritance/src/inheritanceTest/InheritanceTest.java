package inheritanceTest;

// 부모 클래스
class A {
   String name;
   int data;
   
   public A() {
      System.out.println(this);
      System.out.println("부모 생성자 호출");
      this.name = "A";
      this.data = 10;
   }
   
   void printName() {
      System.out.println(name);
   }
   
   void walk() {
      System.out.println("네 발로 걷기");
   }
}

// 자식 클래스
class B extends A {
   public B() {
      super();
      System.out.println(this);
      System.out.println("자식 생성자 호출됨");
   }
   
   void printData() {
      System.out.println(data);
      System.out.println(this.data);
      System.out.println(super.data);
   }
   
//   오버 라이딩
   @Override
   void walk() {
      System.out.println("두 발로 걷는다.");
   }
}

public class InheritanceTest {
   public static void main(String[] args) {
      B b = new B();
      A a = new A();
      b.walk();
      a.walk();
   }
}








