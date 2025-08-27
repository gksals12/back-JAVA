package abstractTest;

public class Dog implements Pet{
	@Override
	public void poop() {
		System.out.println("패드위");
	}
	@Override
	public void waitNow() {
		System.out.println("기다려");
	}
	
	@Override
	public void sitDown() {
		System.out.println("앉아");
	}
}
