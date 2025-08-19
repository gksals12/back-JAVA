package controlStatement;

public class ForTask02 {
	public static void main(String[] args) {
//		10 ~ 1 까지 출력
		for(int i = 0; i < 10; i++) {
			System.out.println(10 - i);
		}
//		1번쨰 홍길동
//		2번쨰 홍길동
		for(int i = 0; i < 5; i++) {
			System.out.println(i + 1 + "번쨰 홍길동");
		}
//		abcd를 이용해서 97 98 99 100 출력하기
		String str = "abcd", strTemp = "";
		for(int i = 0; i < str.length(); i++) {
			strTemp += (int)str.charAt(i);
		}
		System.out.println(strTemp);
		
//		"abcd"에서 c빼고 출력 abd
		int c = "abcd".charAt(0); // 97
		for(int i = 0; i < 4; i++) {
			if(c + i == 99) {
				continue;
			}
			System.out.println((char)(c + i));
		}
		
		String str2 = "abcd";
		for(int i = 0; i < 4; i++) {
			if((int)str2.charAt(i) == 99) {
				continue;
			}
			System.out.println(str.charAt(i));
		}
		
		
//		1 ~ 30 까지 짝수만 출력
//		짝수 개수 출력
//		짝수 총합 출력
		int count = 0;
		int total = 0;
		int sum = 0;
		for(int i = 0; i < 30; i++) {
			if((i + 1) % 2 == 0) {
				count++;
//				if(count == 7) {
//					System.out.println(i + 1);
//				}
				if(count == 1) {
					sum += i + 1;
				}
				if(count == 15) {
					sum += i + 1;
				}
				total += i + 1;
//				System.out.println(total);
//				System.out.println(i + 1);
			}
		}
		System.out.println(sum);
//		System.out.println(count);
//		System.out.println(total);
		
	}
}
