package streamTest.mapTest;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class MapTest {
   public static void main(String[] args) {
      
      ArrayList<User> users = new ArrayList<User>(); 
      
      User user1 = new User(1L, "홍길동", 17, "개발자");
      User user2 = new User(1L, "장보고", 20, "기획자");
      User user3 = new User(1L, "이순신", 35, "디자이너");
      User user4 = new User(1L, "이성계", 42, "개발자");
      User user5 = new User(1L, "이태희", 22, "사장");
      
      users.add(user1);
      users.add(user2);
      users.add(user3);
      users.add(user4);
      users.add(user5);
      
//      System.out.println(users);
      
      users.stream().map((user) -> user.getName()).forEach((name) -> {
//    	  System.out.println(name);
      });
      
//    1. ArrayList생성한다
//    1~10까지 추가
//    모든 값을 10배로 변경
//    모든 값 출력
      ArrayList<Integer> datas1 = new ArrayList<Integer>();
      IntStream.rangeClosed(1, 10).forEach((num) -> {
    	 datas1.add(num); 
      });
      datas1.stream().map((num) -> num * 10).forEach((num) -> {
//    	  System.out.println(num);
      });
      
//	  ArrayList 값을 알파뱃으로 바꾸기
//    ex) 1,2,3,4,5
//    ex) A B C D 
//    65 ~ 90 -> A ~ Z
//	  1 2 3 4 5 6 7 8 9 10
//    65 66 67 68 69
      datas1.stream().map((data) -> data + 64).forEach((data) -> {
    	  System.out.println((char)data.intValue());
      });
      
//   
   }
}
