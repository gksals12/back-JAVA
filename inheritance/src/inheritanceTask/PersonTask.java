package inheritanceTask;

//PersonTask
//이름, 나이, 주소, 핸드폰
//각 메서드 출력
//work 일을 한다
//sleep 잠을 잔다
//eat 세 끼를 먹는다
public class PersonTask {
	String name;
	String phone;
	String address;
	int age;
	
	void work() {
		System.out.println("일을 한다");
	}
	
	void sleep() {
		System.out.println("잠을 잔다");
	}
	void eat() {
		System.out.println("세 끼를 먹는다");
	}
}
