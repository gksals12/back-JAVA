package castingTask3;

public class Movie extends Netflix{
	
	public Movie() {;}
	public Movie(String service) {
		super(service);
	}
	
	@Override
	public void service() {
		System.out.println(getService() + "기능을(를) 지원합니다");
	}
}
