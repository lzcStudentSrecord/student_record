$.ajax({
	url : '/ClassRoom/selectAll',
	type : 'post',
	data : {

	},
	success : function(data) {
		$.each(data, function(i) {
			var oldaddress = $("#oldaddress");
			var temp_option1 = $("<option value='" + data[i].craddress + "'>"
					+ data[i].craddress + "</option>");
			oldaddress.append(temp_option1);
			var newaddress = $("#newaddress");
			var temp_option2 = $("<option value='" + data[i].craddress + "'>"
					+ data[i].craddress + "</option>");
			newaddress.append(temp_option2);
		});
	}
});