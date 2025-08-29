package practiceJavaTest3;
//Dog 클래스 : Animal을 상속
//
//sound()를 오버라이딩하여 "멍멍!" 출력
public class Dog extends Animal{
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
