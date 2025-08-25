package inheritanceTask;

//InhertanceTask에서
//사람, 학생, 직장인 객체화 후 각 메서드 출력하기
public class InheritanceTask02 {
	public static void main(String[] args) {
		PersonTask person = new PersonTask();
		StudentTask student = new StudentTask();
		EmployeeTask employee = new EmployeeTask();
		
		person.work();
		student.work();
		employee.work();
	}
}
