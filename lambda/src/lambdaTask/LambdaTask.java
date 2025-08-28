package lambdaTask;

import lambdaTest.CalcResult;
import lambdaTest.LambdaInter2;

public class LambdaTask {
	
//	사칙연산의 결과를 출력하는 매서드
	public void showCalcResult(CalcResult calcResult) {
		System.out.println("더하기: " + calcResult.getSum());
		System.out.println("빼기: " + calcResult.getSub());
		System.out.println("곱하기: " + calcResult.getMul());
		System.out.println("나누기: " + calcResult.getDiv());
	}
	
	public static void main(String[] args) {
		LambdaInter2 lambdaInter2 = (num1, num2) -> {
			CalcResult result = new CalcResult();
			result.setSum(num1 + num2);
			result.setSub(num1 - num2);
			result.setMul(num1 * num2);
			result.setDiv(num1 / num2);
			return result;
		};
		
		CalcResult result1 = lambdaInter2.calc(20,10);
		CalcResult result2 = lambdaInter2.calc(200, 100);
		new LambdaTask().showCalcResult(result1);
		new LambdaTask().showCalcResult(result2);
	}
}
