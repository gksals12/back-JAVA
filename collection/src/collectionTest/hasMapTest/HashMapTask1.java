package collectionTest.hasMapTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

//	HashMap 자료구조
//	"street": "Victor Plains",
//	"suite": "Suite 879",
//	"city": "Wisokyburgh",
//	"zipcode": "90566-7771",
//	"lat": "-43.9509",
//	"lng": "-34.4618"
//
//	value들만 arrayList로 변경후 출력


public class HashMapTask1 {
	public static void main(String[] args) {
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		userMap.put("street", "Victor Plains");
		userMap.put("suit", "Suite 879");
		userMap.put("city", "Wisokyburgh");
		userMap.put("zipcode", "90566-7771");
		userMap.put("lat", "-43.9509");
		userMap.put("lng", "-34.4618");
		System.out.println(userMap);
		
		userMap.get("street");
		System.out.println(userMap.get("street"));
		
		ArrayList<Object> userArrayList = new ArrayList<Object>(userMap.values());
		System.out.println(userArrayList);
		
		Iterator<Entry<String, Object>> userMapIter = userMap.entrySet().iterator();
		ArrayList<Object> userArrList = new ArrayList<Object>();
		while(userMapIter.hasNext()) {
			userArrList.add(userMapIter.next().getValue());
		}
		System.out.println(userArrList);
	}
}
