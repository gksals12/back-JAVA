package controlStatement;

public class ForTask03 {
	public static void main(String[] args) {
//		1 ~ 100까지 7의 배수의 합 구하기
		int total = 0;
		for(int i = 0; i < 100; i++) {
			int value = i + 1;
			if(value % 7 == 0) {
				total += value;
			}
		}
//		System.out.println(total);
		
//		a ~ z 출력 97 ~ 122
//		97 98 99 100 
//		0  1  2   3
//		aBcD 로 출력 짝수만 - 32
		int intTemp = "a".charAt(0); // 97
		char charTemp = ' ';
		for(int i = 0; i < 26; i++) {
			int charNum = intTemp + i; // 아스키코드
//			System.out.println(charNum);
			//if 아스키코드 == even -32 -> 대문자
			if(charNum % 2 == 0) {
				System.out.println((char)(charNum - 32));
			}else {
				charTemp = (char)(charNum); // 아스키코드 -> char
				System.out.println(charTemp);
			}
		}
	}
}
