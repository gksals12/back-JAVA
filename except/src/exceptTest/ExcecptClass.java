package exceptTest;

public class ExcecptClass {
	public static void main(String[] args) {
		int[] arData = new int[5];
		try {
//			arData[5] = 10;
			System.out.println(10 / 0);
			
		}catch (java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("ddd");
		}catch (java.lang.ArithmeticException e) {
			System.out.println("jjj");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
