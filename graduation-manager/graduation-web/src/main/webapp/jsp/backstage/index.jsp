<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set value="http://localhost:8082/jsp/backstage" var="cp"></c:set>
<!DOCTYPE HTML>
<html>
 <head>
  <title>商业银行人力资源管理系统</title>
   <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
   <link href="${cp }/assets/css/dpl-min.css" rel="stylesheet" type="text/css" />
  <link href="${cp }/assets/css/bui-min.css" rel="stylesheet" type="text/css" />
   <link href="${cp }/assets/css/main-min.css" rel="stylesheet" type="text/css" />
 </head>
 <body>

  <div class="header">
    
      <div class="dl-title">
          <span class="lp-title-port">商业银行人力资源管理系统</span><span class="dl-title-text"></span>
      </div>

    <div class="dl-log">欢迎您，<span class="dl-log-user">${sessionScope.user.rolename}-${sessionScope.user.name}</span><a href="/bank/logout.htm" title="退出系统" class="dl-log-quit">[退出]</a>
    </div>
  </div>
   <div class="content">
    <div class="dl-main-nav">
      <div class="dl-inform"><div class="dl-inform-title">贴心小秘书<s class="dl-inform-icon dl-up"></s></div></div>
      <ul id="J_Nav"  class="nav-list ks-clear">
        <li class="nav-item dl-selected"><div class="nav-item-inner nav-home">员工平台</div></li>
        <li class="nav-item"><div class="nav-item-inner nav-order">招聘管理</div></li>
		<li class="nav-item"><div class="nav-item-inner nav-inventory">人事管理</div></li>
        <li class="nav-item"><div class="nav-item-inner nav-inventory">培训管理</div></li>
        <li class="nav-item"><div class="nav-item-inner nav-supplier">考勤管理</div></li>
        <li class="nav-item"><div class="nav-item-inner nav-order">薪酬福利</div></li>
		<li class="nav-item"><div class="nav-item-inner nav-inventory">企业文化</div></li>
        <li class="nav-item"><div class="nav-item-inner nav-supplier">系统管理</div></li>
      </ul>
    </div>
    <ul id="J_NavContent" class="dl-tab-conten">

    </ul>
   </div>
  <script type="text/javascript" src="${cp }/assets/js/jquery-1.8.1.min.js"></script>
  <script type="text/javascript" src="${cp }/assets/js/bui.js"></script>
  <script type="text/javascript" src="${cp }/assets/js/config.js"></script>

  <script>
    BUI.use('common/main',function(){
      var config = [{
          id:'menu', 
          homePage : 'code',
          menu:[{
              text:'员工基本信息',
              items:[
                {id:'code',text:'首页公告',href:'http://baidu.com',closeable : false},
                {id:'main-menu',text:'个人信息',href:'/employee/index.htm'},
                {id:'second-menu',text:'工资发放记录',href:'main/second-menu.html'},
                {id:'dyna-menu',text:'福利待遇',href:'main/dyna-menu.html'}
              ]
            },{
              text:'详细信息',
              items:[
                {id:'operation',text:'奖惩信息',href:'main/operation.html'},
                {id:'quick1',text:'考勤信息',href:'main/quick.html'} ,
                {id:'quick2',text:'培训信息',href:'main/quick.html'}  ,
                {id:'quick3',text:'数据统计',href:'main/quick.html'} 
              ]
            },{
              text:'其他',
              items:[
                {id:'resource',text:'企业文化',href:'main/resource.html'},
              ]
            }]
          },{
            id:'form',
            menu:[{
                text:'招聘管理',
                items:[
                  {id:'code',text:'编写招聘计划',href:'form/code.html'},
                  {id:'example',text:'招聘计划管理',href:'form/example.html'}
                ]
              },{
                text:'应聘管理',
                items:[
                  {id:'success',text:'应聘人员管理',href:'form/success.html'},
                  {id:'fail',text:'初始通过管理',href:'form/fail.html'},
                  {id:'fail',text:'面试通过管理',href:'form/fail.html'}
                ]
              }]
          },{
            id:'search',
            menu:[{
                text:'人事管理',
                items:[
                  {id:'code',text:'人员录入',href:'search/code.html'},
                  {id:'example',text:'人员信息管理',href:'search/example.html'},
                  {id:'example-dialog',text:'人事调动',href:'search/example-dialog.html'}
                ]
              },{
                text : '考勤管理',
                items : [
                  {id : 'tab1',text : '考勤记录',href : 'search/tab.html'},
                  {id : 'tab2',text : '奖惩信息管理',href : 'search/tab.html'},
                  {id : 'tab3',text : '使用tab过滤',href : 'search/tab.html'},
                  {id : 'tab4',text : '使用tab过滤',href : 'search/tab.html'}
                ]
              }]
          },{
            id:'myown',
            menu:[{
                text:'自己的页面',
                items:[
                  {id:'code',text:'搜索页面代码',href:'search/code.html'},
                  {id:'example',text:'搜索页面示例',href:'search/example.html'},
                  {id:'example-dialog',text:'搜索页面编辑示例',href:'search/example-dialog.html'},
                  {id:'introduce',text:'搜索页面简介',href:'search/introduce.html'}, 
                  {id:'config',text:'搜索配置',href:'search/config.html'}
                ]
              },{
                text : '更多示例',
                items : [
                  {id : 'tab',text : '使用tab过滤',href : 'search/tab.html'}
                ]
              }]
          },{
            id:'detail',
            menu:[{
                text:'详情页面',
                items:[
                  {id:'code',text:'详情页面代码',href:'detail/code.html'},
                  {id:'example',text:'详情页面示例',href:'detail/example.html'},
                  {id:'introduce',text:'详情页面简介',href:'detail/introduce.html'}
                ]
              }]
          },{
            id:'each',
            menu:[{
                text:'详情页面',
                items:[
                  {id:'code',text:'详情页面代码',href:'detail/code.html'},
                  {id:'example',text:'详情页面示例',href:'detail/example.html'},
                  {id:'introduce',text:'详情页面简介',href:'detail/introduce.html'}
                ]
              }]
          },{
            id:'somethong',
            menu:[{
                text:'详情页面',
                items:[
                  {id:'code',text:'详情页面代码',href:'detail/code.html'},
                  {id:'example',text:'详情页面示例',href:'detail/example.html'},
                  {id:'introduce',text:'详情页面简介',href:'detail/introduce.html'}
                ]
              }]
          },{
            id:'sum',
            menu:[{
                text:'基本管理',
                items:[
                  {id:'code',text:'人员帐号生成',href:'/jsp/admin/user/list.jsp'},
                  {id:'example',text:'角色权限的制定',href:'/admin/makerole.htm'},
                  {id:'introduce',text:'部门的制定',href:'detail/introduce.html'},
                  {id:'introduce',text:'岗位的制定',href:'detail/introduce.html'}
                ]
              },{
                text : '数据管理',
                items : [
                  {id : 'tab',text : '数据备份',href : 'search/tab.html'},
                  {id : 'tab',text : '数据还原',href : 'search/tab.html'}
                ]
              },{
                text : '其他管理',
                items : [
                  {id : 'tab',text : '系统日志',href : 'search/tab.html'},
                  {id : 'tab',text : '帮助文档',href : 'search/tab.html'}
                ]
              }]
          }];
      new PageUtil.MainPage({
        modulesConfig : config
      });
    });
  </script>
 </body>
</html>
