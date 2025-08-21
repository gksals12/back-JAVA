package methodTest;

import java.util.Scanner;

public class MethodTask04 {

//	사용자에게 이름과 반복횟수를 받아서 반복횟수만큼 출력하기
//	param o
//	반복 -> loop(for)
//	type -> sysout -> void
	
	void printName(String name, int repeatTimes) {
		for(int i = 0; i < repeatTimes; i ++) {
			int intTemp = i + 1;
			String strTemp = ". ";
			System.out.println(intTemp + strTemp + name);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MethodTask04 mt = new MethodTask04();
		String userMsg = null, userStrInput1 = null;
		int userIntInput1 = 0;
		
		userMsg = "이름과 반복할 횟수를 입력하세\nex)홍길동 5";
		System.out.println(userMsg);
		
		userStrInput1 = sc.next();
		userIntInput1 = sc.nextInt();
		
		mt.printName(userStrInput1, userIntInput1);
	}
}
