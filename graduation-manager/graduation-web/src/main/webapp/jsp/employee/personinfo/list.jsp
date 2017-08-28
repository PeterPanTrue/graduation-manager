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
		return val == '0' ? '在职 ' : '离职 ';
	}
	function formatTime(val, time) {
		return new Date(val).Format("yyyy-MM-dd hh:mm:ss");
	}
</script>
</head>
<body>
	<table id="dg" title="员工管理" class="easyui-datagrid"
		style="width:100%;height:480px;" url="/employee/listEmployee.htm" idField="id"
		toolbar="#toolbar" rownumbers="true" fitColumns="true" singleSelect="false"
		pagination="true">
		<thead>
			<tr>
				<th field="id" width="30" sortable="true">员工工号</th>
				<th field="name" width="30"  >姓名</th>
				<th field="idcard" width="70" >身份证</th>
				<th field="positionname" width="50" >岗位</th>
				<th field="departmentname" width="50" >所属部门</th>
				<th field="isdeleted" width="30" formatter="formatDeleted" sortable="true">离职</th>
				<th field="entertime" width="60"  formatter="formatTime" sortable="true">入职时间</th>
				<th field="createtime" width="60" formatter="formatTime" sortable="true">创建时间</th>
				<th field="createperson" width="40">创建人</th>
				<th field="temp1" width="30">备注</th>
		</thead>
	</table>
	<div id="toolbar">
		<a href="#"
			class="easyui-linkbutton" iconCls="icon-edit" plain="true"
			onclick="editUser()">修改员工信息</a> &nbsp;&nbsp;<a href="#"
			class="easyui-linkbutton" iconCls="icon-remove" plain="true"
			onclick="destroyUser()">删除员工信息</a> &nbsp;&nbsp;<a href="#"
			class="easyui-linkbutton" iconCls="icon-save" plain="true"
			onclick="showUser()">查看员工信息</a>
		<span id="tb" style="padding-top:3px;float:right;">
		    <span>
		        <input class="easyui-combobox" id="ids"  
		         data-options="
					url: '/admin/insertPositionBefore.htm',
					method: 'get',
					valueField: 'id',
					textField: 'text',
					panelWidth: 100,
					label: '所属部门：',
					value:''
					"/>
		    </span>
			<span> ID:</span> <input id="id"
				style="line-height:18px;border:1px solid #000000;">
				<a href="#" class="easyui-linkbutton"  plain="true" iconCls="icon-search" onclick="doSearch()">Search</a>
		</span>
	</div>

	<div id="dlg" class="easyui-dialog"
		style="width:900px;height:500px;padding:10px 20px" closed="true" 
		buttons="#dlg-buttons">
		<div class="ftitle" style="padding-bottom: 10px">
			<h3>分配用户</h3>
		</div>
		<form id="fm" method="post">
		    <table>
		    <table>
				<tr>
					<td>帐号:</td>
					<td><input type="text" name="id" style="width:156px;" disabled="disabled"/>
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
						name="positionname" style="width:156px;" />
					</td>
				</tr>
				<tr>
					<td>学历:</td>
					<td><select name="xuel" class="easyui-combobox" style="width:156px;" >
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
					<td><input type="text" name="school" style="width:156px;" />
					</td>
				</tr>
				<tr>
					<td></td>
					<td>
					</td>
					<td width="100"></td>
					<td></td>
					<td>
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
	
	
	
	<div id="dlg1" class="easyui-dialog"
		style="width:1050px;height:450px;padding:10px 20px" closed="true" 
		buttons="#dlg-buttons1">
		<div class="ftitle" style="padding-bottom: 10px">
			<h3>查看用户详细信息</h3>
		</div>
		<form id="fm1" method="post">
		    <table>
		    <table>
				<tr>
					<td>帐号:</td>
					<td><input type="text" name="id" style="width:156px;" disabled="disabled"/>
					</td>
					<td width="100"></td>
					<td>姓名:</td>
					<td><input type="text" name="name" style="width:156px;" disabled="disabled"/>
					</td>
					<td width="100"></td>
					<td>学历:</td>
					<td><select name="xuel" class="easyui-combobox" style="width:156px;" disabled="disabled">
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
				</tr>
				<tr>
					<td>IDCard:</td>
					<td><input type="text" name="idcard" style="width:156px;" disabled="disabled"/>
					</td>
					<td width="100"></td>
					<td>职位:</td>
					<td><input type="text" name="positionname" style="width:156px;" disabled="disabled"/>
					</td>
					<td width="100"></td>
					<td>部门:</td>
					<td><input type="text" name="departmentname" style="width:156px;" disabled="disabled"/>
					</td>
				</tr>
				<tr>
					<td>毕业时间:</td>
					<td><input type="text" name="finishtime" style="width:156px;" disabled="disabled"/>
					</td>
					<td width="100"></td>
					<td>毕业学校:</td>
					<td><input type="text" name="school" style="width:156px;" disabled="disabled"/>
					</td>
					<td width="100"></td>
					<td>专业:</td>
					<td><input type="text" name="major" style="width:156px;" disabled="disabled"/>
					</td>
				</tr>
				<tr>
				    <td>性别：</td>
					<td><input type="text" name="sex" style="width:156px;" disabled="disabled"/>
					</td>
				    <td width="100"></td>
					<td>出生：</td>
					<td><input type="text" name="birth" style="width:156px;" disabled="disabled"/>
					</td>
					<td width="100"></td>
					<td>民族：</td>
					<td><input type="text" name="natives" style="width:156px;" disabled="disabled"/>
					</td>
				</tr>
				<tr>
					<td>婚配：</td>
					<td><input type="text" name="marray" style="width:156px;" disabled="disabled"/>
					</td>
					<td width="100"></td>
					<td>政治面貌：</td>
					<td><input type="text" name="face" style="width:156px;" disabled="disabled"/>
					</td>
					<td width="100"></td>
					<td>入企时间：</td>
					<td><input type="text" name="entertime" style="width:156px;" disabled="disabled"/>
					</td>
				</tr>
				<tr>
					<td>电话：</td>
					<td><input type="text" name="phone" style="width:156px;" disabled="disabled"/>
					</td>
					<td width="100"></td>
					<td>工作年限：</td>
					<td><input type="text" name="worktime" style="width:156px;" disabled="disabled"/>
					</td>
					<td width="100"></td>
					<td>英语级别：</td>
					<td><input type="text" name="english" style="width:156px;" disabled="disabled"/>
					</td>
				</tr>
				<tr>
					<td>计算机级别：</td>
					<td><input type="text" name="computer" style="width:156px;" disabled="disabled"/>
					</td>
					<td width="100"></td>
					<td></td>
					<td>
					</td>
					<td width="100"></td>
					<td></td>
					<td>
					</td>
				</tr>
			    <tr>
					<td>住址:</td>
					<td colspan="4"><textarea rows="3" cols="2" name="source" style="width:600px;height:50px;" disabled="disabled"></textarea>
					</td>
				</tr>
			</table>
		</form>
	</div>
	<div id="dlg-buttons1">
		<a href="#" class="easyui-linkbutton"
			iconCls="icon-cancel" onclick="javascript:$('#dlg1').dialog('close');$('#dg').datagrid('loaded');">Cancel</a>
	</div>
	
</body>
<script>
    function doSearch() {
        var a=$('#ids').combobox('getText');
		$('#dg').datagrid('load', {
			id : $('#id').val(),
			department : a  
		});
	}
	function saveUser() {
	    alert(url);
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
			$('#dlg').dialog('open').dialog('setTitle', '编辑员工');
			$('#fm').form('load', row);
			url = 'http://localhost:8082/employee/updateEmployee.htm?id='+row.id;
		}
	}
	function showUser() {
	    $("#dg").datagrid("loading", "数据加载中……");
		var row = $('#dg').datagrid('getSelected');
		if (row) {
			$('#dlg1').dialog('open').dialog('setTitle', '查看员工详细信息');
			$('#fm1').form('load', row);
		}
	}
	function destroyUser() {
	    $("#dg").datagrid("loading", "数据加载中……");
		var row = $('#dg').datagrid('getSelected');
		if (row) {
			$.messager.confirm('Confirm',
					'Are you sure you want to destroy this user?', function(r) {
						if (r) {
							$.post('/employee/deleteEmployee.htm', {
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
