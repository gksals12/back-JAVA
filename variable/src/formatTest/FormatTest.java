package formatTest;

public class FormatTest {
	public static void main(String[] args) {
//		이름
//		나이
//		키
		String name = "홍길동";
		int age = 19;
		float height = 177.0F;
		System.out.printf("저의 이름은 %s이고, 나이는 %d, 키는 %.1fcm입니다", name, age, height);
	}
}
