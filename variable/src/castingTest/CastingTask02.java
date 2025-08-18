package castingTest;

public class CastingTask02 {
	public static void main(String[] args) {
//		1 + "8.24", "7.8" 두 값을 더해서 115로 만들기
		int num1 = 0, result = 0;
		String num2 = "", num3 = "", num1Text = "", strResult = "";
		
		num1 = 1;
		num1Text = num1 + ""; /* 정수 -> 문자열 형변환 String.valueOf(num1)*/ 
		num2 = "8.24";
		num3 = "7.8";
		result = (int)Float.parseFloat(num2) + (int)Float.parseFloat(num3);
		strResult = num1Text + result;
		System.out.println(strResult);
	}
}
