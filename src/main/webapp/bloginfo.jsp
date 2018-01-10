<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>问题详情</title>
<meta name="description" content="Free Responsive Html5 Css3 Templates ">
<meta name="author" content="#">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1,user-scalable=no">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="HandheldFriendly" content="true">
<script type="text/javascript" src="../resources/CKeditor/ckeditor.js"></script>
<script src="../resources/js/jquery.min.js"></script>
<link rel="stylesheet" href="../resources/css/zerogrid.css">
<link rel="stylesheet" href="../resources/css/style.css">
<link href="../resources/form-3/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link rel="stylesheet" href="../resources/css/menu.css">
<script src="../resources/js/jquery1111.min.js" type="text/javascript"></script>
<script src="../resources/js/script.js"></script>
<link href="../resources/owl-carousel/owl.carousel.css" rel="stylesheet">
<link rel="stylesheet" type="text/css"
	href="../resources/css/normalize.css" />
<link rel="stylesheet" type="text/css"
	href="../resources/form-3/fonts/font-awesome-4.2.0/css/font-awesome.min.css" />
<link rel="stylesheet" type="text/css" href="../resources/css/demo.css" />
<link rel="stylesheet" type="text/css"
	href="../resources/css/component.css" />
<link rel="stylesheet" type="text/css"
	href="../resources/css/normalize1.css" />
<link rel="stylesheet" type="text/css" href="../resources/css/demo1.css" />
<link rel="stylesheet" type="text/css"
	href="../resources/css/cs-select.css" />
<link rel="stylesheet" type="text/css"
	href="../resources/css/cs-skin-rotate.css" />
<link rel="stylesheet" type="text/css"
	href="../resources/css/htmleaf-demo.css">
<link rel="stylesheet" type="text/css"
	href="../resources/css/pretty.min.css">
<!-- ----- 
<script type="text/javascript">
<c:if test="${empty page}">
location="index.jsp";
</c:if>
</script>
-->
<script type="text/javascript">
	var userisexits = false;
	function checkuserexits() {
		$.ajax({
			url : "UserController",
			type : "post",
			data : {
				flag : "checkUsername",
				username : document.getElementById("username").value
			},
			success : function(data) {
				if (data == 3) {
					alert("用户名不能为空！");
				} else if (data != 1) {
					alert("用户名已存在");
					userisexits = true;
				}
			}
		});
	}
	function test() {
		var password1 = document.getElementById("password1").value;
		var password2 = document.getElementById("password2").value;
		if (password1 == null || password2 == null) {
			window.alert("密码不能为空");
			return false;
		} else if (password1 != password2) {
			return false;
		}

		return true;
	}

	function checkName() {
		var Uname = document.getElementById("username").value;

		if ((Uname).length == 0) {
			alert("请输入用户名");
			Uname.focus();
			return false;
		} else {
			return true;
		}
	}
	function checknetname() {
		var netname = document.getElementById("netname").value;

		if ((netname).length == 0) {
			alert("请输入昵称");
			netname.focus();
			return false;
		} else {
			return true;
		}
	}

	function submitcheck() {
		if (!test()) {
			alert("两次输入密码不一致");
		} else if (!checkName()) {
			alert("用户名不能为空");
		} else if (!checknetname()) {
			alert("昵称不能为空");
		} else if (userisexits) {
			alert("用户名已存在！");
		} else {
			document.regeistform.submit();
		}
	}
</script>
<script type="text/javascript">
	function showdiv(targetid, objN) {
		var target = document.getElementById(targetid);
		var clicktext = document.getElementById(objN)
		if (target.style.display == "block") {
			target.style.display = "none";
			clicktext.innerText = "登录";
		} else {
			target.style.display = "block";
			clicktext.innerText = '登录';
		}
	}
