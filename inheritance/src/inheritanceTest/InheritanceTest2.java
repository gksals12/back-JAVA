package inheritanceTest;

class AA {
   void paint() {
      System.out.print("A");// A
      draw(); // B
   }//AB
   
   void draw() {
      System.out.print("B");// B
   }//B
}


class BB extends AA {
   @Override
   void paint() {
      super.draw(); // B
      System.out.print("C"); // C
      this.draw(); // D
   }//BCD

   @Override
   void draw() {
      System.out.print("D"); //D
   }//D
}

public class InheritanceTest2 {
   public static void main(String[] args) {
      BB b = new BB();
      b.paint(); // BCD
      b.draw(); //D
   }

}