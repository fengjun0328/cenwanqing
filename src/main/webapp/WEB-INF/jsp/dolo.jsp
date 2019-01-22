<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/17
  Time: 17:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix ="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
${customername}
${sessionScope.customername}
<%=request.getSession().getAttribute("username") %>
</body>
</html>
