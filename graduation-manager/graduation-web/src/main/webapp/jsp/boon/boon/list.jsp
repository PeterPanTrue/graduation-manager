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

</head>
<body>
	<table id="dg" title="福利待遇管理" class="easyui-datagrid"
		style="width:100%;height:480px;" url="/boon/listBoon.htm"
		idField="boonid" toolbar="#toolbar" rownumbers="true"
		fitColumns="true" singleSelect="false" pagination="true" >
		<thead>
			<tr>
				<th field="boonname" width="40">福利待遇名称</th>
				<th field="boonmoney" width="40" align="center">提供</th>
				<th field="description" width="200" align="center" >福利待遇描述</th>
				<th field="temp1" width="30">备注</th>
			</tr>
		</thead>
	</table>
	<div id="toolbar">
		<a href="#"
			class="easyui-linkbutton" iconCls="icon-add" plain="true"
			onclick="addUser()">增加福利待遇信息</a><a href="#"
			class="easyui-linkbutton" iconCls="icon-edit" plain="true"
			onclick="editUser()">修改福利待遇信息</a> <a href="#" class="easyui-linkbutton"
			iconCls="icon-remove" plain="true" onclick="destroyUser()">删除福利待遇信息</a>
			 <span id="tb"
			style="padding-top:3px;float:right;"> <span> ID:</span> <input
			id="id" style="line-height:18px;border:1px solid #000000;"> <a
			href="#" class="easyui-linkbutton" plain="true" iconCls="icon-search"
			onclick="doSearch()">Search</a> </span>
	</div>

	<div id="dlg" class="easyui-dialog"
		style="width:800px;height:300px;padding:0px 20px" closed="true"
		buttons="#dlg-buttons">
		<div class="ftitle" style="padding-bottom: 10px">
			<h3>福利待遇信息</h3>
		</div>
		<form id="fm" method="post">
			<table>
				<tr>
					<td width="60">名称:</td>
					<td><input class="easyui-textbox" name="boonname" /></td>
					<td width="100"></td>
					<td>是否提供:</td>
					<td><input type="radio" class="easyui-radiobox" name="boonmoney" value="是"/>是
					<input  type="radio" class="easyui-radiobox" name="boonmoney" value="否"/>否
					</td>
				</tr>
				<tr>
					<td>描述:</td>
					<td colspan="4"><textarea rows="3" cols="4"
							style="width:600px;height:100px;" name="description"></textarea></td>
				</tr>
			</table>
		</form>
	</div>
	<div id="dlg-buttons">
	<a href="#" class="easyui-linkbutton" iconCls="icon-ok"
			onclick="saveUser()" id="save">Save</a>
		 <a href="#" class="easyui-linkbutton"
			iconCls="icon-cancel"
			onclick="javascript:$('#dlg').dialog('close');$('#dg').datagrid('loaded');">Cancel</a>
	</div>

</body>
<script>
    function doSearch() {
		$('#dg').datagrid('load', {
			id : $('#id').val()
		});
	}
	function addUser() {
	    $("#dg").datagrid("loading", "数据加载中……");
		$('#dlg').dialog('open').dialog('setTitle', 'New User');
		$('#fm').form('clear');
		url = '/boon/insertBoon.htm';
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
			$('#dlg').dialog('open').dialog('setTitle', '福利待遇');
			$('#fm').form('load', row);
			url = '/boon/updateBoon.htm?id=' + row.boonid;
		}else{
		    $.messager.alert('Warning','选择一项进行修改！');
		     $("#dg").datagrid("loaded");
		}
	}
	function destroyUser() {
	     $("#dg").datagrid("loading", "数据加载中……");
		var row = $('#dg').datagrid('getSelected');
		if (row) {
			$.messager.confirm('Confirm',
					'Are you sure you want to delete this boon?', function(r) {
						if (r) {
							$.post('/boon/deleteBoon.htm', {
								id : row.boonid
							}, function(result) {
								   if(result=="success"){
								       $('#dg').datagrid('reload');
								   }
							});
						}else{
                   		    $("#dg").datagrid("loaded");
		                }
					});
		}else{
		    $.messager.alert('Warning','已经操作过！');
		    $("#dg").datagrid("loaded");
		}
	}
	
</script>

</html>
