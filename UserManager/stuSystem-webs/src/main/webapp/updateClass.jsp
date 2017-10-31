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

	<h2>修改班级</h2>


<s:if test="#parameters.res[0]==1">
			<p style="color:green">修改班级成功!</p>
		</s:if>
		<s:elseif test="#parameters.res[0]==2">
			<p style="color:red">修改班级失败!</p>
		</s:elseif>
		
	<s:form method="post" action="clsAction_updateClass">
     <s:hidden name="cls.cno" />
    班级名:<s:textfield name="cls.cname" />
		<s:submit value="修改" />
	</s:form>


</body>
</html>