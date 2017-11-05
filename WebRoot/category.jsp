<%@page import="com.newer.pet.web.AppInfo"%>
<%@page import="com.newer.pet.domain.Category"%>

<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  
  </head>
  
  <body>
    <%
    	List<Category> list = (List<Category>)application.getAttribute(AppInfo.APP_CATEGORY_LIST);
    	for(Category c : list){
     %>
     <div>编号：<%=c.getCid() %>名称:<%=c.getCname() %></div>
     <%
     }
      %>
  </body>
</html>
