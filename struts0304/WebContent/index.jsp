<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

 这是主页.....

<a href="mykfc.action"> 默认方法</a>

<a href="mykite.action"> 绑定方法method</a>

<a href="myjack!hello.action">! 动态方法调用method</a>

<a href="myjack_hello.action">* 动态方法调用method</a>

<a href="myjack_myTest.action?myUserName=tom">request * 动态方法调用method</a>
</body>
</html>