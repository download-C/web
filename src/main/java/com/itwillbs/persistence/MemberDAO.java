package com.itwillbs.persistence;

import java.util.List;

import com.itwillbs.domain.MemberVO;

public interface MemberDAO {

	// 회원가입 
		public void insertMember(MemberVO vo);
		
		// 로그인 
		public MemberVO loginMember(MemberVO vo);
		
		// 로그인2
		public MemberVO loginMember(String userid, String userpw);
		
		// 회원정보 조회
		public MemberVO getMember(String userid);
		
		// 회원정보 수정
		public Integer updateMember(MemberVO vo);
		
		// 회원정보 삭제 
		public Integer deleteMember(MemberVO vo);
		
		// 회원정보 삭제2
//			public Integer deleteMember(String userid, String userpw);
		
		// 회원목록조회
		public List<MemberVO> getMemberList();
}
