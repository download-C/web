<%@page import="com.itwillbs.persistence.MemberDAOImpl"%>
<%@page import="com.itwillbs.persistence.MemberDAO"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="com.itwillbs.domain.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//member/joinPro.jsp
// request 한글처리
request.setCharacterEncoding("utf-8");
// MemberBean 객체생성
MemberVO mb = new MemberVO();
// id pw name email regdate
mb.setUserid(request.getParameter("id"));
mb.setUserpw(request.getParameter("pw"));
mb.setUsername(request.getParameter("name"));
mb.setUseremail(request.getParameter("email"));
// MemberDAO 객체생성
MemberDAO dao=new MemberDAOImpl();
// insertMember(mb) 메서드 호출
dao.insertMember(mb);
// login.jsp
response.sendRedirect("login.jsp");
%>
