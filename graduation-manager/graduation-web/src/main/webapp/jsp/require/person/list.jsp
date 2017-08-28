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
	function formatSubmit(val, row) {
		return val == '0' ? '否' : '<font color=red>是</font>';
	}
	function formatAgree(val, row) {
		if(val=='0'){
		    return '未审批';
		}
		if(val=='1'){
		    return '<font color=#8B008B>已批准</font>';
		}
		if(val=='2'){
		    return '<font color=red>驳回</font>';
		}
	}
	function formatPunish(val, row) {
		return val == '0' ? '未发布' : '<font color=red>已发布</font>';
	}
	function formatTime(val, time) {
		return new Date(val).Format("yyyy-MM-dd");
	}
</script>
</head>
<body>
	<table id="dg" title="用户管理" class="easyui-datagrid"
		style="width:100%;height:480px;" url="/require/listRequire.htm"
		idField="requireid" toolbar="#toolbar" rownumbers="true"
		fitColumns="true" singleSelect="false" pagination="true">
		<thead>
			<tr>
				<th field="position" width="40">招聘职位</th>
				<th field="department" width="40">招聘部门</th>
				<th field="number" width="30">人数</th>
				<th field="starttime" width="50" formatter="formatTime">招聘开始时间</th>
				<th field="endtime" width="50" formatter="formatTime">招聘结束时间</th>
				<th field="submit" width="30" formatter="formatSubmit">提交</th>
				<th field="agree" width="40" formatter="formatAgree">审批</th>
				<th field="punish" width="40" formatter="formatPunish">发布</th>
				<th field="isdeleted" width="30" formatter="formatDeleted">删除</th>
				<th field="createtime" width="50" formatter="formatTime">创建时间</th>
				<th field="createpersom" width="30">创建人</th>
				<th field="temp1" width="30">备注</th>
			</tr>
		</thead>
	</table>
	<div id="toolbar">
		<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true"
			onclick="newUser()">编写招聘计划</a>&nbsp;&nbsp;&nbsp; <a href="#"
			class="easyui-linkbutton" iconCls="icon-edit" plain="true"
			onclick="editUser()">更改招聘计划</a> <a href="#" class="easyui-linkbutton"
			iconCls="icon-remove" plain="true" onclick="destroyUser()">删除招聘计划</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-search"
			plain="true" onclick="showUser()">查看招聘计划</a> <a href="#"
			class="easyui-linkbutton" iconCls="icon-edit" plain="true"
			onclick="submitUser()">提交招聘计划</a> <a href="#"
			class="easyui-linkbutton" iconCls="icon-save" plain="true"
			onclick="punishUser()">发布招聘</a> <span id="tb"
			style="padding-top:3px;float:right;"> <span> ID:</span> <input
			id="id" style="line-height:18px;border:1px solid #000000;"> <a
			href="#" class="easyui-linkbutton" plain="true" iconCls="icon-search"
			onclick="doSearch()">Search</a> </span>
	</div>

	<div id="dlg" class="easyui-dialog"
		style="width:700px;height:470px;padding:10px 20px" closed="true"
		buttons="#dlg-buttons">
		<div class="ftitle" style="padding-bottom: 10px">
			<h3>招聘计划</h3>
		</div>
		<form id="fm" method="post">
			<table>
				<tr>
					<td>职位:</td>
					<td><select class="easyui-combotree"
						url="/employee/insertEmployeeBefore.htm" name="position"
						style="width:156px;" /></td>
					<td width="100"></td>
					<td>人数:</td>
					<td><input type="text" name="number" style="width:156px;" />
					</td>
				</tr>
				<tr>
					<td>开始时间:</td>
					<td><input class="easyui-datebox"
						data-options="formatter:myformatter,parser:myparser" name="start" />
					</td>
					<td width="100"><br>
					</td>
					<td>结束时间:</td>
					<td><input class="easyui-datebox"
						data-options="formatter:myformatter,parser:myparser" name="end" />
					</td>
				</tr>
				<tr>
					<td>岗位需求:</td>
					<td colspan="4"><textarea rows="3" cols="4"
							style="width:600px;height:100px;" name="need"></textarea></td>
				</tr>
				<tr>
					<td>工作内容:</td>
					<td colspan="4"><textarea rows="3" cols="4"
							style="width:600px;height:100px;" name="content"></textarea></td>
				</tr>
			</table>
		</form>
	</div>
	<div id="dlg-buttons">
		<a href="#" class="easyui-linkbutton" iconCls="icon-ok"
			onclick="saveUser()">Edit</a> <a href="#" class="easyui-linkbutton"
			iconCls="icon-cancel"
			onclick="javascript:$('#dlg').dialog('close');$('#dg').datagrid('loaded');">Cancel</a>
	</div>


	<div id="dlg2" class="easyui-dialog"
		style="width:700px;height:470px;padding:10px 20px" closed="true"
		buttons="#dlg-buttons2">
		<div class="ftitle" style="padding-bottom: 10px">
			<h3>招聘计划</h3>
		</div>
		<form id="fm2" method="post">
			<table>
				<tr>
					<td>职位:</td>
					<td><select class="easyui-combotree"
						url="/employee/insertEmployeeBefore.htm" name="position"
						style="width:156px;" disabled="disabled" /></td>
					<td width="100"></td>
					<td>人数:</td>
					<td><input type="text" name="number" style="width:156px;" />
					</td>
				</tr>
				<tr>
					<td>部门:</td>
					<td><input type="text" name="department" style="width:156px;" />
					</td>
					<td width="100"></td>
					<td>创建人:</td>
					<td><input type="text" name="createpersom"
						style="width:156px;" /></td>
				</tr>
				<tr>
					<td>开始时间:</td>
					<td><input name="starttime"
						data-options="formatter:myformatter" type="text" /></td>
					<td width="100"><br>
					</td>
					<td>结束时间:</td>
					<td><input name="endtime" data-options="formatter:myformatter"
						type="text" /></td>
				</tr>
				<tr>
					<td>岗位需求:</td>
					<td colspan="4"><textarea rows="3" cols="4"
							style="width:600px;height:100px;" name="need"></textarea></td>
				</tr>
				<tr>
					<td>工作内容:</td>
					<td colspan="4"><textarea rows="3" cols="4"
							style="width:600px;height:100px;" name="content"></textarea></td>
				</tr>
			</table>
		</form>
	</div>
	<div id="dlg-buttons2">
		<a href="#" class="easyui-linkbutton" iconCls="icon-cancel"
			onclick="javascript:$('#dlg2').dialog('close');$('#dg').datagrid('loaded');">Cancel</a>
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
		$('#dlg').dialog('open').dialog('setTitle', '添加用户');
		$('#fm').form('clear');
		url = '/require/insertRequire.htm';
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
		if (row&&row.submit==0) {
			$('#dlg').dialog('open').dialog('setTitle', '编辑用户');
			$('#fm').form('load',row);
			url = 'http://localhost:8082/require/updateRequire.htm?id='+row.requireid;
		}else{
		    $.messager.alert('Warning','已经提交或发布的计划无法修改！');
		     $("#dg").datagrid("loaded");
		}
	}
	function showUser() {
	   $("#dg").datagrid("loading", "数据加载中……");
		var row = $('#dg').datagrid('getSelected');
		var date1=new Date(row.starttime);
		var date2=new Date(row.endtime);
		if (row) {
			$('#dlg2').dialog('open').dialog('setTitle', '编辑用户');
			$('#fm2').form('load',{
			   'position':row.position,
			   'need' :row.need,
			   'number':row.number,
			   'createpersom':row.createpersom,
			   'department':row.department,
			   'content':row.content,
			   'starttime':myformatter(date1),
			   'endtime':myformatter(date2),
			});
		}else{
		    $.messager.alert('Warning','选择一项进行查看！');
		     $("#dg").datagrid("loaded");
		}
	}
	function submitUser() {
	     $("#dg").datagrid("loading", "数据加载中……");
		var row = $('#dg').datagrid('getSelected');
		if (row&&row.submit==0) {
			$.messager.confirm('Confirm',
					'Are you sure you want to Submit this requirement?', function(r) {
						if (r) {
							$.post('/require/submitRequire.htm', {
								id : row.requireid
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
		    $.messager.alert('Warning','已经提交过了！');
		    $("#dg").datagrid("loaded");
		}
	}
	function punishUser() {
	     $("#dg").datagrid("loading", "数据加载中……");
		var row = $('#dg').datagrid('getSelected');
		if (row&&row.punish==0&&row.agree==1) {
			$.messager.confirm('Confirm',
					'Are you sure you want to Punsh this requirement?', function(r) {
						if (r) {
							$.post('/require/punishRequire.htm', {
								id : row.requireid
							}, function(result) {
								   if(result=="success"){
								       $('#dg').datagrid('reload');
								   }
							});
						}
						else{
                   		    $("#dg").datagrid("loaded");
		                }
					});
		}else{
		    $.messager.alert('Warning','已经发布过了或者没有提交！');
		     $("#dg").datagrid("loaded");
		}
	}
	function destroyUser() {
	    $("#dg").datagrid("loading", "数据加载中……");
		var row = $('#dg').datagrid('getSelected');
		if (row) {
			$.messager.confirm('Confirm',
					'Are you sure you want to destroy this user?', function(r) {
						if (r) {
							$.post('/require/deleteRequire.htm', {
								id : row.requireid
							}, function(result) {
								   if(result=="success"){
								       $('#dg').datagrid('reload');
								   }
							});
						}
						else{
                   		    $("#dg").datagrid("loaded");
		                }
					});
		}else{
		    $.messager.alert('Warning','请选择删除的项！');
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
