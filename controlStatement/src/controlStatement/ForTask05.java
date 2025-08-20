package controlStatement;

import java.util.Scanner;

public class ForTask05 {
	public static void main(String[] args) {
//		1. ACEG 출력 
//		A b C d E f G -> index 홀수 또는 65~90 아스키코드 홀수
		int intTemp1 = "A".charAt(0); //65
//		System.out.println(intTemp1);
		for(int i = 0; i < 26; i++) {
			if((intTemp1 + i) % 2 == 1) {
				System.out.print((char)(intTemp1 + i));
			}
		}
		System.out.println();
		
//		2. 1부터N 까지 합 출력
		Scanner sc = new Scanner(System.in);
		String userMsg1 = null;
		int userInt = 0, total = 1;
		
		userMsg1 = "1부터 더하고싶은 숫자를 입력하세요\nex)10";
		System.out.println(userMsg1);
		
		userInt = sc.nextInt();
		for(int i = 0; i < userInt; i++) {
			total += i + 1;
		}
		System.out.println(total);
		
//		3. 0123401234 출력
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(j);
			}
		}
		System.out.println();
		
//		4. a1b22c357
		String userMsg2 = null, userInput = null, temp = "";
		char charTemp = ' ';
		userMsg2 = "문자와 반복할 횟수를 입력하세요\nex)a1b3d2c4";
		System.out.println(userMsg2);
		
		userInput = sc.next();
		
		for(int i = 0; i < userInput.length(); i++) {
			int intTemp = (int)userInput.charAt(i); // 아스키코드
			if(intTemp >= 97 && intTemp <= 122) {
				charTemp = (char)intTemp; // 알파벳일때 char에 저장
//				System.out.println(charTemp);
			}else {
				temp += userInput.charAt(i);
				for(int j = 0; j < Integer.parseInt(temp); j++) {
					System.out.print(charTemp);
				}
			}
		}
		
	}
}
