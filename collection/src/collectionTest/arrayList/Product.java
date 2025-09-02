package collectionTest.arrayList;

import java.util.Objects;

public class Product {
//   이름, 가격, 재고
//   1. 필드 구성
//   2. private 붙이기
   private Long id;
   private String name;
   private int price;
   private int stock;
   
//   3. 기본 생성자, 초기화 생성자
   public Product() {;}
   public Product(Long id, String name, int price, int stock) {
      this.id = id;
      this.name = name;
      this.price = price;
      this.stock = stock;
   }
   
//   4. getter, setter 생성
   public Long getId() {
      return id;
   }
   public void setId(Long id) {
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
   
//   5. toString 재정의
   @Override
   public String toString() {
      return "Product [id=" + id + ", name=" + name + ", price=" + price + ", stock=" + stock + "]";
   }
   
//   6. hash/equals 재정의
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
      Product other = (Product) obj;
      return Objects.equals(id, other.id);
   }
}
