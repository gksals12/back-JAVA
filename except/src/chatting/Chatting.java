package chatting;

import java.util.Scanner;

public class Chatting {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String message = null;
      
      System.out.println("상대방에게 보낼 메세지");
      message = sc.nextLine();
      
      try {
         if(message.contains("꿀꿀")) {
            throw new BadWordException("꿀꿀이는 좀 너무하지 않아?");
         }else {
            System.out.println(message);
         }
      } catch (BadWordException e) {
         System.out.println("비속어 사용하지마세요!");
         System.out.println(e.getMessage());
         System.out.println(e.getClass());
      }
      
   }
}








