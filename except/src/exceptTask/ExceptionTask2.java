package exceptTask;

import java.util.Scanner;

//사용자에게 입력을 받았을 때 특수문자 중 !@#를 사용하면 오류를 발생시키는 로직
//만든 예외를 이용해서 메세지를 출력
public class ExceptionTask2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String userMsg = "문자을 입력하세요\nex)가나다라마바사 단, 특수문제는 제외하세요";
		String userInput = null;
		
		System.out.println(userMsg);
		userInput = sc.nextLine(); 	
		
		try {
			if(userInput.contains("!")) {
				throw new BanSymbols("특수 문자를 사용할 수 없습니다.");
			}else if(userInput.contains("@")) {
				throw new BanSymbols("특수 문자를 사용할 수 없습니다.");
			}else if(userInput.contains("#")) {
				throw new BanSymbols("특수 문자를 사용할 수 없습니다.");
			}else {
				System.out.println("입력한 내용 : " + userInput);
			}
		} catch (BanSymbols e) {
			System.out.println(e.getMessage());
		}
	}
}
