<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>主页</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="../resources/form-3/assets/lb/bootstrap.min.css">
<script src="../resources/form-3/assets/lb/jquery.min.js"></script>
<script src="../resources/form-3/assets/lb/popper.min.js"></script>
<script src="../resources/form-3/assets/lb/bootstrap.min.js"></script>
<script src="../resources/form-3/js/jquery.min.js"></script>
<link rel="stylesheet" href="../resources/form-3/css/menu.css">
<script src="../resources/form-3/js/jquery1111.min.js"
	type="text/javascript"></script>
<script src="../resources/form-3/js/script.js"></script>
<link rel="stylesheet" type="text/css"
	href="../resources/form-3/css/component.css" />
<link rel="stylesheet" type="text/css"
	href="../resources/form-3/css/normalize1.css" />
<link rel="stylesheet" type="text/css"
	href="../resources/form-3/css/demo1.css" />
<link rel="stylesheet" type="text/css"
	href="../resources/form-3/css/cs-select.css" />
<link rel="stylesheet" type="text/css"
	href="../resources/form-3/css/cs-skin-rotate.css" />
<link rel="stylesheet" type="text/css"
	href="../resources/form-3/css/htmleaf-demo.css">
<link rel="stylesheet" type="text/css"
	href="../resources/form-3/css/pretty.min.css">

<style>
/* Make the image fully responsive */
@media ( min-width :1920px) {
	.gg {
		position: absolute;
		width: 28%;
		height: 36%;
		margin-left: 900px;
		margin-top: 60px;
		background: #fff;
		border: 3px solid #d1d1d1;
		border-radius: 10px;
	}
	#write {
		position: absolute;
		width: 100px;
		height: 70px;
		margin-left: 1400px;
	}
	.rizhi {
		height: 100%;
		width: 800px;
		margin: 20px auto;
		padding-left: 90px;
		padding-top: 30px;
		padding-bottom: 40px;
		border: 3px solid #d1d1d1;
		border-radius: 10px;
		background: #fff;
	}
}

@media ( max-width :1366px) {
	.gg {
		width: 40%;
		height: 80%;
		margin-left: 600px;;
		margin-top: 40px;
		background: #fff;
		border: 3px solid #d1d1d1;
		border-radius: 10px;
	}
	#write {
		position: absolute;
		width: 100px;
		height: 70px;
		margin-left: 900px;
	}
	.rizhi {
		height: 100%;
		width: 600px;
		margin-top: 20px;
		padding-left: 90px;
		padding-top: 30px;
		padding-bottom: 40px;
		border: 3px solid #d1d1d1;
		border-radius: 10px;
		background: #fff;
	}
}

.carousel-inner img {
	width: 100%;
	height: 100%;
}

.rizhi1 {
	margin-top: 20px;
	padding: 20px;
}

.news {
	margin-bottom: 20px;
}

.bootstrap-frm2 {
	margin-left: 110px;
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
<body style="background-size: cover"
	background="../resources/form-3/assets/img/backgrounds/eb9f850a19d8bc3ee720ff63828ba61ea8d34509.jpg">
	<div class="wrap-body">
		<div id='cssmenu' class="align-center">
			<ul>
				<li class="active"><a href='index.jsp'><span>主页</span></a></li>
				<c:if test="${!empty student }">
					<li class='last' style="margin-right: 10px; margin-left: 160px;"><a
					href="../student_infoupdate.jsp"	id="showtext"><span>进入学生后台</span></a></li>
				</c:if>
				<c:if test="${!empty teacher }">
					<li class='last' style="margin-right: 10px; margin-left: 160px;"><a
					href="../Student/selectAllByTno" id="showtext"><span>进入老师后台</span></a></li>
				</c:if>
			</ul>
		</div>
		<!-- 轮播图 -->
		<div
			style="width: 80%; height: 500px; margin: 20px auto; padding-top: 40px; padding-left: 60;">

			<div
				style="width: 40%; float: left; margin-top: 40px; margin-left: 60px;"
				id="demo" class="carousel slide" data-ride="carousel">

				<!-- 指示符 -->
				<ul class="carousel-indicators">
					<li data-target="#demo" data-slide-to="0" class="active"></li>
					<li data-target="#demo" data-slide-to="1"></li>
					<li data-target="#demo" data-slide-to="2"></li>
				</ul>

				<!-- 轮播图片 -->
				<div class="carousel-inner">
					<div class="carousel-item active">
						<img src="../resources/form-3/assets/img/lb/1.png"><br>
					</div>
					<div class="carousel-item">
						<img
							src="../resources/form-3/assets/img/lb/14375197_1349947520513.jpg">
					</div>
					<div class="carousel-item">
						<img src="../resources/form-3/assets/img/lb/4.png">
					</div>
				</div>

				<!-- 左右切换按钮 -->
				<a class="carousel-control-prev" href="#demo" data-slide="prev">
					<span class="carousel-control-prev-icon"></span>
				</a> <a class="carousel-control-next" href="#demo" data-slide="next">
					<span class="carousel-control-next-icon"></span>
				</a>
			</div>
			<!-- 公告 -->

			<div class="gg">
				<div
					style="width: 100%; height: 30px; padding: 40px; margin-bottom: 20px;">
					<h3
						style="float: right; float: left; margin-right: 130px; margin-left: 10px;">
						<a href="../Student/adjustList?curpage=1">调&nbsp;&nbsp;&nbsp;&nbsp;课</a>
					</h3>
					<h3>
						<a href="../Student/applyList?curpage=1">教室申请</a>
					</h3>
					<hr>
					<a href="../Student/newlist"
						style="position: absolute; margin-top: 216px;">查看全部</a>
				</div>

				<div style="padding-left: 20px; padding-right: 20px;">
					<c:forEach items="${requestScope.adjustlistbyfour }" var="adjust">
						<a>老师:编号${adjust.tno }调课信息</a>
						<hr>
					</c:forEach>
					<c:forEach items="${requestScope.applylistbyfour }" var="apply">
						<p>
							<a>教室:${apply.craddress }今日被使用</a>
						</p>
						<hr>
					</c:forEach>
				</div>
			</div>

		</div>
		<hr>
		<div style="width: 100%; height: 100%;">
			<div id="write">
				<button class="bootstrap-frm2">提问问题</button>
			</div>
			<div style="width: 45%; height: 100%; margin: 0 auto">
				<div class="rizhi">

					<div class="rizhi1">
						<c:forEach items="${plist }" var="p">
							<a href="/Posts/selectByPid?pid=${p.pid }&curpage=1"><h3 class="news">${p.ptitle }</h3></a>
							<hr>
						</c:forEach>
					</div>
				</div>
				<!-- 分页 -->
				<div style="text-align: center;">
					<c:choose>
						<c:when test="${curpage-1 <= 0 }">
							<a>上一页</a>
						</c:when>
						<c:otherwise>
							<a href="../Student/adjustList?curpage=${curpage-1 }">上一页</a>
						</c:otherwise>
					</c:choose>

					<c:choose>
						<c:when test="${curpage+1 >= allpage }">
							<a>下一页</a>
						</c:when>
						<c:otherwise>
							<a href="../Sudent/adjustList?curpage=${curpage+1 }">下一页</a>
						</c:otherwise>
					</c:choose>
				</div>

			</div>

		</div>
</body>
<script type="text/javascript">
	$("#write").find("button").click(function(){
		location="../write.jsp";
	});
</script>
</html>