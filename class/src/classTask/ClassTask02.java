package classTask;

class Market{
//	상품명, 상품가격, 상품재고
//	sell
	
//	필요한 필드 정리
	String product;
	double price;
	int stock;
	
//	기본 생성자
	public Market() {;}
//	초기화 생성자
	public Market(String product, double price, int stock) {
		this.product = product;
		this.price = price;
		this.stock = stock;
	}
//	판매함수
	void sell(Customer customer) {
		// 재고 먼저 확인
		if(stock <= 0) {
			// 없으면 없다고 출력
			System.out.println("재고가없습니다");
		}
		
		// 충분한 금액이 있는지 확인
		// 충분한 돈이 있다면
		// 할인 계산식
		double discount = price * customer.discountRatio;
		// 할인된 물건의 계산식
		double discountPrice = price - discount;
		String tempMsg = "%s님이 %s를(을) 구매했습니다. 할인된 금액은 %.2f 입니다. 남은 금액은 %.2f 입니다. 남은 물건의 수량은 %d 입니다\n";
		
		if(customer.currency >= discountPrice) {
			// 가지고 있는 금액에서 가격만큼 차감
			customer.currency -= discountPrice;
			// 물건을 구매했으니까 stock 줄이기
			stock--;
			// 누가 어떤 물건을 구매했고 남은 잔고 보여주기
			if(stock <= 0) {
				System.out.println("해당물건이 다 판매 되었습니다");
			}
			System.out.printf(tempMsg, customer.name, product, discount, customer.currency, stock);
		}else {
			// 충분한 돈이 없으니 잔고가 부족하고 출력	
			System.out.println("돈이 부족합니다");
		}
	}
}

class Customer{
//	이름, 번호, 돈, 할인율
	
//	필요한 필드 정리
	String name;
	String phoneNumber;
	double currency;
	double discountRatio;
	
//	기본 생성자
	public Customer() {;}
//	초기화 생성자
	public Customer(String name, String phoneNumber, long currency, double discountRatio) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.currency = currency;
		this.discountRatio = discountRatio;
	}
}

public class ClassTask02 {
	public static void main(String[] args) {
//		마켓, 소비자를 객화시키고
//		소비자에게 마켓의 물건을 판내
//		마켓의 상품 재고와, 소비자의 남은 금액을 출력
		
//		Market 객체
		Market tv = new Market("tv", 1_000_000, 10); 
		Market radio = new Market("radio", 100_000, 5);
		Market car = new Market("car", 9_000_000, 90);
		Market book = new Market("book", 20_000, 42);
		Market tablet = new Market("tablet", 2_000_000, 0);
		
		Customer customer1 = new Customer("홍길동", "010-1234-1234", 2_000_000, 0.3);
		Customer customer2 = new Customer("장보고", "010-1234-1234", 9_000_000, 0.3);

		tv.sell(customer1);
		tv.sell(customer2);
		tv.sell(customer2);
		tv.sell(customer2);
		tv.sell(customer2);
	}
}
