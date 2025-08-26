package castingTask3;

public class Netflix {
	private String service;
	
	public Netflix() {;}
	public Netflix(String service) {
		this.service = service;
	}
	
	public void service() {
		System.out.println(service + "기능을(를) 지원합니다");
//		System.out.println("서비스를 지원합니다");
	}
	
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	
	
}
