package jsonTest;

import java.util.HashMap;

import org.json.JSONObject;

public class JasonTest {
	public static void main(String[] args) {
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		userMap.put("street", "Victor Plains");
		userMap.put("suit", "Suite 879");
		userMap.put("city", "Wisokyburgh");
		userMap.put("zipcode", "90566-7771");
		userMap.put("lat", "-43.9509");
		userMap.put("lng", "-34.4618");
		
		JSONObject json = new JSONObject(userMap);
		System.out.println(json);
	}
}
