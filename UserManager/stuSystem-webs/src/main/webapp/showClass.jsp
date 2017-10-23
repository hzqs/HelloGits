<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
</head>
<body>

	<h2>班级信息列表</h2>
	
<s:if test="#parameters.res[0]==1">
			<p style="color:green">删除班级成功!</p>
		</s:if>
		<s:elseif test="#parameters.res[0]==2">
			<p style="color:red">删除班级失败!</p>
		</s:elseif>

	<table id="mytab" border="1">
		<tr>
			<td>编号</td>
			<td>班级名称</td>
			<td align="center">功能</td>
		</tr>

	</table>
<a href="${pageContext.request.contextPath}/index.jsp">主页</a>


</body>
</html>


<script type="text/javascript">
	$(function() {
		//取出所有的班级
		$.get("stuAction_findTbClassList", "", function(data) {
			$.each(data.clsList, function(i, v) {
				var tr ="<tr>";
				    tr+="<td>"+(i+1)+"</td>";
				    tr+="<td>"+v.cname+"</td>"
				    tr+="<td><a href='clsAction_toUpdate?cls.cno="+v.cno+"'>修改</a>|<a href='clsAction_deleteClass?cls.cno="+v.cno+"'>删除</a></td>"
				    tr+="</tr>";
				    $("#mytab").append(tr);
			});
		}, "json");
	});

	
</script>