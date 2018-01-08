<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<c:if test="${empty ret }">
	<script type="text/javascript">
		location = "index.jsp";
	</script>
</c:if>
<c:choose>
	<c:when test="${ret eq 1 }">
		<script type="text/javascript">
			alert("用户名不存在");
			<c:if test="${!empty sessionScope.teacher}">
			location = "../student_login.jsp";
			</c:if>
			<c:if test="${!empty sessionScope.student}">
			location="../teacher_login.jsp";
			</c:if>
		</script>
	</c:when>
	<c:when test="${ret eq 2 }">
		<script type="text/javascript">
			alert("密码错误");
			<c:if test="${!empty sessionScope.teacher}">
			location="../student_login.jsp";
			</c:if>
			<c:if test="${!empty sessionScope.student}">
			location="../teacher_login.jsp";
			</c:if>
		</script>
	</c:when>
	<c:when test="${ret eq 3 }">
		<script type="text/javascript">
			alert("登陆成功");
			<c:if test="${!empty sessionScope.teacher}">
			location = "../teacher_applyclassroom.jsp";
			</c:if>
			<c:if test="${!empty sessionScope.student}">
			location = "../student_infoupdate.jsp";
			</c:if>
		</script>
	</c:when>
	<c:when test="${ret eq 4 }">
		<script type="text/javascript">
			alert("修改成功");
			<c:if test="${!empty teacher}">
			location = "../Student/selectAllByTno";
			</c:if>
			<c:if test="${!empty sessionScope.student}">
			location = "../student_infoupdate.jsp";
			</c:if>
		</script>
	</c:when>
	<c:when test="${ret eq 5 }">
		<script type="text/javascript">
			alert("修改失败");
			<c:if test="${!empty sessionScope.teacher}">
			location = "../Student/selectAllByTno";
			</c:if>
			<c:if test="${!empty sessionScope.student}">
			location = "../student_infoupdate.jsp";
			</c:if>
		</script>
	</c:when>
	<c:when test="${ret eq 6 }">
		<script type="text/javascript">
			alert("添加成功");
			<c:if test="${!empty sessionScope.teacher}">
			location = "../Student/selectAllByTno";
			</c:if>
			<c:if test="${!empty sessionScope.student}">
			location = "../student_infoupdate.jsp";
			</c:if>
		</script>
	</c:when>
	<c:when test="${ret eq 7 }">
		<script type="text/javascript">
			alert("添加失败");
			<c:if test="${!empty sessionScope.teacher}">
			location = "../Student/selectAllByTno";
			</c:if>
			<c:if test="${!empty sessionScope.student}">
			location = "../student_infoupdate.jsp";
			</c:if>
		</script>
	</c:when>
	<c:when test="${ret eq 7 }">
		<script type="text/javascript">
			alert("申请成功");
			<c:if test="${!empty sessionScope.teacher}">
			location = "../Student/selectAllByTno";
			</c:if>
			<c:if test="${!empty sessionScope.student}">
			location = "../student_infoupdate.jsp";
			</c:if>
		</script>
	</c:when>
	<c:when test="${ret eq 8 }">
		<script type="text/javascript">
			alert("申请失败");
			<c:if test="${!empty sessionScope.teacher}">
			location = "../Student/selectAllByTno";
			</c:if>
			<c:if test="${!empty sessionScope.student}">
			location = "../student_infoupdate.jsp";
			</c:if>
		</script>
	</c:when>
	<c:when test="${ret eq 9 }">
		<script type="text/javascript">
			alert("确认成功");
			<c:if test="${!empty sessionScope.teacher}">
			location = "../Student/selectAllByTno";
			</c:if>
			<c:if test="${!empty sessionScope.student}">
			location = "../student_infoupdate.jsp";
			</c:if>
		</script>
	</c:when>
	<c:when test="${ret eq 11 }">
		<script type="text/javascript">
			alert("确认失败");
			<c:if test="${!empty sessionScope.teacher}">
			location = "../Student/selectAllByTno";
			</c:if>
			<c:if test="${!empty sessionScope.student}">
			location = "../student_infoupdate.jsp";
			</c:if>
		</script>
	</c:when>
	<c:when test="${ret eq 12 }">
		<script type="text/javascript">
			alert("删除成功");
			<c:if test="${!empty sessionScope.teacher}">
			location = "../Student/selectAllByTno";
			</c:if>
			<c:if test="${!empty sessionScope.student}">
			location = "../student_infoupdate.jsp";
			</c:if>
		</script>
	</c:when>
	<c:when test="${ret eq 13 }">
		<script type="text/javascript">
			alert("删除失败");
			<c:if test="${!empty sessionScope.teacher}">
			location = "../Student/selectAllByTno";
			</c:if>
			<c:if test="${!empty sessionScope.student}">
			location = "../student_infoupdate.jsp";
			</c:if>
		</script>
	</c:when>
	<c:when test="${ret eq 14 }">
		<script type="text/javascript">
			alert("只能上传xls类型的文件");
			<c:if test="${!empty sessionScope.teacher}">
			location = "../Student/selectAllByTno";
			</c:if>
			<c:if test="${!empty sessionScope.student}">
			location = "../student_infoupdate.jsp";
			</c:if>
		</script>
	</c:when>
	<c:when test="${ret eq 15 }">
		<script type="text/javascript">
			alert("${result}");
			<c:if test="${!empty sessionScope.teacher}">
			location = "../Student/selectAllByTno";
			</c:if>
			<c:if test="${!empty sessionScope.student}">
			location = "../student_infoupdate.jsp";
			</c:if>
		</script>
	</c:when>
	<c:when test="${ret eq 16 }">
		<script type="text/javascript">
			alert("提问成功");
			location="../Student/adjustList?curpage=1";
		</script>
	</c:when>
	<c:when test="${ret eq 17 }">
		<script type="text/javascript">
		alert("提问失败");
		location="../Student/adjustList?curpage=1";
		</script>
	</c:when>
	<c:when test="${ret eq 18 }">
		<script type="text/javascript">
		alert("回答成功");
		location="../Student/adjustList?curpage=1";
		</script>
	</c:when>
	<c:when test="${ret eq 19 }">
		<script type="text/javascript?curpage=1">
		alert("回答失败");
		location="../Student/adjustList";
		</script>
	</c:when>
	<c:when test="${ret eq -1 }">
		<script type="text/javascript">
			alert("请通过正确的方式访问");
			<c:if test="${!empty sessionScope.teacher}">
			location = "../Student/selectAllByTno";
			</c:if>
			<c:if test="${!empty sessionScope.student}">
			location = "../student_infoupdate.jsp";
			</c:if>
		</script>
	</c:when>
	<c:otherwise>
		<script type="text/javascript">
			alert("服务器错误");
			<c:if test="${!empty sessionScope.teacher}">
			location = "../Student/selectAllByTno";
			</c:if>
			<c:if test="${!empty sessionScope.student}">
			location = "../student_infoupdate.jsp";
			</c:if>
		</script>
	</c:otherwise>
</c:choose>
</head>
<body>
</body>
</html>