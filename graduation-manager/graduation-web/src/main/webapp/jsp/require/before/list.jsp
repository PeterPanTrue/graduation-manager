<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set value="http://localhost:8082/jsp/require/before" var="cp"></c:set>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8" />
		<title></title>
		<link rel="stylesheet" href="${cp }/css/own.css" />
		<link rel="stylesheet" href="${cp }/css/style.css" />
		<link rel="stylesheet" href="${cp }/css/menu.css" />
		<link rel="stylesheet" href="${cp }/css/bootstrap.min.css" />
		<script src="${cp }/js/jquery-1.8.3.js"></script>
		<script src="${cp }/js/posfixed.js"></script>
	</head>

	<body>
		<div class="wrap">
			<ul class="nav">
				<li>
					<div></div>
				</li>
				<li>
					<p style="width:250px;font-size:24px;">商&nbsp;业&nbsp;银&nbsp;行</p>
				</li>
				<li>
					<a href="http://localhost:8082/jsp/require/before/web.jsp">银行首页</a>
				</li>
				<li>
					<a href="#a3">公司业务</a>
				</li>
				<li>
					<a href="#a4">个人业务</a>
				</li>
				<li>
					<a href="#a4">电子银行</a>
				</li>
				<li>
					<a href="#a5">今日商行</a>
				</li>
			</ul>
		</div>
		<br /><br />
		<div class="container">
			<table class="table">
				<tr>
					<td class="active" colspan="6">
						<font style="color:#FFFFFF;font-weight: 500;font-size:20px;">崗位基本信息</font>
					</td>
				</tr>
				<tr>
				    <td>
						<font style="color:#EBCCCC">序号</font>
					</td>
					<td>
						<font style="color:#EBCCCC">职位名称</font>
					</td>
					<td>
						<font style="color:#EBCCCC">部门</font>
					</td>
					<td>
						<font style="color:#EBCCCC">发布时间</font>
					</td>
					<td>
						<font style="color:#EBCCCC">招聘人数</font>
					</td>
					<td>
						<font style="color:#EBCCCC">操作</font>
					</td>
				</tr>
				<c:forEach items="${list }" var="require" varStatus="index">
				    <tr>
					<td>${index.index+1 }</td>
					<td>${require.position }</td>
					<td>${require.department}</td>
					<td><fmt:formatDate value="${require.createtime }" pattern="yyyy-MM-dd"/></td>
					<td>${require.number}</td>
					<td><a href="/require/detail.htm?id=${require.requireid }">详细信息</a></td>
				    </tr>
				</c:forEach>
				<tr>
					<td colspan="6" align="right">
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
		</div>
	</body>
	<script type="text/javascript" src="${cp }/js/bootstrap.min.js"></script>

</html>