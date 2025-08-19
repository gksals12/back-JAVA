package operaterTest;

import java.util.Scanner;

public class OperTask01 {
	public static void main(String[] args) {
//		사용자가 입력한 값이 정수인지 실수인지 확인하여 결과를 출력하시오
		Scanner sc = new Scanner(System.in);
		String userMsg = null, userInput = null, result = null, intMsg = null, doubleMsg = null;
		int userInt = 0;
		double userDouble = 0.0;
		
		intMsg = "정수";
		doubleMsg = "실수";
		
		userMsg = "숫자를 입력하세요 ex) 8, 8.8, 10";
		System.out.println(userMsg);
		userInput = sc.next();
		
		userDouble = Double.parseDouble(userInput);
		userInt = (int)userDouble;
		result = userDouble - userInt == 0 ? intMsg : doubleMsg;
		
		System.out.println(result);
	}
}
