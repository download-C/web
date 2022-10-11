package com.itwillbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {
	
	// http://localhost:8088/funweb/member/insert
	@RequestMapping(value="/member/insert", method=RequestMethod.GET)
	public String insert() {
	// 
		return "member/join";
		//member/insert를 입력하면 /WEB-INF/views/member/join.jsp 파일로 연결
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
	
	// http://localhost:8088/funweb/member/loginPro
	@RequestMapping(value="/member/loginPro", method=RequestMethod.POST)
	public String loginPro() {
		System.out.println("MemberController loginPro()");
		// loginPro 가상주소가 들어올 경우 /main/main.jsp 파일로 이동
		return "redirect:/main/main";
	}
	
	// http://localhost:8088/funweb/main/main
	@RequestMapping(value="/main/main", method=RequestMethod.GET)
	public String main() {
		System.out.println("MemberController main()");
		// loginPro 가상주소가 들어올 경우 /main/main.jsp 파일로 이동
		return "/main/main";
	}
}