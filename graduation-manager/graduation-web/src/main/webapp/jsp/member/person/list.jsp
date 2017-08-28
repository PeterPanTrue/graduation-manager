<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set value="http://localhost:8082/jsp/static" var="cp"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="keywords" content="jquery,ui,easy,easyui,web">
<meta name="description"
	content="easyui help you build your web page easily!">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>jQuery EasyUI CRUD Demo</title>
<link rel="stylesheet" type="text/css"
	href="${cp }/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="${cp }/css/style.css">
<link rel="stylesheet" type="text/css"
	href="${cp }/css/htmleaf-demo.css">
	<link rel="stylesheet" type="text/css" href="${cp }/css/easyui.css">
<link rel="stylesheet" type="text/css" href="${cp }/css/icon.css">
<link rel="stylesheet" type="text/css" href="${cp }/css/demo.css">
<script type="text/javascript" src="${cp }/js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="${cp }/js/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${cp }/js/common.js"></script>
<style>
    td{
        color:#005;
        font-size:15px;
    }
    
</style>
<script>
    function formatTime(val, time) {
		return new Date(val).Format("yyyy-MM-dd hh:mm:ss");
	}
</script>
</head>
<body style="background: #FFFFFF;">
	<div class="container" style="padding-top:27px;">
	<form method="post" action="http://localhost:8082/member/update.htm"  enctype="multipart/form-data" modelAttribute="employee">
	    <table class="table" style="border:1px solid #ccc;">
		<tr>
			<td class="active" colspan="6"><font style="color:#000;font-weight: 500;font-size:20px;">员工基本信息</font></td>
		</tr>
		<tr>
			<td >帐号：</td>
			<td >${employee.id }
			<input type="hidden" name="id" value="${employee.id }"/></td>
			<td >姓名：</td>
			<td >${employee.name }
			<input type="hidden" name="name" value="${employee.name }"/></td>
			<td ></td>
			<td  rowspan="3"><span style="float:left;"><img style="width:60px;width:85px;" src="http://localhost:18888/Picture/upload/${employee.photo }"/></span>
			<span style="float:left;margin-top:75px;"><input type="file" name="fileupload"  size="8"/>
			<input type="hidden" name="photo" value="${employee.photo }"/></span>
			</td>
		</tr>
		<tr>
			<td >性别：</td>
			<td ><select name="sex" id="sex" class="easyui-combobox" >
			    <option value="" >--请选择--</option>
			    <option value="男" <c:if test="${requestScope.employee.sex=='男' }">selected</c:if>>男</option>
			    <option value="女" <c:if test="${requestScope.employee.sex=='女' }">selected</c:if>>女</option>
			    <option value="其他" <c:if test="${requestScope.employee.sex=='其他' }">selected</c:if>>其他</option>
			</select></td>
			<td >出生：</td>
			<td ><input class="easyui-datebox" data-options="formatter:myformatter,parser:myparser" name="born" value="${employee.birth }"/></td>
			<td >照片：</td>
		</tr>
		<tr>
			<td >身份证：</td>
			<td >${employee.idcard }
			<input type="hidden" name="idcard" value="${employee.idcard }"/></td>
			<td >民族:</td>
			<td >
			<select name="natives" id="natives" class="easyui-combobox" >
			    <option value="" >--请选择--</option>
			    <option value="汉族" <c:if test="${requestScope.employee.natives=='汉族' }">selected</c:if>>汉族</option>
			    <option value="回族" <c:if test="${requestScope.employee.natives=='回族' }">selected</c:if>>回族</option>
			    <option value="藏族" <c:if test="${requestScope.employee.natives=='藏族' }">selected</c:if>>藏族</option>
			    <option value="维吾尔族" <c:if test="${requestScope.employee.natives=='维吾尔族' }">selected</c:if>>维吾尔族</option>
			    <option value="苗族" <c:if test="${requestScope.employee.natives=='苗族' }">selected</c:if>>苗族</option>
			    <option value="其他" <c:if test="${requestScope.employee.natives=='其他' }">selected</c:if>>其他</option>
			</select></td>
			<td ></td>
		</tr>
		<tr>
			<td >婚配：</td>
			<td >
			<select name="marray" id="marray" class="easyui-combobox" >
			    <option value="" >--请选择--</option>
			    <option value="1" <c:if test="${requestScope.employee.marray==1 }">selected</c:if>>已婚</option>
			    <option value="2" <c:if test="${requestScope.employee.marray==2 }">selected</c:if>>未婚</option>
			    <option value="3" <c:if test="${requestScope.employee.marray==3 }">selected</c:if>>其他</option>
			</select>
			</td>
			<td >政治面貌：</td>
			<td >
			<select name="face" id="face" class="easyui-combobox" >
			    <option value="" >--请选择--</option>
			    <option value="1" <c:if test="${requestScope.employee.face=='1' }">selected</c:if>>中共党员</option>
			    <option value="2" <c:if test="${requestScope.employee.face=='2' }">selected</c:if>>预备党员</option>
			    <option value="3" <c:if test="${requestScope.employee.face=='3' }">selected</c:if>>团员</option>
			    <option value="4" <c:if test="${requestScope.employee.face=='4' }">selected</c:if>>群众</option>
			    <option value="5" <c:if test="${requestScope.employee.face=='5' }">selected</c:if>>其他</option>
			</select></td>
			<td >地址：</td>
			<td>${employee.source }
			<input  type="hidden" name="source" value="${employee.source }" style="border:0px;"/></td>
		</tr>
		<tr>
			<td >电话：</td>
			<td >
			<input class="easyui-textbox" type="text" name="phone" value="${employee.phone }"/></td>
			<td >工作年限：</td>
			<td >
			<input class="easyui-textbox" type="text" name="worktime" value="${employee.worktime }"/></td>
			<td >学历：</td>
			<td >${employee.xuel }
			<input  type="hidden" name="xuel" value="${employee.xuel }"/></td>
		</tr>
		<tr>
			<td >毕业学校：</td>
			<td >${employee.school }
			<input type="hidden" name="school" value="${employee.school }" /></td>
			<td >毕业时间：</td>
			<td >
			<input class="easyui-datebox" name="finish" value="${employee.finishtime }" data-options="formatter:myformatter,parser:myparser" ></td>
			<td >专业：</td>
			<td >
			<input class="easyui-textbox"  type="text" name="major" value="${employee.major }"/></td>
		</tr>
		<tr>
			<td >英语水平：</td>
			<td >
			<select name="english" id="english" class="easyui-combobox" >
			    <option value="" >--请选择--</option>
			    <option value="1" <c:if test="${requestScope.employee.english=='1' }">selected</c:if>>六级</option>
			    <option value="2" <c:if test="${requestScope.employee.english=='2' }">selected</c:if>>四级</option>
			    <option value="3" <c:if test="${requestScope.employee.english=='3' }">selected</c:if>>三级</option>
			    <option value="4" <c:if test="${requestScope.employee.english=='4' }">selected</c:if>>其他</option>
			</select></td>
			<td >计算机等级：</td>
			<td>
			<select name="computer" id="computer" class="easyui-combobox" >
			    <option value="" >--请选择--</option>
			    <option value="1" <c:if test="${requestScope.employee.computer=='1' }">selected</c:if>>六级</option>
			    <option value="2" <c:if test="${requestScope.employee.computer=='2' }">selected</c:if>>四级</option>
			    <option value="3" <c:if test="${requestScope.employee.computer=='3' }">selected</c:if>>二级</option>
			    <option value="4" <c:if test="${requestScope.employee.computer=='4' }">selected</c:if>>其他</option>
			</select></td>
			<td >入企时间：</td>
			<td ><fmt:formatDate value="${employee.entertime }"  pattern="yyyy-MM-dd"/>
			<input  type="hidden" name="entertime" value="${employee.entertime }"/></td>
		</tr>
		<tr>
			<td >所属部门：</td>
			<td >${employee.departmentname }
			<input  type="hidden" name="departmentname" value="${employee.departmentname }"/></td>
			<td >岗位：</td>
			<td >${employee.positionname }
			<input  type="hidden" name="positionname" value="${employee.positionname }"/></td>
			<td >基本工薪：</td>
			<td >${employee.salary }
			<input  type="hidden" name="salary" value="${employee.salary }"/></td>
		</tr>
		<tr><td></td><td></td><td></td><td></td><td></td><td></td></tr>
	    </table>
	    <div align="center">
	        <input  type="submit" class="btn btn-info" value="提交" size="15" onclick="click();"/>&nbsp;&nbsp;
	        <input  type="reset" class="btn btn-info" value="重置" size="15"/>
	    </div>
	    </form>
	</div>
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
</body>
</html>
