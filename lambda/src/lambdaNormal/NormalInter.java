package lambdaNormal;

// 5개 숫자를 무작위로 전달해서 두 수를 더한 결과를 무조건 짝수로 만들어 주는 짝수
@FunctionalInterface
public interface NormalInter {
	public int getRandomEven(int[] intArr);
}
