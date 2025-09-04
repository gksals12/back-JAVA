package streamTest.forEachTest;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class StreamTest2 {
	public static void main(String[] args) {
		ArrayList<Integer> datas1 = new ArrayList<Integer>();
//		1 ~ 10 추가
		IntStream.rangeClosed(1, 10).forEach((num) -> {
			datas1.add(num);
		});
//		System.out.println(datas1);
		
//		1 ~ 5 지우고 출력
//		여기서 num은 반복을 돌 횟수
		IntStream.range(0, 5).forEach((num) -> datas1.remove(0));
//		System.out.println(datas1);
		
//		10 ~ 1 추가
		ArrayList<Integer> datas2 = new ArrayList<Integer>();
		IntStream.range(0, 10).forEach(num -> {
			datas2.add(10 - num);
		});
//		System.out.println(datas2);
		
//		"ABCDEFGHIJK"을  datas3에 각각 한글자씩 추가 후 출력하기
		ArrayList<String> datas3 = new ArrayList<String>();
		"ABCDEFGHIJK".chars().forEach((ch) -> {
			datas3.add(String.valueOf((char)ch));
		});
//		datas3.forEach(System.out::print);
//		System.out.println(datas3);
		
//		"aBcDeFgHiJk"을  datas4에 소문자만 각각 한 글자씩 추가 후 출력하기
		ArrayList<String> datas4 = new ArrayList<String>();
//		97 - 122 -> a - z
//		65 - 90 -> A - Z
		"aBcDeFgHiJk".chars().forEach((ch) -> {
			if(ch >= 97 && ch <= 122) {
				datas4.add(String.valueOf((char)ch));
//				System.out.print((char)ch);
			}
		});
//		System.out.println(datas4);
		
		ArrayList<String> datas5 = new ArrayList<String>();
//		"aBcDeFgHiJk"을  datas5에 모두 대문자로 변경 후 추가
		"aBcDeFgHiJk".toUpperCase().chars().forEach((ch) -> datas5.add(String.valueOf((char)ch)));
		datas5.forEach((ch) -> {
			System.out.println(ch);
		});
		"aBcDeFgHiJk".chars().forEach((ch) -> {
			if(ch >= 97 && ch <= 122) {
				ch -= 32;
			}
			datas5.add(String.valueOf((char)ch));
			System.out.print((char)ch);
		});
		System.out.println(datas5);
	}
}
