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
		<title>用户列表</title>
	</head>
	<body>	
		<table class="easyui-datagrid" title="Basic DataGrid" style="width:700px;height:250px"
            data-options="singleSelect:true,collapsible:true,url:'/base/user/userList',method:'get'">
	        <thead>
	            <tr>
	                <th data-options="field:'id',width:60">ID</th>
	                <th data-options="field:'name',width:100">name</th>
	                <th data-options="field:'nick',width:80,align:'right'">Nick</th>
	                <th data-options="field:'nick',url:'/base/user/update?id=1',width:80,align:'right'">edit</th>		               
	            </tr>
	        </thead>
	    </table>
	</body>
	<script type="text/javascript" src="../resource/commons/js/user/list.js"></script>
</html>