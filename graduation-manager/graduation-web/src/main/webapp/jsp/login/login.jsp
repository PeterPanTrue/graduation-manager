<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set value="http://localhost:8082/jsp/login" var="cp"></c:set>
<!DOCTYPE html>
<html lang="en" class="no-js">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge"> 
<meta name="viewport" content="width=device-width, initial-scale=1"> 
<title>login</title>
<link rel="stylesheet" type="text/css" href="${cp }/css/normalize.css" />
<link rel="stylesheet" type="text/css" href="${cp }/css/demo.css" />
<!--必要样式-->
<link rel="stylesheet" type="text/css" href="${cp }/css/component.css" />
<!--[if IE]>
<script src="js/html5.js"></script>
<![endif]-->
</head>
<body>
		<div class="container demo-1">
			<div class="content">
				<div id="large-header" class="large-header">&nbsp; 
					<canvas id="demo-canvas"></canvas>
					<div class="logo_box">
					<h2 align="center">商业银行人力资源管理后台</h2><br/>
						<form action="/bank/backstage.htm" name="f" method="post">
							<div class="input_outer">
								<span class="u_user"></span>
								<input name="id" class="text" style="color: #FFFFFF !important" type="text" placeholder="请输入账户">
							</div>
							<div class="input_outer">
								<span class="us_uer"></span>
								<input name="password" class="text" style="color: #FFFFFF !important; position:absolute; z-index:100;"value="" type="password" placeholder="请输入密码">
							</div>
							<div class="mb2"><a class="act-but submit" href="javascript:;" style="color: #FFFFFF" onclick="submit();">登录</a></div>
						</form>
					</div>
				</div>
			</div>
		</div><!-- /container -->
		<script src="${cp }/js/TweenLite.min.js"></script>
		<script src="${cp }/js/EasePack.min.js"></script>
		<script src="${cp }/js/rAF.js"></script>
		<script src="${cp }/js/demo-1.js"></script>
		<script>
		    function submit(){
		        document.forms[0].submit();
		    }
		</script>
	</body>
