package castingTask4;

//- 필드: 이름
//- 메서드:
// 1. 상품 판매
//    - 등록된 상품만 판매할 수 있다.
//    - 유저가 가진 돈보다 적으면 판매할 수 없다.
//    - 유저가 마다의 할인율이 적용된다.
//       1. 비회원 할인율 5% 적용
//       2. 멤버 할인율 30% 적용
//    - 등록된 상품의 재고보다 작으면 판매할 수 없다.

// 2. 상품 등록
//    - 상품 등록은 최대 5개까지만 할 수 있다.
//    (즉, 6개를 전달해도 앞에 5개 상품만 등록된다)
//    - 마트에 같은 이름의 상품은 등록할 수 없다.
//
// 3. 포인트 적립 메서드
//    - 비회원은 5%
//    - 회원은 10%

// 4. 만약 비회원이라면 
// 쿠폰 1장 제공, 쿠폰이 10장이라면 상품 무료!
public class Market {
	private String marketName;
	private Product[] arrProduct = new Product[5];
	private int productCount = 0;
	
	public Market() {;}
	public Market(String marketName) {
		this.marketName = marketName;
	}
	
	public void addProduct(Product product) {
//		- 상품 등록은 최대 5개까지만 할 수 있다.
	    if(product.getStock() >= 6) {
	        System.out.println("최대 물품 등록 수량은 5개입니다.");
	    } 
	    else {
//	    	- 마트에 같은 이름의 상품은 등록할 수 없다.
	        for(int i = 0; i < productCount; i++) {
	            if(arrProduct[i].getProductName().equals(product.getProductName())) {
	                System.out.println("같은 이름의 상품을 담을 수 없습니다");
	                return;
	            }
	        }
	        arrProduct[productCount++] = product; // 그대로 등록
	        System.out.println(product.getProductName() + "이(가) 등록되었습니다");
	        System.out.println(product.getProductName() + "의 수량은 " + product.getStock() + "개 입니다");
	    }
	}
	
	public void sellProduct(Product product, Customers customers) {
		double discountPrice = product.getPrice() - (product.getPrice() * customers.discount());
//		- 등록된 상품만 판매할 수 있다.
//	    - 등록된 상품의 재고보다 작으면 판매할 수 없다.
		if(product.getStock() > 1) {
//		    - 유저가 가진 돈보다 적으면 판매할 수 없다.
//		    - 유저가 마다의 할인율이 적용된다.
//		       1. 비회원 할인율 5% 적용
//		       2. 멤버 할인율 30% 적용
			if(customers.getMoney() > discountPrice) {
				customers.setMoney(customers.getMoney() - discountPrice);
				System.out.println(customers.getMoney());
			}else {
				System.out.println("돈이 부족합니다");
			}
		}else {
			System.out.println("상품이 없습니디ㅏ");
		}
	}
	
	public void savePoint(Product product, Customers customers) {
//		포인트 계산
		double points = product.getPrice() * customers.points();
		customers.setPoint(customers.getPoint() + points);
		System.out.println(customers.getPoint() + "적립 포인트");
	}
	
	public void saveCoupon() {
		// 쿠폰 1장 제공, 쿠폰이 10장이라면 상품 무료!
	}
	
	public String getMarketName() {
		return marketName;
	}
	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}
	public Product[] getProduct() {
		return arrProduct;
	}
	public void setProduct(Product[] product) {
		this.arrProduct = product;
	}
	public int getProductCount() {
		return productCount;
	}
	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}
	
}
