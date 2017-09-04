<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set value="http://localhost:8082/jsp/static" var="cp"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="keywords" content="jquery,ui,easy,easyui,web">
<meta name="description"
	content="easyui help you build your web page easily!">
<title>jQuery EasyUI CRUD Demo</title>
<link rel="stylesheet" type="text/css" href="${cp }/css/easyui.css">
<link rel="stylesheet" type="text/css" href="${cp }/css/icon.css">
<link rel="stylesheet" type="text/css" href="${cp }/css/demo.css">
<script type="text/javascript" src="${cp }/js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="${cp }/js/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${cp }/js/common.js"></script>
<script>
	function formatDeleted(val, row) {
		return val == '0' ? '在职' : '离职';
	}
	function formatTime(val, time) {
		return new Date(val).Format("yyyy-MM-dd hh:mm:ss");
	}
</script>
</head>
<body>
	<table id="dg" title="用户管理" class="easyui-datagrid"
		style="width:100%;height:480px;" url="/admin/listUser.htm" idField="id"
		toolbar="#toolbar" rownumbers="true" fitColumns="true" singleSelect="false"
		pagination="true" >
		<thead>
			<tr>
				<th field="id" width="30" sortable="true">员工工号</th>
				<th field="password" width="40">密码</th>
				<th field="rolename" width="50" sortable="true">角色权限</th>
				<th field="name" width="40"  sortable="true">姓名</th>
				<th field="isdeleted" width="20" formatter="formatDeleted" sortable="true">离职</th>
				<th field="createtime" width="50" formatter="formatTime" sortable="true">创建时间</th>
				<th field="createperson" width="40">创建人</th>
				<th field="temp1" width="50">备注</th>
		</thead>
	</table>
	<div id="toolbar">
		<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true"
			onclick="newUser()">注册十个空帐号</a>&nbsp;&nbsp;<a href="#"
			class="easyui-linkbutton" iconCls="icon-edit" plain="true"
			onclick="editUser()">编辑用戶</a> &nbsp;&nbsp;<a href="#"
			class="easyui-linkbutton" iconCls="icon-remove" plain="true"
			onclick="destroyUser()">删除用户</a>
		<span id="tb" style="padding-top:3px;float:right;">
			<span> ID:</span> <input id="id"
				style="line-height:18px;border:1px solid #000000;">
				<a href="#" class="easyui-linkbutton"  plain="true" iconCls="icon-search" onclick="doSearch()">Search</a>
		</span>
	</div>

	<div id="dlg" class="easyui-dialog"
		style="width:400px;height:200px;padding:10px 20px" closed="true" 
		buttons="#dlg-buttons">
		<div class="ftitle" style="padding-bottom: 10px">
			<h3>用户角色设置</h3>
		</div>
		<form id="fm" method="post">
		    <table>
			    <tr>
					<td>角色权限:</td>
					<td><select class="easyui-combotree" url="/admin/insertUserBrfore.htm"
						name="rolename" style="width:156px;" />
					</td>
				</tr>
			</table>
		</form>
	</div>
	<div id="dlg-buttons">
		<a href="#" class="easyui-linkbutton" iconCls="icon-ok"
			onclick="saveUser()">Save</a> <a href="#" class="easyui-linkbutton"
			iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close');$('#dg').datagrid('loaded');">Cancel</a>
	</div>
	<div id="dlg2" class="easyui-dialog"
		style="width:360px;height:300px;padding:10px 20px" closed="true" 
		buttons="#dlg-buttons2">
		<div class="ftitle" style="padding-bottom: 10px">
			<h3>编辑用户</h3>
		</div>
		<form id="fm2" method="post">
		    <table>
		    <table>
				<tr>
					<td>密码:</td>
					<td><input type="password" name="password" style="width:156px;" />
					</td>
				</tr>
				<tr>
					<td>姓名:</td>
					<td><input type="text" name="name" style="width:156px;" />
					</td>
				</tr>
			    <tr>
					<td>角色权限:</td>
					<td><select class="easyui-combotree" url="/admin/insertUserBrfore.htm"
						name="rolename" style="width:156px;" />
					</td>
				</tr>
			</table>
		</form>
	</div>
	<div id="dlg-buttons2">
		<a href="#" class="easyui-linkbutton" iconCls="icon-ok"
			onclick="changeUser()">Edit</a> <a href="#" class="easyui-linkbutton"
			iconCls="icon-cancel" onclick="javascript:$('#dlg2').dialog('close');$('#dg').datagrid('loaded');">Cancel</a>
	</div>
</body>
<script>
    function doSearch() {
		$('#dg').datagrid('load', {
			id : $('#id').val()
		});
	}
	function newUser() {
	    $("#dg").datagrid("loading", "数据加载中……");
		$('#dlg').dialog('open').dialog('setTitle', 'New User');
		$('#fm').form('clear');
		url = '/admin/insertUser.htm';
	}
	function saveUser() {
		$('#fm').form('submit', {
			url : url,
			onSubmit : function() {
				return $(this).form('validate'); //没有验证成功不让提交
			},
			success : function(result) {
				$('#dlg').dialog('close'); // close the dialog
				$('#dg').datagrid('reload'); // reload the user data
			}
		});
	}
	function changeUser() {
	    $("#dg").datagrid("loading", "数据加载中……");
		$('#fm2').form('submit', {
			url : url,
			onSubmit : function() {
				return $(this).form('validate'); //没有验证成功不让提交
			},
			success : function(result) {
				$('#dlg2').dialog('close'); // close the dialog
				$('#dg').datagrid('reload'); // reload the user data
			}
		});
	}
	function editUser() {
	    $("#dg").datagrid("loading", "数据加载中……");
		var row = $('#dg').datagrid('getSelected');
		if (row) {
			$('#dlg2').dialog('open').dialog('setTitle', '编辑用户');
			$('#fm2').form('load', row);
			url = '/admin/updateUser.htm?id=' + row.id;
		}
	}
	function destroyUser() {
	    $("#dg").datagrid("loading", "数据加载中……");
		var row = $('#dg').datagrid('getSelected');
		if (row) {
			$.messager.confirm('Confirm',
					'Are you sure you want to destroy this user?', function(r) {
						if (r) {
							$.post('/admin/deleteUser.htm', {
								id : row.id
							}, function(result) {
								   if(result=="success"){
								       $('#dg').datagrid('reload');
								   }
							});
						}
					});
		}
	}
</script>
</html>
