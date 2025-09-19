package view;

import java.util.Optional;

import dao.MemberDAO;
import exeception.MemberNotFoundException;
import vo.MemberVO;

public class View {
	public static void main(String[] args) {
		MemberDAO memberDAO = new MemberDAO();
		MemberVO memberVO = new MemberVO();
		
		
		
//		memberVO.setMemberEmail("yhm12345");
//		memberVO.setMemberPassword("1234");
		
		memberVO.setMemberEmail("hgd12345");
		memberVO.setMemberPassword("1234");
		memberVO.setMemberName("홍길동");
		memberVO.setMemberAge(20);
		memberVO.setMemberAddress("서울시 강남구");
		
//		memberDAO.join(memberVO);
		
//		if(memberDAO.checkId(memberVO.getMemberEmail())) {
//			System.out.println("사용이 가능한 아이디");
//			memberDAO.join(memberVO);
//		}else {
//			System.out.println("중복된 아이디");
//		}
		
		if(memberDAO.login(memberVO)) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}

		memberDAO.changeInfo(memberVO);
		
		Optional<MemberVO> foundMember = memberDAO.findById();
		foundMember.ifPresent(System.out::println);
		MemberVO member = foundMember.orElseThrow(MemberNotFoundException::new);
		
//		memberDAO.logout();
//		System.out.println("현재 세션 : " + memberDAO.session);
		
	}
}

