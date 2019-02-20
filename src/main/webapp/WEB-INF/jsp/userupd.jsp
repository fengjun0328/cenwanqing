<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>修改员工</title>


</head>

<body>

	<form action="${pageContext.request.contextPath }/userupd.html"
		method="post">

		<div>
			<table border="1" cellpadding="0" cellspacing="0" align="center">
				<tr>
					<td><h1>修改员工信息</h1> <br /></td>
				</tr>
				<tr>
					<td>岗位：<select name="${gw_id}">
						<option value="1">请选择</option>
						<option value="1">员工</option>
						<option value="2">部门经理</option>
						<option value="3">总经理</option>
						<option value="4">财务</option>
					</select>

					</td>
				</tr>
				<tr>
					<td>部门：<select name="${bm_id}">
						<option value="1">请选择</option>
						<option value="1">人事部</option>
						<option value="2">平台研发部</option>
						<option value="3">产品设计部</option>
						<option value="4">财务部</option>
						<option value="5">总裁办公室</option>
					</select>

					</td>
				</tr>
				<tr>
					<td>姓名：<input type="text" name="${username}" />
					</td>
				</tr>
				<tr>
					<td>密码：<input type="text" name="${userpwd}" />
					</td>
				</tr>
				<tr>
					<td>在职情况：岗位：<select name="${status}">
							<option value="在职">请选择</option>
							<option value="在职">在职</option>
							<option value="离职">离职</option>
					</select>
					</td>
				</tr>
				<tr>
					<td><input type="submit" value="提交" /> <a href="dolo.html">返回</a>
					</td>
				</tr>
			</table>
		</div>

	</form>

</body>
</html>
