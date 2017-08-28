<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set value="http://localhost:8082/jsp/backstage" var="cp"></c:set>
<!DOCTYPE HTML>
<html>
 <head>
  <title> 页面操作快捷方式</title>
   <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
       <link href="${cp }/assets/css/dpl-min.css" rel="stylesheet" type="text/css" />
    <link href="${cp }/assets/css/bui-min.css" rel="stylesheet" type="text/css" />
    <link href="${cp }/assets/css/page-min.css" rel="stylesheet" type="text/css" />   <!-- 下面的样式，仅是为了显示代码，而不应该在项目中使用-->
   <link href="${cp }/assets/css/prettify.css" rel="stylesheet" type="text/css" />
   <style type="text/css">
    code {
      padding: 0px 4px;
      color: #d14;
      background-color: #f7f7f9;
      border: 1px solid #e1e1e8;
    }
    a{
      padding-right:50px;
      font-size:15px;
    }
    #main{
       padding-top:65px;
       text-align:center;
       font-size:35px;
       color: orange;
    }
    #b{
       padding-top:150px;
       padding-left:450px;
    }
   </style>
 </head>
 <body style="padding-left:300px;padding-top:100px;background: #ccc;">
  
  <div class="container">
    <div class="row"  >
      <div class="span20">
        <div class="tips tips-large tips-success" >
          <span class="x-icon x-icon-success"><i class="icon icon-ok icon-white"></i></span>
          <div class="tips-content" style="height:400px;" >
            <h1>成功信息</h1>
            <br/><br/>
            <p id="main">
               恭喜你成功投递简历！
            </p>
            <p id="b">
            <button type="button" class="button button-primary" style="width:120px;height:55px;" onclick="window.location.href='http://localhost:8082/jsp/require/before/main.jsp'">返回</button>
            </p>
          </div>
        </div>
      </div> 
    </div>
  </div>
  <script type="text/javascript" src="${cp }/assets/js/jquery-1.8.1.min.js"></script>
  <script type="text/javascript" src="${cp }/assets/js/bui-min.js"></script>

  <script type="text/javascript" src="${cp }/assets/js/config-min.js"></script>
  <script type="text/javascript">
    BUI.use('common/page');
  </script>
  <!-- 仅仅为了显示代码使用，不要在项目中引入使用-->
  <script type="text/javascript" src="${cp }/assets/js/prettify.js"></script>
  <script type="text/javascript">
    $(function () {
      prettyPrint();
    });

  </script> 

<body>
</html>  