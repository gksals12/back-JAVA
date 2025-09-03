package collectionTest.arrayList2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class UserField {
//   DB
   public ArrayList<User> users = DBconnecter.users;
   public static String userId;
   public static String code;
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
   public void update(User user) {
	   // 유저의 현재 비밀번호를 null로 바꾼후
	   // 입력한 비밀번호를 다시 넣어준다
	   // 유저의 현재 비밀번호를 입력 받은 값으로 바꾼다
	   // swap?
	   // user.setPassword()
	   User userInDb = checkId(user.getId());
	   if(userInDb != null) {
		   userInDb.setPassword(encrypt(user.getPassword()));
	   }
   }
   
//      비밀번호 변경(비밀번호 변경 30일)
   public void update(String newPassword) {
	   User userInDb = checkId(userId);
	   if(userInDb != null) {
		   userInDb.setPassword(encrypt(newPassword));
	   }
   }
   
//      인증번호 생성
   	public String randomNumber() {
   		String code = "";
   		for(int i = 0; i < 6; i++) {
   			code += (int)(Math.random() * 10);
   			this.code = code;
   		}
   		return code;
   	}
//	    인증번호 전송
   	public void sendEmail(String toMemberEmail) {
   	// 메일 인코딩
        final String bodyEncoding = "UTF-8"; //콘텐츠 인코딩
        
        //원하는 메일 제목 작성
        String subject = "인증번호";
        
        //보낸 이메일 작성
        String fromEmail = "yunhanmin@gmail.com";
        String fromUsername = "윤한민";
        
        String toEmail = toMemberEmail; // 콤마(,)로 여러개 나열
        
        //도메인 사용할 필요 없다
        //앱비밀번호
        final String username = "yunhanmin@gmail.com";         
        final String password = "orde sdck shld fblv";
        
        // 랜덤코드생성
        this.randomNumber();
        
        // 메일에 출력할 텍스트
        String html = null;
        StringBuffer sb = new StringBuffer();
        sb.append("<h3>인증번호 발송</h3>\n");
        sb.append("<h4>[인증번호6자리]</h4>\n");    
        sb.append("<h4>" + code + "<h4>");    
        sb.append("<h4>[테스트]</h4>\n");    
        html = sb.toString();
        
        // 메일 옵션 설정
        Properties props = new Properties();    
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");
        
        try {
          // 메일 서버  인증 계정 설정
          Authenticator auth = new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
              return new PasswordAuthentication(username, password);
            }
          };
          
          // 메일 세션 생성
          Session session = Session.getDefaultInstance(props, auth);
          
          // 메일 송/수신 옵션 설정
          Message message = new MimeMessage(session);
          message.setFrom(new InternetAddress(fromEmail, fromUsername));
          message.setRecipients(RecipientType.TO, InternetAddress.parse(toEmail, false));
          message.setSubject(subject);
          message.setSentDate(new Date());
          
//          // 메일 콘텐츠 설정
          Multipart mParts = new MimeMultipart();
          MimeBodyPart mTextPart = new MimeBodyPart();
          MimeBodyPart mFilePart = null;
 //    
//          // 메일 콘텐츠 - 내용
          mTextPart.setText(html, bodyEncoding, "html");
          mParts.addBodyPart(mTextPart);
//                
//          // 메일 콘텐츠 설정
          message.setContent(mParts);
     
          // 메일 발송
          Transport.send( message );
          
        } catch ( Exception e ) {
          e.printStackTrace();
        }
   	}
   	
//      인증번호 확인
   public boolean checkCode(String inputCode) {
	   return code.equals(inputCode);
   }
   
   public static void main(String[] args) {
      UserField uf = new UserField();
      Scanner sc = new Scanner(System.in);
      String msg = "인증번호를 입력하세요\nex)737122", inputCode = "";
      int errorCount = 0;
      
      System.out.println(uf.encrypt("AbCddd"));
      
      uf.sendEmail("yunhanmin@gmail.com");
      
//    인증번호 확인
      do {
    	 if(errorCount == 0 ) {
    		 System.out.println(msg);
    		 inputCode = sc.nextLine().trim();
    	 }else if(errorCount > 0 && errorCount < 3) {
    		 System.out.println("다시 입력하세요");
    	 }else if(errorCount > 3) {
    		 System.out.println("다시 인증해주세요");
    		 break;
    	 }
    	 errorCount++;
      } while (!uf.checkCode(inputCode));
      
      if(uf.checkCode(inputCode)) {
    	  System.out.println("인증이 완료되었습니다");
      }else {
    	  System.out.println("인증이 실패되었습니다");
      }
   }
}
