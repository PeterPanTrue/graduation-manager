<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set value="http://localhost:8082/jsp/require/before" var="cp"></c:set>
<!DOCTYPE html>
<html lang="en">

	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title></title>
		<link href="${cp }/css/bootstrap.min.css" rel="stylesheet">
		<link href="${cp }/css/myown.css" rel="stylesheet">
		<link rel="stylesheet" href="${cp }/css/own.css" />
		<link rel="stylesheet" href="${cp }/css/style.css" />
		<link rel="stylesheet" href="${cp }/css/menu.css" />
	</head>

	<body style="background: #FFFFFF">
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
		<div class="own" style="background: #FFFFFF;margin-top: 50px;">
			<div class="body">
				<div id="myCarousel" class="carousel slide">
					<ol class="carousel-indicators">
						<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
						<li data-target="#myCarousel" data-slide-to="1"></li>
						<li data-target="#myCarousel" data-slide-to="2"></li>
						<li data-target="#myCarousel" data-slide-to="3"></li>
					</ol>
					<div class="carousel-inner">
						<div class="item active" >
							<img src="img/b3.jpg" alt="第一张"  style="width:100%;height: 350px;"/>
						</div>
						<div class="item" >
							<img src="img/A4.jpg" alt="第二张"  style="width:100%;height: 350px;"/>
						</div>
						<div class="item" >
							<img src="img/b2.jpg" alt="第三张" style="width:100%;height: 350px;"/>
						</div>
						<div class="item" >
							<img src="img/b1.jpg" alt="第四张" style="width:100%;height: 350px;"/>
						</div>
					</div>
				</div>
			</div>
			<div class="center" style="width:1200px;height:300px;">
				<div class="left">
					<div class="up">
						<h3 style="margin-left:18px;border-bottom:1px solid #E7E7E7;" >热门产品<span style="float:right;font-size: 15px;margin-right: 25px;"> >>更多 </span></h3>
					</div>
					<div class="down" >
						<div class="first">
							<div class="sonup">
								<h4 style="margin-left:25px;">“月月红”存款产品</h4>
							</div>
							<div class="sondown">
								<div class="sonleft">
									<div style="margin:15px;">
										10万元起购
									</div>
									<div style="margin:15px;">
										投资期限：<font color="darkorange">5年</font>
									</div>
								</div>
								<div class="sonright">
									 <h3>预期收益率:<font color="red">5.225%</font></h3>
								</div>
							</div>
						</div>	
						<div class="two">
							<div class="sonup">
								<h4 style="margin-left:25px;">“快乐金”存款产品</h4>
							</div>
							<div class="sondown">
								<div class="sonleft">
									<div style="margin:15px;">
										400元起购
									</div>
									<div style="margin:15px;">
										投资期限：<font color="darkorange">5年</font>
									</div>
								</div>
								<div class="sonright">
									 <h3>预期收益率:<font color="red">3.25%</font></h3>
								</div>
							</div>
						</div>
						<div class="first">
							<div class="sonup">
								<h4 style="margin-left:25px;">存款组合套餐</h4>
							</div>
							<div class="sondown">
								<div class="sonleft">
									<div style="margin:15px;">
										5万元起购
									</div>
									<div style="margin:15px;">
										投资期限：<font color="darkorange">5年</font>
									</div>
								</div>
								<div class="sonright">
									 <h3>预期收益率:<font color="red">4.835%</font></h3>
								</div>
							</div>
						</div>	
						<div class="two">
							<div class="sonup">
								<h4 style="margin-left:25px;">“利滚利”存款产品</h4>
							</div>
							<div class="sondown">
								<div class="sonleft">
									<div style="margin:15px;">
										3万元起购
									</div>
									<div style="margin:15px;">
										投资期限：<font color="darkorange">5年</font>
									</div>
								</div>
								<div class="sonright">
									 <h3>预期收益率:<font color="red">4.345%</font></h3>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="right">
					<div class="rup">
						<h3 style="margin-left:10px;border-bottom:1px solid #E7E7E7;" >热门活动<span style="float:right;font-size: 15px;"> >>更多 </span></h3>
					</div>
					<div class="rleft">
						<img src="img/A6.jpg" style="float:left;width:440px;height:115px;"/>
					</div>
					<div class="rright"> 
						<div style="margin-top:7px;margin-left: 10px;">“让爱回家”摄影大赛获奖名单出.....<span style="float:right;font-size: 15px;margin-right: 20px;">2017-8-15  </span></div>
						<div style="margin-top:7px;margin-left: 10px;">“让爱回家”摄影大赛获奖名单出.....<span style="float:right;font-size: 15px;margin-right: 20px;">2017-8-20  </span></div>
						<div style="margin-top:7px;margin-left: 10px;">“让爱回家”摄影大赛获奖名单出.....<span style="float:right;font-size: 15px;margin-right: 20px;">2017-8-25  </span></div>
						<div style="margin-top:7px;margin-left: 10px;">“让爱回家”摄影大赛获奖名单出.....<span style="float:right;font-size: 15px;margin-right: 20px;">2017-8-28  </span></div>
					</div>
				</div>
			</div>
			<div class="footer">
				<span><img src="img/A5.jpg" /></span>
				<div>
					<a href="http://localhost:8082/jsp/require/before/main.jsp">官网招聘</a><br /><br />
					<a href="">官方微博</a><br /><br />
					<a href="">官方微信</a><br /><br />
					<a href="">移动应用</a><br /><br />
				</div>
				<div>
					<a href="">收费服务</a><br /><br />
					<a href="">金融工具</a><br /><br />
					<a href="">在线客服</a><br /><br />
					<a href="">网点查询</a><br /><br />
				</div>
				<div>
					<a href="">个人业务</a><br /><br />
					<a href="">公司业务</a><br /><br />
					<a href="">电子银行</a><br /><br />
					<a href="">银行卡</a><br /><br />
				</div>
				<div>
					<a href="">存款利率</a><br /><br />
					<a href="">贷款利率</a><br /><br />
					<a href="">电子回单</a><br /><br />
					<a href="">便名服务</a><br /><br />
				</div>
			</div>
			<div class="end" style="text-align: center;">
				<span class="last">Copyright商业银行2014　地址：湖北省武汉市武昌区八一路299号　邮编：430072+</span>
				<br /><br />
				<p>鄂ICP备05003330鄂公网安备42010602000219</p>
			</div>
		</div>
		<script src="${cp }/js/jquery-1.8.3.js"></script>
		<script src="${cp }/js/bootstrap.min.js"></script>
		<script>
			$('#myCarousel').carousel({
				interval: 2000,
			});
		</script>
	</body>

</html>