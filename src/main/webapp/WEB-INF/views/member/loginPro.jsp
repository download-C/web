<%@page import="com.itwillbs.persistence.MemberDAOImpl"%>
<%@page import="com.itwillbs.persistence.MemberDAO"%>
<%@page import="com.itwillbs.domain.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// member/loginPro.jsp
// MemberBean 객체생성
MemberVO mb = new MemberVO();
// id pw 
mb.setUserid(request.getParameter("id"));
mb.setUserpw(request.getParameter("pw"));

//MemberDAO 객체
MemberDAO dao = new MemberDAOImpl();
// 로그인 체크 기능-loginMember() 
int result = dao.loginMember(mb);
 if(result==0){
%>
	    <script type="text/javascript">
	       alert(' 비밀번호 오류! ');
	       history.back();		    
	    </script>		  
	  <%
 }else if(result==-1){
	  %>
	    <script type="text/javascript">
	       alert(' 아이디 오류! ');
	       history.back();		    
	    </script>		  
	  <%
 }else{
	 //아이디 비밀번호 일치
	 //세션값 생성
	 session.setAttribute("loginID", mb.getUserid());
	 // 이동 main.jsp 
	 response.sendRedirect("../main/main.jsp");
 }
%>

