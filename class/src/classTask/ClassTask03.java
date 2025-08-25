package classTask;

// 두개의 값을 전달하면 최솟값과 최댓값을 구해주는 메서드
// 클래스로 리턴
// 메인 메서드에서 사용
class MinMax{
	int max;
	int min;
	
	public MinMax() {;}
	public MinMax(int max, int min) {
		this.max = max;
		this.min = min;
	}
}

class Calc{
	MinMax getMinMax(int num1, int num2) {
		
		int max = num1 > num2 ? num1 : num2;
		int min = num1 < num2 ? num1 : num2;
		
		return new MinMax(max, min);
	}
}

public class ClassTask03 {

	public static void main(String[] args) {
		Calc cal = new Calc();
		MinMax minMax = cal.getMinMax(40, 30);
		
		System.out.println(minMax.max);
		System.out.println(minMax.min);
	}
}
