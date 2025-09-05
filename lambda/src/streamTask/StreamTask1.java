package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask1 {
	public static void main(String[] args) {
		
		  
	      

	      

	      

		
//		1. 1~10까지 ArrayList에 담고 출력
		ArrayList<Integer> datas1 = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 10).forEach((datas) -> {
			datas1.add(datas);
		});
		System.out.println(datas1);
		
//		ArrayList<Integer> data1 = new ArrayList<Integer>();
//	      IntStream.rangeClosed(1, 10).forEach(data1::add);
//	      data1.forEach(System.out::println);
		
//		2. ABCDEF를 각각 다른문자별로 출력
		"ABCDEF".chars().forEach((datas) -> {
			System.out.print((char)datas);
		});
		System.out.println();
		
//	    2. ABCDEF를 각각 문자별로 출력
//	    IntStream.range(0, 6)
//	       .mapToObj((n) -> (char)('A' + n))
//	       .collect(Collectors.toCollection(ArrayList::new))
//	       .forEach(System.out::println);

//		3. 1~100까지 중 홀수 만 ArrayList에 담고 출력
		ArrayList<Integer> datas2 = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 100).filter((datas) -> datas % 2 == 1).forEach(System.out::println);
		
//	    3. 1~100까지 중 홀수만 ArrayList에 담고 출력
//	    ArrayList<Integer> data2 = new ArrayList<Integer>();
//	    IntStream
//	       .rangeClosed(1, 50)
//	       .map((n) -> n * 2 - 1)
//	       .forEach(data2::add);
//	    data2.forEach(System.out::println);
		
//		4. A~F까지 중 D를 제외하고 모두 ArrayList에 담고 출력
		ArrayList<String> datas3 = new ArrayList<String>(Arrays.asList("A","B","C","E","F"));
		datas3.stream().forEach(System.out::println);
		
//	    4. A~F까지 중 D를 제외하고 ArrayList에 담고 출력
//	    IntStream
//	       .range(0, 5)
//	       .mapToObj((n) -> (char)(n > 2 ? 'A' + n + 1 : 'A' + n))
//	       .collect(Collectors.toList())
//	       .forEach(System.out::println);
		
//		5. 5개의 문자열을 모두 소문자로 변경 후 출력
//			Black, WHITE, reD, yeLLow, PInk
		ArrayList<String> datas4 = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PInk"));
		datas4.stream().map((datas) -> datas.toLowerCase()).forEach(System.out::println);
		
//      5. 5개의 문자열을 모두 소문자로 변경 후 출력
//      "Black", "WHITE", "reD", "yeLLow", "PInk"
//		ArrayList<String> datas5 = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PInk"));
//		datas5.stream().map(String::toLowerCase).forEach(System.out::println);
		
//		6. Apple, banana, Melon, orange 중 앞글자가 대문자인 문자열만 출력
		ArrayList<String> datas5 = new ArrayList<String>(Arrays.asList("Apple","banana", "Melon", "orange"));
//		datas5.stream().filter((datas) -> datas.startsWith("A")).forEach(System.out::println);;
//		datas5.stream().filter((datas) -> datas.startsWith("M")).forEach(System.out::println);;
		datas5.stream().forEach((data) -> {
			if(data.charAt(0) >= 65 && data.charAt(0) <= 90) {
				System.out.println(data);
			}
		});
		
//      6. "Apple", "banana", "Melon", "orange" 중 앞글자가 대문자인 문자열만 출력
//		ArrayList<String> datas6 = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon", "orange"));
//		datas6.stream()
//         .filter((s) -> s.charAt(0) >= 65)
//         .filter((s) -> s.charAt(0) <= 90)
//         .forEach(System.out::println);
		
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
		System.out.println(datas6);
		
//		8. 정수를 한글로 변경 0723 -> "공칠이삼"
		ArrayList<String> datas7 = new ArrayList<String>(Arrays.asList("0","7","2","3"));
		datas6.stream()
		.map((datas) -> datas.replaceAll("0", "공"))
		.map((datas) -> datas.replaceAll("1", "일"))
		.map((datas) -> datas.replaceAll("2", "이"))
		.map((datas) -> datas.replaceAll("3", "삼"))
		.map((datas) -> datas.replaceAll("4", "사"))
		.map((datas) -> datas.replaceAll("5", "오"))
		.map((datas) -> datas.replaceAll("6", "육"))
		.map((datas) -> datas.replaceAll("7", "칠"))
		.map((datas) -> datas.replaceAll("8", "팔"))
		.map((datas) -> datas.replaceAll("9", "구"));
		System.out.println(datas7);
		
//      7. 한글을 정수로 변경 "공칠이삼" -> 0723
//      String hangle = "공일이삼사오육칠팔구";
//      String input = "일공이사";
//      input.chars().map(hangle::indexOf).forEach(System.out::println);
		
//      8. 정수를 한글로 변경 "0723" -> "공칠이삼"
//		String input2 = "0723";
//		input2
//         .chars().map(c -> c - 48)
//         .map(hangle::charAt)
//         .mapToObj((c) -> (char)c)
//         .forEach(System.out::println);
	}
}
