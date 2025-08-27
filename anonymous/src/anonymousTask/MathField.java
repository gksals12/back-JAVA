package anonymousTask;

public class MathField {
	public static void main(String[] args) {
		MathTask mt = new MathTask() {
			
			@Override
			public int sum(int num1, int num2) {
				int temp = num1 + num2;
				return temp;
			}
			
			@Override
			public void printName(String name) {
				System.out.println(name);
			}
			
			@Override
			public String concat(String str1, String str2) {
				String temp = str1 + str2;
				return temp;
			}
			
			@Override
			public CalcResult calc(int num1, int num2) {
				CalcResult cal = new CalcResult();
				cal.setSum(num1 + num2);
				cal.setSub(num1 - num2);
				cal.setMul(num1 * num2);
				cal.setDiv(num1 / num2);
				return cal;
			}
		};
		System.out.println(mt.sum(10,20));
		mt.printName("홍길동");
		System.out.println(mt.concat("홍길동", "님"));
		CalcResult result = mt.calc(10,20);
		System.out.println(result.getSum());
		System.out.println(result.getSub());
		System.out.println(result.getMul());
		System.out.println(result.getDiv());
	}
}
