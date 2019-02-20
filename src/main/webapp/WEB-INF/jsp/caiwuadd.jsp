<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>财务2</title>


</head>

<body>

	<form action="${pageContext.request.contextPath }/caiwuadd.html"
		method="post">

		<div>
			<table border="1" cellpadding="0" cellspacing="0" align="center">
				<tr>
					<td><h1>新增财务信息</h1> <br /></td>
				</tr>
				<tr>
					<td>姓名：<select name="xm_id">
						<option value="1">请选择</option>
						<option value="1">admin</option>
						<option value="2">liyihao</option>
						<option value="3">bdqn</option>
						<option value="4">李小伟</option>
						<option value="5">张平</option>
						<option value="6">叶宁</option>
						<option value="7">李伟</option>
						<option value="8">王小明</option>
						<option value="9">林风</option>
					</select>
					</td>
				</tr>
				<tr>
					<td>任务：<input type="text" name="rw" />
					</td>
				</tr>
				<tr>
					<td>打款：<input type="text" name="goqian" />
					</td>
				</tr>
				<tr>
					<td>进度：<select name="jindu">
						<option value="进行中">请选择</option>
						<option value="已终止">已终止</option>
						<option value="进行中">进行中</option>
					</select>
					</td>
				</tr>
				<tr>
					<td><input type="submit" value="添加" /> <a href="caiwu.html">返回</a>
					</td>
				</tr>
			</table>
		</div>

	</form>

</body>
</html>
