package streamTask;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask3 {
	
	public boolean getOdd(int num) {
		return num % 2 == 1;
	}
	
	public int multipleByTen(int num) {
		return num * 10;
	}
	
	public static void main(String[] args) {
//		IntStream으로 시작
//		10,30,50,70,90만 ArrayList, List에 추가
		StreamTask3 st = new StreamTask3();
		ArrayList<Integer> datas = IntStream
					.rangeClosed(1, 10) // IntStream
					.filter(st::getOdd) // IntStream
					.map(st::multipleByTen) // IntStream
					.mapToObj(Integer::valueOf) // Stream<Integer>
					.collect(Collectors.toCollection(ArrayList::new)); //ArrayList<Integer>
		System.out.println(datas);
		
//		ArrayList<Integer> datas = IntStream
//				.rangeClosed(1, 10) // IntStream
//				.filter(st::getOdd) // IntStream
//				.map(st::multipleByTen) // IntStream
//				.boxed() // Stream
//				.collect(Collectors.toCollection(ArrayList::new)); //ArrayList
		
		
		List<Integer> datsList = datas.stream().collect(Collectors.toList()); // List
	}
}
