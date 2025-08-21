package methodTest;

public class MethodTask01 {

//	1. 1~10까지 출력해주는 method
//	param x
//	sysout -> void
//	1~10 loop(for)
	void printOneToTen() {
		for(int i = 0; i < 10; i++) {
			int intTemp = i + 1;
			System.out.println(intTemp);
		}
	}
	
	void printOneToTen(int num) {
		for(int i = 0; i < num; i++) {
			int intTemp = i + 1;
			System.out.println(intTemp);
		}
	}
	
	public static void main(String[] args) {
		MethodTask01 mt = new MethodTask01();
		mt.printOneToTen();
	}
}
