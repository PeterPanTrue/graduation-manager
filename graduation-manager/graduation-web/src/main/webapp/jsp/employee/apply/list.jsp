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
	function formatName(val, row) {
		if(val!=null&&val==1){
		    return '已录取';
		}else{
		    return '未录取';
		}
	}
	function formatName2(val, row) {
		if(val!=null){
		    return '人员信息已经入库';
		}else{
		    return "<font color='red'>待录入</font>";
		}
	}
</script>
</head>
<body>
	<table id="dg" title="用户管理" class="easyui-datagrid"
		style="width:100%;height:480px;" url="/employee/listApply.htm" idField="employid"
		toolbar="#toolbar" rownumbers="true" fitColumns="true" singleSelect="false"
		pagination="true">
		<thead>
			<tr>
				<th field="name" width="30" >姓名</th>
				<th field="sex" width="20" >性别</th>
				<th field="age" width="20" >年龄</th>
				<th field="phone" width="40" >电话</th>
				<th field="email" width="50" >E-mail</th>
				<th field="admitted" width="30" formatter="formatName">状态</th>
				<th field="temp1" width="40" formatter="formatName2">信息录入</th>
				<th field="secondcreatetiem" width="40" formatter="formatTime" >入职时间</th>
				<th field="createperson" width="40">创建人</th>
				<th field="temp2" width="30">备注</th>
			</tr>
		</thead>
	</table>
	<div id="toolbar">
		<a href="#"
			class="easyui-linkbutton" iconCls="icon-edit" plain="true"
			onclick="editUser()">分配员工</a>
		<span id="tb" style="padding-top:3px;float:right;">
			<span> ID:</span> <input id="id"
				style="line-height:18px;border:1px solid #000000;">
				<a href="#" class="easyui-linkbutton"  plain="true" iconCls="icon-search" onclick="doSearch()">Search</a>
		</span>
	</div>
	<div id="dlg" class="easyui-dialog"
		style="width:700px;height:400px;padding:10px 20px" closed="true" 
		buttons="#dlg-buttons">
		<div class="ftitle" style="padding-bottom: 10px">
			<h3>分配用户</h3>
		</div>
		<form id="fm" method="post">
		    <table>
		    <table>
				<tr>
					<td>帐号:</td>
					<td><select class="easyui-combotree" url="/employee/getUser.htm"
						name="id" style="width:156px;" />
					</td>
					<td width="100"></td>
					<td>姓名:</td>
					<td><input type="text" name="name" style="width:156px;" />
					</td>
				</tr>
				<tr>
					<td>IDCard:</td>
					<td><input type="text" name="idcard" style="width:156px;" />
					</td>
					<td width="100"></td>
					<td>职位:</td>
					<td><select class="easyui-combotree" url="/employee/insertEmployeeBefore.htm"
						name="position" style="width:156px;" />
					</td>
				</tr>
				<tr>
					<td>学历:</td>
					<td><select name="xuel" class="easyui-combobox" style="width:156px;"/>
					    <option value="">--请选择--</option>
					    <option value="0">小学</option>
					    <option value="1">初中</option>
					    <option value="2">高中</option>
					    <option value="3">大专</option>
					    <option value="4">本科</option>
					    <option value="5">硕士</option>
					    <option value="6">博士</option>
					    <option value="7">硕士后</option>
					    <option value="8">博士后</option>
					    <option value="9">其他</option>
					</select>
					</td>
					<td width="100"></td>
					<td>毕业学校:</td>
					<td><input type="text" name="school" style="width:156px;" ">
					</td>
				</tr>
			    <tr>
					<td>住址:</td>
					<td colspan="4"><textarea rows="3" cols="2" name="source" style="width:460px;height:70px;"></textarea>
					</td>
				</tr>
			</table>
		</form>
	</div>
	<div id="dlg-buttons">
		<a href="#" class="easyui-linkbutton" iconCls="icon-ok"
			onclick="saveUser()">Edit</a> <a href="#" class="easyui-linkbutton"
			iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close');$('#dg').datagrid('loaded');">Cancel</a>
	</div>
</body>
<script>
    function doSearch() {
		$('#dg').datagrid('load', {
			id : $('#id').val()
		});
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
			$('#fm').form('load', {
			    'name':row.name,
			    'position':row.position,
			    'idcard':row.idcard,
			    'xuel':row.education,
			    'school':row.school,
			});
			url = 'http://localhost:8082/employee/insertApply.htm?applyid='+row.employid;
		}
	}
</script>
</html>
