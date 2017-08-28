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
        <li class="nav-item"><div class="nav-item-inner nav-order">培训管理</div></li>
        <li class="nav-item"><div class="nav-item-inner nav-supplier">薪酬福利</div></li>
		<li class="nav-item"><div class="nav-item-inner nav-supplier">企业文化</div></li>
		<li class="nav-item"><div class="nav-item-inner nav-inventory">审批流程</div></li>
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
                {id:'main-menu',text:'个人信息',href:'/member/list.htm'},
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
                {id:'resource',text:'其他',href:'main/resource.html'},
              ]
            }]
          },{
            id:'form',
            menu:[{
                text:'招聘管理',
                items:[
                  {id:'code',text:'编写招聘计划',href:'/require/person/list.htm'}
                ]
              },{
                text:'应聘管理',
                items:[
                  {id:'success',text:'应聘人员管理',href:'/apply/apply/list.htm'}
                ]
              }]
          },{
            id:'search',
            menu:[{
                text:'人事管理',
                items:[
                  {id:'code',text:'人员录入',href:'/employee/person/list.htm'},
                  {id:'example',text:'人员信息管理',href:'/employee/personinfo/list.htm'},
                  {id:'example-dialog',text:'人事调动',href:'/change/person/list.htm'}
                ]
              },{
                text:'招聘人员',
                items:[
                  {id:'code',text:'待录入',href:'/employee/apply/list.htm'}
              
                ]
              }
              ,{
                text : '考勤管理',
                items : [
                  {id : 'tab1',text : '考勤记录',href : 'search/tab.html'}
                ]
              }]
          },{
            id:'myown',
            menu:[{
                text:'培训管理',
                items:[
                  {id:'code',text:'培训计划',href:'/plan/plan/list.htm'}
                ]
              },{
                text : '其他',
                items : [
                  {id : 'tab',text : '其他',href : 'search/tab.html'}
                ]
              }]
          },{
            id:'each',
            menu:[{
                text:'薪酬福利',
                items:[
                  {id:'code',text:'基本工资管理',href:'detail/code.html'},
                  {id:'example',text:'奖惩管理',href:'detail/example.html'},
                  {id:'introduce',text:'待遇福利',href:'detail/introduce.html'}
                ]
              }]
          },{
            id:'somethong',
            menu:[{
                text:'企业文化',
                items:[
                  {id:'code',text:'公告栏目',href:'detail/code.html'},
                  {id:'example',text:'前台文化模块',href:'detail/example.html'}
                ]
              }]
          },{
            id:'somethong2',
            menu:[{
                text:'计划审批',
                items:[
                  {id:'code',text:'招聘计划方案',href:'/header/person/list.htm'},
                  {id:'example',text:'其他',href:'detail/example.html'}
                ]
              }]
          },{
            id:'sum',
            menu:[{
                text:'基本管理',
                items:[
                  {id:'code',text:'人员帐号管理',href:'/admin/user/list.htm'},
                  {id:'example',text:'角色权限的制定',href:'/admin/role/list.htm'},
                  {id:'introduce',text:'部门的制定',href:'/admin/department/list.htm'},
                  {id:'introduce',text:'岗位的制定',href:'/admin/position/list.htm'}
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
