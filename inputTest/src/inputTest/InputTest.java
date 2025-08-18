package inputTest;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String msg = "이름을 입력하세요", name = null, lastName = null, firstName = null;
		System.out.println(msg);
		
//		공백 문자를 기준으로 잘라서 값을 가져옴
//		lastName = sc.next();
//		firstName = sc.next();
		
//		공백 문자도 포함해서 값으로 가져옴
		name = sc.nextLine();
		sc.close();
		System.out.println(name + "님 환영합니다");
	}
}
