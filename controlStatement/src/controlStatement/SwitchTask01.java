package controlStatement;

import java.util.Scanner;

public class SwitchTask01 {
	public static void main(String[] args) {
//		계절을 맞추는 프로그램
//		겨울 12 1 2
//		봄 3 4 5
//		여름 6 7 8
//		가을 9 10 11
		Scanner sc = new Scanner(System.in);
		
		String userMsg = null, userInput = null;
		
		userMsg = "달을 입력해주세요\nex)10월->10";
		System.out.println(userMsg);
		userInput = sc.next();
		sc.close();
//		userInput / 3 % 4
		switch(userInput) {
		case "3": case "4": case "5":
			System.out.printf("%s월은 봄입니다",userInput);
			break;
		case "6": case "7": case "8":
			System.out.printf("%s월은 여름입니다",userInput);
			break;
		case "9": case "10": case "11":
			System.out.printf("%s월은 가을입니다",userInput);
			break;
		case "12": case "1": case "2":
			System.out.printf("%s월은 겨울입니다",userInput);
			break;
		default:
			System.out.println("잘못입력했습니다");
			break;
		}
	}
}
