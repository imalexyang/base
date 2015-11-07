<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<link rel="stylesheet" type="text/css" href="../resource/commons/jeasyui/themes/default/easyui.css">
		<link rel="stylesheet" type="text/css" href="../resource/commons/jeasyui/themes/icon.css">
		<link rel="stylesheet" type="text/css" href="../resource/commons/css/menu.css">
		<script type="text/javascript" src="../resource/commons/jeasyui/jquery.min.js"></script>
		<script type="text/javascript" src="../resource/commons/jeasyui/jquery.easyui.min.js"></script>
		<script type="text/javascript" src="../resource/commons/js/commons.js"></script>
		<title>后台管理系统</title>
	</head>
	<body class="easyui-layout">		
		<div data-options="region:'north'" style="height:100px;padding-left: 50px;">
			<br/>
			<br/>
			<br/>
			<h1>后台管理系统</h1>
		</div>
		<div id="p" data-options="region:'west'" title="菜单" style="width:205px;">
			<!-- 代码 开始 -->
			<div class="subNavBox">
				<div class="subNav currentDd currentDt">权限管理中心</div>
				<ul class="navContent" style="display:block">
						<li><a href="#">组织机构</a></li>
						<li><a href="/base/user/list" target="iframe" class="currentA">用户管理</a></li>
						<li><a href="#">菜单管理</a></li>
						<li><a href="#">角色管理</a></li>
						<li><a href="#">权限管理</a></li>						
				</ul>
				<!-- <div class="subNav">关于我们</div>
				<ul class="navContent">
						<li><a href="#">添加新闻</a></li>
						<li><a href="#">新闻管理</a></li>
						<li><a href="#">添加新闻</a></li>
						<li><a href="#">新闻管理</a></li>
				</ul>
				<div class="subNav">业务系统</div>
				<ul class="navContent">
						<li><a href="#">添加新闻</a></li>
						<li><a href="#">添加新闻</a></li>
						<li><a href="#">新闻管理</a></li>
				</ul>
				<div class="subNav">招商加盟</div>
				<ul class="navContent">
						<li><a href="#">添加新闻</a></li>
						<li><a href="#">添加新闻</a></li>
						<li><a href="#">新闻管理</a></li>
						<li><a href="#">添加新闻</a></li>
						<li><a href="#">新闻管理</a></li>
				</ul> -->
			</div>
			<!-- 代码 结束 -->
		</div>
		<div data-options="region:'center'" title="内容">
			<iframe name="iframe" id="iframe" width="99%" height="98%" src="/base/user/list">您的浏览器不支持iframe，请按网页底部联系方式反馈给我们，谢谢。</iframe>
		</div>
	</body>
	<script type="text/javascript" src="../resource/commons/js/admin/index.js"></script>
</html>