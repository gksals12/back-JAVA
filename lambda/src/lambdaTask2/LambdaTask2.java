package lambdaTask2;

public class LambdaTask2 {
	
	public static void main(String[] args) {
		//1) 1~10까지 출력해주는 람다구현 PrintNum, printUpTo10()
		PrintNum printNum = () -> {
			for(int i = 0; i < 10; i++) {
				int temp = i + 1;
				System.out.print(temp);
			}
			System.out.println();
		};
		
		//2) 문자열과 문자형을 전달하면 해당 문자의 개수를 구해주는 람다구현 PrintString, strCount()
		PrintString countChar = (str, ch) -> {
			int count = 0;
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == ch) {
					count++;
				}
			}
			return count;
		};
		
		//3) 문자열을 받으면 뒤집은 문자열로 리턴해주는 람다구현 Reverse reverseString()
		Reverse revserString = (str) -> {
			char[] charArr = str.toCharArray();
			char[] reverseChar = new char[charArr.length];
			for(int i = 0; i < charArr.length; i++) {
				reverseChar[charArr.length - 1 - i] = charArr[i];
			}
			return String.valueOf(reverseChar);
		};
		
		//4) 문자열과 문자형을 받으면 해당 문자를 모두 지워주는 람다구현 Remove removeStr()
		Remove removeChar = (str, ch) -> {
				// str.replaceAll(String.valueOf(ch))
				String strTemp = "";
				for(int i = 0; i < str.length(); i++) {
					if(str.charAt(i) == ch) {
						continue;
					}else {
						strTemp += str.charAt(i);
					}
				}
				System.out.println(strTemp);
			};
		
		//5) 문자열에서 중복된 값 모두 없애고 리턴해주는 람다구현 Dedupe, getDedupe()
		//ex) "가나다가나다라가나다라마바사" -> "가나다라마바사"
		Dedupe dedupe = (str) -> {
				String strTemp = "";
				for(int i = 0; i < str.length(); i++) {
					boolean isRepeat = false;
					char charTemp = str.charAt(i);
					for(int j = 0; j < strTemp.length(); j++) {
						if(strTemp.charAt(j) == charTemp) {
							isRepeat = true;
							break;
						}
					}
					if(!isRepeat) {
						strTemp += charTemp;
					}
				}
				return strTemp;
			};
			
		//1)
		printNum.printNum();
		
		//2)
		int count = countChar.strCount("AAB", 'A');
		System.out.println(count);
		
		//3)
		String reverse = revserString.reverseString("ABC");
		System.out.println(reverse);
		
		//4)
		removeChar.removeChar("ABC", 'C');
		
		//5)
		String removeRepeatChar = dedupe.getDedupe("가나다가나다라가나다라마바사");
		System.out.println(removeRepeatChar);
	}
}
