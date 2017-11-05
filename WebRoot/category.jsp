<%@page import="com.newer.pet.web.AppInfo"%>
<%@page import="com.newer.pet.domain.Category"%>
<%@page import="com.newer.pet.domain.Product"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

</head>

<body>
	<%--     <%
    	List<Category> list = (List<Category>)application.getAttribute(AppInfo.APP_CATEGORY_LIST);
    	for(Category c : list){
     %>
     <div>编号：<%=c.getCid() %>名称:<%=c.getCname() %></div>
     <%
     }
      %> --%>
	<table>
		<tr>
			<th>编号</th>
			<th>名称</th>
			<th>价格</th>
			<th>库存</th>
			<th>销量</th>
			<th>描述</th>
			<th>图片路径</th>
		</tr>
		<c:forEach items="${products}" var="p">
			<tr>
				<td>${p.pid}</td>
				<td>${p.pname}</td>
				<td>${p.price}</td>
				<td>${p.pquantity}</td>
				<td>${p.psales}</td>
				<td>${p.pdescription}</td>
				<td><img alt="无法显示该图片" src="images/${p.pic}" height="100px" width="100px"></td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>
