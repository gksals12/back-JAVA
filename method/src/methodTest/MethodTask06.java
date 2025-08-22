package methodTest;

import java.util.Scanner;

public class MethodTask06 {
	
//	문자열을 입력받고 원하는 문자의 개수를 구해주는 매서드
	int getCharNumber(String str, char ch) {
		// 글자를 돌면서
		// 문자열을 쪼개서 원하는 문자랑 비교
		// count++
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ch) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		MethodTask06 mt = new MethodTask06();
		Scanner sc = new Scanner(System.in);
		String userMsg = null, userStrInput1 = null, userStrInput2 = null;
		char userCharInput1 = ' ';
		
		userMsg = "원하는 문자 그리고 원하는 문자의 갯수를 입력하세요\nex)apple a";
		System.out.println(userMsg);
		userStrInput1 = sc.next();
		userStrInput2 = sc.next();
		userCharInput1 = userStrInput2.charAt(0);
		System.out.println(mt.getCharNumber(userStrInput1, userCharInput1));
		
	}
}
