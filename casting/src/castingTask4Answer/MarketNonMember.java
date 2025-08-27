package castingTask4Answer;

public class MarketNonMember extends Customer{
   public MarketNonMember() {;}
   public MarketNonMember(String name, String phone, long money) {
      super(name, phone, money);
   }
   
   {
      super.setDiscount(5);
   }
}