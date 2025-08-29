package ex03;

import java.util.Random;

public class Student extends Person{
	private int number;
	
	public Student() {;}
	public Student(String name, int age, String job, String hobby, int number) {
		super(name, age, job, hobby);
		this.number = number;
	}
	
	@Override
	public void printName() {
		System.out.println(this.getName() + "님 환영합니다");
	}
	
	@Override
	public void printWork() {
		System.out.println(this.getName() + "은 공부합니다");
	}
	
	public int printHobby(String str, char ch) {
		return str.length() - str.replaceAll(String.valueOf(ch), "").length();
	}
	
	public String getRandomNumber() {
		Random rand = new Random();
		String number = "";
		for(int i = 0; i < 8; i ++) {
			number += rand.nextInt(0,10);
		}
		this.setNumber(Integer.parseInt(number));
		
		return number;
	}
	
	public boolean checkNumber(Student student) {
		return this.getNumber() == student.getNumber();
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}
