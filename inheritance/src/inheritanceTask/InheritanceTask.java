package inheritanceTask;

class Car {
	String brand;
	String color;
	int price;
	
	public Car() {;}
	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	void engineStart() {
		System.out.println("열쇠로 시동 킴");
	}
	
	void engineStop() {
		System.out.println("열쇠로 시동 끔");
	}
}

class SuperCar extends Car{
	String mode;
	
	public SuperCar() {;}
	public SuperCar(String brand, String color, int price, String mode) {
		super(brand, color, price);
		this.mode = mode;
	}
	
	void engineStart() {
		System.out.println("음성으로 시동 킴");
	}
	
	void engineStop() {
		System.out.println("음성로 시동 끔");
	}
}

public class InheritanceTask {
	public static void main(String[] args) {
		SuperCar sp = new SuperCar();
		Car car = new Car();
		
		sp.engineStart();
		car.engineStop();
	}
}
