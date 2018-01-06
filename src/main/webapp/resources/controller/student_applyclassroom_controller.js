$.ajax({
	url:'/ClassRoom/selectAll',
	type:'post',
	data:{
		
	},success : function(data){
		$.each(data,function(i){
			var craddress = $("#craddress");
			var temp_option = $("<option value='"+data[i].craddress+"'>"+data[i].craddress+"</option>");
			craddress.append(temp_option);
		});
	}
});