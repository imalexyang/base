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
		<title>用户列表</title>
	</head>
	<body>	
		<table id="dg" class="easyui-datagrid" title="Basic DataGrid" style="width:100%;height:100%;"
            data-options="rownumbers:true,singleSelect:true,autoRowHeight:true,pagination:true,
				pageSize:10,url:'/base/user/userList',method:'get',toolbar:'#toolbar'">
	        <thead>
	            <tr>
	                <th data-options="field:'id',width:100">ID</th>
	                <th data-options="field:'name',width:150">name</th>
	                <th data-options="field:'nick',width:200,align:'right'">Nick</th>
	            </tr>
	        </thead>
	    </table>
	    <div id="toolbar">
			<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add'" onclick="insert()">添加</a>
			<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-edit'" onclick="edit()">编辑</a>
			<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-remove'" onclick="del()">删除</a>			
		</div>
		
		<div id="dlg" class="easyui-dialog" data-options="iconCls:'icon-save',resizable:true,modal:true" style="width:400px;height:280px;padding:10px 20px"	closed="true" buttons="#dlg-buttons">
			<form id="fm" method="post">
				<div style="margin-bottom: 10px;">
					<label for="name">用户名:</label>
					<input name="name" class="easyui-validatebox" type="text" data-options="required:true">
				</div>
				<div style="margin-bottom: 10px;">
					<label for="nick">昵称:</label>
					<input name="nick" class="easyui-validatebox" type="text" data-options="required:true">
				</div>				
			</form>
		</div>
		<div id="dlg-buttons">
			<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-ok'" onclick="save()">Save</a>
			<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-cancel'" onclick="javascript:$('#dlg').dialog('close')">Cancel</a>
		</div>
		
	</body>
	<script type="text/javascript" src="../resource/commons/js/user/list.js"></script>
</html>