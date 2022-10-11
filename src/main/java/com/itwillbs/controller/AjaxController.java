package com.itwillbs.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itwillbs.domain.MemberVO;
import com.itwillbs.service.MemberService;

@RestController  // RestAPI : 웹으로 주소를 입력하면 화면 전환 없이 해당 데이터를 Text, JSON, XML 형태로 조회할 수 있음.
public class AjaxController {
	
	@Inject
	private MemberService memberServece;
	
	// DB에 있는 id와 사용자가 입력한 id가 일치하는지 확인 후 결과값 리턴
	@RequestMapping(value="/member/idcheck")
	public ResponseEntity<String> idcheck(HttpServletRequest request) {
		
		// 1. 사용자가 입력한 id 가져오기
		String id  = request.getParameter("id"); 
		
		// 2. DB 연결(root-context.xml) 후 getMember() 실행
		MemberVO vo = memberServece.getMember(id);
		
		// 3. 아이디 비교
		String result = "";
		if(vo != null) result = "you can't you this id";
		else result = "you can use this id";
		
		
		ResponseEntity<String> entity 
		= new ResponseEntity<String>(result, HttpStatus.OK);
		

		return entity;// ajax는 페이지 이동 대신 결과 데이터 리턴
	}
}
