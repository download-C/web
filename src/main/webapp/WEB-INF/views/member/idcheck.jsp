<%@page import="com.itwillbs.persistence.MemberDAOImpl"%>
<%@page import="com.itwillbs.domain.MemberVO"%>
<%@page import="com.itwillbs.persistence.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//member/idcheck.jsp
// 'id':$('.id').val()
String id=request.getParameter("id");
// MemberDAO 객체생성
MemberDAO dao = new MemberDAOImpl();
// getMember(id) 메서드호출
MemberVO mb=dao.getMember(id);
String result="";
if(dao.getMember(id)!=null){
	//아이디 있음, 아이디 중복
	result="아이디 중복";
}else{
	//아이디 없음, 아이디 사용가능
	result="아이디 사용가능";
}
%>
<%=result%>