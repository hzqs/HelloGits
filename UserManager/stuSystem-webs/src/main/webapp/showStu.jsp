<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>学生信息列表</h2>


<s:if test="#parameters.res[0]==1">
			<p style="color:green">删除学生成功!</p>
		</s:if>
		<s:elseif test="#parameters.res[0]==2">
			<p style="color:red">删除学生失败!</p>
		</s:elseif>

  
  
	<table border="1" width="700">
	<tr>
	<td>编号</td><td>班级名称</td>
	<td>学生姓名</td>
	<td>年龄</td><td>性别</td>
	<td>爱好</td><td>入学时间</td>
	<td align="center">功能</td>
	</tr>
	<s:iterator value="#request.stulist" var="st" status="ids">
	<tr>
	<td>${ids.count }</td><td>${st.cls.cname}</td>
	<td>${st.sname}</td>
	<td>${st.sage}</td><td>${st.ssex}</td>
	<td>${st.shobby}</td>
	<td>${st.sintime}</td>
	<td>
	<a href="stuAction_toupdateStu?stu.sno=${st.sno}">修改</a>|<a href="stuAction_deleteStu?stu.sno=${st.sno}">删除</a>
	</td>
	</tr>
	</s:iterator>
	</table>
	<a href="${pageContext.request.contextPath}/index.jsp">主页</a>



</body>
</html>