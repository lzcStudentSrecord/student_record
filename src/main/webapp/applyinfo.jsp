<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>教室申请模板</title>
<link href="../resources/form-3/assets/css/fresh-bootstrap-table.css"
	rel="stylesheet" />
<link rel="stylesheet"
	href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
<link rel="stylesheet"
	href="../resources/form-3/assets/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet"
	href="../resources/form-3/assets/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet"
	href="../resources/form-3/assets/css/form-elements.css">
<link rel="stylesheet" href="../resources/form-3/assets/css/style1.css">
<link rel="shortcut icon" href="../resources/form-3/assets/ico/favicon.png">
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="../resources/form-3/assets/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="../resources/form-3/assets/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="../resources/form-3/assets/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="../resources/form-3/assets/ico/apple-touch-icon-57-precomposed.png">
<link rel="stylesheet" href="../resources/form-3/css/pretty.min.css">
<link rel="stylesheet" href="../resources/css/timedropper.css">
<style>
* {
	margin: 0;
	padding: 0;
}

font {
	color: #000;
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
	height: 1000px;
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

.bootstrap-frm1 {
	margin-left: auto;
	margin-right: auto;
	height: 50%;
	width: 30%;
	background: #FFF;
	padding: 20px 30px 20px 30px;
	font: 20px "Helvetica Neue", Helvetica, Arial, sans-serif;
	color: #888;
	text-shadow: 1px 1px 1px #FFF;
	border: 3px solid #D2D2D2;
	border-radius: 10px;
	-webkit-border-radius: 8px;
	-moz-border-radius: 8px;
}

.bootstrap-frm2 {
	margin: 0 auto;
	margin-top: 20px;
	height: 50px;
	width: 120px;
	background: #FFF;
	text-align: center;
	font: 18px "Helvetica Neue", Helvetica, Arial, sans-serif;
	color: #888;
	text-shadow: 1px 1px 1px #FFF;
	border: 1px solid #DDD;
	border-radius: 10px;
	-webkit-border-radius: 8px;
	-moz-border-radius: 8px;
}
</style>
</head>

<body
	background="../resources/form-3/assets/img/backgrounds/eb9f850a19d8bc3ee720ff63828ba61ea8d34509.jpg">
	<nav class="navbar-inverse visible-lg visible-md" role="navigation">
	</nav>
	<input type='checkbox' id='sideToggle'>
	<div id='wrap'>
		<label id='sideMenuControl' for='sideToggle'>=</label>
	</div>

	<div>
		<h1>教室申请</h1>
	</div>
	<div
		style="width: 60%; height: 100%; border: 3px solid #d1d1d1; border-radius: 20px; background: #fff; margin: 0 auto; padding: 20px; opacity: 0.66">
		<div>
			<h3 style="text-align: left; margin-left: 25%; color: #000;">
				<strong>申请事由</strong><input name="reason" id="reason"
					value="${applyinfo.reason }"
					style="height: 40px; border: 1px solid #d1d1d1; border-radius: 20px; margin-left: 20px; margin-top: 10px;"
					type="text" readonly="readonly">
			</h3>
			<br>
			<h3 style="text-align: left; margin-left: 25%; color: #000;">
				<strong>申请教室</strong><input name="reason" id="reason"
					value="${applyinfo.craddress }"
					style="height: 40px; border: 1px solid #d1d1d1; border-radius: 20px; margin-left: 20px; margin-top: 10px;"
					type="text" readonly="readonly">
			</h3>
			<br>
			<h3 style="text-align: left; margin-left: 25%; color: #000;">
				<strong>使用日期</strong><input name="startdate" id="startdate"
					value="${applyinfo.startTime }"
					style="height: 40px; border: 1px solid #d1d1d1; border-radius: 20px; margin-left: 20px; margin-top: 10px;"
					type="text">
			</h3>
			<br>
			<h3 style="text-align: left; margin-left: 25%; color: #000;">
				<strong>归还日期</strong><input name="enddate" id="enddate"
					value="${applyinfo.endTime }"
					style="height: 40px; border: 1px solid #d1d1d1; border-radius: 20px; margin-left: 20px; margin-top: 10px;"
					type="text">
			 </h3>
			<br>
		</div>
	</div>
</body>
<script type="text/javascript"
	src="../resources/form-3/assets/js/jquery-1.11.2.min.js"></script>
<script type="text/javascript"
	src="../resources/form-3/assets/js/bootstrap.js"></script>
<script type="text/javascript"
	src="../resources/form-3/assets/js/bootstrap-table.js"></script>
<script type="text/javascript"
	src="../resources/form-3/assets/js/jquery-1.11.2.min.js"></script>
<script type="text/javascript"
	src="../resources/form-3/assets/js/bootstrap.js"></script>
<script type="text/javascript"
	src="../resources/form-3/assets/js/bootstrap-table.js"></script>
<script type="text/javascript" src="../resources/js/timedropper.js"></script>
<script type="text/javascript" src="../resources/js/mydate.js"></script>
<script type="text/javascript"
	src="../resources/controller/student_applyclassroom_controller.js"></script>
</html>
</html>
