package controlStatement;

import java.util.Scanner;

public class ForTask01 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		String userMsg = null, userInput = null, strTemp = "";
		char charTemp = ' ';
		int intTemp = 0, intGap = 48;
		
		userMsg = "텍스틀 입력하세요\nex)abZ182bePz92";
		System.out.println(userMsg);
		userInput = sc.next();
		
		for(int i = 0; i < userInput.length(); i++) {
			charTemp = userInput.charAt(i);
			if(charTemp >= 65 || charTemp >= 97) {
				strTemp += charTemp;
			}else if(charTemp >= 48 || charTemp <= 57) {
				intTemp += (charTemp - intGap);
			}
		}
		System.out.printf("문자열 : %s\n",strTemp);
		System.out.printf("정수 : %d",intTemp);
	}
}
