package streamTask;

import java.util.Objects;

public class Member {
//	이름 취미 소개
	private Long id;
	private String name;
	private String hobby;
	private String inntro;
	private static Long seq;
	
//	최초한번
	static {
		seq = 1L;
	}
	
//	생성자가 호출될 떄
	{
		this.id = seq++;
	}
	
	public Member() {;}

	public Member(String name, String hobby, String inntro) {
		this.name = name;
		this.hobby = hobby;
		this.inntro = inntro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getInntro() {
		return inntro;
	}

	public void setInntro(String inntro) {
		this.inntro = inntro;
	}

	@Override
	public String toString() {
		return "StreamTask4 [id=" + id + ", name=" + name + ", hobby=" + hobby + ", inntro=" + inntro + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(id, other.id);
	}
}
