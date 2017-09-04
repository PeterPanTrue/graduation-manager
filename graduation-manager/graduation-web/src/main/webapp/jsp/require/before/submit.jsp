<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
td {
	height: 80px;
}

ul.nav-pills {
	float: left;
	width: 150px;
}

ul.nav-pills.affix {
	float: left;
	top: 30px;
}

ul.nav-pills li a {
	float: left;
	width: 150px;
	color: #fff;
	background-color: #000;
}

ul.nav-pills li a:hover {
	color: #000;
	background-color: #EEA2AD;
}

label {
	font-size: 17px;
}
</style>
</head>

<body data-spy="scroll" data-target="#myScrollspy">
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
	<br />
	<br />
	<div class="container">
		<div style="height:50px"></div>
		<div class="row">
			<div class="col-xs-3" id="myScrollspy">
				<ul class="nav nav-pills nav-stacked" data-spy="affix"
					data-offset-top="50" style="background: none;">
					<li><a href="#section1">基本信息</a></li>
					<li><a href="#section2">申请职位</a></li>
					<li><a href="#section3">学历信息</a></li>
					<li><a href="#section4">工作经验</a></li>
					<li><a href="#section5">附件上传</a></li>
				</ul>
			</div>
			<div class="col-xs-9">
				<form role="form" method="post" action="/apply/insertApply.htm"
					class="form-horizontal">
					<h2 id="section1" style="border-bottom: 1px dotted #ccc;">基本信息</h2><br/>
					<div>
						<div class="form-group">
							<label class="col-sm-2 control-label">名字:</label>
							<div class="col-sm-4">
								<input type="text" name="name" class="form-control"
									placeholder="请输入名字">
							</div>
							<label class="col-sm-2 control-label">性别:</label>
							<div class="col-sm-4">
								<input type="radio" name="sex" value="男"
									style="width:30px;height:30px;">男
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<input type="radio" name="sex" value="女"
									style="width:30px;height:30px;">女
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">年龄:</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" name="age"
									placeholder="请输入年龄">
							</div>
							<label class="col-sm-2 control-label">身份证:</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" name="idcard"
									placeholder="请输入身份证">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">邮箱:</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" name="email"
									placeholder="请输入邮箱">
							</div>
							<label class="col-sm-2 control-label">电话:</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" placeholder="请输入电话"
									name="diahua">
							</div>
						</div>
					</div>
					<br />
					<br />
					<h2 id="section2" style="border-bottom: 1px dotted #ccc;">申请职位</h2><br/>
					<div>
						<div class="form-group">
							<label class="col-sm-2 control-label">职位名称:</label> <input
								type="hidden" name="position" value="${require.position }">
							<div class="col-sm-4" style="padding-top:8px;font-size:16px;">
								${require.position }</div>
							<label class="col-sm-2 control-label">所属部门:</label>
							<div class="col-sm-4" style="padding-top:8px;font-size:16px;">
								${require.department }</div>
							<input type="hidden" name="department"
								value="${require.department }">
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">第一选择城市:</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" placeholder="请输入第一选择城市">
							</div>
							<label class="col-sm-2 control-label">第二选择城市</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" placeholder="请输入第二选择城市">
							</div>
						</div>
					</div>
					<br />
					<br />
					<h2 id="section3" style="border-bottom: 1px dotted #ccc;">学历信息</h2><br/>
					<div>
						<div class="form-group">
							<label class="col-sm-2 control-label">学历:</label>
							<div class="col-sm-4">
								<select name="education" class="form-control">
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
								</select>
							</div>
							<label class="col-sm-2 control-label">毕业学校:</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" name="school"
									placeholder="请输入学校">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">专业:</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" placeholder="请输入专业">
							</div>
							<label class="col-sm-2 control-label"></label>
							<div class="col-sm-4"></div>
						</div>
					</div>
					<br />
					<br />
					<h2 id="section4" style="border-bottom: 1px dotted #ccc;">工作经验</h2><br/>
					<div>
						<div class="form-group">
							<label class="col-sm-2 control-label">工作经验:</label>
							<div class="col-sm-10">
								<textarea class="form-control" rows="10" name="exprement">
									</textarea>
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-2"></div>
							<div class="col-sm-10">
								<font color="red">*格式:公司名称-工作岗位-工作内容-收获</font>
							</div>
						</div>
					</div>
					<br />
					<br />
					<h2 id="section5">附件上传</h2>
					<div>
						<div class="form-group">
							<div class="col-sm-4">
								<label class="sr-only" for="inputfile">文件输入</label>
							</div>
							<div class="col-sm-8">
								<input type="file" id="inputfile" size=50>
							</div>
						</div>
					</div>
					<br />
					<br />
					<div class="form-group">
						<div class="col-sm-4"></div>
						<div class="col-sm-4">
							<input type="submit" class="form-control btn-danger" value="投递" />
						</div>
						<div class="col-sm-4"></div>
					</div>
				</form>
			</div>
		</div>
	</div>
	<br />
	<br />
	<br />
	<br />
</body>
<script type="text/javascript" src="${cp }/js/bootstrap.min.js"></script>

</html>