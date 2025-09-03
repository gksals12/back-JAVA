package collectionTest.hasMapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		userMap.put("id", "hgd");
		userMap.put("password", "1234");
		userMap.put("name", "홍길동");
		userMap.put("age", "20");
		userMap.put("isRich", true);
		
		System.out.println(userMap);
		System.out.println(userMap.get("age"));
		System.out.println(userMap.entrySet());
		
		Set<Entry<String, Object>> userMapEntrySet = userMap.entrySet();
		Iterator<Entry<String, Object>> userMapIter = userMap.entrySet().iterator();
		
		while(userMapIter.hasNext()) {
			System.out.println(userMapIter.next());
			Entry<String, Object> entry = userMapIter.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
}