</script>
<style>
@media ( min-width : 1366px) {
	#contentid {
		background: #FFFFFF;
		position: absolute;
		margin-top: 30px;
		margin-left: 900px;
		width: 350px;
		height: 400px;
		max-height: 400px;
		max-width: 350px;
		border: 1px solid #CCC;
		border-radius: 10px;
		z-index: 999;
		padding: 5px;
	}
	#contentid2 {
		background: #FFFFFF;
		position: absolute;
		margin-top: 30px;
		margin-left: 900px;
		width: 350px;
		height: 900px;
		max-height: 900px;
		max-width: 350px;
		border: 1px solid #CCC;
		border-radius: 10px;
		z-index: 999;
		padding: 5px;
	}
	.rizhi {
		height: 100%;
		width: 700px;
		margin-left: 300px;
		text-align: left;
		padding-left: 90px;
		padding-top: 30px;
		padding-bottom: 40px;
		border: 1px solid #d1d1d1;
		border-radius: 10px;
	}
	.rizhi1 {
		margin-top: 20px;
		padding: 20px;
	}
	.news {
		margin-bottom: 20px;
	}
	.ph {
		height: 100%;
		width: 300px;
		margin-left: 1020px;
		text-align: left;
		padding-left: 90px;
		padding-top: 30px;
		padding-bottom: 40px;
		border: 1px solid #d1d1d1;
		border-radius: 10px;
	}
}

@media ( min-width : 1920px) {
	#contentid {
		background: #FFFFFF;
		position: absolute;
		margin-top: 30px;
		margin-left: 1400px;
		width: 350px;
		height: 400px;
		max-height: 400px;
		max-width: 350px;
		border: 1px solid #CCC;
		border-radius: 10px;
		z-index: 999;
		padding: 5px;
	}
	#contentid2 {
		background: #FFFFFF;
		position: absolute;
		margin-top: 30px;
		margin-left: 1400px;
		width: 350px;
		height: 900px;
		max-height: 900px;
		max-width: 350px;
		border: 1px solid #CCC;
		border-radius: 10px;
		z-index: 999;
		padding: 5px;
	}
	.login {
		z-index: 9999;
	}
	.rizhi {
		height: 100%;
		width: 800px;
		margin: 0 auto;
		text-align: left;
		padding-left: 90px;
		padding-top: 30px;
		padding-bottom: 40px;
		border: 1px solid #d1d1d1;
		border-radius: 10px;
	}
	.rizhi1 {
		margin-top: 20px;
		padding: 20px;
	}
	.news {
		margin-bottom: 20px;
	}
	.ph {
		height: 100%;
		width: 300px;
		margin-left: 1400px;
		text-align: left;
		padding-left: 90px;
		padding-top: 30px;
		padding-bottom: 40px;
		border: 1px solid #d1d1d1;
		border-radius: 10px;
	}
}

body {
	
}

#showtext {
	cursor: hand;
	cursor: pointer;
}
/**/
body {
	
}

#showtext {
	cursor: hand;
	cursor: pointer;
}

.none {
	display: none;
	　background: #FFFFFF;
}

