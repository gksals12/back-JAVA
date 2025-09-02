package collectionTest.arrayList2;

import java.util.ArrayList;

public class UserField {
//   DB
   public ArrayList<User> users = DBconnecter.users;
   public static String userId;
   final int KEY = 300;
   
//      아이디 검사
   public User checkId(String id) {
//      id를 받아서 db에 아이디가 있는지 아닌지를 검사한다.
      for(User user: users) {
         if(user.getId().equals(id)) {
            return user;
         }
      }
      return null;
      
   }
   
//      회원 가입
   public void join(User user) {
      User userInDb = checkId(user.getId());
      if(userInDb == null) {
         users.add(user);
      }
      
   }
   
//      25분
//      로그인
   public boolean login(User user) {
//      아이디를 검사
      User userInDb = checkId(user.getId());
      if(userInDb != null) {
//         비밀번호 검사
         if(userInDb.getPassword().equals(user.getPassword())) {
            userId = userInDb.getId();
            return true;
         }
      }
      return false;
   }
   
   
//      로그아웃
   public void logout() {
      userId = null;
   }
   
//      암호화
   public String encrypt(String password) {
      String encryptPassword = "";
      for(int i = 0; i < password.length(); i++) {
         encryptPassword += (char)(password.charAt(i) * KEY);
      }
      return encryptPassword;
   }
   
//      비밀번호 변경(마이페이지)
//      비밀번호 변경(비밀번호 변경 30일)
//      인증번호 전송
//      인증번호 생성
//      인증번호 확인
   
   public static void main(String[] args) {
      UserField uf = new UserField();
      System.out.println(uf.encrypt("AbCddd"));
   }
}
