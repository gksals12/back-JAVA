package controlStatement;

import java.util.Scanner;

public class IfTask01 {
	public static void main(String[] args) {
//		두 수의 크기 비교
		Scanner sc = new Scanner(System.in);
		
		String userMsg = null, compareMsg = null, equalMsg = null;
		int userInt1 = 0, userInt2 = 0;
		
		userMsg = "비교 할 두 정수를 입력하세요 ex) 10 20";
		System.out.println(userMsg);
		
		userInt1 = sc.nextInt();
		userInt2 = sc.nextInt();
		
		compareMsg = "큰값 : %d\n작은값 : %d";
		equalMsg = "두 정수가 같습니다";
		if(userInt1 < userInt2) {
			System.out.printf(compareMsg, userInt2, userInt1);
		}else if(userInt1 == userInt2) {
			System.out.println(equalMsg);
		}
		else {
			System.out.printf(compareMsg, userInt1, userInt2);
		}
	}
}
