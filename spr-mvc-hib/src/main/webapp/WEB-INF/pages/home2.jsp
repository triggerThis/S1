<?xml version="1.0" encoding="utf-8" ?>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Home page</title>
</head>
<body>
<h1>Home page  1</h1>
<p>
${message}<br/>
<a href="${pageContext.request.contextPath}/team/add.html">Add new team</a><br/>
<a href="${pageContext.request.contextPath}/team/list.html">Team list</a><br/>
<a href="${pageContext.request.contextPath}/home.html">home</a><br/>

<p>
${pageContext.request.contextPath}样是通过 get方法去取的，
先pageContext.getRequest()得到HttpServletRequest对象，
再调用 HttpServletRequest的getContextPath方法
</p>
<textarea>
${pageContext.request.contextPath}样是通过 get方法去取的，
先pageContext.getRequest()得到HttpServletRequest对象，
再调用 HttpServletRequest的getContextPath方法
</textarea>
</p>

<p>
${pageContext.request.contextPath}样是通过 get方法去取的，
先pageContext.getRequest()得到HttpServletRequest对象，
再调用 HttpServletRequest的getContextPath方法
</p>
</body>
</html>