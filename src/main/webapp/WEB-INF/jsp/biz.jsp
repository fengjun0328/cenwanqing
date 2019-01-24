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
        <td rowspan="1" colspan="10">JBOA办公</td>
    </tr>
    <tr>
        <td colspan="9">
            <form action="${pageContext.request.contextPath }/biz.html">
                <table align="center">
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
                    <tr><td>
                        编号：<select name="xmId" id="xmId">
                        <option value="0">全部</option>
                        <c:forEach items="${userlist}" var="u">
                        <option value="${u.id }">${u.username }</option>
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
        </td>
    </tr>


    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>请假时间</td>
        <td>请假到期</td>
        <td>部门</td>
        <td>岗位</td>
        <td>请假条</td>
        <td>理由</td>
        <td>是否同意</td>
        <td>批假时间</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${bizLeaves }" var="b" varStatus="vs">
        <tr>
            <td>${b.id}</td>
            <td>${b.xm_id}</td>
            <td><fmt:formatDate value="${b.starttime}"
                                pattern="yyyy-MM-dd" /></td>
            <td><fmt:formatDate value="${b.endtime}"
                                pattern="yyyy-MM-dd" /></td>
            <td>${b.bm_id}</td>
            <td>${b.gw_id}</td>
            <td>${b.qingjia}</td>
            <td>${b.liyou}</td>
            <td>${b.sfty}</td>
            <td><fmt:formatDate value="${b.pjshijian}"
                                pattern="yyyy-MM-dd" /></td>
            <td>
                <a href="${pageContext.request.contextPath }/delbiz.html?id=${b.id}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
