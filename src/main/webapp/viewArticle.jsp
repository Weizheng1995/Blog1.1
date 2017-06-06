<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<head>
		<meta charset="UTF-8">
		<title>浏览文章</title>
		<style>
			.*{
				padding: 0px;
				margin: 0px;
			}
			.content{
				margin-top:5px;
				margin-left: 5px;
			}
			table{
				border: 1px solid gainsboro;
			}
			th{
				background: palegreen;
			}
			tr{
				background: paleturquoise;
				text-align: center;
				height: 30px;
			}
			tr:hover{
				background: deepskyblue;
			}
			.tdSelected{
				background: rgba(0,0,0,0.1);
			}
			.tdSelected a{
				color: black;
				word-spacing: 3px;
				margin-right: 5px;
				text-decoration: none;
			}
			.tdSelected a:hover{
				text-decoration: underline;
				color: lightpink;
			}
			input{
				line-height: 20px;
			}
			#submit,select{
				width: 60px;
				line-height: 25px;
				height: 25px;
			}
		</style>
	</head>
	<body>
		<div class="content">
			<form action="searchArticle" method="post">
            <input type="text" name="keyWord" placeholder="搜索关键词" size="40">&nbsp;&nbsp;By:
            <select name="category">
            <option id="101" value="101" selected="selected">全部</option>
            <c:forEach var="item" items="${categoryList}" varStatus="status">
            <option id="${item.categoryId}" value="${item.categoryId}">${item.categoryName}</option>
            </c:forEach>
            </select>&nbsp;&nbsp;
            <input type="submit" value="搜索" width="50px" id="submit">
        </form><br />
        <table width="100%">
            <tr>
                <th>编号</th>
                <th>标题</th>
                <th>内容</th>
                <th>操作</th>
            </tr>

            <c:forEach var="item" items="${divPage.getSubList()}" varStatus="status">
             <tr >
                  <td>${item.articleId}</td>
                  <td class="tdSelected">
                     	${item.articleTitle}
                  </td>
                  <td>
                      <article>
                    	${item.getSubString(10)}。。
                       </article>
                  </td>
                  <td class="tdSelected">
                    <a href="../articleDetail?articleId=${item.articleId}" target="_blank">查看</a>
                    <a href="deleteArticle?articleId=${item.articleId}">删除</a>
                  </td>
             </tr>
             </c:forEach>
        </table>
        <h3 align="center">${requestScope.message}</h3>
        <p align="right">
             <form action="divPages" method="post" style="float:right;">
             跳转到&nbsp;<input type="text" size="3" name="pageIndex"/>&nbsp;页&nbsp;
             <input type="submit" value="确定"/>
             </form>
            <a href="divPages?pageIndex=${divPage.getCurrentPage()-1}">上一页</a>&nbsp;
            ${divPage.getCurrentPage()}/<b>${divPage.getTotalPages()}</b>&nbsp;
            <a href="divPages?pageIndex=${divPage.getCurrentPage()+1}">下一页</a>&nbsp&nbsp;
        </p>
		</div>
	</body>
</html>
