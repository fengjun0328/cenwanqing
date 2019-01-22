<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/17
  Time: 16:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JBOA—办公管理系统登录</title>
</head>
<body>
    <div>
        <form class="loginForm" action="${pageContext.request.contextPath }/index.html"  name="actionForm" id="actionForm"  method="post">
        <table>
            <tr>
                <td>
                    <input type="text" class="form-control" name="username" placeholder="登入名"/>
                </td>
            </tr>
            <tr>
                <td>
                    <input type="password" class="form-control" name="userpwd" placeholder="密码"/>
                </td>
            </tr>
            <tr>
                <td>
                        <input type="submit" value="登录"  >
                </td>
            </tr>
        </table>
        </form>
    </div>
</body>
</html>
