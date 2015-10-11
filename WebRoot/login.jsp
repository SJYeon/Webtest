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
    <title>博客登录</title>
 	<meta charset="utf-8">
<link href="./css/index.css" rel="stylesheet" type="text/css">
<style type="text/css">

#con{width:100%;
		height:500px;
		background:#CCC;
		position:relative;
}
#login{
		top:150px;
		width:280px;
		height:300px;
		left:40%;
		position:absolute;
		}
</style>
</head>

<body>
<div>
	<iframe frameborder="0" seamless allowtransparency="true" src="./header.html" width="100%" height="50px"></iframe>
	<div id="con">
    		<div id="login" align="center">
            	<form action="loginaction">
                	<input class="Style_input" type="search" name="user.name" placeholder="请输入用户名"><br>
                    <input class="Style_input" type="password" name="user.password" placeholder="请输入密码"><br>
                    <input class="Style_input" type="submit">
                </form>
            </div>
    </div>	
	<iframe frameborder="0" seamless allowtransparency="true" src="./footer.html" width="100%" height="100px"></iframe> 
</div>

</body>
</html>
