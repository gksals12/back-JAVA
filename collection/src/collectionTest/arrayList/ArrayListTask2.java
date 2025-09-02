package collectionTest.arrayList;

import java.util.ArrayList;

public class ArrayListTask2 {
	public static void main(String[] args) {
//		a ~ z까지 문자열로 ArrayList로 추가하기
		ArrayList<String> arrList = new ArrayList<String>();
		
//		for(char c = 'a'; c <= 'z'; c++) {
//			arrList.add(String.valueOf(c));
//		}
//		
//		for(int i = 97; i < 123; i++) {
//			arrList.add(String.valueOf((char)i));
//		}
		System.out.println(arrList);
		
		for(int i = 0; i < 26; i++) {
			arrList.add(String.valueOf((char)('a' + i)));
		}
		
		for(int i = 0; i < arrList.size(); i++) {
			if(i % 2 == 1) {
				System.out.print(arrList.get(i).toUpperCase()); 
			}
			System.out.println(arrList.get(i)); 
		}
		
	}
}
