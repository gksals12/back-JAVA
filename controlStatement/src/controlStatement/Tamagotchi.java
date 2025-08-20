package controlStatement;

import java.util.Scanner;

// 5번
// HP: (0/5)

// 밥을 안주면 죽는다.
// 밥을 주면 HP 5가 된다.
// 행동 1번당 HP가 1씩 줄어든다.
// 1. 놀아주기
// 2. 씻겨주기
// 3. 노래하기
// 4. 잠자기
// 5. 밥주기
// 0. 게임 종료

// 만족도 10
// 타마고치 키우기 성공!


public class Tamagotchi {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      boolean flag = false;
      int choice = 0, hp = 5, exp = 0;
      String message = "어서오세요~ 타마고치 키우기\n(*￣3￣)╭\n",
            exampleMessage = "캐릭터를 선택하세요.\nex)1",
            th = "(╬▔皿▔)╯",
            hm = "(～￣(OO)￣)ブ",
            js = "(っ °Д °;)っ",
            lsc = "┌( ಠ_ಠ)┘",
            bk = "（＞人＜；）",
            tama = "", tamaName = null;
      
      System.out.println(message);
      System.out.println(exampleMessage);
      System.out.println("1. 태히 " + th);
      System.out.println("2. 안민 " + hm);
      System.out.println("3. 준섬 " + js);
      System.out.println("4. 승창 " + lsc);
      System.out.println("5. 병군 " + bk);
      
      choice = sc.nextInt();
      if(choice == 1) {
         tama = th;
      }else if(choice == 2) {
         tama = hm;
      }else if(choice == 3) {
         tama = js;
      }else if(choice == 4) {
         tama = lsc;
      }else if(choice == 5) {
         tama = bk;
      }
      
      System.out.println("타마의 이름을 입력하세요.");
      tamaName = sc.next();
      System.out.println("타마 선택: " + tama);
      System.out.println("타마 이름: " + tamaName);
      
      while(true) {
         
         System.out.println("행동을 입력하세요.\nex)1\n"
               + "1. 놀아주기\n"
               + "2. 노래하기\n"
               + "3. 밥주기\n"
               + "0. 게임종료");
         choice = sc.nextInt();
         
         switch(choice) {
         case 1:
            System.out.println(tamaName + "이(가) 즐거워 합니다.");
            System.out.println(tama + "룰루 ~ ♬\n");
            break;
         case 2:
            System.out.println(tamaName + "이(가) 노래를 흥얼 거립니다.");
            System.out.println(tama + "♬ 슈슈슈 슈퍼 노바~~ ♬\n");
            break;
         case 3:
            System.out.println(tamaName + "꿈나라로 떠납니다 ..zzZ");
            hp = 5;
            break;
         case 0:
            flag = true;
            break;
         default:
            System.out.println("다시 입력해주세요.");
            break;
         }
//         게임 종료
         if(flag) { break; }
         
//         아니라면 게임 계속
         hp--;
         exp++;
         System.out.printf("현재 경험치 (%d/%d)\n 현재 체력 (%d/%d)", exp, 10, hp, 5);
         if(hp == 0) {
            System.out.println(tama + tamaName +"이(가) 좋은 곳으로 갔습니다.");
            break;
         }
         if(exp == 10) {
            System.out.println("축하합니다~!\n"
                  + tama + tamaName + "이(가) 우주로 떠납니다.");
            break;
         }
      }
   }
}












