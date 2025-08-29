package practiceJavaTest2;
//다음 조건을 만족하는 Calculator 클래스를 작성하시오.
//
//add(int a, int b) : 두 수의 합 리턴
//
//subtract(int a, int b) : 두 수의 차 리턴
//
//multiply(int a, int b) : 두 수의 곱 리턴
//
//divide(int a, int b) : 두 수의 나눗셈 결과 리턴 (단, 0으로 나누면 "0으로 나눌 수 없습니다." 출력 후 0 리턴)
public class Calc {
	public int sum(int num1, int num2) {
		return num1 + num2;
	}
	public int sub(int num1, int num2) {
		return num1 - num2;
	}
	public int mul(int num1, int num2) {
		return num1 * num2;
	}
	public double div(int num1, int num2) {
		double result = 0.0;
		if(num1 == 0) {
			System.out.println("0으로 나눌수 없습니다");
		}else {
			result = num1 / (double)num2;
		}
		return result;
	}
}
