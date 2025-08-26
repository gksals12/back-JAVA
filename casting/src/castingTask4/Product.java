package castingTask4;

//Product 상품
//- 필드: 이름, 가격, 재고
public class Product {
	private String productName;
	private double price;
	private int stock;
	
	public Product() {;}

	public Product(String productName, double price, int stock) {
		this.productName = productName;
		this.price = price;
		this.stock = stock;
	}
	public Product(String productName, double price) {
		this.productName = productName;
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
}