.bootstrap-frm1 {
	margin-left: auto;
	margin-right: auto;
	height: 100%;
	width: 100%;
	background: #FFF;
	padding: 20px 30px 20px 30px;
	font: 12px "Helvetica Neue", Helvetica, Arial, sans-serif;
	color: #888;
	text-shadow: 1px 1px 1px #FFF;
	border: 1px solid #DDD;
	border-radius: 10px;
	-webkit-border-radius: 8px;
	-moz-border-radius: 8px;
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

input {
	width: 200px;
	height: 30px;
	padding: 5px;
	font-size: 15px;
}

input>submit {
	height: 40px;
}

input::-webkit-input-placeholder { /* WebKit browsers */
	　　color: #999;
	　　
}

　input:-moz-placeholder { /* Mozilla Firefox 4 to 18 */
	　　color: #999;
	　　
}

　　input::-moz-placeholder { /* Mozilla Firefox 19+ */
	　　color: #999;
	　　
}

　　input:-ms-input-placeholder { /* Internet Explorer 10+ */
	　　color: #999;
	　　
}
</style>
</head>

<body>
	<div class="wrap-body">
		<div id='cssmenu' class="align-center">
			<ul>
				<li class="active"><a href='../Student/adjustList?curpage=1'><span>主页</span></a></li>
			</ul>
		</div>

		<div class="wrap-container">
			<div id="main-content">
				<!-- 日志 -->
				<div class="rizhi">
					<h3>${log.ptitle }<a
							style="font-size: 12px; margin-left: 30px;">学号:${log.pauthor }</a>
					</h3>
					<div style="margin-top: 50px; margin-bottom: 30px;">
						<p style="font-size: 18px;">${log.pcontent }</p>
						<p style="font-size: 9px; margin-top: 30px;">${log.pdate }</p>
					</div>
					<c:forEach items="${rlist}" var="rep">
						<div>
							<a style="font-size: 20px;">老师:${rep.rauthor }</a>
							<div>
								<p style="font-size: 18px;">${rep.rcontent}</p>
								<p style="font-size: 9px;">${rep.rdate }</p>
							</div>
						</div>
					</c:forEach>
					<div style="margin-right: 40px;">
						<form action="/Reply/insertByReply" method="post">
							<textarea name="rcontent" class="ckeditor" cols="80"
								id="rcontent" rows="10"> 
								</textarea>
							<input type="hidden" name="pid" value="${log.pid }" />
							<c:if test="${!empty teacher }">
								<input class="bootstrap-frm2" type="submit" value="提交" />
							</c:if>
							<c:if test="${empty teacher }">
								<input class="bootstrap-frm2" style="width: 200px" type="button"
									value="只有老师才能回答问题" />
							</c:if>
						</form>
					</div>
				</div>

			</div>
		</div>
		<!-- 分页 -->
		<div style="margin-left: 600px">
		<c:choose>
			<c:when test="${curpage-1 <= 0 }"> 
 					上一页
			</c:when>
			<c:otherwise>
				<a href="/Posts/selectByPid?pid=${log.pid }&curpage=${curpage-1 }">上一页</a>
			</c:otherwise>
		</c:choose>
		|
		<c:choose>
			<c:when test="${curpage+1 > allpage }"> 
 							下一页
			</c:when>
			<c:otherwise>
				<a href="/Posts/selectByPid?pid=${log.pid }&curpage=${curpage+1 }">下一页</a>
			</c:otherwise>
		</c:choose>
		</div>
	</div>
	<script src="/resources/owl-carousel/owl.carousel.js"></script>
	<script>
		$(document)
				.ready(
						function() {
							$("#owl-slide")
									.owlCarousel(
											{
												autoPlay : 3000,
												items : 1,
												itemsDesktop : [ 1199, 1 ],
												itemsDesktopSmall : [ 979, 1 ],
												itemsTablet : [ 768, 1 ],
												itemsMobile : [ 479, 1 ],
												navigation : true,
												navigationText : [
														'<i class="fa fa-chevron-left fa-5x"></i>',
														'<i class="fa fa-chevron-right fa-5x"></i>' ],
												pagination : false
											});
						});
	</script>
	<script src="/resources/js/classie.js"></script>
	<script>
		(function() {

			if (!String.prototype.trim) {
				(function() {

					var rtrim = /^[\s\uFEFF\xA0]+|[\s\uFEFF\xA0]+$/g;
					String.prototype.trim = function() {
						return this.replace(rtrim, '');
					};
				})();
			}

			[].slice.call(document.querySelectorAll('input.input__field'))
					.forEach(function(inputEl) {

						if (inputEl.value.trim() !== '') {
							classie.add(inputEl.parentNode, 'input--filled');
						}

						inputEl.addEventListener('focus', onInputFocus);
						inputEl.addEventListener('blur', onInputBlur);
					});

			function onInputFocus(ev) {
				classie.add(ev.target.parentNode, 'input--filled');
			}

			function onInputBlur(ev) {
				if (ev.target.value.trim() === '') {
					classie.remove(ev.target.parentNode, 'input--filled');
				}
			}
		})();
	</script>
</body>
</html>