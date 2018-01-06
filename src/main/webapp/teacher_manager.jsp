<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>详细信息</title>
<!-- CSS -->

<link href="resources/form-3/assets/css/fresh-bootstrap-table.css"
	rel="stylesheet" />
<link rel="stylesheet"
	href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
<link rel="stylesheet"
	href="resources/form-3/assets/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet"
	href="resources/form-3/assets/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet"
	href="resources/form-3/assets/css/form-elements.css">
<link rel="stylesheet" href="resources/form-3/assets/css/style1.css">
<link rel="shortcut icon" href="resources/form-3/assets/ico/favicon.png">
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="resources/form-3/assets/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="resources/form-3/assets/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="resources/form-3/assets/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="resources/form-3/assets/ico/apple-touch-icon-57-precomposed.png">
<style>
* {
	margin: 0;
	padding: 0;
}

html {
	height: 100%;
}

body {
	min-height: 100%;
	font-family: arial;
	position: relative;
	background-position: center;
	background-attachment: fixed;
	background-size: cover;
}

body.sideMenu {
	margin: 0;
	-webkit-transform: none;
	transform: none;
}

font {
	vertical-align: bottom;
}

#sideToggle {
	display: none;
}

#sideToggle:checked+aside {
	left: 0;
}

#sideToggle:checked ~ #wrap {
	padding-left: 220px;
}

body>aside {
	position: absolute;
	top: 0;
	bottom: 0;
	left: -200px;
	width: 200px;
	background: #de615e;
	transition: 0.2s ease-out;
	-webkit-transition: 0.2s ease-out;
}

body>aside>h2 {
	color: #FFF;
	text-align: center;
	font-weight: normal;
	padding: 10px;
}

#wrap {
	margin-left: 20px;
	padding: 10px;
	transition: 0.25s ease-out;
	-webkit-transition: 0.25s ease-out;
}

#wrap>label {
	display: inline-block;
}

#wrap>label {
	background: #de615e;
	border-radius: 50px;
	color: #FFF;
	cursor: pointer;
	display: block;
	font-family: Courier New;
	font-size: 25px;
	font-weight: bold;
	width: 30px;
	height: 30px;
	line-height: 35px;
	text-align: center;
	text-shadow: 0 -4px;
	margin-top: 0px;
}

#wrap>label:hover {
	background: #000;
}

#lia {
	font-size: 18px;
}

a:link, a:visited {
	text-decoration: none;
}

li {
	margin-top: 20px;
	margin-bottom: 20px;
}

#info {
	margin-top: 50px;
	margin-right: 200px;
	margin-bottom: 100px;
	padding-top: 45px;
	padding-left: 50px;
	width: 1200px;
	height: 1700px;
	background: #FFFFFF;
	border-radius: 20px;
}

#infoin {
	width: 1100px;
	height: 1600px;
	border-radius: 40px;
	border: 3px solid #de615e;
	background: #FFFFFF;
}

p {
	font-size: 8px;
	margin-left: 20px;
	margin-top: 20px;
}
</style>
<c:if test="${empty teacher }">
	<script type="text/javascript">
		alert("请先登录");
		location = "index.jsp";
	</script>
</c:if>
</head>

