<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/20
  Time: 9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>test</title>
</head>
<body>
<c:forEach items="${productCategory}" var="items">
    ${items.cid}
    ${items.cname}
    <a href="/products/pCategory.action?cid=${items.cid}">productsCategory</a>
</c:forEach>
<c:forEach items="${pVo}" var="items">
    ${items.pid}
    ${items.pname}
</c:forEach>
</body>
</html>
