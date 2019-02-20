<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix ="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
    <title>JBOA办公</title>
</head>
<body>
<table border="1" align="center"  style="text-align: center;">
    <tr>
        <td rowspan="1" colspan="6">JBOA办公</td>
    </tr>
    <tr>
        <td colspan="6">
            <form action="${pageContext.request.contextPath }/dolo.html">
                <table>
                    <tr><td>
                        部门：<select name="bmId" id="bmId">
                        <option value="0">全部</option>
                        <c:forEach items="${departmentList}" var="d">
                        <option value="${d.id }">${d.name }</option>
                        </c:forEach>
                    </select>
                    </td></tr>
                    <tr><td>
                        岗位：<select name="gwId" id="gwId">
                        <option value="0">全部</option>
                        <c:forEach items="${positionList}" var="p">
                        <option value="${p.id }">${p.name_cn }</option>
                        </c:forEach>
                    </select>
                    </td></tr>
                </table>
             <input type="submit" value="查询">
            </form>
        </td>
        <td colspan="1">
            <form action="${pageContext.request.contextPath }/addNews.html">
                <input type="submit" value="添加" />
            </form>
            <form action="${pageContext.request.contextPath }/biz.html">
                <input type="submit" value="查看请假" />
            </form>
            <form action="${pageContext.request.contextPath }/caiwu.html">
                <input type="submit" value="财务信息" />
            </form>
        </td>
    </tr>


    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>密码</td>
        <td>岗位</td>
        <td>部门</td>
        <td>在职情况</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${userlist }" var="user" varStatus="vs">
        <tr>
            <td>${user.id}</td>
            <td>${user.username}</td>
            <td>${user.userpwd}</td>
            <td>${user.gw_id}</td>
            <td>${user.bm_id}</td>
            <td>${user.status}</td>
            <td>
                <a href="${pageContext.request.contextPath }/userupd.html?id=${user.id}">修改</a>
                <a href="${pageContext.request.contextPath }/del.html?id=${user.id}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
