package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask2 {
	static int total;
	
	public static void main(String[] args) {
//		ArrayList에 있는 모든 값을 더한 후 출력 {10,20,30,40,50,60}
		ArrayList<Integer> datas1 = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 60));
		datas1.stream().forEach((datas) -> {
			total += datas;
		});
		System.out.println(total);
		
	      int total2 = IntStream
	    		  	 .rangeClosed(1, 6) // IntStream
	    	         .map(n -> n * 10) // IntStream
	    	         .mapToObj(Integer::valueOf) // Stream<Integer>
	    	         .collect(Collectors.toCollection(ArrayList::new)) // ArrayList<Integer>
	    	         .stream() // Stream<Integer>
	    	         .mapToInt(Integer::intValue) // IntStream
	    	         .sum(); // int
		
		IntStream.rangeClosed(1, 6).map(num -> num * 10).sum();
//		mapToInt() Stream<T> -> IntStream
//		matToObj() IntStream -> Stream<T>
		int sum = datas1.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
	}
}
