package operaterTest;

import java.util.Scanner;

public class OperTask2 {
	public static void main(String[] args) {
//		3개의 입력값 중 중간 찾기
		Scanner sc = new Scanner(System.in);
		
		String userMsg = null;
		int userInt1 = 0, userInt2 = 0, userInt3 = 0, intTemp = 0, intMid = 0;
		
		userMsg = "숫자 3개를 입력하세요 ex) 10 30 20";
		System.out.println(userMsg);
		userInt1 = sc.nextInt();
		userInt2 = sc.nextInt();
		userInt3 = sc.nextInt();
		
		intTemp = (userInt1 < userInt2) ? userInt2 : userInt1; /* temp에 큰수저장 a보다 b가 크면 a는 최소값 10 < 20 "20"*/
		intMid = (intTemp < userInt3) ? intTemp : userInt3; /* temp보다 c가 크면 temp가 중앙값 c가 최대값 20 < 30 "20"*/
		
		System.out.printf("중앙값 : %d",intMid);
	}
}
