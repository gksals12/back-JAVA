package controlStatement;

import java.util.Scanner;

public class ForTask04 {
	public static void main(String[] args) {
//		해당 문자와 반복할 횟수를 입력하면 전체 문자열을 만들어주는 프로그램
//		예시) a1b3d2c4
		Scanner sc = new Scanner(System.in);
		String userMsg = null, userInput = null, temp = "";
		char charTemp = ' ';
		userMsg = "문자와 반복할 횟수를 입력하세요\nex)a1b3d2c4";
		System.out.println(userMsg);
		
		userInput = sc.next();
		
		for(int i = 0; i < userInput.length(); i++) {
			int intTemp = (int)userInput.charAt(i); // 아스키코드
			if(intTemp >= 97 && intTemp <= 122) {
				charTemp = (char)intTemp; // 알파벳일때 char에 저장
//				System.out.println(charTemp);
			}else if(intTemp >= 48 && intTemp <= 57) { // 숫자일때
				int count = intTemp - 48; // 아스키코드로 바꿨으니까 -48 해서 반복할 숫자 변환
				for(int j = 0; j < count; j ++) {
					System.out.print(charTemp); // 숫자를 카운트로 저장해서 카운트 만큼 문자 출력
				}
			}
		}
	}
}
