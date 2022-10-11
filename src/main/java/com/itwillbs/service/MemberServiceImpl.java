package com.itwillbs.service;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.itwillbs.domain.MemberVO;
import com.itwillbs.persistence.MemberDAO;


@Service	
public class MemberServiceImpl implements MemberService{

	private static final Logger log 
	= LoggerFactory.getLogger(MemberServiceImpl.class);
	
	// 1. DB 연결을 위한  sqlSessionFactory 객체 주입 -> root-context.xml에서 SqlSessionFactory 선언
	@Inject
	private SqlSessionFactory factory;
	
	// 2. DB 연결 / MyBatis 설정 + 자원 해제 -> root-context.xml에서 SqlSessionTemplate 선언 
	@Inject
	private SqlSession sqlSession; 
	
	// 3. dao 사용을 위한 주입
	@Inject
	MemberDAO dao;
	
	private static final String NAMESPACE = "com.itwillbs.mapper.MemberMapper";
	
	@Override
	public void insertMember(MemberVO vo) {
	}

	@Override
	public MemberVO loginMember(MemberVO vo) {
		return null;
	}

	@Override
	public MemberVO loginMember(String userid, String userpw) {
		return null;
	}

	@Override
	public MemberVO getMember(String userid) {
		return dao.getMember(userid);
	}

	@Override
	public Integer updateMember(MemberVO vo) {
		return null;
	}

	@Override
	public Integer deleteMember(MemberVO vo) {
		return null;
	}

	@Override
	public List<MemberVO> getMemberList() {
		return null;
	}

}
