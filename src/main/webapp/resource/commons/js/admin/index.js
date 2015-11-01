/*!
 * imalex@163.com - v0.1 (2015-08-29 18:00:00 +0800)
 * Copyright 2015
 */
$(function(){
	$(".subNav").click(function(){			
			// 修改数字控制速度， slideUp(500)控制卷起速度
			$(this).next(".navContent").slideToggle(500).siblings(".navContent").slideUp(500);
	})	
	
	$(".navContent li a").click(function(){
		$(this).parent().siblings().children().each(function(){
			   $(this).removeClass("currentA");
	    });
		$(this).addClass("currentA");
	})
})