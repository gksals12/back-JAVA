package practiceJavaTest1;

import java.awt.print.Book;

//문제 1
//
// 다음 조건을 만족하는 Book 클래스를 작성하시오.
//
// 필드 : title(제목, String), price(가격, int) — private으로 선언
//
// 기본 생성자 : "제목없음", 0으로 초기화
//
// 초기화 생성자 : 제목과 가격을 매개변수로 받아 초기화
//
// getter / setter 작성
//
// 출력 메서드 printInfo() : 제목과 가격을 출력
//
// BookTest 클래스에서 객체를 생성하여 출력하시오.
public class PracticeJavaTest1 {
	public static void main(String[] args) {
		Boook book1 = new Boook("책1", 3000);
		Boook book2 = new Boook();
		
		book1.printInfo();
		book2.printInfo();
	}
}
