package castingTask3;

// 넷플릭스
// 애니메이션, 영화, 드라마, 클래스 선언
// 사용자가 선택한 영상이
// 애니메이션이라면 자막지원 기능
// 영화라면 4D 기능
// 드라마라면 굿즈

public class CastingTask3 {
	public static void main(String[] args) {
		User user = new User();
		user.watch(new Movie("4D"));
		user.watch(new Animation("자막"));
		user.watch(new Drama("굿즈"));
		
		
		Netflix[] contents = {new Movie("4D"), new Animation("자막"), new Drama("굿즈")};
		for(Netflix content : contents) {
			content.service();
		}
		
	}
}
