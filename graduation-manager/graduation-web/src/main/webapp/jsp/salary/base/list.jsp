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
	function formatSalary(val) {
		return val!=null?"<font color=red>"+val+"</font>":"";
	}

</script>
</head>
<body>
	<table id="dg" title="基本工资管理" class="easyui-datagrid"
		style="width:100%;height:480px;" url="/employee/listEmployee.htm"
		idField="id" toolbar="#toolbar" rownumbers="true"
		fitColumns="true" singleSelect="false" pagination="true">
		<thead>
			<tr>
		    	<th field="id" width="30">员工工号</th>
				<th field="name" width="30">姓名</th>
				<th field="phone" width="40">电话</th>
				<th field="positionname" width="40" >岗位</th>
				<th field="departmentname" width="40" >部门</th>
				<th field="salary" width="50" formatter="formatSalary" align="center">基本工资</th>
				<th field="temp1" width="30">备注</th>
			</tr>
		</thead>
	</table>
	<div id="toolbar">
		<a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true"
			onclick="editUser()">修改基本工资</a>&nbsp;&nbsp;&nbsp;
		 <a href="#"
			class="easyui-linkbutton" iconCls="icon-print" plain="true"
			onclick="">导出信息</a> <span
			id="tb" style="padding-top:3px;float:right;"> <span>
				ID:</span> <input id="id"
			style="line-height:18px;border:1px solid #000000;"> <a
			href="#" class="easyui-linkbutton" plain="true" iconCls="icon-search"
			onclick="doSearch()">Search</a> </span>
	</div>

	<div id="dlg" class="easyui-dialog"
		style="width:350px;height:200px;padding:10px 20px" closed="true"
		buttons="#dlg-buttons">
		<div class="ftitle" style="padding-bottom: 10px">
			<h3>修改基本工资</h3>
		</div>
		<form id="fm" method="post">
			<table>
				<tr>
					<td width="100">基本工资:</td>
					<td width="200"><input class="easyui-textbox" name="salary" />
					</td>
				</tr>
			</table>
		</form>
	</div>
	<div id="dlg-buttons">
	<a href="#" class="easyui-linkbutton" iconCls="icon-ok"
			onclick="saveUser()" id="save">Save</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-cancel"
			onclick="javascript:$('#dlg').dialog('close');$('#dg').datagrid('loaded');">Cancel</a>
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
			$('#dlg').dialog('open').dialog('setTitle', '工资信息');
			$('#fm').form('load', {
			    'salary':row.salary
			});
			url = '/salary/updateSalary.htm?id=' + row.id;
		}else{
		    $.messager.alert('Warning','选择一项进行修改！');
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
