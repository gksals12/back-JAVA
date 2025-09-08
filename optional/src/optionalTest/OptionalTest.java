package optionalTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class OptionalTest {
	ArrayList<User> users = new ArrayList<User>(Arrays.asList(
			new User("홍길동","hgd", "1234"),
			new User("이순신","lss", "1234"),
			new User("장보고","jbg", "1234"),
			new User("김철수","kcs", "1234")
		));
	
//	for문 if문에 한 번이라도 들어가지 않았다면 null
//	NPE 발생
//	반드시 리턴 타입에만 optional을 사용하고, 단일 객체만 가능
	public Optional<User> findById(Long id) {
		User user = null;
		for(User userInDb : users) {
			if(userInDb.getId() == id) {
				user = userInDb;
			}
		}
		return  Optional.ofNullable(user);
	}
	
	public static void main(String[] args) {
		OptionalTest optionalTest= new OptionalTest();
		
		Optional<User> foundUser = optionalTest.findById(2L);
		
//		user가 null아니면 통째로가 user
//		null이면 throw
		try {
			User user = foundUser.orElseThrow(() -> {
				throw new NoSearchUserException("유저를 찾을 수 없습니다");
			});
			System.out.println(user);
		} catch (NoSearchUserException e) {
			System.out.println("유저를 찾을 수 없습니다");
		}
		
//		boolean
		System.out.println(foundUser.map(User::getId).isPresent());
		User user1 = null;
		if(foundUser.isPresent()) {
			user1 = foundUser.get();
		}
		
//		값이 있을 때에만 해당 로직을 수행
		optionalTest.findById(100L).map(User::getUserEmail).ifPresent((email) -> {
			System.out.println(email);
		});
		optionalTest.findById(1L).map(User::getUserEmail).ifPresent((email) -> {
			System.out.println(email);
		});
		optionalTest.findById(100L).map(User::getUserEmail).ifPresentOrElse((email) -> {
			System.out.println(email);
		}, () -> {
			System.out.println("존재하지 않는 유저입니다");
		});
		
		
	}
}
