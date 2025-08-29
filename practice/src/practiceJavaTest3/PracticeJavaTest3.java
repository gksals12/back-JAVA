package practiceJavaTest3;
//문제 3-1 (상속 + 오버라이딩)
//
//다음 조건을 만족하는 클래스를 작성하시오.
//
//	Animal 클래스 :
//
//	메서드 sound() : "동물이 소리를 냅니다." 출력
//
//	Dog 클래스 : Animal을 상속
//
//	sound()를 오버라이딩하여 "멍멍!" 출력
//
//	main()에서 Animal과 Dog 객체를 생성하여 sound() 실행
//
//	문제 3-2 (오버로딩)
//
//	Printer 클래스를 작성하시오.
//
//	print(int a) : 정수 출력
//
//	print(String s) : 문자열 출력
//
//	print(double d) : 실수 출력
//
//	main()에서 각각 다른 타입을 넣어 호출해보시오.
public class PracticeJavaTest3 {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Dog dog = new Dog();
		
		animal.sound();
		dog.sound();
	}
}
