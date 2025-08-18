package inputTest;

import java.util.Scanner;

public class InputTask01 {
	public static void main(String[] args) {
//		사용자에게 정수를 2개 입력 받고,
//		두 수를 더해서 출력하기
//		30, 50 = 80
		Scanner sc = new Scanner(System.in);
		String userMsg = null, userInput1 = null, userInput2 = null;
		int userInputSum = 0, userInputInt1 = 0, userInputInt2 = 0;
		
		userMsg = "2개의 숫자를 입력하세요";
		System.out.println(userMsg);
		
		userInput1 = sc.next();
		userInput2 = sc.next();
		sc.close();
		
		userInputInt1 = Integer.parseInt(userInput1);/* String to int */
		userInputInt2 = Integer.parseInt(userInput2);/* String to int */
		
		userInputSum = userInputInt1 + userInputInt2;
		
		System.out.println(userInputSum);
	}
}
