package castingTask2;

public class Human extends Monster{
	public Human() {;}
	
	@Override
	void dropItems() {
		System.out.println("골드가 드랍 되었습니다");
	}
	
	void printScream() {
		System.out.println("크아악");
	}
}
