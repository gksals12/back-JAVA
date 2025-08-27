package marker;

public class MarkerTest {

//	어떤 동물이 어떤 분류인지 알려주는 매서드
	public void checkKinds(Animal[] animals) {
		for(int i = 0; i < animals.length; i++) {
			if(animals[i] instanceof HerbivoreMarker) {
				System.out.println("초식");
			}else if(animals[i] instanceof CarnivoreMarker) {
				System.out.println("육식");
			}else {
				System.out.println("잡식");
			}
		}
	}
	public static void main(String[] args) {
		MarkerTest mk = new MarkerTest();
		Animal[] animals = {new Bear(), new Tiger(), new Cow(), new Dog(), new Rabbit(), new Cat()};
		
		mk.checkKinds(animals);
	}
}
