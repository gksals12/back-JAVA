package methodTest;

public class MethodTask03 {

//	1. 1~n번까지 출력하는 함수
//	param o
//	반복->loop(for)
//	type -> sysout -> void
	
	void printNumber(int repeatTimes) {
		for(int i = 0; i < repeatTimes; i ++) {
			int intTemp = i + 1;
			System.out.println(intTemp);
		}
	}
	
	public static void main(String[] args) {
		MethodTask03 mt = new MethodTask03();
		mt.printNumber(5);
	}
}
