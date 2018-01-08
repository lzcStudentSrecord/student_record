<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>后台</title>
<c:if test="${empty sessionScope.teacher}">
	<script type="text/javascript">
		alert("请先登录");
		location = "index.jsp";
	</script>
</c:if>
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
	height:1070px;
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

.bootstrap-frm2 {
	margin-left: 110px;
	margin-top: 20px;
	height: 50px;
	width: 120px;
	background: #FFF;
	opacity: 0.66;
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
	<aside>
		<h2 style="margin-top: 40px">导航栏</h2>
		<ul id="lia" style="margin-top: 120px">
			<!--老师功能-->
			<hr>
			<li style="text-align: center"><a style="color: aliceblue"
					href="Student/adjustList?curpage=1">首页</a></li>
			<c:if test="${!empty teacher }">
			<hr>
			<li style="text-align: center"><a style="color: aliceblue"
				href="/Student/selectAllByTno">学生信息管理</a></li>
			<hr>
			<li style="text-align: center"><a style="color: aliceblue"
				href="/Credit/selectByTno">学生学分管理</a></li>
			<hr>
			<li style="text-align: center"><a style="color: aliceblue"
				href="/Well/selectByTno">评优奖学（Excel导入）</a></li>
			<hr>
			<li style="text-align: center"><a style="color: aliceblue"
				href="/Criticism/selectByTno">通报批评（Excel导入）</a></li>
			<hr>
			<li style="text-align: center"><a style="color: aliceblue"
				href="/GeneralCertificate/selectByTno">普通证书添加（Excel导入）</a></li>
			<hr>
			<li style="text-align: center"><a style="color: aliceblue"
				href="/StudentTextbook/selectByTno">教材费结算信息添加</a></li>
			<hr>
			<li style="text-align: center"><a style="color: aliceblue"
				href="/teacher_applyclassroom.jsp">教室申请</a></li>
			<hr>
			<li style="text-align: center"><a style="color: aliceblue"
				href="/ApplyClassroom/selectByTno">教室使用批准</a></li>
			<hr>
			<li style="text-align: center"><a style="color: aliceblue"
				href="/teacher_adjustlesson.jsp">调课</a></li>
			<hr>
			<li style="text-align: center"><a style="color: aliceblue"
				href="/ProfessCertificate/selectByTnoWithHadPass">职业资格书管理</a></li>
			<hr>
			<li style="text-align: center"><a style="color: aliceblue"
				href="/Activity/selectByTno">活动管理</a></li>
			<hr>
			</c:if>
			<!--学生功能-->
			<c:if test="${!empty student }">
			<hr>
			<li style="text-align: center"><a style="color: aliceblue"
				href="/StudentTextbook/selectBySnoWithNoPass">教材费确认</a></li>
			<hr>
			<li style="text-align: center"><a style="color: aliceblue"
				href="/student_profess.jsp">职业资格证书添加</a></li>
			<hr>
			<li style="text-align: center"><a style="color: aliceblue"
				href="/student_applyclassroom.jsp">教室使用申请</a></li>
			<hr>
			<li style="text-align: center"><a style="color: aliceblue"
				href="/student_activity.jsp">活动申请</a></li>
			<hr>
			<li style="text-align: center"><a style="color: aliceblue"
				href="/Student/getMessageBySno">查看消息</a></li>
			<hr>
			</c:if>
		</ul>
	</aside>
	<div id='wrap'>
		<label id='sideMenuControl' for='sideToggle'>=</label>
	</div>

	<div>
		<h1>学生后台</h1>
		<div style="width: 30%; height: 100%; margin: 0 auto">
			<form action="../Criticism/insertByList" method="post" enctype="multipart/form-data">
				<label>通过excel添加学生信息</label> <input
					style="float: right; margin-top: 30px;" type="file" name="excel">
					<input style="float: right;margin-top: 60px;" type="submit" value="提交">
			</form>
		</div>
	</div>
	<div class="wrapper">

		<div class="container">
			<div class="row">

				<div class="col-md-8 col-md-offset-2">

					<div style="margin-top: 100px; opacity: 0.76" class="fresh-table ">
						<!--    Available colors for the full background: full-color-blue, full-color-azure, full-color-green, full-color-red, full-color-orange                  
                        Available colors only for the toolbar: toolbar-colo	r-blue, toolbar-color-azure, toolbar-color-green, toolbar-color-red, toolbar-color-orange
                -->

						<table id="fresh-table" class="table">
							<div class="toolbar">
								<button class="btn btn-default">返回</button>
							</div>

							<thead style="">
								<th>学号</th>
								<th>时间</th>
								<th>原因</th>
								<th>类型</th>
								<th>处分</th>
								<th data-field="actions" data-events="operateEvents">操作</th>
							</thead>
							<tbody>
								<c:forEach items="${criticismlist }" var="criticism">
									<tr>
										<td>${criticism.sno }</td>
										<td>${criticism.ctime }</td>
										<td>${criticism.creason }</td>
										<td>${criticism.ctype }</td>
										<td>${criticism.cpunishment }</td>
										<td><a href="/Criticism/deleteByCrid?crid=${criticism.crid }">删除</a>
										</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
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
<script type="text/javascript">
	var $table = $('#fresh-table'), $alertBtn = $('#alertBtn'), full_screen = false;

	$().ready(function() {
		$table.bootstrapTable({
			toolbar : ".toolbar",

			showRefresh : true,
			search : true,
			showToggle : true,
			showColumns : true,
			pagination : true,
			striped : true,
			pageSize : 8,
			pageList : [ 8, 10, 25, 50, 100 ],

			formatShowingRows : function(pageFrom, pageTo, totalRows) {
				//do nothing here, we don't want to show the text "showing x of y from..." 
			},
			formatRecordsPerPage : function(pageNumber) {
				return pageNumber + " rows visible";
			},
			icons : {
				refresh : 'fa fa-refresh',
				toggle : 'fa fa-th-list',
				columns : 'fa fa-columns',
				detailOpen : 'fa fa-plus-circle',
				detailClose : 'fa fa-minus-circle'
			}
		});

		$(window).resize(function() {
			$table.bootstrapTable('resetView');
		});

		window.operateEvents = {
			'click .like' : function(e, value, row, index) {
				alert('You click like icon, row: ' + JSON.stringify(row));
				console.log(value, row, index);
			},
			'click .edit' : function(e, value, row, index) {
				alert('You click edit icon, row: ' + JSON.stringify(row));
				console.log(value, row, index);
			},
			'click .remove' : function(e, value, row, index) {
				$table.bootstrapTable('remove', {
					field : 'id',
					values : [ row.id ]
				});

			}
		};

		$alertBtn.click(function() {
			alert("You pressed on Alert");
		});

	});
</script>
</html>

