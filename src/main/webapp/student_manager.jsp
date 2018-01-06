<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>后台管理系统</title>
<!-- CSS -->
<c:if test="${empty student }">
	<script type="text/javascript">
		alert("请先登录");
		location = "index.jsp";
	</script>
</c:if>
<link href="resources/form-3/assets/css/bootstrap.css" rel="stylesheet" />
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
<link rel="stylesheet" href="resources/form-3/assets/css/style.css">
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
	text-align: center;
}

html {
	height: 100%;
}

p {
	padding: 10px 0;
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
</style>
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
			<div onMouseOver="this.style.backgroundColor='##fff'">
				<li style="text-align: center"><a style="color: aliceblue"
					href="#">个人信息修改</a></li>
			</div>
			<hr>
			<li style="text-align: center"><a style="color: aliceblue"
				href="#">职业资格证书申请</a></li>
			<hr>
			<li style="text-align: center"><a style="color: aliceblue"
				href="#">活动申请</a></li>
			<hr>
			<li style="text-align: center"><a style="color: aliceblue"
				href="#">教室申请</a></li>
			<hr>
			<li style="text-align: center"><a style="color: aliceblue"
				href="#">个人教材确认</a></li>
			<hr>
			<li style="text-align: center"><a style="color: aliceblue"
				href="#">消息通知</a></li>
			<hr>

		</ul>
	</aside>
	<div id='wrap'>
		<label id='sideMenuControl' for='sideToggle'>=</label>
	</div>
	<div>
		<h1>学生后台</h1>

	</div>
	<div class="wrapper">
		<div class="container">
			<div class="row">
				<div class="col-md-8 col-md-offset-2">
					<div style="margin-top: 100px" class="fresh-table ">
						<!--    Available colors for the full background: full-color-blue, full-color-azure, full-color-green, full-color-red, full-color-orange                  
                        Available colors only for the toolbar: toolbar-colo	r-blue, toolbar-color-azure, toolbar-color-green, toolbar-color-red, toolbar-color-orange
                -->

						<table id="fresh-table" class="table">
							<div class="toolbar">
								<button class="btn btn-default">返回</button>
							</div>

							<thead style="">
								<th>学号</th>
								<th>姓名</th>
								<th>班级</th>
								<th>年级</th>
								<th>专业</th>

								<th data-field="actions" data-events="operateEvents">操作</th>
							</thead>
							<tbody>
								<tr>
									<td>1</td>
									<td>Dakota Rice</td>
									<td>$36,738</td>
									<td>Niger</td>
									<td>Oud-Turnhout</td>

									<td><a>修改</a>/<a href="#">删除</a></td>
								</tr>
								<tr>
									<td>1</td>
									<td>Dakota Rice</td>
									<td>$36,738</td>
									<td>Niger</td>
									<td>Oud-Turnhout</td>

									<td><a>修改</a>/<a href="#">删除</a></td>
								</tr>
								<tr>
									<td>2</td>
									<td>Dakota Rice</td>
									<td>$36,738</td>
									<td>Niger</td>
									<td>Oud-Turnhout</td>

									<td><a>修改</a>/<a href="#">删除</a></td>
								</tr>
								<tr>
									<td>1</td>
									<td>Dakota Rice</td>
									<td>$36,738</td>
									<td>Niger</td>
									<td>Oud-Turnhout</td>

									<td><a>修改</a>/<a href="#">删除</a></td>
								</tr>
								<tr>
									<td>1</td>
									<td>Dakota Rice</td>
									<td>$36,738</td>
									<td>Niger</td>
									<td>Oud-Turnhout</td>

									<td><a>修改</a>/<a href="#">删除</a></td>
								</tr>
								<tr>
									<td>1</td>
									<td>Dakota Rice</td>
									<td>$36,738</td>
									<td>Niger</td>
									<td>Oud-Turnhout</td>

									<td><a>修改</a>/<a href="#">删除</a></td>
								</tr>
								<tr>
									<td>1</td>
									<td>Dakota Rice</td>
									<td>$36,738</td>
									<td>Niger</td>
									<td>Oud-Turnhout</td>

									<td><a>修改</a>/<a href="#">删除</a></td>
								</tr>
								<tr>
									<td>1</td>
									<td>Dakota Rice</td>
									<td>$36,738</td>
									<td>Niger</td>
									<td>Oud-Turnhout</td>

									<td><a>修改</a>/<a href="#">删除</a></td>
								</tr>
								<tr>
									<td>1</td>
									<td>Dakota Rice</td>
									<td>$36,738</td>
									<td>Niger</td>
									<td>Oud-Turnhout</td>

									<td><a>修改</a>/<a href="#">删除</a></td>
								</tr>
								<tr>
									<td>1</td>
									<td>Dakota Rice</td>
									<td>$36,738</td>
									<td>Niger</td>
									<td>Oud-Turnhout</td>

									<td><a>修改</a>/<a href="#">删除</a></td>
								</tr>
								<tr>
									<td>1</td>
									<td>Dakota Rice</td>
									<td>$36,738</td>
									<td>Niger</td>
									<td>Oud-Turnhout</td>

									<td><a>修改</a>/<a href="#">删除</a></td>
								</tr>
								<tr>
									<td>1</td>
									<td>Dakota Rice</td>
									<td>$36,738</td>
									<td>Niger</td>
									<td>Oud-Turnhout</td>

									<td><a>修改</a>/<a href="#">删除</a></td>
								</tr>
								<tr>
									<td>1</td>
									<td>Dakota Rice</td>
									<td>$36,738</td>
									<td>Niger</td>
									<td>Oud-Turnhout</td>

									<td><a>修改</a>/<a href="#">删除</a></td>
								</tr>
								<tr>
									<td>1</td>
									<td>Dakota Rice</td>
									<td>$36,738</td>
									<td>Niger</td>
									<td>Oud-Turnhout</td>

									<td><a>详细信息</a>/<a href="#">修改</a>/<a href="#">删除</a></td>
								</tr>
								<tr>
									<td>1</td>
									<td>Dakota Rice</td>
									<td>$36,738</td>
									<td>Niger</td>
									<td>Oud-Turnhout</td>

									<td><a>详细信息</a>/<a href="#">修改</a>/<a href="#">删除</a></td>
								</tr>
								<tr>
									<td>1</td>
									<td>Dakota Rice</td>
									<td>$36,738</td>
									<td>Niger</td>
									<td>Oud-Turnhout</td>

									<td><a>详细信息</a>/<a href="#">修改</a>/<a href="#">删除</a></td>
								</tr>
								<tr>
									<td>1</td>
									<td>Dakota Rice</td>
									<td>$36,738</td>
									<td>Niger</td>
									<td>Oud-Turnhout</td>

									<td><a>详细信息</a>/<a href="#">修改</a>/<a href="#">删除</a></td>
								</tr>
								<tr>
									<td>1</td>
									<td>Dakota Rice</td>
									<td>$36,738</td>
									<td>Niger</td>
									<td>Oud-Turnhout</td>

									<td><a>详细信息</a>/<a href="#">修改</a>/<a href="#">删除</a></td>
								</tr>
								<tr>
									<td>1</td>
									<td>Dakota Rice</td>
									<td>$36,738</td>
									<td>Niger</td>
									<td>Oud-Turnhout</td>

									<td><a>详细信息</a>/<a href="#">修改</a>/<a href="#">删除</a></td>
								</tr>
								<tr>
									<td>1</td>
									<td>Dakota Rice</td>
									<td>$36,738</td>
									<td>Niger</td>
									<td>Oud-Turnhout</td>

									<td><a>详细信息</a>/<a href="#">修改</a>/<a href="#">删除</a></td>
								</tr>
								<tr>
									<td>1</td>
									<td>Dakota Rice</td>
									<td>$36,738</td>
									<td>Niger</td>
									<td>Oud-Turnhout</td>

									<td><a>详细信息</a>/<a href="#">修改</a>/<a href="#">删除</a></td>
								</tr>
								<tr>
									<td>1</td>
									<td>Dakota Rice</td>
									<td>$36,738</td>
									<td>Niger</td>
									<td>Oud-Turnhout</td>

									<td><a>详细信息</a>/<a href="#">修改</a>/<a href="#">删除</a></td>
								</tr>
							</tbody>
						</table>
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

	//        function operateFormatter(value, row, index) {
	//            return [
	//                '<a rel="tooltip" title="Like" class="table-action like" href="javascript:void(0)" title="Like">',
	//                    '<i class="fa fa-heart"></i>',
	//                '</a>',
	//                '<a rel="tooltip" title="Edit" class="table-action edit" href="javascript:void(0)" title="Edit">',
	//                    '<i class="fa fa-edit"></i>',
	//                '</a>',
	//                '<a rel="tooltip" title="Remove" class="table-action remove" href="javascript:void(0)" title="Remove">',
	//                    '<i class="fa fa-remove"></i>',
	//                '</a>'
	//            ].join('');
	//        }
</script>
</html>
