package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class StreamTask4 {
	static Integer count = 0;
	public static void main(String[] args) {
//		홍길동, 축구_농구_야구, 나는 축구왕!
//		이순신, 개발_당구_축구, 나는 개발자 좋아!
//		장보고, 피아노, 피아노만 한 우물!
//		김철수, 스포츠댄스_개발, 취미로 춤을 춘다 ~
//		김영희, 골프_야구, 운동 선수는 나의 꿈
//		흰둥이, 개발_축구_농구, 개발도 운동도 다 잘해요!
		ArrayList<Member> members = new ArrayList<Member>();
		
		Member member1 = new Member("홍길동", "축구_농구_야구", "나는 축구왕!");
		Member member2 = new Member("이순신", "개발_당구_축구", "나는 개발자 좋아!");
		Member member3 = new Member("장보고", "피아노", "피아노만 한 우물!");
		Member member4 = new Member("김철수", "스포츠댄스_개발", "취미로 춤을 춘다 ~");
		Member member5 = new Member("김영희", "골프_야구", "운동 선수는 나의 꿈");
		Member member6 = new Member("흰둥이", "개발_축구_농구", "개발도 운동도 다 잘해요!");
		Member member7 = new Member("최준서", "개발", "자바가 제일 쉬웠어요");
		Member member8 = new Member("최준서", "개발", "자바가 제일 가나다라마바사아자차카타파하");
		
//		Member[] memberArr = new Member[] {member1, member2, member3, member4, member5, member6, member7};
//		for(Member m : memberArr)
//		{
//			members.add(m);
//		}
//		members.addAll(Arrays.asList(memberArr));
		
		members.add(member1);
		members.add(member2);
		members.add(member3);
		members.add(member4);
		members.add(member5);
		members.add(member6);
		members.add(member7);
//		System.out.println(members);
		
//		1) 각 Member의 취미를 검토하시오
//		취미 중 개발을 좋아하는 취미를 가진 멤버의 데이터를 모두 출력하시오
//		members.stream().filter(data -> data.getHobby().contains("개발")).forEach(System.out::println);
		
//		2) 취미 중 개발을 좋아하는 취미를 가진 멤버의 데이터를
//		개발자 000(이름)으로 변경 후 모두 출력
//		members.stream().filter(data -> data.getHobby().contains("개발")).map(data -> "개발자" + " " + data.getName()).forEach(System.out::println);

//		3) 취미를 3개 이상 가진 사람의 id를 출력
		members.stream().forEach(data -> {
			data.getHobby().replace("_", " ");
//			System.out.println(data.getHobby().replace("_", ""));
		});
		
//		members.stream().filter(data -> data.getHobby().split("_").length >= 3).forEach(System.out::println);
		
//		members.stream().map(data -> data.getHobby().replace("_", " ")).forEach(data -> {
//			if(data.contains(" ")) {
//				count++;
//			}
//			if(count == 3) {
//				System.out.println(data);
//			}
//		});
		
//		4) 취미를 3개 이상 가진 사람의 id를 ArrayList로 변경하고 hobbyIds 변수에 담기
		
		ArrayList<Long> hobbyIds = members
				.stream()
				.filter(data -> data.getHobby().split("_").length >= 3)
				.map(data -> data.getId())
				.collect(Collectors.toCollection(ArrayList::new));
//		System.out.println(hobbyIds);
		
//		5) hobbyIds에 존재하는 id와 같은 id를 가진 members의 데이터의 소개를 출력하기
		hobbyIds.stream().forEach(data -> {
			members.stream()
			.filter(id -> id.getId().equals(data))
			.forEach(intro -> {
//				System.out.println(intro.getInntro());
			});
		});
		
//		hobbyIds.stream().mapToInt(Long::intValue).boxed().map(i -> members.get(i)).map(m -> m.getInntro()).forEach(System.out::println);

//		6) 소개를 가장 길게 쓴 사용자의 정보를 문자열로 출력하기
//		members.stream().map(data -> data.getInntro()).forEach(System.out::println);
		int temp = members.stream().map(data -> data.getInntro().length()).mapToInt(Integer::intValue).max().getAsInt();
		members.stream().filter(data -> data.getInntro().length() == temp).forEach(System.out::println);
//		members.stream().map(data -> data.getInntro().length()).sorted(Collections.reverseOrder()).forEach(System.out::println);
//		members.stream().filter(data -> data.getInntro().length() == 14).forEach(System.out::println);
		
	}
}
