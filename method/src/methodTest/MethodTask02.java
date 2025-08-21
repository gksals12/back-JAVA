package methodTest;

public class MethodTask02 {
	
//	1. 이름을 10번 출력해주는 매서드
//	param o
//	10번 반복 -> loop(for)
//	type -> void -> sysout
	void printNameTenTimes(String name) {
		for(int i = 0; i < 10; i++) {
			int intTemp = i + 1;
			String stringTemp = ". ";
			System.out.println(intTemp + stringTemp + name);
		}
	}
	
	public static void main(String[] args) {
		MethodTask02 mt = new MethodTask02();
		mt.printNameTenTimes("홍길동");
	}
}
