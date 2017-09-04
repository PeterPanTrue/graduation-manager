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
	function formatPunish(val) {
		if(val==null){
	        return "未面试";
	    }else if(val=='0'||val==0){
	        return "<font color=red>未通过</font>";
	    }else if(val=='1'||val==1){
	        return "通过";
	    }
	}
	function formatAdmit(val){
	    if(val==null){
	        return "在评审";
	    }else if(val==0){
	        return "<font color=red>未录取</font>";
	    }else if(val==1){
	        return "<font color=orange>录取</font>";
	    }
	}
	function formatTime(val, time) {
		return new Date(val).Format("yyyy-MM-dd");
	}
	function formatExprement(val,row){
	    if(val!=null||val!=""){
	        return "有";
	    }else{
	        return "无";
	    }
	}
</script>
</head>
<body>
	<table id="dg" title="应聘管理" class="easyui-datagrid"
		style="width:100%;height:480px;" url="/apply/listApply.htm"
		idField="employid" toolbar="#toolbar" rownumbers="true"
		fitColumns="true" singleSelect="false" pagination="true">
		<thead>
			<tr>
				<th field="name" width="30">姓名</th>
				<th field="sex" width="30">性别</th>
				<th field="age" width="20">年龄</th>
				<th field="applytime" width="40" formatter="formatTime">申请时间</th>
				<th field="exprement" width="30" formatter="formatExprement">工作经验</th>
				<th field="position" width="50">应聘职位</th>
				<th field="department" width="50">应聘部门</th>
				<th field="firstpass" width="30" formatter="formatPunish">通过一面</th>
				<th field="secondpass" width="30" formatter="formatPunish">通过二面</th>
				<th field="admitted" width="30" formatter="formatAdmit">是否录取</th>
				<th field="temp1" width="30">备注</th>
			</tr>
		</thead>
	</table>
	<div id="toolbar">
		<a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true"
			onclick="showUser()">浏览详细信息</a>&nbsp;&nbsp;&nbsp; (<a href="#"
			class="easyui-linkbutton" iconCls="icon-add" plain="true"
			onclick="firstUser()">一面通过</a><a href="#" class="easyui-linkbutton"
			iconCls="icon-add" plain="true" onclick="firstUser2()">一面否决</a> <a
			href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true"
			onclick="secondUser()">二面通过</a> <a href="#" class="easyui-linkbutton"
			iconCls="icon-add" plain="true" onclick="secondUser2()">二面否决</a> <a
			href="#" class="easyui-linkbutton" iconCls="icon-save" plain="true"
			onclick="admitUser()">审核录入</a> <a href="#" class="easyui-linkbutton"
			iconCls="icon-save" plain="true" onclick="admitUser2()">审核否決</a>)&nbsp;&nbsp;&nbsp; <a href="/apply/writeExcel.htm"
			class="easyui-linkbutton" iconCls="icon-print" plain="true"
			onclick="">导出信息</a> <span
			id="tb" style="padding-top:3px;float:right;"> <span>
				ID:</span> <input id="id"
			style="line-height:18px;border:1px solid #000000;"> <a
			href="#" class="easyui-linkbutton" plain="true" iconCls="icon-search"
			onclick="doSearch()">Search</a> </span>
	</div>

	<div id="dlg" class="easyui-dialog"
		style="width:700px;height:470px;padding:10px 20px" closed="true"
		buttons="#dlg-buttons">
		<div class="ftitle" style="padding-bottom: 10px">
			<h3>应聘人员信息</h3>
		</div>
		<form id="fm" method="post">
			<table>
				<tr>
					<td>姓名:</td>
					<td><input class="easyui-textbox" name="name" />
					</td>
					<td width="100"></td>
					<td>性别:</td>
					<td><input type="text" class="easyui-textbox" name="sex"
						style="width:156px;" /></td>
				</tr>
				<tr>
					<td>年龄:</td>
					<td><input class="easyui-textbox" name="age" />
					</td>
					<td width="100"></td>
					<td>电话:</td>
					<td><input type="text" class="easyui-textbox" name="phone"
						style="width:156px;" /></td>
				</tr>
				<tr>
					<td>E-mail:</td>
					<td><input class="easyui-textbox" name="email" />
					</td>
					<td width="100"></td>
					<td>毕业学校:</td>
					<td><input type="text" class="easyui-textbox" name="school"
						style="width:156px;" /></td>
				</tr>
				<tr>
					<td>学历:</td>
					<td><select name="education" class="easyui-combobox">
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
					</select></td>
					<td width="100"></td>
					<td>申请时间:</td>
					<td><input class="easyui-datebox"
						data-options="formatter:myformatter,parser:myparser"
						name="applytime" /></td>
				</tr>
				<tr>
					<td>申请职位:</td>
					<td><input class="easyui-textbox" name="position" />
					</td>
					<td width="100"></td>
					<td>所属部门:</td>
					<td><input type="text" class="easyui-textbox"
						name="department" style="width:156px;" /></td>
				</tr>
				<tr>
					<td>身份证:</td>
					<td><input class="easyui-textbox" name="idcard" />
					</td>
					<td width="100"></td>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<td>工作经验:</td>
					<td colspan="4"><textarea rows="3" cols="4"
							style="width:600px;height:140px;" name="exprement"></textarea>
					</td>
				</tr>
			</table>
		</form>
	</div>
	<div id="dlg-buttons">
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
	function showUser() {
	   $("#dg").datagrid("loading", "数据加载中……");
		var row = $('#dg').datagrid('getSelected');
		var date1=new Date(row.applytime);
		if (row) {
			$('#dlg').dialog('open').dialog('setTitle', '编辑用户');
			$('#fm').form('load',{
			   'department':row.department,
			   'position':row.position,
			   'name' :row.name,
			   'sex':row.sex,
			   'age':row.age,
			   'education':row.education,
			   'school':row.school,
			   'exprement':row.exprement,
			   'phone':row.phone,
			   'email':row.email,
			   'applytime':myformatter(date1),
			   'idcard':row.idcard
			});
		}else{
		    $.messager.alert('Warning','选择一项进行查看！');
		     $("#dg").datagrid("loaded");
		}
	}
	function firstUser() {
	     $("#dg").datagrid("loading", "数据加载中……");
		var row = $('#dg').datagrid('getSelected');
		if (row.firstpass==null) {
			$.messager.confirm('Confirm',
					'Are you sure you want to operate this apply?', function(r) {
						if (r) {
							$.post('/apply/firstpass.htm', {
								id : row.employid
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
		    $.messager.alert('Warning','已经操作过s！');
		    $("#dg").datagrid("loaded");
		}
	}
	function firstUser2() {
	     $("#dg").datagrid("loading", "数据加载中……");
		var row = $('#dg').datagrid('getSelected');
		if (row.firstpass==null) {
			$.messager.confirm('Confirm',
					'Are you sure you want to operate this apply?', function(r) {
						if (r) {
							$.post('/apply/firstNopass.htm', {
								id : row.employid
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
		    $.messager.alert('Warning','已经操作过s！');
		    $("#dg").datagrid("loaded");
		}
	}
	function secondUser() {
	     $("#dg").datagrid("loading", "数据加载中……");
		var row = $('#dg').datagrid('getSelected');
		if (row.firstpass==1&&row.secondpass==null) {
			$.messager.confirm('Confirm',
					'Are you sure you want to operate this apply?', function(r) {
						if (r) {
							$.post('/apply/secondpass.htm', {
								id : row.employid
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
	function secondUser2() {
	     $("#dg").datagrid("loading", "数据加载中……");
		var row = $('#dg').datagrid('getSelected');
		if (row.firstpass==1&&row.secondpass==null) {
			$.messager.confirm('Confirm',
					'Are you sure you want to operate this apply?', function(r) {
						if (r) {
							$.post('/apply/secondNopass.htm', {
								id : row.employid
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
	function admitUser() {
	      $("#dg").datagrid("loading", "数据加载中……");
		var row = $('#dg').datagrid('getSelected');
		if (row.firstpass==1&&row.secondpass==1) {
			$.messager.confirm('Confirm',
					'Are you sure you want to operate this apply?', function(r) {
						if (r) {
							$.post('/apply/admitpass.htm', {
								id : row.employid
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
	function admitUser2() {
	      $("#dg").datagrid("loading", "数据加载中……");
		var row = $('#dg').datagrid('getSelected');
		if (row.firstpass==0||row.secondpass==0) {
			$.messager.confirm('Confirm',
					'Are you sure you want to operate this apply?', function(r) {
						if (r) {
							$.post('/apply/admitNopass.htm', {
								id : row.employid
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
