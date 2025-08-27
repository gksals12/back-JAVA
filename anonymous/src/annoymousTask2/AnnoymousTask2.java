package annoymousTask2;

public class AnnoymousTask2 {
	public static void main(String[] args) {
		MyInter myinter = new MyInter() {
			
			@Override
			public void getString(String str) {
//				ABCD를 전달하면 ABDE를 출력해주는 매서드
				for(int i = 0; i < str.length(); i++) {
					if(str.charAt(i) == 'C') {
						continue;
					}
					System.out.println(str.charAt(i));
				}
			}
			
			@Override
			public String changeLetterCase(String str) {
//				문자열을 입력받고 소문자는 대문자로
//				대문자는 소문자로 바꿔주는 매서드
				int ascii = 0;
				String temp = "";
				for(int i = 0; i < str.length(); i++) {
					ascii = str.charAt(i);
					if(ascii >= 65 && ascii <= 90) {
						ascii += 32;
						temp += (char)ascii;
					}else if(ascii >= 97 && ascii <= 122) {
						ascii -= 32;
						temp += (char)ascii;
					}
//					System.out.println(ascii);
//					System.out.println(temp);
				}
				System.out.println(temp);
				return temp;
			}
		};
		myinter.getString("ABCD");
		myinter.changeLetterCase("AZaz");
	}
}
