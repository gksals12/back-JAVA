package streamTest.mapTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class MapTask1 {
	
	public String addRoot(String url) {
		return "/app" + url;
	}
	
	public static void main(String[] args) {
//		아래의 4개의 url을 List에 담은 후 모든 경로 앞에 /app을 붙여서 출력하기
//		/news, /game, /brand, /rank
		ArrayList<String> datas1 = new ArrayList<String>(Arrays.asList("/news", "/game", "/brand", "/rank"));
		MapTask1 mt = new MapTask1();
		
		datas1.stream().map((data) -> "/app" + data).forEach((data) -> {
			System.out.println(data);
		});
		
		datas1.stream().map(mt::addRoot).forEach((data) -> {
			System.out.println(data);
		});
//		System.out.println(datas1);
	}
}
