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
					<td class="active" colspan="8"><font
						style="color:#000;font-weight: 500;font-size:20px;">福利待遇</font>
					</td>
				</tr>
				<tr>
					<td>编号</td>
					<td>名称</td>
					<td>金额</td>
					<td>描述</td>
					<td>备注</td>
				</tr>
				<c:forEach items="${list }" var="salary" varStatus="index">
					<tr>
						<td>${index.index+1 }</td>
						<td>${salary.rewordname }</td>
						<td>${salary.money }</td>
						<td>${salary.description}</td>
						<td></td>
					</tr>
				</c:forEach>
				<tr>
					<td colspan="8" align="right">
						<nav aria-label="Page navigation">
							<ul class="pagination">
								<li>
									<a href="" aria-label="Previous">
										<span aria-hidden="true">上一页</span>
									</a>
								</li>
								<li>
									<a href="">1</a>
								</li>
								<li>
									<a href="">2</a>
								</li>
								<li>
									<a href="">3</a>
								</li>
								<li>
									<a href="">4</a>
								</li>
								<li>
									<a href="" aria-label="Next">
										<span aria-hidden="true">下一页</span>
									</a>
								</li>
							</ul>
						</nav>
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>
