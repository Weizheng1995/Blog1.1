;$(
	function(){
		'use strike';
		        // 下拉自动加载数据实现分页
                // 下拉加载更多数据的功能
                var url = "http://localhost:8080/blog/loadArticles"; // 请求获取数据的url
                var totalPage = 1; //一共有多少页数据
                var pageSize = 10; // 每页显示30条数据
                var currentPage = 1; // 当前第几页数据，默认为1
                var isLoading = false; // 是否正在加载更多的数据

                // 页面渲染完之中执行的代码
                // 绑定事件，监听滚动条下拉的动作
                bindScrollEvent();
                // 请求后台，加载文章信息
                queryArticle(1);
                //请求后台，加载文章信息
                function queryArticle(pageNum){

                	if(pageNum > totalPage){
                		$("#emptyInfo").html("没有更多的文章信息了......");
                		$(window).unbind("scroll");
                	}
                	if(isLoading){
                		return;
                	}else{
                		isLoading = true; // 修改状态为正在加载数据
                	}
                	// 进行post请求
                	$.post(url,{pageIndex:pageNum},function(data){
                		// 加载文章信息
                		totalPage = data.totalPages; // 一共有多少页数据
                		currentPage = data.currentPage; // 获取当前第几页数据
                		var subList = data.subList; // 文章信息
                		if(totalPage == 0){
                			$("#emptyInfo").html("没有更多的文章信息了......");
                		}
                		//加载文章的数据
                		showArticleData(subList);

                		isLoading = false;
                	},"json");
                }
                //加载文章的数据;
                function showArticleData(articleList){
                	var articleStr ="" ;
                	$.each(articleList,function(idx, obj){
                		articleStr+="<div class='article_item'><div class='article_info'>";
                		articleStr+="浏览:"+obj.articleViewcount+" 分类:"+obj.articleCategory;
                		articleStr+="<a href='articleDetail?articleId="+obj.articleId+"' >查看更多</a>";
                		articleStr+="</div><article>";
                		articleStr+="<h2 align='center'>"+obj.articleTitle+"<h2>";
                		var content=obj.articleContent;
                		articleStr+="<p>"+content.substring(0,50)+"...<p>";
                		articleStr+="</article></div>";
                	});
                	$("#articlesDiv").append(articleStr);
                }

                function bindScrollEvent(){
                	// 添加滚动监听事件
                	$(window).scroll( function() {
                			var docHeight = $(document).height(); // 获取整个页面的高度
                			var winHeight = $(window).height(); // 获取当前窗体的高度
                			var winScrollHeight = $(window).scrollTop(); // 获取滚动条滚动的距离
                			if(docHeight -30 <= winHeight + winScrollHeight){
                				// 加载更多的文章数据
                				queryArticle(currentPage+1);
                			}
                	} );
                }
	}
)