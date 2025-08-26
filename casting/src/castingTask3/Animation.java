package castingTask3;

public class Animation extends Netflix{

	public Animation() {;}
	public Animation(String service) {
		super(service);
	}
	@Override
	public void service() {
		System.out.println(getService() + "기능을(를) 지원합니다");
	}
	
}
