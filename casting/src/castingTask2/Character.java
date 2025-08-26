package castingTask2;

import java.util.Random;

public class Character {
	String name;
	static int level;
	static int exp;
	
	static Random expAmount = new Random();
	
	{
		this.level = 1;
	}
	
	public Character() {;}
	public Character(String name, int level, int exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}
	
	public Character(String name) {
		this.name = name;
	}
	
	void Attack(Monster monster) {
		if(monster instanceof Ork) {
			Ork ork = (Ork)monster;
			monster.dropItems();
			ork.printCough();
			this.exp += expAmount.nextInt(1, 5);
		}else if(monster instanceof Elf) {
			Elf elf = (Elf)monster;
			monster.dropItems();
			this.exp += expAmount.nextInt(1, 10);
		}else if(monster instanceof Human) {
			Human human = (Human)monster;
			monster.dropItems();
			human.printScream();
			this.exp += expAmount.nextInt(1, 15);
		}
	}
	
	void printExp() {
		System.out.println("경험치 : " + this.exp);
	}
	
	void printLevel() {
	    for (int i = 10, add = 1; i <= 100; i += 10, add++) {
	        if (this.exp > i) {
	            this.level += add;
	        }
	    }
	    System.out.println("레벨 : " + this.level);
	}
}
