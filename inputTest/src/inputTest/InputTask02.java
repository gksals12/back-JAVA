package inputTest;

import java.util.Scanner;

public class InputTask02 {
	public static void main(String[] args) {
//		3개의 정수를 한 번에 받은 후
//		세 정수의 곱셈을 출력
		Scanner sc = new Scanner(System.in);
		
		String userMsg = null, userInput1 = null, userInput2 = null, userInput3 = null, resultMsg = null;
		int userInt1 = 0, userInt2 = 0, userInt3 = 0, userIntMul = 0;
		
		userMsg = "곱해야할 숫자 3개를 입력하세요 ex)10 20 30";
		resultMsg = "첫번째 숫자 : %s\n두번째 숫자 : %s\n세번째 숫자 : %s\n%d * %d * %d = %d";
		System.out.println(userMsg);
		
		userInput1 = sc.next();/* get userInput */
		userInput2 = sc.next();/* get userInput */
		userInput3 = sc.next();/* get userInput */
		sc.close();
		
		userInt1 = Integer.parseInt(userInput1);/* String to int */
		userInt2 = Integer.parseInt(userInput2);/* String to int */
		userInt3 = Integer.parseInt(userInput3);/* String to int */
		
		userIntMul = userInt1 * userInt2 * userInt3;
		
		System.out.printf(resultMsg, userInt1, userInt2, userInt3, userInt1, userInt2, userInt3, userIntMul);
	}
}
