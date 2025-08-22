package staticTest;

// 회사원들이 벌어온 수익을 모두 회사의 돈에 합치고
// 회사의 돈 출력
// 회사의돈(money)
// 이름(name) 나이(int) 수익(income)

class Employee{
	static int money;
	String name;
	int age;
	int income;
	
	public Employee() {;}
	public Employee(String name, int age, int income) {
		this.name = name;
		this.age = age;
		this.income = income;
	}
	
	void printCompanyMoney() {
		System.out.println(money);
	}
}

public class StaticTask01 {
	public static void main(String[] args) {
		
		Employee em1 = new Employee("홍길동",30,10000);
		Employee em2 = new Employee("홍길동",40,20000);
		Employee em3 = new Employee("홍길동",20,30000);
		
		int em1Income = em1.income;
		int em2Income = em2.income;
		int em3Income = em3.income;
		
		Employee.money = em1Income + em2Income + em3Income;
		
//		System.out.println(companyMoney);
		
		System.out.println(Employee.money);
		em1.printCompanyMoney();
		em2.printCompanyMoney();
		em3.printCompanyMoney();
	}
}
