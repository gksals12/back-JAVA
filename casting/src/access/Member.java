package access;

// 이름 주소 나이
public class Member {
	private String name;
	private String address;
	private int age;
	
	public Member() {;}

	public Member(String name, String address, int age) {
		this.setName(name);
		this.setAddress(address);
		this.setAge(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
