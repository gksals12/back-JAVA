package castingTask2;

public class Ork extends Monster{
	public Ork() {;}
	
	@Override
	void dropItems() {
		System.out.println("도끼가 드랍 되었습니다");
	}
	
	void printCough() {
		System.out.println("콜록!");
	}
}
