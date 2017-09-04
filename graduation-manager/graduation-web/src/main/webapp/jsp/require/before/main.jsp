<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set value="http://localhost:8082/jsp/require/before" var="cp"></c:set><!DOCTYPE html>
<html lang="en">

	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title></title>
		<link rel="stylesheet" href="${cp }/css/own.css" />
		<link rel="stylesheet" href="${cp }/css/style.css" />
		<link rel="stylesheet" href="${cp }/css/menu.css" />
		<link rel="stylesheet" href="${cp }/css/main.css" />
		<link rel="stylesheet" href="${cp }/css/jd.css" />
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
		<div class="center" style="margin-top: 30px;">
			<div class="show">
				<div class="left">
					<div id="menu">
						<div id="top"><span><a href="#" style="font-size:15px;">全部岗位分类</a></span></div>
						<ul id="nav">
							<li>
								<a href="/require/list.htm?department=0" class="navlia"><span>银行前台</span></a>
							</li>
							<li>
								<a href="/require/list.htm?department=1" class="navlia"><span>银行业务部</span></a>
								
							</li>
							<li>
								<a href="/require/list.htm?department=2" class="navlia"><span>信息技术部</span></a>
								
							</li>
							<li>
								<a href="/require/list.htm?department=3" class="navlia"><span>银行会计部</span></a>
								
							</li>
							<li>
								<a href="/require/list.htm?department=4" class="navlia"><span>银行风控部</span></a>
								
							</li>
							<li>
								<a href="/require/list.htm?department=5" class="navlia"><span>银行人力资源部</span></a>
								
							</li>
							<li>
								<a href="/require/list.htm?department=6" class="navlia"><span>银行财务部</span></a>
								
							</li>
							<li id="foot">

							</li>
						</ul>
					</div>
				</div>
				<div class="right">
					<div id="main">
						<a href="http://www.hao123.com"><img class="pic" style="display:block;" src="img/a2.jpg" /></a>
						<a href="http://www.hao123.com"><img class="pic" src="img/a1.jpg" /></a>
						<a href="http://www.hao123.com"><img class="pic" src="img/a3.jpg" /></a>
					</div>
				</div>
			</div>
		</div>
	</body>
	<script type="text/javascript" src="${cp }/js/jd.js"></script>
	<script type="text/javascript" src="${cp }/js/lunbo.js" ></script>

</html>