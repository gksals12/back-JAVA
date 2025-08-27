package castingTask4;

//MarketNonMember
//- 필드: 이름, 전화번호, 돈, 포인트, 쿠폰
public class MarketNonMember extends Customers{

	public MarketNonMember() {;}
	public MarketNonMember(String name, String phone, double money) {
		super(name, phone, money);
	}
	public MarketNonMember(String name, String phone, double money, int coupon) {
		super(name, phone, money, coupon);
	}
	
@Override
	public double discount() {
		return 0.05;
	}

@Override
public double points() {
	// TODO Auto-generated method stub
	return 0.05;
}
}
