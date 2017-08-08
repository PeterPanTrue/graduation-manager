<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set value="http://localhost:8082/jsp/backstage" var="cp"></c:set>
<!DOCTYPE HTML>
<html>
 <head>
  <title> 失败页面</title>
   <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="${cp }/assets/css/dpl-min.css" rel="stylesheet" type="text/css" />
    <link href="${cp }/assets/css/page-min.css" rel="stylesheet" type="text/css" />  

 </head>
 <body>
  
  <div class="container">
    <div class="row">
      <div class="span10">
        <div class="tips tips-large tips-warning">
          <span class="x-icon x-icon-error">×</span>
          <div class="tips-content">
            <h2>失败信息</h2>
            <p class="auxiliary-text">
               <h1 style="margin-left:50px;">对不起,您没有访问权限！</h1>
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

<body>
</html>  