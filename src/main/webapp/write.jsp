<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="utf-8">
<title>问题填写</title>
<link rel="stylesheet" href="resources/form-3/css/zerogrid.css">
<link rel="stylesheet" href="resources/form-3/css/style.css">
<link href="resources/form-3/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link rel="stylesheet" href="resources/form-3/css/menu.css">
<script src="resources/form-3/js/jquery1111.min.js"
	type="text/javascript"></script>
<script src="resources/form-3/js/script.js"></script>
<script type="text/javascript" src="resources/CKeditor/ckeditor.js"></script>
<link href="resources/owl-carousel/owl.carousel.css"
	rel="stylesheet">
<link rel="stylesheet" type="text/css"
	href="resources/form-3/css/normalize.css" />
<link rel="stylesheet" type="text/css"
	href="resources/form-3/fonts/font-awesome-4.2.0/css/font-awesome.min.css" />
<link rel="stylesheet" type="text/css"
	href="resources/form-3/css/demo.css" />
<link rel="stylesheet" type="text/css"
	href="resources/form-3/css/component.css" />
<link rel="stylesheet" type="text/css"
	href="resources/css/normalize1.css" />
<link rel="stylesheet" type="text/css"
	href="resources/css/demo1.css" />
<link rel="stylesheet" type="text/css"
	href="resources/css/cs-select.css" />
<link rel="stylesheet" type="text/css"
	href="resources/css/cs-skin-rotate.css" />
<link rel="stylesheet" type="text/css"
	href="resources/css/htmleaf-demo.css">
<link rel="stylesheet" type="text/css"
	href="resources/form-3/css/pretty.min.css">
<link rel="stylesheet" href="resources/css/animate.css">
<link rel="stylesheet" href="resources/css/magnific-popup.css">
<link rel="stylesheet" href="resources/css/salvattore.css">
<link rel="stylesheet" href="resources/css/photostyle.css">
<script src="resources/form-3/js/modernizr-2.6.2.min.js"></script>
<c:if test="${empty student }">
	<script type="text/javascript">
		alert("请先登录");
		location = "student_login.jsp";
	</script>
</c:if>
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
body {
	
}

#showtext {
	cursor: hand;
	cursor: pointer;
}

#contentid {
	background: #FFFFFF;
	position: absolute;
	margin-top: 60px;
	margin-left: 1500px;
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
	margin-top: 60px;
	margin-left: 1500px;
	width: 350px;
	height: 900px;
	border: 1px solid #CCC;
	border-radius: 10px;
	z-index: 999;
	padding: 5px;
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

.login {
	z-index: 9999;
}

.blogs {
	position: absolute;
	background: #fff;
	height: 100%;
	width: 65%;
	margin-top: 0px;
	margin-left: 300px;
	padding: 50px;
	padding-left: 90px;
	border: 1px solid #d1d1d1;
	border-radius: 13px;
	text-align: left;
}

.blogs-title {
	text-align: left;
}

.blogs-info {
	margin-left: 40px;
	margin-top: 50px;
	margin-right: 40px;
	word-wrap: break-word;
	word-break: break-all;
	overflow: hidden;
}

.read {
	margin-right: 20px;
}
</style>
</head>
<body>


	<div class="wrap-body">
		<div style="position: fixed; width: 100%" id='cssmenu'
			class="align-center">
			<ul>
				<li class="active"><a href='../Student/adjustList?curpage=1'><span>主页</span></a></li>
			</ul>
		</div>
		<div>
		<br><br>
			<form action="/Posts/insertByPosts" method="post">
				问题：<input name="ptitle" placeholder="请输入问题" style="width:100%">
				<textarea name="pcontent" class="ckeditor" cols="80" id="pcontent"
					rows="10"> 
				</textarea>
				<input type="submit" value="提交" />
			</form>
		</div>
		<script src="resources/owl-carousel/owl.carousel.js"></script>
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
													itemsDesktopSmall : [ 979,
															1 ],
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
		<script src="resources/js/classie.js"></script>
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
						.forEach(
								function(inputEl) {

									if (inputEl.value.trim() !== '') {
										classie.add(inputEl.parentNode,
												'input--filled');
									}

									inputEl.addEventListener('focus',
											onInputFocus);
									inputEl.addEventListener('blur',
											onInputBlur);
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
		<script src="resources/form-3/js/jquery.min.js"></script>
		<script src="resources/form-3/js/jquery.waypoints.min.js"></script>
		<script src="resources/form-3/js/jquery.magnific-popup.min.js"></script>
		<script src="resources/form-3/js/salvattore.min.js"></script>
		<script src="resources/form-3/js/photomain.js"></script>
		
</html>