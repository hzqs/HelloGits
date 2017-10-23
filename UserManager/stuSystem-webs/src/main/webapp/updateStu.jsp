<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
</head>
<body>

<h2>修改学生</h2>


<s:if test="#parameters.res[0]==1">
			<p style="color:green">修改学生成功!</p>
		</s:if>
		<s:elseif test="#parameters.res[0]==2">
			<p style="color:red">修改学生失败!</p>
		</s:elseif>


<s:form method="post" action="stuAction_updateStu" >
	 <s:hidden name="stu.sno"/>
	学生姓名:<s:textfield name="stu.sname"/><br/>
	学生年龄:<s:textfield name="stu.sage"/><br/>
	学生性别:<s:radio list="{'男','女'}" name="stu.ssex" /><br/>
	学生爱好:<s:checkboxlist name="stu.shobby" list="{'体育','娱乐','学习'}"/><br/>
	入学时间:<s:textfield name="stu.sintime"/><br/>
	选择班级:<select name="stu.cls.cno">
				<option value="">请选择班级</option>
			 </select><br/>
			 <s:submit value="修改学生"/>
	</s:form>
	<a href="${pageContext.request.contextPath}/index.jsp">主页</a>
</body>
</html>
<script type="text/javascript">
	$(function(){
		//取出所有可选的班级
		$(":input[name='stu.cls.cno'] option:not(:first)").remove();
		$.post("stuAction_findTbClassList","",function(data){
			$.each(data.clsList,function(i,v){
				var option="<option value='"+v.cno+"'>"+v.cname+"</option>";
				$(":input[name='stu.cls.cno']").append(option);
			});
		},"json");
	});
	
	var hobby="${stu.shobby}"
	var hobbys=$(":checkbox");
	for(var i=0;i<hobbys.length;i++){
		if(hobby.indexOf(hobbys[i].value)>0)
		hobbys[i].checked=true;
	}

	</script>
</script>
