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
		return val == '0' ? '否' : '是';
	}
</script>
</head>
<body>
	<table id="dg" title="岗位管理" class="easyui-datagrid"
		style="width:100%;height:480px;" url="/admin/listPosition.htm" idField="positionid"
		toolbar="#toolbar" rownumbers="true" fitColumns="true" singleSelect="false"
		pagination="true">
		<thead>
			<tr>
				<th field="name" width="40"><font face="Calibri">岗位名称</font></th>
				<th field="description" width="200" align="center"><font face="Calibri">岗位描述</font></th>
				<th field="department" width="30"><font face="Calibri">所属岗位</font></th>
				<th field="temp1" width="30"><font face="Calibri">备注</font></th>
		</thead>
	</table>
	<div id="toolbar">
		<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true"
			onclick="newUser()">创建岗位</a>&nbsp;&nbsp;<a href="#"
			class="easyui-linkbutton" iconCls="icon-edit" plain="true"
			onclick="editUser()">编辑岗位</a> &nbsp;&nbsp;<a href="#"
			class="easyui-linkbutton" iconCls="icon-remove" plain="true"
			onclick="destroyUser()">删除岗位</a>
		<span id="tb" style="padding-top:3px;float:right;">
			<span></span> <input class="easyui-combobox" id="ids" style="width:90%;" data-options="
					url: '/admin/insertPositionBefore.htm',
					method: 'get',
					valueField: 'id',
					textField: 'text',
					panelWidth: 300,
					panelHeight: 'auto',
					formatter: formatItem,
					label: '所属部门：',
					labelPosition: 'left',
					value:''
					"/>
				<a href="#" class="easyui-linkbutton"  plain="true" iconCls="icon-search" onclick="doSearch()">Search</a>
		</span>
	</div>

	
	<div id="dlg" class="easyui-dialog"
		style="width:360px;height:350px;padding:10px 20px" closed="true" 
		buttons="#dlg-buttons">
		<div class="ftitle" style="padding-bottom: 10px">
			<h3>岗位信息</h3>
		</div>
		<form id="fm" method="post">
		    <table>
		    <table>
				<tr>
					<td>岗位名称</td>
					<td><input type="text" name="name" style="width:156px;" />
					</td>
				</tr>
				<tr>
					<td>描述:</td>
					<td><textarea rows="4" cols="1" name="description" style="width:156px;">
					</textarea>
					</td>
				</tr>
				<td>所属部门:</td>
					<td><select class="easyui-combotree" url="/admin/insertPositionBefore.htm"
						name="department" style="width:156px;" />
					</td>
			</table>
		</form>
	</div>
	<div id="dlg-buttons">
		<a href="#" class="easyui-linkbutton" iconCls="icon-ok"
			onclick="saveUser()">Save</a> <a href="#" class="easyui-linkbutton"
			iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close');$('#dg').datagrid('loaded');">Cancel</a>
	</div>
</body>
<script>
    function doSearch() {
        var a=$('#ids').combobox('getText');
		$('#dg').datagrid('load', {
			department : a           //重新加载listPosition传递department参数查询
		});
	}
	function newUser() {
	    $("#dg").datagrid("loading", "数据加载中……");
		$('#dlg').dialog('open').dialog('setTitle', '添加部门');
		$('#fm').form('clear');
		url = '/admin/insertPosition.htm';
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
	function editUser() {
	    $("#dg").datagrid("loading", "数据加载中……");
		var row = $('#dg').datagrid('getSelected');
		if (row) {
			$('#dlg').dialog('open').dialog('setTitle', '编辑用户');
			$('#fm').form('load', row);
			url = '/admin/updatePosition.htm?id=' + row.positionid;
		}
	}
	function destroyUser() {
	    $("#dg").datagrid("loading", "数据加载中……");
		var row = $('#dg').datagrid('getSelected');
		if (row) {
			$.messager.confirm('Confirm',
					'Are you sure you want to destroy this user?', function(r) {
						if (r) {
							$.post('/admin/deletePosition.htm', {
								id : row.positionid
							}, function(result) {
								   if(result=="success"){
								       $('#dg').datagrid('reload');
								   }
							});
						}
					});
		}
	}
	function formatItem(row){
			var s = '<span style="font-weight:bold">' + row.text + '</span>';
			return s;
		}
</script>
</html>
