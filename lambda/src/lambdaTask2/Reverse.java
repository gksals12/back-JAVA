package lambdaTask2;

@FunctionalInterface
public interface Reverse {
	//3) 문자열을 받으면 뒤집은 문자열로 리턴해주는 람다구현 Reverse reverseString()
	public String reverseString(String str);
}
