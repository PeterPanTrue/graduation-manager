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
		<style>
			td{
				height:85px;
				width:130px;
				font-size: 15px;
			}
		</style>
	</head>

	<body>
		<div class="wrap">
			<ul class="nav">
				<li>
					<div></div>
				</li>
				<li>
					<p style="width:250px;font-size:22px;">商业银行招聘</p>
				</li>
				<li>
					<a href="http://localhost:8082/jsp/require/before/main.jsp">银行招聘</a>
				</li>
				<li>
					<a href="#a3">招聘流程</a>
				</li>
				<li>
					<a href="#a4">人才计划</a>
				</li>
				<li>
					<a href="#a4">招聘职位</a>
				</li>
				<li>
					<a href="#a5">QAQ</a>
				</li>
			</ul>
		</div>
		<br /><br />
		<div class="container">
			<div class="panel panel-default" style="width:100%;float:left">
				<div class="panel-heading">
					<h3 class="panel-title">岗位详细信息</h3>
				</div>
				<div class="panel-body">
					<table>
						<tr>
							<td>
								职位:
							</td>
							<td class="other">
								${require.position }
							</td>
							<td>
								部门：
							</td>
							<td>
								${require.department }
							</td>
							<td>
								人数：
							</td>
							<td>
								${require.number }
							</td>
							<td></td>
						</tr>
						<tr>
							<td>
								开始时间：
							</td>
							<td class="other">
								<fmt:formatDate value="${require.starttime }" pattern="yyyy-MM-dd"/>
							</td>
							<td>
								结束时间：
							</td>
							<td>
								<fmt:formatDate value="${require.endtime }" pattern="yyyy-MM-dd"/>
							</td>
							<td>
								发布时间：
							</td>
							<td>
								<fmt:formatDate value="${require.createtime }" pattern="yyyy-MM-dd"/>
							</td>
							<td></td>
						</tr>
						<tr>
							<td >
								要求：
							</td>
							<td  colspan="5" style="width:250px;">
							<input type="hidden" value="${require.need }" id="v1"/>
								<div id="need">
								</div>
							</td>
							<td colspan="1"></td>
						</tr>
						<tr>
							<td >
								工作内容：
							</td>
							<td  colspan="5" style="width:250px;">
								<input type="hidden" value="${require.content }" id="v2"/>
								<div id="content">
								</div>
							</td>
							<td colspan="1"></td>
						</tr>
						<tr>
							<td colspan="6" align="right">
							</td>
							<td  align="right">
								<a  href="/require/submit.htm?id=${require.requireid }" class="btn btn-danger btn-sm" style="width:150px;height:50px;padding-top:12px;font-size: 16px;">投递简历</a>
							</td>
						</tr>
					</table>
				</div>
			</div>
		</div>
	</body>
	<script type="text/javascript" src="${cp }/js/bootstrap.min.js"></script>
    <script>
        var value=document.getElementById("v1").value;
        var values= value.split("；");//
        for(var i=0;i<values.length;i++){
            document.getElementById("need").innerHTML+=values[i]+"<br/>";
        }
        var value2=document.getElementById("v2").value;
        var values2= value2.split("；");//
        document.getElementById("content").innerHTML+="<br/>";
        for(var i=0;i<values2.length;i++){
            document.getElementById("content").innerHTML+=values2[i]+"<br/>";
        }
    </script>
</html>