;$(
	function(){
		'use strike';
		
		var sidebar=$('#sidebar'),
		    mask=$('.mask'),
		    backButton=$('.back-to-top'),
		    sidebar_trigger=$('#sidebar_trigger');
		function showSidebar(){
			mask.fadeIn();
			sidebar.animate({'right':0});
//			sidebar.css('right',0);
		}
		function hideSidebar(){
			mask.fadeOut();
			sidebar.css('right',-sidebar.width());
		}
		function backToTop(){
//			console.log('backToTop');
			$('html,body').animate({
				scrollTop:0
			},800)
		}
		sidebar_trigger.on('click',showSidebar)
		mask.on('click',hideSidebar)
		backButton.on('click',backToTop)
		
		$(window).on('scroll',function(){
			if($(window).scrollTop()>$(window).height())
			    backButton.fadeIn();
			else
			    backButton.fadeOut();
		})
	}
)
