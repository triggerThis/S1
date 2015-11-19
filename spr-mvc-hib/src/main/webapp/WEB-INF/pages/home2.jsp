<?xml version="1.0" encoding="utf-8" ?>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<c:if test="${!ajaxRequest}">
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Home page</title>

<!-- 
<link href="<c:url value="resources/form.css" />" rel="stylesheet"  type="text/css" />		
	<link href="<c:url value="resources/jqueryui/1.8/themes/base/jquery.ui.core.css" />" rel="stylesheet" type="text/css"/>
	<link href="<c:url value="resources/jqueryui/1.8/themes/base/jquery.ui.theme.css" />" rel="stylesheet" type="text/css"/>
	<link href="<c:url value="resources/jqueryui/1.8/themes/base/jquery.ui.tabs.css" />" rel="stylesheet" type="text/css"/>

<link href="<c:url value="resources/form.css" />" rel="stylesheet"  type="text/css" />		
	<link href="/spring-mvc-hib/resources/jqueryui/1.8/themes/base/jquery.ui.core.css" rel="stylesheet" type="text/css"/>
	<link href="/spring-mvc-hib/resources/jqueryui/1.8/themes/base/jquery.ui.theme.css"  rel="stylesheet" type="text/css"/>
	<link href="/spring-mvc-hib/resources/jqueryui/1.8/themes/base/jquery.ui.tabs.css"  rel="stylesheet" type="text/css"/>


<link href="<c:url value="resources/form.css" />" rel="stylesheet"  type="text/css" />
<link type="text/javascript"  href="resources/jquery/1.6/jquery.js" />
<script type="text/javascript" src="<c:url value="/resources/jquery/1.6/jquery.js" />"></script>
<script type="text/javascript"  src="<c:url value="resources/jquery/1.6/jquery.js" />" />		
<script type="text/javascript"  src="resources/jquery/1.6/jquery.js" />
<script type="text/javascript"  src="/spring-mvc-hib/resources/jquery/1.6/jquery.js" />
<link href="resources/jqueryui/1.8/themes/base/jquery.ui.core.css" rel="stylesheet" type="text/css"/>
	<link href="resources/jqueryui/1.8/themes/base/jquery.ui.theme.css"  rel="stylesheet" type="text/css"/>
	<link href="resources/jqueryui/1.8/themes/base/jquery.ui.tabs.css"  rel="stylesheet" type="text/css"/>

<script type="text/javascript" src="<c:url value="/resources/jquery/1.6/jquery.js" />"></script>
<script type="text/javascript"  src="<c:url value="resources/jquery/1.6/jquery.js" />" />

<script type="text/javascript"  src="<c:url value="/resources/jquery/1.6/jquery.js" />" />
-->
<script src="http://libs.baidu.com/jquery/1.10.2/jquery.min.js"></script>
<script src="http://apps.bdimg.com/libs/angular.js/1.3.9/angular.min.js"></script>
<link rel="stylesheet" href="//apps.bdimg.com/libs/bootstrap/3.2.0/css/bootstrap.min.css">
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

<!-- Imports user-defined @Controller beans that process client requests -->
	<beans:import resource="controllers.xml" />
</p>
<textarea>
http://blog.csdn.net/wangshfa/article/details/39560225
上述提到, 在 spring web的使用中, 会加载两个ioc容器,
          1. 一个是contextConfigLocation定义,用来启动spring核心框架的. 所以在该步骤中,应加载应用中的基础服务信息的bean,如 dao,Service 等等.
          2. 另外一个ioc容器是web加载的容器, 那么只需加载Controller相关的bean.
          
在方案一中, 使用的简单,粗暴的解决办法. 没有考虑到spring的设计思想. 
既然有ioc容器的父子级划分,那么在使用的时候,一定会有用的.
 因为在spring ioc的 DefaultListableBeanFactory类是支持父子关系,
            1. 子容器是可以访问到父容器中的bean,
            2. 然而父容器访问不了子容器的bean,
        这就保证了, Controller可以访问 Service等, 但是Service 访问不了web层的bean, 这样就将职责分开了.所以修改的配置如下:
        
        spring 4 aspectJ
 http://www.it165.net/pro/html/201407/18718.html
</textarea>
</p>

<p>
${pageContext.request.contextPath}样是通过 get方法去取的，
先pageContext.getRequest()得到HttpServletRequest对象，
再调用 HttpServletRequest的getContextPath方法
</p>

<a href="${pageContext.request.contextPath}/link/home2.html">Team list</a><br/>

<p>
$_{pageContext.request.contextPath}样是通过 get方法去取的，
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

<aop:aspectj-autoproxy/>有一个proxy-target-class属性，默认为false，表示使用jdk动态代理织入增强，当配为<aop:aspectj-autoproxy poxy-target-class="true"/>时，表示使用CGLib动态代理技术织入增强。
不过即使proxy-target-class设置为false，如果目标类没有声明接口，则spring将自动使用CGLib动态代理
</p>

AngularJS Bootstrap
http://www.runoob.com/angularjs/angularjs-bootstrap.html


<script type="text/javascript">
a = 'HttpServletRequest';
$(document).ready(function() {
	$('body').append('jquery');
	$('body').prepend(a);
});
</script>
</body>
</html>
</c:if>