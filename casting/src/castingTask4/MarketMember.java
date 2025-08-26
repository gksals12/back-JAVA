package castingTask4;

// MarketMember 
//- 필드: 이름, 전화번호, 돈, 포인트, 쿠폰
public class MarketMember extends Customers{
	
	public MarketMember() {;}
	public MarketMember(String name, String phone, double money) {
		super(name, phone, money);
	}
	
	@Override
	public double discount() {
		return 0.3;
	}
	
	@Override
	public double points() {
		// TODO Auto-generated method stub
		return 0.1;
	}
}
