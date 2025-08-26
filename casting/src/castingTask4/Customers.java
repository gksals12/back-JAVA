package castingTask4;

//MarketMember 
//- 필드: 이름, 전화번호, 돈, 포인트, 쿠폰
//MarketNonMember
//- 필드: 이름, 전화번호, 돈, 포인트, 쿠폰
public class Customers {
	private String name;
	private String phone;;
	private double money;
	private double point;
	private int coupon;
	

	public Customers() {;}

	//MarketMember
	public Customers(String name, String phone, double money) {
		super();
		this.name = name;
		this.phone = phone;
		this.money = money;
	}
	
	//NonMarketMember
	public Customers(String name, String phone, double money, int coupon) {
		super();
		this.name = name;
		this.phone = phone;
		this.money = money;
		this.coupon = coupon;
	}

	public double discount() {
		return 0.0;
	}
	
	public double points() {
		return 0.0;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public double getPoint() {
		return point;
	}

	public void setPoint(double point) {
		this.point = point;
	}

	public int getCoupon() {
		return coupon;
	}

	public void setCoupon(int coupon) {
		this.coupon = coupon;
	}
}
