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
	function formatTime(val, time) {
		return new Date(val).Format("yyyy-MM-dd");
	}
	function formatDelete(val,time){
	    return val==0?"否":"<font color='red'>是</font>";
	}
	function formatData(val ,time){
	    return  val==null?'无':'有';
	}
</script>
</head>
<body>
	<table id="dg" title="奖惩补贴管理" class="easyui-datagrid"
		style="width:100%;height:480px;" url="/reword/listReword.htm"
		idField="rewordid" toolbar="#toolbar" rownumbers="true"
		fitColumns="true" singleSelect="false" pagination="true" >
		<thead>
			<tr>
				<th field="rewordname" width="40">奖惩补贴名称</th>
				<th field="money" width="40">奖惩补贴金额</th>
				<th field="description" width="80" >描述</th>
				<th field="createtime" width="40" formatter="formatTime">创建时间</th>
				<th field="createperson" width="30" >创建人</th>
				<th field="temp1" width="30">备注</th>
			</tr>
		</thead>
	</table>
	<div id="toolbar">
		<a href="#"
			class="easyui-linkbutton" iconCls="icon-add" plain="true"
			onclick="addUser()">增加奖惩补贴信息</a><a href="#"
			class="easyui-linkbutton" iconCls="icon-edit" plain="true"
			onclick="editUser()">修改奖惩补贴信息</a> <a href="#" class="easyui-linkbutton"
			iconCls="icon-remove" plain="true" onclick="destroyUser()">删除奖惩补贴信息</a>
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
			<h3>奖惩信息</h3>
		</div>
		<form id="fm" method="post">
			<table>
				<tr>
					<td width="60">奖惩名称:</td>
					<td><input class="easyui-textbox" name="rewordname" /></td>
					<td width="100"></td>
					<td>奖惩金额:</td>
					<td><input class="easyui-textbox" name="money" />
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
		url = '/reword/insertReword.htm';
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
			url = '/reword/updateReword.htm?id=' + row.rewordid;
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
					'Are you sure you want to delete this plan?', function(r) {
						if (r) {
							$.post('/reword/deleteReword.htm', {
								id : row.rewordid
							}, function(result) {
								   if(result=="sucess"){
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
<script type="text/javascript">
		function myformatter(date){
			var y = date.getFullYear();
			var m = date.getMonth()+1;
			var d = date.getDate();
			return y+'-'+(m<10?('0'+m):m)+'-'+(d<10?('0'+d):d);
		}
		function myparser(s){
			if (!s) return new Date();
			var ss = (s.split('-'));
			var y = parseInt(ss[0],10);
			var m = parseInt(ss[1],10);
			var d = parseInt(ss[2],10);
			if (!isNaN(y) && !isNaN(m) && !isNaN(d)){
				return new Date(y,m-1,d);
			} else {
				return new Date();
			}
		}
	</script>
</html>
