package castingTask2;

import java.util.Scanner;

// 캐릭터 클래스
// 사냥 매서드

// 오크 클래스 - 도끼
// 콜록 매서드

// 요정 클래스 - 팬던트
// 눈물 매서드

// 휴먼 클래스 - 골드
// 해치웠나 출력

public class CastingTask2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Character player1 = new Character("홍길동");
		int userInput = 0;
		
		String playerMsg = "행동을 선택하세요 ex)1", playerOption = "1. 오크\n2. 엘프\n3. 사람\n";
		
		System.out.println(player1.name + "님이 입장했습니다");
		
		do {
			System.out.println(playerMsg);
			System.err.println(playerOption);
			new Character().printLevel();
			new Character().printExp();
			userInput = sc.nextInt();
			switch(userInput) {
			case 1:
				new Character().Attack(new Ork());
				break;
			case 2:
				new Character().Attack(new Elf());
				break;
			case 3:
				new Character().Attack(new Human());
				break;
			default:
				break;
			}
		} while (userInput != 0);
		
		
	}
}
