package castingTask2;

public class Elf extends Monster{
	public Elf() {;}

	@Override
	void dropItems() {
		System.out.println("팬던트가 드랍 되었습니다");
	}
	
	void printTear() {
		System.out.println("눈물을 흘린다.");
	}
}
