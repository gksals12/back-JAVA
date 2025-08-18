package castingTest;

public class CastingTest {
	public static void main(String[] args) {
		System.out.println(1 + 2.5); // 자동형변환 (정수 + 실수 = 실수) 3.5
		System.out.println(5 + 3); // (정수 + 정수 = 정수) 8
		System.out.println(5 / 2); // (정수 / 정수 = 정수) 2
		System.out.println(5.0 / 2); // (실수 / 정수 = 실수) 2.5
		System.out.println(5 / (double)2); // 강제형변환 (정수 / (원하는타입)정수) 2.5
		System.out.println((int)(5 / (double)2)); // 강제형변환 ((원하는타입)(정수 / (원하는타입)정수)) 2
		

	}
}
