<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<head>
		<meta charset="utf-8">
		<title>添加文章</title>
		<script type="text/javascript" src="../ckeditor/ckeditor.js" ></script>
		<style>
			*{
				margin: 0px;
				padding: 0px;
			}
			.content{
				max-width: 100%;
				margin-top:5px;
				margin-left: 5px;
				min-height: 600px;
			}
			input{
				line-height: 20px;
			}
			span{
				color: black;
				font-size: large;
				word-spacing: 2px;
				margin-top: 10px;
			}
			#submit{
				line-height: 30px;
				width: 60px;
				height: 30px;
				
			}
		</style>
	</head>
	<body>
		<div class="content">
			<h2 align="center">添加文章</h2><br />
			<form action="addArticle" method="post">
				<span>标 题:</span>
				<input type="text" placeholder="文章标题" name="articleTitle" size="50"/><br /><br />
				<span>分 类:</span>
				<select name="articleCategory">
                <c:forEach var="item" items="${requestScope.categoryList}" varStatus="status">
                <option id="${item.categoryId}" value="${item.categoryId}">${item.categoryName}</option>
                </c:forEach>
                </select><br /><br />
				<span>文章内容:</span><br />
			    <textarea id="inputContent" rows="40" cols="20" class="ckeditor" name="articleContent"></textarea><br />
		        <input type="submit" value="添加" id="submit"/>    ${requestScope.message}
			</form>
		</div>
		<script type="text/javascript">
			CKEDITOR.replace('inputContent');
		</script>
	</body>
</html>