package classTest;

public class ClassTask01 {
	// 동물(ClassTask)
	// 이름(name), 나이(age), 먹이(feed)
	// 기본 생성자 / 초기화 생성자
	// 객체화
	String name;
	int age ;
	String feed;
	
	// 생성자의 오버로딩
	public ClassTask01() {;}
	public ClassTask01(String name, int age, String feed) {
		this.name = name;
		this.age = age;
		this.feed = feed;
	}
	
	public static void main(String[] args) {
		ClassTask01 dog = new ClassTask01("멍멍이", 10, "사료");
		ClassTask01 cat = new ClassTask01("야옹이", 5, "사료");
		ClassTask01 bird = new ClassTask01("짹짹이", 1, "사료");
		
		System.out.printf("이름: %s, 나이: %d, 먹이: %s\n", dog.name, dog.age, dog.feed);
		System.out.printf("이름: %s, 나이: %d, 먹이: %s\n", cat.name, cat.age, cat.feed);
		System.out.printf("이름: %s, 나이: %d, 먹이: %s\n", bird.name, bird.age, bird.feed);
	}
	
}
