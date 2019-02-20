<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>请假</title>


</head>

<body>

	<form action="${pageContext.request.contextPath }/bizadd.html"
		method="post">

		<div>
			<table border="1" cellpadding="0" cellspacing="0" align="center">
				<tr>
					<td><h1>新请假条</h1> <br /></td>
				</tr>
				<tr>
					<td>岗位：<select name="gw_id">
						<option value="1">请选择</option>
						<option value="1">员工</option>
						<option value="2">部门经理</option>
						<option value="3">总经理</option>
						<option value="4">财务</option>
					</select>

					</td>
				</tr>
				<tr>
					<td>部门：<select name="bm_id">
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
					<td>请假条：<input type="text" name="qingjia" />
					</td>
				</tr>
				<tr>
					<td>理由：<input type="text" name="liyou" />
					</td>
				</tr>
				<tr>
					<td>是否通过：<select name="sfty">
						<option value="待审核">请选择</option>
						<option value="同意">同意</option>
						<option value="拒绝">拒绝</option>
						<option value="待审核">待审核</option>
					</select>
					</td>
				</tr>
				<tr>
					<td><input type="submit" value="添加" /> <a href="biz.html">返回</a>
					</td>
				</tr>
			</table>
		</div>

	</form>

</body>
</html>
