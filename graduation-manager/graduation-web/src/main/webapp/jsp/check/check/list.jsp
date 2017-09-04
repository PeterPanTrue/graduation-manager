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
	function formatGood(val, time) {
		return val!=0?"<font color=red>"+val+"</font>":val;
	}
	function formatTime(val, time) {
		return new Date(val).Format("yyyy-MM-dd");
	}
</script>
</head>
<body>
	<table id="dg" title="考勤管理" class="easyui-datagrid"
		style="width:100%;height:480px;" url="/check/listCheck.htm" idField="checkid"
		toolbar="#toolbar" rownumbers="true" fitColumns="true" singleSelect="false"
		pagination="true">
		<thead>
			<tr>
				<th field="memberid" width="30" >员工工号</th>
				<th field="membername" width="30" >员工姓名</th>
				<th field="checktime" width="40" formatter="formatTime">考勤时间</th>
				<th field="ontime" width="40"  formatter="formatGood">全勤</th>
				<th field="late" width="40"  formatter="formatGood">迟到早退</th>
				<th field="aleave" width="40"   formatter="formatGood">请假</th>
				<th field="missing" width="40"  formatter="formatGood">矿工</th>
				<th field="goout" width="40"   formatter="formatGood">出差</th>
				<th field="plus" width="40" formatter="formatGood">加班</th>
				<th field="createperson" width="30">创建人</th>
				<th field="temp1" width="30">备注</th>
		</thead>
	</table>
	<div id="toolbar">
	     <a href="#"
			class="easyui-linkbutton" iconCls="icon-edit" plain="true"
			onclick="editUser()">修改考勤信息</a>&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="#"
			class="easyui-linkbutton" iconCls="icon-remove" plain="true"
			onclick="">删除考勤信息</a>&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="#"
			class="easyui-linkbutton" iconCls="icon-print" plain="true"
			onclick="read()">导入信息</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="#"
			class="easyui-linkbutton" iconCls="icon-print" plain="true"
			onclick="write()">导出信息</a>
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
			<h3>修改考勤信息</h3>
		</div>
		<form id="fm" method="post">
		    <table>
		    <table>
				<tr>
					<td>帐号:</td>
					<td><input type="text" name="mid" style="width:156px;" disabled="disabled"/>
					</td>
					<td width="100"></td>
					<td>姓名:</td>
					<td><input type="text" name="name" style="width:156px;" disabled="disabled"/>
					</td>
				</tr>
				<tr>
					<td>考勤时间:</td>
					<td><input class="easyui-datebox"
						data-options="formatter:myformatter,parser:myparser" name="start" />
					</td>
					<td width="100"></td>
					<td>迟到早退:</td>
					<td><input type="text" name="late" style="width:156px;"/>
					</td>
				</tr>
				<tr>
					<td>请假:</td>
					<td><input type="text" name="aleave" style="width:156px;"/>
					</td>
					<td width="100"></td>
					<td>矿工:</td>
					<td><input type="text" name="missing" style="width:156px;" />
					</td>
				</tr>
			    <tr>
					<td>出差:</td>
					<td><input type="text" name="goout" style="width:156px;"/>
					</td>
					<td width="100"></td>
					<td>加班:</td>
					<td><input type="text" name="plus" style="width:156px;" />
					</td>
				</tr>
				 <tr>
					<td>全勤:</td>
					<td><input type="text" name="ontime" style="width:156px;"/>
					</td>
					<td width="100"></td>
					<td></td>
					<td>
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
	
	<div id="dlg2" class="easyui-dialog"
		style="width:350px;height:150px;padding:10px 20px" closed="true" 
		buttons="#dlg-buttons2">
		<br/>
		<form id="fm2" method="post" enctype="multipart/form-data">
		    <table>
				<tr>
					<td width="100">选择文件:</td>
					<td><input type="file" name="fileupload" style="width:200px;" />
					</td>
				</tr>
			</table>
		</form>
	</div>
	<div id="dlg-buttons2">
		<a href="#" class="easyui-linkbutton" iconCls="icon-ok"
			onclick="saveUser2()">Submit</a> <a href="#" class="easyui-linkbutton"
			iconCls="icon-cancel" onclick="javascript:$('#dlg2').dialog('close');$('#dg').datagrid('loaded');">Cancel</a>
	</div>
</body>
<script>
    function doSearch() {
		$('#dg').datagrid('load', {
			id : $('#id').val()
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
				$('#dlg').dialog('close');
				$('#dg').datagrid('reload'); 
			}
		});
	}
	function saveUser2() {
		$('#fm2').form('submit', {
			url : url,
			onSubmit : function() {
				return $(this).form('validate'); //没有验证成功不让提交
			},
			success : function(result) {
				$('#dlg2').dialog('close');
				$('#dg').datagrid('reload'); 
			}
		});
	}
	function editUser() {
	    $("#dg").datagrid("loading", "数据加载中……");
		var row = $('#dg').datagrid('getSelected');
		var date1=new Date(row.checktime);
		if (row) {
			$('#dlg').dialog('open').dialog('setTitle', '编辑用户');
			$('#fm').form('load', {
			   'mid':row.memberid,
			   'name' :row.membername,
			   'ontime':row.ontime,
			   'late':row.late,
			   'aleave':row.aleave,
			   'missing':row.missing,
			   'goout':row.goout,
			   'plus':row.plus,
			   'start':myformatter(date1),
			});
			url = 'http://localhost:8082/check/updateCheck.htm?id='+row.checkid+'&memberid='+row.memberid;
		}
	}
	function read() {
	    $("#dg").datagrid("loading", "数据加载中……");
		$('#dlg2').dialog('open').dialog('setTitle', '导入文件');
		$('#fm2').form('clear');
		url = 'http://localhost:8082/check/readExcel.htm';
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
