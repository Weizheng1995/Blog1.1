<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<head>
		<meta charset="utf-8" />
		<title>Article</title>
		<link rel="stylesheet" href="css/normalize.css" />
		<link rel="stylesheet" href="css/main.css" />
	</head>
	<body>
		<div class="main-wrapper article">
			<!--页头-->
			<header>
				<nav>
					<div class="logo">
						<a href="homePage">魏政</a>
					</div>
					<ul>
						<li><a href="homePage" >首 页</a></li>
						<li><a href="queryAllArticle" class="active">文 章</a></li>
						<li><a href="aboutMe">关于我</a></li>
						<li><a href="myUniversity" >我的大学</a></li>
						<li id="sidebar_trigger"><a href="#">分 享</a></li>
					</ul>
				</nav>
				<div id="banner">
					<div class="inner">
						<div class="hr"></div>
						<h2>魏政</h2>
						<div class="hr"></div>
						<p class="sub-head">人和社会，一切斗争的总结局也许都是中庸而已。与其认真，不如随便，采菊东篱下，悠然见南山。有钱就寻一醉，无钱就寻一睡，与过无争，随遇而安。</p>
					</div>
				</div>
			</header>
			<!--内容-->
			<div class="content">
				<div class="content_wrapper">
					<div class="article_info">
						编辑于 ${requestScope.article.getCurrentDate()} 浏览:${requestScope.article.articleViewcount}  &nbsp;作者:${author.authorName} &nbsp;分类:${requestScope.category.categoryName}
					</div>
					<article>
					<h2 align="center">${requestScope.article.articleTitle}</h2>
					${requestScope.article.showContent()}
					<c:if test="${message}">
					 <h4 color="blue">${message}</h4>
					</c:if>
				    </article>
				</div>
			</div>
			<!--页脚-->
			<footer>
				<ul class="share-group">
					<li>C</li>
					<li>Java</li>
					<li>JEE</li>
					<li>Android</li>
				</ul>
				<div class="copy">
					&copy 魏政 -2017
				</div>
			</footer>
		</div>
		<div class="mask">
			
		</div>
		<div id="sidebar">
			<ul>
				<li><a href="resourceShare.jsp#example">java案例分享</a></li>
				<li><a href="resourceShare.jsp#video">学习视频</a></li>
				<li><a href="resourceShare.jsp#book">推荐书籍</a></li>
			</ul>
		</div>
		<button class="back-to-top">返回顶部</button>
		<script type="text/javascript" src="js/jquery-2.1.0.js" ></script>
		<script type="text/javascript" src="js/main.js" ></script>
	</body>
</html>
