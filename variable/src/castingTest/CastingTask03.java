package castingTest;

public class CastingTask03 {
	public static void main(String[] args) {
//      String.valueOf(값);
//      어떤 값을 문자열로 형변환시켜주는 메서드
      
//      모두 대문자로 바꿔서 출력
//      아스키코드
//      'A', 'J', 'K'
//      A = 65 / a = 97
//      J = 74 / j = 106
//      K = 75 / k = 107
	 
	  char a = 'a', j = 'j', k = 'k';
	  char upperA = ' ', upperJ = ' ', upperK = ' ';
	  int gap = 32;
	  String result = "%c, %c, %c";
	  
	  upperA = (char)(a - gap);
	  upperJ = (char)(j - gap);
      upperK = (char)(k - gap);
      
      System.out.printf(result, upperA, upperJ, upperK);
	}
}
