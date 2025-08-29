package practiceJavaTest2;
//
//	다음 조건을 만족하는 Calculator 클래스를 작성하시오.
//
//	add(int a, int b) : 두 수의 합 리턴
//
//	subtract(int a, int b) : 두 수의 차 리턴
//
//	multiply(int a, int b) : 두 수의 곱 리턴
//
//	divide(int a, int b) : 두 수의 나눗셈 결과 리턴 (단, 0으로 나누면 "0으로 나눌 수 없습니다." 출력 후 0 리턴)
//
//	CalculatorTest 클래스에서 메서드를 호출하여 결과를 출력하시오.
public class PracticeJavaTest2 {
	public static void main(String[] args) {
		Calc calc = new Calc();
		
		int sumResult = calc.sum(10, 20);
		int subResult = calc.sub(10, 20);
		int mulResult = calc.mul(10, 20);
		double divResult = calc.div(0, 20);
		
		System.out.println(sumResult);
		System.out.println(subResult);
		System.out.println(mulResult);
		System.out.println(divResult);
	}
}
