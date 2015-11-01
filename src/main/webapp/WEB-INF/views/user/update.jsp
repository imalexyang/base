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
		<title>用户编辑</title>
	</head>
	<body>
		<div class="easyui-panel" title="New Topic" style="width:400px">
	        <div style="padding:10px 60px 20px 60px">
		        <form id="ff" method="post">
		            <table cellpadding="5">
		                <tr>
		                    <td>Name:</td>
		                    <td><input class="easyui-textbox" type="text" name="name" data-options="required:true" value="${user.name}"></input></td>
		                </tr>
		                <tr>
		                    <td>nick:</td>
		                    <td><input class="easyui-textbox" type="text" name="email" data-options="required:true" value="${user.nick}"></input></td>
		                </tr>		               
		            </table>
		        </form>
		        <div style="text-align:center;padding:5px">
		            <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">Submit</a>
		            <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">Clear</a>
		        </div>
	        </div>
    	</div>
	    <script>
	        function submitForm(){
	            $('#ff').form('submit');
	        }
	        function clearForm(){
	            $('#ff').form('clear');
	        }
	    </script>
	</body>
</html>