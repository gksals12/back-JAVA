package castingTask;

public class Pororo {
	String name;
	int age;
	String hobby;
	
	public Pororo() {;}
	public Pororo(String name, int age, String hobby) {
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}
	
	void play(Friend friend) {
		if(friend instanceof Crong) {
			Crong cr = (Crong)friend;
			friend.withPlay();
			cr.speak();
		}else if(friend instanceof Loopy) {
			Loopy lp = (Loopy)friend;
			friend.withPlay();
			lp.sleep();
		}else if(friend instanceof Poby) {
			Poby pb = (Poby)friend;
			friend.withPlay();
			pb.joy();
		}
		
		
	};
	
	void eat() {};
	
	void sleep() {};
}