<body
	background="resources/form-3/assets/img/backgrounds/eb9f850a19d8bc3ee720ff63828ba61ea8d34509.jpg">
	<nav class="navbar-inverse visible-lg visible-md" role="navigation">
	</nav>
	<input type='checkbox' id='sideToggle'>
	<aside>
		<h2 style="margin-top: 40px">导航栏</h2>
		<ul id="lia" style="margin-top: 120px">
			<hr>
			<li style="text-align: center"><a style="color: aliceblue"
				href="#">添加学生信息</a></li>
			<hr>
			<li style="text-align: center"><a style="color: aliceblue"
				href="#">学生学分情况添加</a></li>
			<hr>
			<li style="text-align: center"><a style="color: aliceblue"
				href="#">奖惩情况（Excel导入）</a></li>
			<hr>
			<li style="text-align: center"><a style="color: aliceblue"
				href="#">专业证书添加（Excel导入）</a></li>
			<hr>
			<li style="text-align: center"><a style="color: aliceblue"
				href="#">职业资格证书添加</a></li>
			<hr>
			<li style="text-align: center"><a style="color: aliceblue"
				href="#">教材费确认</a></li>
			<hr>
			<li style="text-align: center"><a style="color: aliceblue"
				href="#">教材费结算信息添加</a></li>
			<hr>
			<li style="text-align: center"><a style="color: aliceblue"
				href="#">发布公告</a></li>
			<hr>
			<li style="text-align: center"><a style="color: aliceblue"
				href="#">教室使用</a></li>
			<hr>
		</ul>
	</aside>
	<div id='wrap'>
		<label id='sideMenuControl' for='sideToggle'>=</label>
	</div>
	<div>
		<h1>详细信息</h1>
		<div class="wrapper">
			<div class="container">
				<div id="info">
					<div id="infoin">
						<!--专业、年级、班级、学号、姓名、家庭住址-->
						<p>*学生无法更改！</p>
						专业: <input style="vertical-align: bottom" type="text" value="专业"
							readonly> 年级: <input type="text" value="年级" readonly>
						<br> 班级: <input type="text" value="班级" readonly> 学号:
						<input type="text" value="学号" readonly> <br> 姓名: <input
							type="text" value="姓名" readonly> 家庭住址: <input type="text"
							value="家庭住址" readonly>
						<!--联系方式、家长姓名、家长联系方式、学生任职情况-->
						<hr color="#CC8F90">
						<br> 联系方式: <input type="text" value="联系方式" readonly>
						家长姓名: <input type="text" value="家长姓名" readonly> <br>
						家长联系方式: <input type="text" value="家长联系方式" readonly>
						学生任职情况: <input type="text" value="学生任职情况" readonly>
						<hr>
						<br>
						<!--必修、选修、公选课、加分情况-->
						必修: <input type="text" value="必修" readonly> 选修: <input
							type="text" value="选修" readonly> <br> 公选课: <input
							type="text" value="公选课" readonly> 加分情况: <input
							type="text" value="加分情况" readonly>
						<hr>
						<br>
						<!--1.奖学金：获得时间、奖项名称
			  2.评优奖励：时间、名称
  			  3.通报批评：学号、时间/学期、原因、通报类型、处分
-->
						<h3>奖学金</h3>
						获得时间: <input type="text" value="2017-0101" readonly> 奖项名称:
						<input type="text" value="吃屎" readonly>
						<h3>评优奖励</h3>
						获得时间: <input type="text" value="2017-0101" readonly> 奖项名称:
						<input type="text" value="吃屎" readonly>
						<h3>通报批评</h3>
						学号: <input type="text" value="2017-0101" readonly> 时间/学期:
						<input type="text" value="吃屎" readonly> <br> 原因： <input
							type="text" value="吃屎" readonly> 通报类型： <input type="text"
							value="吃屎" readonly> <br> 处分： <input type="text"
							value="吃屎" readonly>
						<hr>
						<br>
						<h3>证书取得情况</h3>
						<!--1.计算机类（文化基础、等级考试）：类别、通过时间、通过成绩
				2.英语类（高职高专英语、CET）：类别、通过时间、通过成绩
				3.普通话证书：通过时间、等级
				4.职业资格证书：类别、通过时间、发证机关（此项学生可自行录入，交由负责教师确认操作）
-->
						<h5>计算机类（文化基础、等级考试）</h5>
						类别： <input type="text" value="吃屎" readonly> 通过时间： <input
							type="text" value="吃屎" readonly> 通过成绩： <input type="text"
							value="吃屎" readonly>
						<h5>英语类（高职高专英语、CET）</h5>
						类别： <input type="text" value="吃屎" readonly> 通过时间： <input
							type="text" value="吃屎" readonly> 通过成绩： <input type="text"
							value="吃屎" readonly>
						<h5>普通话证书</h5>
						通过时间： <input type="text" value="吃屎" readonly> 通过成绩： <input
							type="text" value="吃屎" readonly>
						<h5>职业资格证书</h5>
						类别： <input type="text" value="吃屎" readonly> 通过时间： <input
							type="text" value="吃屎" readonly> 发证机关： <input type="text"
							value="吃屎" readonly>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript"
	src="resources/form-3/assets/js/jquery-1.11.2.min.js"></script>
<script type="text/javascript"
	src="resources/form-3/assets/js/bootstrap.js"></script>
<script type="text/javascript"
	src="resources/form-3/assets/js/bootstrap-table.js"></script>
</html>
