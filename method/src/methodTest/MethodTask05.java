package methodTest;

import java.util.Scanner;

public class MethodTask05 {
	
//	1. 1~n까지의 합을 구해서 결과를 반환해주는 함수
//	param o
//	반복 -> loop(for)
//	type -> return
	
	int addTotal(int num) {
		int tempTotal = 0;
		for(int i = 0; i < num; i++) {
			int intTemp = i + 1;
			tempTotal += intTemp;
		}
		return tempTotal;
	}
	
// 	2. 어떤 값을 전달하면 홀수인지, 짝수인지, 문자열인지 확인한 결과를 반환해주는 메서드
//	param 0
//	반복?
//	type -> sys?
//	get input check string or int
//	if string -> print string
//	if int -> check add or even
//	if even -> print even
//	if odd -> print odd
	
	String printOddEvenString(String arg) {
		String result = "";
		boolean isNumber = false;
		for(int i = 0; i < arg.length(); i++) {
			char charTemp = arg.charAt(i);
			if(charTemp >= '0' && charTemp <= '9') {
				isNumber = true;
			}else {
				isNumber = false;
				break;
			}
		}
		if(isNumber) {
			result = Integer.parseInt(arg) % 2 == 1 ? "홀수" : "짝수";
		}else{
			result = "문자열";
		}
		return result;
	}
	
// 	3. 문자열을 입력하면 모두 대문자로 바꿔서 출력해주는 메서드
//	param o
//	반복->loop(for)
//	type -> sysot -> void
	void convertLowercaseToUppercase(String arg) {
		for(int i = 0; i < arg.length(); i++) {
			int intTemp = arg.charAt(i);
			if(intTemp >= 65 && intTemp <= 90 /*대문자에서 소문자*/) {
				intTemp += 32;
			}else if(intTemp >= 97 && intTemp <= 122 /*소문자에서 대문자*/) {
				intTemp -= 32;
			}
			System.out.print((char)intTemp);
		}
		System.out.println();
	}
// 	4. 어떤 문자열을 전달하면 반대로 출력해주는 메서드
// 	입력 예시) abcdef
// 	출력 예시) fedcba
//	param o 
//	반복 -> loop(for)
//	type -> sysout -> void
	void reverseWord(String arg) {
		String result = "";
		for(int i = 0; i < arg.length(); i++) {
			char strTemp = arg.charAt(arg.length() - 1 -i);
			result += strTemp;
		}
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MethodTask05 mt = new MethodTask05();
		
//		1. 1~n까지의 합을 구해서 결과를 반환해주는 함수
		int result1 =mt.addTotal(10);
		System.out.println(result1);
		
//	 	2. 어떤 값을 전달하면 홀수인지, 짝수인지, 문자열인지 확인한 결과를 반환해주는 메서드
		
		String userMsg1 = "문자열 또는 문자 또는 숫자를 입력해주세요\nex)abc 또는 10 또는 9", userInput1 = null;
		System.out.println(userMsg1);
		userInput1 = sc.next();
		System.out.println(mt.printOddEvenString(userInput1));
		
//	 	3. 문자열을 입력하면 모두 대문자로 바꿔서 출력해주는 메서드
		String userMsg2 = "대소문자로 바꾸고싶은 문자를 입력하세요\nex)apple 또는 APPLE", userInput2 = null;
		System.out.println(userMsg2);
		userInput2 = sc.next();
		mt.convertLowercaseToUppercase(userInput2);
		
//	 	4. 어떤 문자열을 전달하면 반대로 출력해주는 메서드
		String userMsg3 = "반대로 바꾸고 싶은 문자를 입력해주세요\nex)apple -> elppa", userInput3 = null;
		
		System.out.println(userMsg3);
		userInput3 = sc.next();
		mt.reverseWord(userInput3);
	}
}
