package collectionTest;

import java.util.ArrayList;

public class ArrayTest2 {
	public static void main(String[] args) {
		ArrayList<Integer> datas = new ArrayList<Integer>();
		System.out.println(datas.size());
//		.add(값)
		datas.add(10);
		datas.add(30);
		datas.add(50);
		datas.add(40);
		datas.add(60);
		datas.add(80);
		datas.add(20);
		datas.add(90);
		datas.size();
		System.out.println(datas.size());
		System.out.println(datas);
		try {
			System.out.println(datas.get(0));
		}catch(IndexOutOfBoundsException e) {
			System.out.println("ArraryList2 예외 발생");
			System.out.println("인덱스 범위를 똑바로 작성하세요");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
//		실습
//		추가(삽입)
//		50뒤에 500
//		수정
//		90을 9
//		삭제
//		80
		int prve = 0;
		if(datas.contains(50)) {
			datas.add(datas.indexOf(50), 500);
		}
		try {
			if(datas.contains(90)) {
				
				prve = datas.set(datas.indexOf(90), 9);
			}
			if(datas.contains(80)) {
				datas.remove(Integer.valueOf(80));
			}
		}catch(IndexOutOfBoundsException e) {
			System.out.println("ArrayList2 에외발생");
			System.out.println("인덱스 범위를 똑바로 작성하세요");
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(datas);
		System.out.println(prve);
	}
}
