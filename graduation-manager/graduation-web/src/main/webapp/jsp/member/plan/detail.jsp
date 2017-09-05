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
td {
	color: #005;
	font-size: 15px;
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
		<form method="post" action="http://localhost:8082/member/update.htm"
			enctype="multipart/form-data" modelAttribute="employee">
			<table class="table table-bordered" style="border:1px solid #ccc;">
				<tr>
					<td class="active" colspan="9"><font
						style="color:#000;font-weight: 500;font-size:20px;">培训计划详情</font>
					</td>
				</tr>
				<tr>
					<td>编号</td>
					<td>${plan.planid }</td>
					<td>名称</td>
					<td>${plan.planname }</td>
					<td>地点</td>
					<td>${plan.whereplace }</td>
				</tr>
				<tr>
					<td>开始时间</td>
					<td><fmt:formatDate value="${plan.starttime }" pattern="yyyy-MM-dd"/> </td>
					<td>结束时间</td>
					<td><fmt:formatDate value="${plan.endtime }" pattern="yyyy-MM-dd"/> </td>
					<td>老师</td>
					<td>${plan.teacher }</td>
				</tr>
				<tr>
					<td>上午</td>
					<td>${plan.beforetime }</td>
					<td>下午</td>
					<td>${plan.aftertime }</td>
					<td>培训对象</td>
					<td>${plan.people }</td>
				</tr>
				<tr>
					<td>资料链接</td>
					<td colspan="5"><a href="${plan.data }" style="color:red;">下载(资料链接)</a></td>
				</tr>
				<tr>
					<td>培训内容</td>
					<td colspan="5">${plan.plancontent }</td>
				</tr>
				<tr>
					<td>培训目的</td>
					<td colspan="5">${plan.planmotive }</td>
				</tr>
				<tr>
					<td colspan="6" align="center">
					   <a href="/member/listPlan.htm" class="btn btn-primary btn-sm" style="width:100px;height:40px;">返回</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>
