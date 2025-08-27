package innerTest;

public class InnerTest {
	
//	내부클래스
	public class Test{
		int value = 10;
		public Test() {
			this.value = 20;
		}
		
		public void printValue() {
			System.out.println(this.value);
		}
	}
	public static void main(String[] args) {
		InnerTest it = new InnerTest();
		it.new Test().printValue();
	}
}
