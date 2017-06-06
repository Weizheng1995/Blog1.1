<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<head>
		<meta charset="UTF-8">
		<title>编辑信息</title>
		<style>
			*{
				padding: 0px;
				margin: 0px;
			}
			.content{
				max-width: 100%;
				margin-top: 5px;
				margin-left: 5px;
			}
			span{
				line-height: 30px;
				word-spacing: 2px;
				letter-spacing: 5px;
			}
			input{
				line-height:20px;
				size: 70px;
			}
			#submit{
				width: 60px;
				line-height: 25px;
				height: 25px;
			}
		</style>
	</head>
	<body>
		<div class="content">
			<h2 align="center">更新信息</h2>
			<form action="#" method="post">
				<span>Q&nbsp;Q:</span>
				<input type="text" name="authorQq" value="${requestScope.author.authorQq}"/><br /><br />
				<span>微信:</span>
				<input type="text" name="authorWeixin" value="${requestScope.author.authorWeixin}"/><br /><br />
				<span>邮箱:</span>
				<input type="text" name="authorMail" value="${requestScope.author.authorMail}"/><br /><br />
				<span>电话:</span>
                <input type="text" name="authorPhone" value="${requestScope.author.authorPhone}"/><br /><br />
				<span>签名:</span>
				<input type="text" name="authorDescription" size="50" value="${requestScope.author.authorDescription}"/><br /><br />
				<input type="submit" value="更新" id="submit"/>
			</form>
		</div>
	</body>
</html>
