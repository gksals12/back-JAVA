package objectTask;

import java.util.Objects;

// 상품 클래스를 만들고 같은 상품인지 비교하기
// toString, hasCode, Equals를 재정의하고 비교하기
class Products{
	private int id;
	private String name;
	private int price;
	private int stock;
	private String country;

	public Products() {;}
	public Products(int id, String name, int price, int stock, String country) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.country = country;
	}
	public int getID() {
		return id;
	}
	public void setID(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Products [ID=" + id + ", name=" + name + ", price=" + price + ", stock=" + stock + ", country="
				+ country + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Products other = (Products) obj;
		return id == other.id;
	}
}

public class ObjectTask1 {
	public static void main(String[] args) {
		Products products = new Products(1, "파인애플", 20000, 15, "필리핀");
		System.out.println(products.toString());
		if(products.equals(new Products(1, "파인애플", 20000, 15, "필리핀"))) {
			System.out.println("판매");
			System.out.println("형 도라에몽 닮았어요 -준서가-");
		}else {
			System.out.println("판매불가");
		}
	}
}
