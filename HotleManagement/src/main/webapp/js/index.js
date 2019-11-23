$(function(){
	var path="/HotelManagement";
	$("#button01").click(function(){
		var i= $(".xyy").val();
		if(i==null || i==""){
			$(".xyy").val(1);
			window.location.href=path+"/allPassenger?xyy="+$(".xyy").val()+"&txtname="+$("#txtnameid").val();
			 return;
		}
		if((parseInt(i))<parseInt($("#sgdsy").text())-1){
			var y=parseInt(i)+1;
			 $(".xyy").val(y);
			 window.location.href=path+"/allPassenger?xyy="+$(".xyy").val()+"&txtname="+$("#txtnameid").val();
		}else{
			alert("已经是最后一页了")
			return;
		}
		
		
	})
		$("#button02").click(function(){
		var i= $(".xyy").val();
		if(i==0 || i=="0"){
			alert("已经是第一页了")
			 return;
		}
		var y=parseInt(i)-1;
		 $(".xyy").val(y);
		 window.location.href=path+"/allPassenger?method=modify&xyy="+$(".xyy").val()+"&txtname="+$("#txtnameid").val();
		
	})
	$("#button03").click(function(){
		if(parseInt($("#sgdsy").text())==1){
			return;
		}
		 $(".xyy").val(0);
		 window.location.href=path+"/allPassenger?method=modify&xyy="+$(".xyy").val()+"&txtname="+$("#txtnameid").val();
	})
	$("#button04").click(function(){
		if(parseInt($("#sgdsy").text())==1){
			return;
		}
		 $(".xyy").val(parseInt($("#sgdsy").text())-1);
		 window.location.href=path+"/allPassenger?method=modify&xyy="+$(".xyy").val()+"&txtname="+$("#txtnameid").val();
		
	})
	
	$("#cx").CLICK(function(){
		$("#form").submit();
	})
})