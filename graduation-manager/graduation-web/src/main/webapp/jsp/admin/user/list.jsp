<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set value="http://localhost:8082/jsp/admin/another" var="cp"></c:set>
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
<script>
	Date.prototype.Format = function(fmt) { //author: meizz
		var o = {
			"M+" : this.getMonth() + 1,
			//月份
			"d+" : this.getDate(),
			//日
			"h+" : this.getHours(),
			//小时
			"m+" : this.getMinutes(),
			//分
			"s+" : this.getSeconds(),
			//秒
			"q+" : Math.floor((this.getMonth() + 3) / 3),
			//季度
			"S" : this.getMilliseconds()
		//毫秒
		};
		if (/(y+)/.test(fmt)) {
			fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "")
					.substr(4 - RegExp.$1.length));
		}
		for ( var k in o) {
			if (new RegExp("(" + k + ")").test(fmt)) {
				fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k])
						: (("00" + o[k]).substr(("" + o[k]).length)));
			}
		}
		return fmt;
	};
	
	
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
		style="width:100%;height:480px;" url="/admin/listUser.htm"
		toolbar="#toolbar" rownumbers="true" fitColumns="true"
		singleSelect="true" pagination="true">
		<thead>
			<tr>
				<th field="id" width="30">员工工号</th>
				<th field="password" width="40">密码</th>
				<th field="rolename" width="50">角色权限</th>
				<th field="name" width="40">姓名</th>
				<th field="isdeleted" width="20" formatter="formatDeleted">离职</th>
				<th field="createtime" width="50" formatter="formatTime">创建时间</th>
				<th field="createperson" width="40">创建人</th>
				<th field="temp1" width="50">备注</th>
		</thead>
	</table>
	<div id="toolbar">
		<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true"
			onclick="newUser()">注册十个空帐号</a>
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
					<td><select class="easyui-combotree" url="/admin/insertUserBefore.htm"
						name="name" style="width:156px;" />
					</td>
				</tr>
			</table>
		</form>
	</div>
	<div id="dlg-buttons">
		<a href="#" class="easyui-linkbutton" iconCls="icon-ok"
			onclick="saveUser()">Save</a> <a href="#" class="easyui-linkbutton"
			iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')">Cancel</a>
	</div>
</body>
<script>
	function newUser() {
		$('#dlg').dialog('open').dialog('setTitle', 'New User');
		$('#fm').form('clear');
		url = '${pageContext.request.contextPath }/save';
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
</script>
</html>
