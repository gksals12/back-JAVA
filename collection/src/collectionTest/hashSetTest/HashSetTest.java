package collectionTest.hashSetTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> mbti = new HashSet<String>();
		mbti.add("ISTP");
		mbti.add("ISTJ");
		mbti.add("ESFJ");
		mbti.add("INTP");
		mbti.add("INFJ");
		mbti.add("ISTP");
		mbti.add("ESFP");
		
//		System.out.println(mbti);
//		System.out.println(mbti.size());
//		for(String m : mbti) {
//			System.out.println(m);
//		}
		
//		데이터를 가져오고 싶을 때 순서를 부여해야한ㄷ
//		iterator:  순서가 없을 때 순서를 부여할 수 있는 인터페이스
		Iterator<String> iter = mbti.iterator();
		while(iter.hasNext()){
			String m = iter.next();
			if(m.equals("ISTP"))
			System.out.println(m);
		}
		
//		중복값 데이터 삭제하고 싶을 때
		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,10,10));
		System.out.println(datas);
		datas = new ArrayList<Integer>(new HashSet<Integer>(datas));
		System.out.println(datas);
		
	}
}
