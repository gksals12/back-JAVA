package practiceJavaTest1;

//필드 : title(제목, String), price(가격, int) — private으로 선언
//
//기본 생성자 : "제목없음", 0으로 초기화
//
//초기화 생성자 : 제목과 가격을 매개변수로 받아 초기화
//
//getter / setter 작성
//
//출력 메서드 printInfo() : 제목과 가격을 출력
public class Boook {
	private String title;
	private int price;
	
	public Boook() {;}
	public Boook(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println(this.title);
		System.out.println(this.price);
	}
	
}
