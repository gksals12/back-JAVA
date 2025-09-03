package collectionTest.arrayList2;

public class Login {
	public static void main(String[] args) {
		UserField userField = new UserField();
		
//		회원가입
		User user = new User("hkd", "홍길동", "1234", "01011111111");
		userField.join(user);
		
		System.out.println(DBconnecter.users);
		
//		로그인
		User userForLogin = new User("hkd", "홍길동", "1234", "01011111111");
		if(userField.login(userForLogin)) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
//		비밀번호 변경
		userForLogin.setPassword("12345");
		userField.update(userForLogin);
		
//		로그아웃
		userField.logout();
		System.out.println(userField.userId);
		
	}
}
