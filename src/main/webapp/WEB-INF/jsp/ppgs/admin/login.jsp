<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui"     uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%

%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="ko" xml:lang="ko">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title><spring:message code="title.admin.main.login" /></title>
    <link type="text/css" rel="stylesheet" href="<c:url value='/css/lgs/reset.css'/>"/>
    <link type="text/css" rel="stylesheet" href="<c:url value='/css/lgs/login.css'/>"/>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"
  			integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
  			crossorigin="anonymous"></script>
    <script type="text/javaScript" language="javascript" defer="defer" src="/js/lgs/login.js"></script>
</head>
<body>
	<div class ="login-bgnd">
		<div class = "login-jumbo">
			<h1>ADMIN-LOGIN</h1>
			<form id="frm-login" method="post" action="/login.do">
				<input class="edt-login" id ="user-id" type="text" placeholder="ID..."></input>
				<input class="edt-login" id ="user-pw" type="password" placeholder="PASSWORD..."></input>
				<input class="btn-login" id ="btn-login" type="button" value="LOGIN"></input>
				<input class="btn-login" id ="btn-register" type="button" value="REGISTER"></input>
			</form>
		</div>
	</div>
</body>
</html>
