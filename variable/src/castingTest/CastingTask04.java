package castingTest;

public class CastingTask04 {
	public static void main(String[] args) {
//      "12.123";
//      "345.789"
//      "6789"
//      3개 값을 더해서 123456789를 출력하기
		String str1 = "", str2 = "", str3 = "", result = "";
		double str1Double = 0.0, str2Double = 0.0;
		int str1Int = 0, str2Int = 0, str3Int = 0;
		
		str1 = "12.123"; 
		str2 = "345.789";
		str3 = "6789";
		
		str1Double = Double.parseDouble(str1); /*String to double*/
		str2Double = Double.parseDouble(str2); /*String to double*/
		
		str1Int = (int)str1Double; /*double to int*/
		str2Int = (int)str2Double; /*double to int*/
		str3Int = Integer.parseInt(str3); /*String to int*/
		
//		result = "%d%d%d";
		str1 = String.valueOf(str1Int);
		result = str1 + str2Int + str3Int;
		
//		System.out.printf(result, str1Int, str2Int, str3Int);
		System.out.println(result);
	}
}
