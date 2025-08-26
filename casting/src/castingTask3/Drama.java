package castingTask3;

public class Drama extends Netflix{

	public Drama() {;}
	public Drama(String service) {
		super(service);
	}
	
	@Override
	public void service() {
		System.out.println(getService() + "기능을(를) 지원합니다");
	}
	
}
