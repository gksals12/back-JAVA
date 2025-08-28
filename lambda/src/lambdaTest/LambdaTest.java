package lambdaTest;

public class LambdaTest {
	public static void main(String[] args) {
		LambdaInter lambdaInter = (num1, num2) -> {System.out.println(num1 + num2);};
		lambdaInter.printAddResult(1, 2);
		
//		중괄호가 없으면 전체가 리턴값 return 생략가능
		LambdaInter2 lambdaInter2 = (num1, num2) -> new CalcResult();
//		LambdaInter2 lambdaInter2 = (num1, num2) -> {return new CalcResult();};
		lambdaInter2.calc(10, 20);
		
//		매개변수가 하나면 소괄호 생략가능
		LambdaInter3 lambdaInter3 = num1 -> num1 % 2 == 0;
		lambdaInter3.isEven(4);
		System.out.println(lambdaInter3.isEven(4));
	}
}
