<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
		<link rel="stylesheet" href="<%=request.getContextPath() %>/css/normalize.css" />
		<link rel="stylesheet" href="<%=request.getContextPath() %>/css/main.css" />
	</head>
	<body>
		<div class="main-wrapper">
			<!--页头-->
			<header>
				<nav>
					<div class="logo">
						<a href="homePage">魏政</a>
					</div>
					<ul>
						<li><a href="homePage" class="active">首 页</a></li>
						<li><a href="queryAllArticle">文 章</a></li>
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
	                    <button>了解我</button>
	                    <div class="more">更多</div>
					</div>
				</div>
			</header>
			<!--内容-->
			<div class="content">
				<section class="green-section">
					<div class="wrapper">
						<div>
							<h2>是这样么</h2>
							<div class="hr"></div>
							<p class="sub-head">人们宁愿去关心一个蹩脚电影演员的吃喝拉撒和鸡毛蒜皮，而不愿了解一个普通人波涛汹涌的内心世界……</p>
						</div>
						<div class="icon-group">
							<span class="icon"><img src="img/c.jpg"/></span>
							<span class="icon"><img src="img/zheng.jpg"/></span>
							<span class="icon"><img src="img/c2.jpg"/></span>
						</div>
					</div>
				</section>
				<section class="gray-section">
					<div class="article-preview">
						<div class="img-section">
							<img src="img/pic01.jpg" alt="" />
						</div>
						<div class="text-section">
							<h2>Chapter 1</h2>
							<p class="sub-head">人生并不像火车要通过每个站似的经过每一个生活阶段。人生总是直向前行走，从不留下什么。</p>
						</div>
					</div>
					<div class="article-preview">
						<div class="text-section">
							<h2>Chapter 2</h2>
							<p class="sub-head">人生若只如初见，何事秋风悲画扇。<br />等闲变却故人心，却道故人心易变。<br />骊山语罢清宵半，泪雨零铃终不怨。<br />何如薄幸锦衣郎，比翼连枝当日愿。</p>
						</div>
						<div class="img-section">
							<img src="img/pic02.jpg" alt="" />
						</div>
					</div>
					<div class="article-preview">
						<div class="img-section">
							<img src="img/pic03.jpg" alt="" />
						</div>
						<div class="text-section">
							<h2>Chapter 3</h2>
							<p class="sub-head">每一个繁花似锦，都是经历了暗涛汹涌；每一个鲜艳夺目，都是经历了风雨无阻；每一个风光无限，都是经历了黯然伤神。所有的一切，只有经历过的人，才更懂得背后的力量。</p>
						</div>
					</div>
				</section>
				<section class="purple-section">
					<div class="wrapper">
						<div class="heading-wrapper">
						<h2>人生</h2>
						<div class="hr"></div>
						<div class="sub-heading">
							人生的磨难是很多的，所以我们不可对于每一件轻微的伤害都过于敏感。在生活磨难面前，精神上的坚强和无动于衷是我们抵抗罪恶和人生意外的最好武器。
						</div>
						</div>
						<div class="card-group clearfix">
							<div class="card">
								<h3>小学</h3>
								<p>
									2002-2008年，前五年在我们村的小学上的，自己记忆的问题，现在只能零星的记住些碎片了。记忆尤新的是，二三年级的时候，虽然自己的成绩不是很好，
									但是却学的很开心。<br />
									如果没记错的话，自己的转折点应该是四年级的时候，遇到一个很凶的数学老师，大家都很怕他，所以自己不敢在这门课上偷懒，很显然成绩是飞速上升，
									也小小改变了自己的性格吧。（他真的挺好的。。。）<br />
									六年级，第一次，走出了自己的小村庄，在乡里的小学上六年级，记忆不是很多，只有她。。。。。。<br />
									不知道，她过的怎么样了呢。。，希望她过的开心吧。
								</p>
							</div>
							<div class="card">
								<h3>初中</h3>
								<p>
									2008-2011年，在我们那的乡上初中，年轻无极限么，或许自己当时的头脑很可以，很轻松就可以考个好成绩，也交了很多的朋友(很多年没联系了，他们都各自成家立业了)
									，。。。。。总觉得自己因为上学失去了很多东西,却没发现得到了写啥。。可能是我太偏激了<br />
									这三年的时光，是自己学业生涯里的最重要的时光。。。。。<br />
									很开心。。。。。。。。。。。
								</p>
							</div>
						</div>
						<div class="card-group clearfix">
							<div class="card">
								<h3>高中</h3>
								<p>
									2011-2014年，在老家上了市里还算可以得高中，或许是上天的安排和自己性格的使然，竟然让我考了个年级前十左右，
									<br />哎。。。。。。。<br />
									一发不可收拾，一度经历了为期两年的迷茫期。。。。。。。。<br />
									高三，不知道，为啥要努力，自己为啥要在这刷题，人们常说没目标是可怕的。。。。。<br />
									但怀着不能对不起家人的心，自己对自己说：必须努力。。。但两年的迷茫期，让自己落后了很多，不管自己多么努力总是。。。
									高考结束了，自己只比二本线多了十分，（不想上。。，这是第一个念头，也不想上学），但考虑到家人，在此妥协了，选了
									个南京的学校。。。。。。。。。。。。<br />
									。。。。。。。。。。。。。。。<br />
									不知道，写到这，心很痛。。。。。。。。。<br />
								</p>
							</div>
							<div class="card">
								<h3>大学</h3>
								<p>
									2014-2018年，在南京上大学。怀着懵懂的心第一次走出了家乡，来到这个陌生的大城市，害怕中又带着些激动，就这样，在迷茫中
									度过了一个又一个学期，期间的心境由：迷茫-->努力-->懒散-->迷茫。<br/>
									我不知道是不是所有的学生都是这样的，自己总觉得自己已经很努力了，但还是感觉没啥用。对未来的担心、和自己的差距，可能自己
									真的心急了吧，但。。。。。<br />
									确实大学，是个改变人的地方，决定了你。。。。。。<br />
									。。。。。。。。。。<br />
								</p>
							</div>
						</div>
						<div class="card-group clearfix">
							<div class="card">
								<h3>家族</h3>
								<p>
									我们这个大家庭，真心的挺不错的，大家都很和睦。小时候的自己，感触不是很大，人往高处走，水往低处流。家家都在比这过，现在的自己
									已经长大了，渐渐的应该学者去承担责任。<br />
									在别人眼里，自己是上了大学的，以后肯定是可以很好的。但有用吗？？？？上大学》》》》》》<br />
									毛用都没有，浪费时间，浪费金钱，如果有人说我太偏激。对的，我承认。。。<br />
									但从大数据来说，是不是弊大于利，。。。不讲这个话题了。。<br />
									如果自己不能找个好工作，让别人看的起的话，岂不成了笑话。。、、、
									一直的自己都在内心中督促自己，努力向前。但每每细心回想，又那么令人失望，自己还是很差，不知道怎样的自己才是合格的，我做不到
									很安逸，我承认我的心很小，小到连自己都容不下。<br />
									真的很无力，有时，但又不得不站起来，向前冲。。。。。。
								</p>
							</div>
							<div class="card">
								<h3>家</h3>
								<p>
									人们常说，家是温暖的港湾。有道理，但这次我竟然害怕的不敢回家，说不出来为什么，害怕，啥？不想多想。。。<br />
									这个家，很好，正确的说非常好。爸妈，都很努力，为了姐姐和我。所以我更应该好好努力报答他们，找个好工作，让他们不要那么幸苦，虽然
									现在的自己不知道是不是合格了，但是我还会继续加油的。<br />
									压力、压力。。。。。。。。，总是好的。
								</p>
							</div>
						</div>
					</div>
				</section>
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
