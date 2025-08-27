package anonymousTask;

public interface MathTask {
// 두 수를 더해주는 매서드
	public int sum(int num1, int num2);
// 2개의문자열을 연결시켜주는 매서드
	public String concat(String str1, String str2);
// 두 수를 전달하면 사칙연산의 결과를 전달해주는 매서드
	public CalcResult calc(int num1, int num2);
// 이름을 전달하면 이름을 출력하는 매서드
	public void printName(String name);
}
