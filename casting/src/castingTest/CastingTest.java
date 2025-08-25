package castingTest;

class A {
	void test() {
		System.out.println("A");
	}
}

class B extends A{
	void test() {
		System.out.println("B");
	}
	void  test2() {
		System.out.println("BB");
	}
}

public class CastingTest {
	public static void main(String[] args) {
		A b = new B(); // upcasting
		B bb = (B)b;// downcasting
		b.test();
		bb.test2();
	}
	
}
