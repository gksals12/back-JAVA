package lambdaExpert;

import java.util.Scanner;

// 연산자 1개를 전달 받아서 알맞게 연산하도록 메서드를 구현
public class MyMath {
	public static Calc calculator(String oper) {
		return null;
	}
	
	public static void main(String[] args) {
//		사용자가 수식을 입력
		Scanner sc = new Scanner(System.in);
		String userMsg = "식을 입력하세요\nex)9 + 9 - 8", userInput = null;
		
		System.out.println(userMsg);
		userInput = sc.next();
		
//		전체 수식에서 연산자만 구별해서 처리
		OperCheck operCheck = (expression) -> {
				// expression -> userInput
				return null;
			};
				
		Calc calc = (num1, num2) -> {return 0;};
		
		operCheck.getOpers(userInput);
		
		
		
//		System.out.println(operCheck.getOpers(userInput));
		
		
	}
}
