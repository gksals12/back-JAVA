package methodTest;

public class MethodTest {
	
//	3개의 정수를 받아서, 모두 뺸 값을 반환해주는 매서드
	int sub(int num1, int num2, int num3) {
		return num1 - num2 - num3;
	}
	
//	성과, 이름을 붙여서 출력해주는 매서드 선언
	void printFirstLastName(String firstName, String lastName) {
		String fullName = firstName + lastName;
		System.out.println(fullName);
	}
	
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		int sub = mt.sub(10, 2, 3);
		System.out.println(sub);
	}
}
