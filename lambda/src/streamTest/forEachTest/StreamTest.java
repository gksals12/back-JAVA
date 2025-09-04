package streamTest.forEachTest;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class StreamTest {
	public static void main(String[] args) {
		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream : 정수형을 사용해서 stream문법을 사용
		IntStream.rangeClosed(0, 10).forEach((num) -> {
			datas.add(num);
		});
//		System.out.println(datas);
		
//		1~5까지 stream 문법으로 출력
		ArrayList<Integer> arrData1 = new ArrayList<Integer>();
		IntStream.rangeClosed(1,5).forEach((num) -> {
			arrData1.add(num);
		});
//		System.out.println(arrData1);
		
//		참조형 문법
//		.(소속::메서드명)
//		IntStream.rangeClosed(1,5).forEach(System.out::println);
		
//		datas 짝수만 출력하기
		datas.forEach((num) -> {
			if(num % 2 == 0) {
//				System.out.println(num);
			}
		});

//		datas 홀수만 출력하기
		datas.stream().filter((num) -> num % 2 == 1).forEach(System.out::println);
	
//		chars()
		"ABCD".chars().forEach(System.out::print);
		"ABCD".chars().forEach((c) -> {
			System.out.println((char)c);
		});
		
//		ArrayList<Integer> arrData2 = new ArrayList<Integer>();
//		IntStream.rangeClosed(0, 10).forEach((num) -> {
//			if(num % 2 == 0) {
//				arrData2.add(num);
//			}
//		});
//		System.out.println(arrData2);
	}
}
