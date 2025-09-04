package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamTask1 {
	public static void main(String[] args) {
//		1. 1~10까지 ArrayList에 담고 출력
		ArrayList<Integer> datas1 = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 10).forEach((datas) -> {
			datas1.add(datas);
		});
		System.out.println(datas1);
		
//		2. ABCDEF를 각각 다른문자별로 출력
		"ABCDEF".chars().forEach((datas) -> {
			System.out.print((char)datas);
		});
		System.out.println();

//		3. 1~100까지 중 홀수 만 ArrayList에 담고 출력
		ArrayList<Integer> datas2 = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 100).filter((datas) -> datas % 2 == 1).forEach(System.out::println);
		
//		4. A~F까지 중 D를 제외하고 모두 ArrayList에 담고 출력
		ArrayList<String> datas3 = new ArrayList<String>(Arrays.asList("A","B","C","E","F"));
		datas3.stream().forEach(System.out::println);
		
//		5. 5개의 문자열을 모두 소문자로 변경 후 출력
//			Black, WHITE, reD, yeLLow, PInk
		ArrayList<String> datas4 = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PInk"));
		datas4.stream().map((datas) -> datas.toLowerCase()).forEach(System.out::println);
		
//		6. Apple, banana, Melon, orange 중 앞글자가 대문자인 문자열만 출력
		ArrayList<String> datas5 = new ArrayList<String>(Arrays.asList("Apple","banana", "Melon", "orange"));
//		datas5.stream().filter((datas) -> datas.);
		
//		7. 한글을 정수로 변경 "공칠이삼" -> 0723
		ArrayList<String> datas6 = new ArrayList<String>(Arrays.asList("공","칠","이","삼"));
		ArrayList<Integer> intDatas = new ArrayList<Integer>();
		datas6.stream()
		.map((datas) -> datas.replaceAll("공", "0"))
		.map((datas) -> datas.replaceAll("일", "1"))
		.map((datas) -> datas.replaceAll("이", "2"))
		.map((datas) -> datas.replaceAll("삼", "3"))
		.map((datas) -> datas.replaceAll("사", "4"))
		.map((datas) -> datas.replaceAll("오", "5"))
		.map((datas) -> datas.replaceAll("육", "6"))
		.map((datas) -> datas.replaceAll("칠", "7"))
		.map((datas) -> datas.replaceAll("팔", "8"))
		.map((datas) -> datas.replaceAll("구", "9"));
//		System.out.println();
		
//		8. 정수를 한글로 변경 0723 -> "공칠이삼"
		ArrayList<String> datas7 = new ArrayList<String>(Arrays.asList("공","칠","이","삼"));
		datas6.stream()
		.map((datas) -> datas.replaceAll("공", "0"))
		.map((datas) -> datas.replaceAll("일", "1"))
		.map((datas) -> datas.replaceAll("이", "2"))
		.map((datas) -> datas.replaceAll("삼", "3"))
		.map((datas) -> datas.replaceAll("사", "4"))
		.map((datas) -> datas.replaceAll("오", "5"))
		.map((datas) -> datas.replaceAll("육", "6"))
		.map((datas) -> datas.replaceAll("칠", "7"))
		.map((datas) -> datas.replaceAll("팔", "8"))
		.map((datas) -> datas.replaceAll("구", "9"));
//		.forEach(System.out::println);
	}
}
