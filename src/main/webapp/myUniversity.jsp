<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<head>
		<meta charset="utf-8" />
		<title>关于我</title>
		<link rel="stylesheet" href="css/normalize.css" />
		<link rel="stylesheet" href="css/main.css" />
		<link rel="stylesheet" href="css/myUniversity.css" />
	</head>
	<body>
		<div class="main-wrapper article">
			<!--页头-->
			<header>
				<nav>
					<div class="logo">
						<a href="index.jsp">魏政</a>
					</div>
					<ul>
						<li><a href="index.jsp" >首 页</a></li>
						<li><a href="queryAllArticle">文 章</a></li>
						<li><a href="aboutMe" >关于我</a></li>
						<li><a href="myUniversity.jsp" class="active">我的大学</a></li>
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
				<div class="content_wrapper clearfix">
					<div class="article_info">
						我只想说上大学，有用也无用。
					</div>
					<article class="clearfix">
					  <div class="article_img">
					  	<img  src="img/zheng.jpg" alt="你好啊"/>
				      </div>
				      <div class="article_content">
				      	<!--
                          	作者：zheng
                          	时间：2017-06-01
                          	描述：关于大学的简介
                          -->
                          <p>
                          	基本信息：<br />
                            &nbsp;&nbsp;于2014-2018，就读于南京一所大学，所属计算机系软件工程专业。<br /><br /><br /><br /><br /><br />
                          </p>
                          <h2>学习资料</h2>
                          <h3>大一</h3>
                          <h3>大二</h3>
                          <h3>大三</h3>
                          <h3>大四</h3>
				      </div>
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
