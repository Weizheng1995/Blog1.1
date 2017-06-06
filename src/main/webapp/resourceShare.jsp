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
		<link rel="stylesheet" href="css/share.css" />
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
						<li><a href="myUniversity.jsp" >我的大学</a></li>
						<li id="sidebar_trigger" class="active"><a href="#">分 享</a></li>
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
					<div class="share-resource">
						<!--
                        	作者：zheng
                        	时间：2017-06-01
                        	描述：分享案例部分
                        -->
						<p id="example" class="share-title">Java案例分享</p>
						<div class="article_info">
							<p>JavaEE BBS论坛系统 发布于2017-6-1  浏览：233</p>
						</div>
						<article>
						  <div class="article_img">
						  	<img  src="img/zheng.jpg" alt="你好啊"/>
					      </div>
					      <div class="article_content">
					      	<p>自制论坛系统(BBS) </p>
					      	<p>
					      		主要采用：<br />
					      		后端：Struts2+Spring+Hibernate+MySql<br />
					      		前端：Ajax+js+html+css+div(经典网页样式)<br />
					      		开发工具：MyEclipse+tomcat7.0<br />
					      		测试运行环境:windows10<br />
					      		功能介绍：<br />
					      		主要包含了登录、注册、查询(按条件查找)文章、发布文章、查看自己以及别人的文章<br />
					      		功能尚未完善。可自行添加(如评论、点赞、分享、收藏)功能。<br />
					      		演示：<a href="#">演示实例链接</a>
					      	</p>
					      </div>
				        </article>
				        <div class="clearfix"></div>
				        <div class="article_info">
							<p>另一个分享的项目介绍  发布于2017-6-1  浏览：233</p>
						</div>
						<article>
						  <div class="article_img">
						  	<img  src="img/zheng.jpg" alt="你好啊"/>
					      </div>
					      <div class="article_content">
					      	<p>自制论坛系统(BBS)</p>
					      	<p>
					      		主要采用：<br />
					      		后端：Struts2+Spring+Hibernate+MySql<br />
					      		前端：Ajax+js+html+css+div(经典网页样式)<br />
					      		开发工具：MyEclipse+tomcat7.0<br />
					      		测试运行环境:windows10<br />
					      		功能介绍：<br />
					      		主要包含了登录、注册、查询(按条件查找)文章、发布文章、查看自己以及别人的文章<br />
					      		功能尚未完善。可自行添加(如评论、点赞、分享、收藏)功能。<br />
					      		演示：<a href="#">演示实例链接</a>
					      	</p>
					      </div>
				        </article>
				        <div class="clearfix"></div>
				        <!--
                        	作者：zheng
                        	时间：2017-06-01
                        	描述：分享视频部分
                        -->
                        <p id="video" class="share-title">Java视频分享</p>
                        <article>
                        	<h3>网站推荐</h3>
                        	<p>ps:看再精彩的视频，也比不上自己动手敲几行代码</p>
                        	<p><a href="#">推荐网址1</a></p>
                        	<p><a href="#">推荐网址2</a></p>
                        	<p><a href="#">推荐网址3</a></p>
                        	<p><a href="#">推荐网址4</a></p>
                        	<h3>百度云学习视频资料分享</h3>
                        	<p><a href="#">分享网址1</a></p>
                        	<p><a href="#">分享网址2</a></p>
                        	<p><a href="#">分享网址3</a></p>
                        	<p><a href="#">分享网址4</a></p>
                        	<p>ps:其中的视频都很老了，质量也不是很好，总之是一分心意，大家别嫌弃啊，另外建议大家去在线看推荐网址的课程(简练而精彩)</p>
                        </article>
                        <!--
                        	作者：zheng
                        	时间：2017-06-01
                        	描述：推荐书籍部分
                        -->
                        <p id="book" class="share-title">Java书籍推荐</p>
                        <article>
                        	<p>首先为大家介绍java的几个阶段：</p>
                        	<p>入门阶段</p>
                        	<p>拓展阶段</p>
                        	<p>提炼阶段</p>
                        	<p>....... </p>
                        	<h3>入门阶段</h3>
                        	<p>
                        		这个阶段定位于java小白和对java不是很熟悉(只是简单了解)的人群，这是学习任何事物的必经阶段。
                        	</p>
                        	<p>
                        		推荐书籍：<br />
                        		①java从入门到精通/21天学通java<br />
                        		点评：书不在好坏，入门其实很简单，关键是兴趣，千万别急，学习语言，要的是耐心。每本书其实都基本包含了java的各方面知识，所以
                        		不要盲目的买入门类的书。推荐的这本书，知识关于入门的，我觉得入门的书其他的也可以，并不是这本书非常好，每个人的理解感受都不一样，
                        		推荐这本书知识代表着入门看的书，不要多，一本或两本就够了。<br />
                        		②java核心技术Ⅰ/Ⅱ卷<br />
                        		点评:可以当作参考手册使用，讲的是很详细，很经典的java书。<br />
                        		③java编程思想<br />
                        		点评：建议等自己基本掌握了java后看，会有更多收获。前期阅读，有点压力容易是自己失去对java学习的兴趣。<br />
                        		④java趣味编程100例<br />
                        		点评：关于java的100个小实例，可以边学例子，边学知识。可以提高自己的信息和兴趣。
                        	</p>
                        	<h3>拓展阶段</h3>
                        	<p>本阶段的小伙伴已经能基本掌握java使用，寻求java的开发方向</p>
                        	<p>
                        		<h4>认真寻求自己喜欢的方向</h4>
                        		java桌面应用开发：<br />
                        		技能：需要灵活掌握swing的使用、构建。<br />
                        		javaWeb应用开发：<br />
                        		技能：需要掌握基本的前端知识(html+css+js)。<br />
                        		Android应用开发：<br />
                        		技能：需要另外学习Android的方面知识，虽然这是基于java的。<br />
                        		书籍：html+css+div、javascript、jquery、struts2、hibernate、spring、ajax。
                        	</p>
                        	<h3>提炼阶段</h3>
                        	<p>本阶段的小伙伴已经确定自己的java方向，能熟悉使用自己掌握的技术，并能知其然而知其所以然，进而架构出属于自己的技术骨架。</p>
                        	<p>
                        		<p>不断提升中......................</p>
                        	</p>
                        </article>
                        <!--
                        	作者：zheng
                        	时间：2017-06-01
                        	描述：开发工具部分
                        -->
                        <p id="developerTools" class="share-title">Java开发工具</p>
                        <article>
                        	<h2>
                        		前期基础
                        	</h2>
                        	<p>
                        		推荐使用：Eclipse(需安装jdk，自行设置环境变量)
                        	</p>
                        	<h2>
                        		JavaWeb方面
                        	</h2>
                        	<p>
                        		推荐使用：myEclipse(简单、易用、前期)、Eclipse-EE(挺好的)、IntelliJ IDEA(很专业、提高开发效率、后期推荐)
                        	</p>
                        	<h2>
                        		Android移动端
                        	</h2>
                        	<p>
                        		推荐使用：Android Studio
                        	</p>
                        	<h2>
                        		其他
                        	</h2>
                        	<p>
                        		前端：HBuilder(做的很好、方便快捷)<br />
                        		数据库：MySql(简单、移用、个人、前期)、SqlServer<br />
                        		数据库可视化：navicate<br />
                        		web服务器：Tomcat、nginx<br />
                        		版本控制：gitHub(个人)、subversion<br />
                        		项目管理：Maven<br />
                        	</p>
                        	<p>PS:这些开发工具基本上都是免费的，只有部分是限制的，百度百科官网都可以获取到</p>
                        </article>
				    </div>
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
