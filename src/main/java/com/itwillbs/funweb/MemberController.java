package com.itwillbs.funweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {
	
//	// http://localhost:8088/funweb/insert
//	@RequestMapping(value="/insert", method=RequestMethod.GET)
//	public String insert(){
//	return "insert";
//	}
	
	
	// http://localhost:8088/funweb/member/insert
	@RequestMapping(value="/member/insert", method=RequestMethod.GET)
	public String insert() {
		System.out.println("MemberController insert()");
	// 해당 링크 클릭 시 가상 주소 변경 없이 회원가입(join.jsp)로 이동
		return "member/join";
	}
	
	// http://localhost:8088/funweb/member/insertPro
	@RequestMapping(value = "/member/insertPro", method=RequestMethod.POST)
	public String insertPro() {
		System.out.println("MemberController insertPro()");
		//회원가입 완료 시 주소가 가상 주소(redirect:)로 변경하기
		return "redirect:/member/login";
	}
	
	// http://localhost:8088/funweb/member/login
	@RequestMapping(value="/member/login", method=RequestMethod.GET)
	public String login() {
		System.out.println("MemberController login()");
		// login 가상주소가 들어올 경우 /member/login.jsp 파일로 이동
		return "/member/login";
	}

	
}
