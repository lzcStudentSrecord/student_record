<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>登录</title>

<!-- CSS -->
<link rel="stylesheet"
	href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
<link rel="stylesheet"
	href="resources/form-3/assets/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet"
	href="resources/form-3/assets/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet"
	href="resources/form-3/assets/css/form-elements.css">
<link rel="stylesheet" href="resources/form-3/assets/css/style1.css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

<!-- Favicon and touch icons -->
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
.hhh {
	color: #C163A1;
}
</style>
</head>

<body style="background-size: cover"
	background="resources/form-3/assets/img/backgrounds/eb9f850a19d8bc3ee720ff63828ba61ea8d34509.jpg">

	<!-- Top content -->
	<div class="top-content">
		<div class="inner-bg">
			<div class="container">
				<div class="row">
					<div class="col-sm-8 col-sm-offset-2 text">
						<h1>
							<strong>后台管理</strong> 教师登录
						</h1>
						<div class="description">
							<p>后台管理系统管理员登录</p>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-6 col-sm-offset-3 form-box">
						<div class="form-top">
							<div class="form-top-left">
								<h3>欢迎来到后台管理系统</h3>
								<p>请输入正确的用户名和密码登录:</p>
							</div>
							<div class="form-top-right">
								<i class="fa fa-lock"></i>
							</div>
						</div>
						<div class="form-bottom">
							<form role="form" action="/Student/login" method="post" class="login-form">
								<div class="form-group">
									<label class="sr-only" for="form-username">用户名</label> <input
										type="text" name="username" placeholder="用户名..."
										class="form-username form-control" id="form-username">
								</div>
								<div class="form-group">
									<label class="sr-only" for="form-password">密码</label> <input
										type="password" name="password" placeholder="密码..."
										class="form-password form-control" id="form-password">
								</div>
								<button type="submit" class="btn">登录!</button>
							</form>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-6 col-sm-offset-3 social-login">
						<h3 style="color: #DB63B9;">...第三方登录:</h3>
						<div class="social-login-buttons">
							<a class="btn btn-link-2" href="#"> <i class="fa fa-facebook"></i>
								Facebook
							</a> <a class="btn btn-link-2" href="#"> <i class="fa fa-twitter"></i>
								Twitter
							</a> <a class="btn btn-link-2" href="#"> <i
								class="fa fa-google-plus"></i> Google Plus
							</a>
							<h3 style="color: #DB63B9;">
								<strong>你全用不了！！！hhhhh......</strong>
							</h3>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Javascript -->
	<script src="resources/form-3/assets/js/jquery-1.11.1.min.js"></script>
	<script src="resources/form-3/assets/bootstrap/js/bootstrap.min.js"></script>
	<script src="resources/form-3/assets/js/jquery.backstretch.min.js"></script>
	<script src="resources/form-3/assets/js/scripts.js"></script>

	<!--[if lt IE 10]>
            <script src="assets/js/placeholder.js"></script>
        <![endif]-->

</body>
</html>