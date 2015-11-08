/*!
 * imalex@163.com - v0.1 (2015-08-29 18:00:00 +0800)
 * Copyright 2015
 */
$(function(){
	
});

function insert(){
	$('#dlg').dialog('open').dialog('setTitle','新建用户');
	$('#fm').form('clear');
	url = ctx+'/user/insert';
}

function edit(){
	var row = $('#dg').datagrid('getSelected');
	if (row){
		$('#dlg').dialog('open').dialog('setTitle','Edit User');
		$('#fm').form('load',row);
		url = 'update?id='+row.id;
	}
}

function save(){
	$('#fm').form('submit',{
		url: url,
		onSubmit: function(){
			return $(this).form('validate');
		},
		success: function(result){
			var result = eval('('+result+')');
			if (result.errorMsg){
				$.messager.show({
					title: 'Error',
					msg: result.errorMsg
				});
			} else {
				$('#dlg').dialog('close');		// close the dialog
				$('#dg').datagrid('reload');	// reload the user data
			}
		}
	});
}

function del(){
	var row = $('#dg').datagrid('getSelected');
	if (row){
		$.messager.confirm('Confirm','Are you sure you want to destroy this user?',function(r){
			if (r){
				$.post('del',{id:row.id},function(result){
					if (result.status!=null){
						$('#dg').datagrid('reload');	// reload the user data
					} else {
						$.messager.show({	// show error message
							title: 'Error',
							msg: result.errorMsg
						});
					}
				},'json');
			}
		});
	}
}