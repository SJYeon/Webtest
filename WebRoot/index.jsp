<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.beans.Users" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
  <head>
    <base href="<%=basePath%>">
    <title>FreeBlog</title>
 	<meta charset="utf-8">
<link href="./css/index.css" rel="stylesheet" type="text/css">

</head>

<body>
<div id="body">
		<iframe frameborder="0" seamless allowtransparency="true" src="./header.html" width="100%" height="50px"></iframe>
<div id="cont1">
        		<div id="form" align="center">
                <form action="register">
                <input class="Style_input" placeholder="用户名" name="user.name" type="search"><br>
                <input class="Style_input" placeholder="邮箱" name="user.email" type="email"><br>
                <input class="Style_input" placeholder="密码" type="password"><br>
                <input class="Style_input" placeholder="确认密码" name="user.password" type="password"><br>
                <input class="Style_input" type="submit" >
                </form>
                </div>
        </div>
        <div id="cont2"></div>
     <iframe frameborder="0" seamless allowtransparency="true" src="./footer.html" width="100%" height="100px"></iframe>  
</div>
</body>
</html>