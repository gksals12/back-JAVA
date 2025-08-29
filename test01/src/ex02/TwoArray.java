package ex02;

public class TwoArray {
	public TwoArray() {;}
	
	public static void main(String[] args) {
		System.out.println("배열의 행 길이 : 3");
		System.out.println("배열의 열 길이 : 4");
		
		for(int i = 0; i < 12; i++) {
			System.out.print(i + 1 + " ");
			if((i + 1) % 4 == 0) {
				System.out.println();
			}
		}
	}
}
