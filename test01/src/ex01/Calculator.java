package ex01;

public class Calculator {
	
	public Calculator() {;}
	
	public void calcNum(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	public double calcNum(int num1, double num2) {
		
		return num1 + num2;
	}
	
	public int calcNum(double num1) {
		return (int)num1;
	}

	public String calcNum(String str1, String str2) {
		return str1 + str2;
	}
}
