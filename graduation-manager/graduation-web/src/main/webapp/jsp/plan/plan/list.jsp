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
	<table id="dg" title="培訓管理" class="easyui-datagrid"
		style="width:100%;height:480px;" url="/plan/listPlan.htm"
		idField="planid" toolbar="#toolbar" rownumbers="true"
		fitColumns="true" singleSelect="false" pagination="true">
		<thead>
			<tr>
				<th field="planname" width="30">培训主题</th>
				<th field="people" width="30">针对对象</th>
				<th field="starttime" width="30" formatter="formatTime">开始时间</th>
				<th field="endtime" width="30" formatter="formatTime">结束时间</th>
				<th field="beforetime" width="30" >早上时间</th>
				<th field="aftertime" width="30">下午时间</th>
				<th field="whereplace" width="50">地点</th>
				<th field="teacher" width="20">教师</th>
				<th field="data" width="20" formatter="formatData">教学资料</th>
				<th field="isdeleted" width="10" formatter="formatDelete">删除</th>
				<th field="createtime" width="30" formatter="formatTime">创建时间</th>
				<th field="createperson" width="20">创建人</th>
				<th field="temp1" width="20">备注</th>
			</tr>
		</thead>
	</table>
	<div id="toolbar">
		<a href="#" class="easyui-linkbutton" iconCls="icon-save" plain="true"
			onclick="showUser()">浏览详细信息</a>&nbsp;&nbsp;&nbsp; <a href="#"
			class="easyui-linkbutton" iconCls="icon-add" plain="true"
			onclick="addUser()">增加培训信息</a><a href="#"
			class="easyui-linkbutton" iconCls="icon-edit" plain="true"
			onclick="editUser()">修改培训信息</a> <a href="#" class="easyui-linkbutton"
			iconCls="icon-remove" plain="true" onclick="destroyUser()">删除培训信息</a>
			 <span id="tb"
			style="padding-top:3px;float:right;"> <span> ID:</span> <input
			id="id" style="line-height:18px;border:1px solid #000000;"> <a
			href="#" class="easyui-linkbutton" plain="true" iconCls="icon-search"
			onclick="doSearch()">Search</a> </span>
	</div>

	<div id="dlg" class="easyui-dialog"
		style="width:900px;height:500px;padding:0px 20px" closed="true"
		buttons="#dlg-buttons">
		<div class="ftitle" style="padding-bottom: 10px">
			<h3>培训计划信息</h3>
		</div>
		<form id="fm" method="post">
			<table>
				<tr>
					<td width="60">培训主题:</td>
					<td><input class="easyui-textbox" name="planname" /></td>
					<td width="100"></td>
					<td>培训对象:</td>
					<td><select class="easyui-combotree" url="/employee/insertEmployeeBefore.htm"
						name="people" style="width:156px;" />
					</td>
				</tr>
				<tr>
					<td>开始时间:</td>
					<td>
					<input class="easyui-datebox"
						data-options="formatter:myformatter,parser:myparser" name="start" />
					</td>
					<td width="100"></td>
					<td>结束时间:</td>
					<td><input class="easyui-datebox"
						data-options="formatter:myformatter,parser:myparser" name="end" />
					</td>
				</tr>
				<tr>
					<td>上午时间段:</td>
					<td><input class="easyui-textbox" name="beforetime" /></td>
					<td width="100"></td>
					<td>下午时间段:</td>
					<td><input type="text" class="easyui-textbox" name="aftertime" style="width:156px;" />
					</td>
				</tr>
				<tr>
					<td>培训地点:</td>
					<td><input class="easyui-textbox" name="whereplace" /></td>
					<td width="100"></td>
					<td>培训教师:</td>
					<td><input type="text" class="easyui-textbox" name="teacher" style="width:156px;" />
					</td>
				</tr>
				<tr>
					<td>培训资料:</td>
					<td><input class="easyui-textbox" name="data" id="data"/>
					</td>
					<td width="100"></td>
					<td>链接:</td>
					<td>
					<a href="" id="a"/></a>
					</td>
				</tr>
				<tr>
					<td>培训内容:</td>
					<td colspan="4"><textarea rows="3" cols="4"
							style="width:600px;height:100px;" name="plancontent"></textarea></td>
				</tr>
				<tr>
					<td>培训目的:</td>
					<td colspan="4"><textarea rows="3" cols="4"
							style="width:600px;height:100px;" name="planmotive"></textarea></td>
				</tr>
			</table>
		</form>
	</div>
	<div id="dlg-buttons">
	<a href="#" class="easyui-linkbutton" iconCls="icon-ok"
			onclick="saveUser()" id="save">Save</a>
		 <a href="#" class="easyui-linkbutton"
			iconCls="icon-cancel"
			onclick="javascript:$('#dlg').dialog('close');$('#dg').datagrid('loaded');document.getElementById('save').style.display='inline-block';">Cancel</a>
	</div>

</body>
<script>
    function doSearch() {
		$('#dg').datagrid('load', {
			id : $('#id').val()
		});
	}
	function addUser() {
	    clear();
	    $("#dg").datagrid("loading", "数据加载中……");
		$('#dlg').dialog('open').dialog('setTitle', 'New User');
		$('#fm').form('clear');
		url = '/plan/insertPlan.htm';
		alert(url);
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
		var date1=new Date(row.starttime);
		var date2=new Date(row.endtime);
		if (row) {
			$('#dlg').dialog('open').dialog('setTitle', '编辑用户');
			$('#fm').form('load', {
			   'planname':row.planname,
			   'plancontent':row.plancontent,
			   'planmotive' :row.planmotive,
			   'beforetime':row.beforetime,
			   'aftertime':row.aftertime,
			   'whereplace':row.whereplace,
			   'teacher':row.teacher,
			   'data':row.data,
			   'people':row.people,
			   'start':myformatter(date1),
			   'end':myformatter(date2),
			});
			url = '/plan/updatePlan.htm?id=' + row.planid;
		}else{
		    $.messager.alert('Warning','选择一项进行修改！');
		     $("#dg").datagrid("loaded");
		}
	}
	function change(v){
	    document.getElementById("a").href=v;
	    document.getElementById("a").innerHTML=v;
	}
	function clear(){
	    document.getElementById("a").href="";
	    document.getElementById("a").innerHTML="";
	}
	function showUser() {
	   document.getElementById("save").style.display="none";
	   $("#dg").datagrid("loading", "数据加载中……");
		var row = $('#dg').datagrid('getSelected');
		change(row.data);
		var date1=new Date(row.starttime);
		var date2=new Date(row.endtime);
		if (row) {
			$('#dlg').dialog('open').dialog('setTitle', '编辑用户');
			$('#fm').form('load',{
			   'planname':row.planname,
			   'plancontent':row.plancontent,
			   'planmotive' :row.planmotive,
			   'beforetime':row.beforetime,
			   'aftertime':row.aftertime,
			   'whereplace':row.whereplace,
			   'teacher':row.teacher,
			   'data':row.data,
			   'people':row.people,
			   'start':myformatter(date1),
			   'end':myformatter(date2),
			});
		}else{
		    $.messager.alert('Warning','选择一项进行查看！');
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
							$.post('/plan/deletePlan.htm', {
								id : row.planid
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
		    $.messager.alert('Warning','已经操作过s！');
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
