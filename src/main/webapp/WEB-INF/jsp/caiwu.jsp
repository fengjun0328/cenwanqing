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
        <%--<td colspan="9">
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
        </td>--%>
        <td colspan="10">
            <form action="${pageContext.request.contextPath }/caiwuadd.html">
                <input type="submit" value="添加" />
            </form>
            <form action="${pageContext.request.contextPath }/dolo.html">
            <input type="submit" value="用户列表" />
        </form>
            <form action="${pageContext.request.contextPath }/biz.html">
                <input type="submit" value="请假列表" />
            </form>
        </td>
    </tr>


    <tr>
        <td>编号</td>
        <td>姓名ID</td>
        <td>申请时间</td>
        <td>任务</td>
        <td>打款</td>
        <td>进度</td>
        <td>结束时间</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${financials }" var="f" varStatus="vs">
        <tr>
            <td>${f.id}</td>
            <td>${f.xm_id}</td>
            <td><fmt:formatDate value="${f.check_time}" pattern="yyyy-MM-dd" /></td>
            <td>${f.rw}</td>
            <td>${f.goqian}</td>
            <td>${f.jindu}</td>
            <td><fmt:formatDate value="${f.modify_time}" pattern="yyyy-MM-dd" /></td>
            <td>
                <a href="${pageContext.request.contextPath }/delcaiwu.html?id=${f.id}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
