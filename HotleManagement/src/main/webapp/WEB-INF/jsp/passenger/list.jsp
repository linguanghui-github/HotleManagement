<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:set  value="${pageContext.request.contextPath}" scope="page" var="ctx"></c:set>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title></title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
<!--   <link rel="stylesheet" href="${ctx}/css/roomset/roomset.css" type="text/css"></link> -->
  <link rel="stylesheet" href="${ctx}/bootstrap/css/bootstrap.css" type="text/css"></link>
  <link rel="stylesheet" href="${ctx}/css/page.css" type="text/css"></link>
  <link href="${ctx}/bootstrap/css/bootstrap-responsive.css" rel="stylesheet"><!-- start 响应式布局要添加的 -->
  <script src="${ctx}/bootstrap/js/jquery-3.1.1.min.js"></script>
  <script src="${ctx}/bootstrap/js/bootstrap.js"></script>
  <script type="text/javascript" src="${ctx}/js/page.js"></script>
  <script src="${ctx}/js/index.js"></script>
   <style>
   
   .container{
     margin-top: 10px;
   }
   
    .labelroomnumber{
      position: relative;
      font-size: 17px;
      float: left;
      margin-top: 15px;
    }
    
    .textone{
    margin-top:12px;
    }
    
    .rightOne{
    margin-right: 50px;
    font-size:16px;
    }
    
    .table th,.table td{
       text-align: center; 
    }
    
    .theadone{
     background-color: #CCFF99;
    }
    
    .dgvone{
      margin-top: 12px;
    }
    
    .roomnumberwidth{
      width:70%;
    }
    
  
  </style>
  
 </head>
  
 
  <body>
  <div class="container" >
    <div class="span5">
	    <div class="row-fluid">
		    <label class="labelroomnumber">旅客名称：</label>
		    <form action="${ctx}/allPassenger" method="post" style="float: left;">
			   <input id="txtnameid" name="txtname" class="textone roomnumberwidth" style="border-radius:0px; border-top-left-radius:4px; border-bottom-left-radius:4px;height:26px;" type="text" placeholder="请输入关键字" value="${txtname}">
			   <div class="input-append">  
			   <input type="hidden" name="xyy" class="xyy" value="${xyy }" />
			      <button type="submit" class="btn-success textone" style="margin-left:-4px;height:26px;"><li class="icon-search icon-white"></li>搜索</button>
			   </div>
		    </form>
	    </div>
    </div>
    <div class="span6">
      <div class="row-fluid">
       <div class="span3">
<button class="btn btn-warning btn-small textone" type="button" onclick="add()"><li class="icon-pencil icon-white"></li>添加</button>
       </div>
       <div class="span3">
         <button class="btn btn-warning btn-small textone" type="button" onclick="updatefunction()"><li class="icon-pencil icon-white"></li>修改</button>
       </div>
       <div class="span3">
         <button class="btn btn-danger btn-small textone" type="button" onclick="deletefunction()"><li class="icon-remove icon-white"></li>删除</button>
       </div>
      </div>
    </div>
    <br>
    <div class="dgvone">
       <table class="table table-condensed table-bordered table-striped" id="tableid">
	      <thead class="theadone">
	        <tr>
	          <th >选择</th>
	          <th >姓名</th>
	          <th >性别</th>
	          <th >出生日期</th>
	          <th >民族</th>
	          <th >旅客级别</th>
	          <th >证件类型</th>
	          <th >证件号码</th>
	          <th >联系电话</th>
	        </tr>
	      </thead>
	      <tbody id="tbody">
	        <c:forEach items="${list}" var="item">
		        <tr>
		        
		           <td><input type="checkbox" name="id" value="${item.id}"></td>
		          <td>${item.name}</td>
		          
		          <c:if test="${item.genderID==31  }">
		          <td>男</td>
		          </c:if>
		           <c:if test="${item.genderID==32  }">
		          <td>女</td>
		          </c:if>
		         
		          <td>${item.birthDate}</td>
		           <c:if test="${item.nationID==33  }">
		          <td>汉族</td>
		          </c:if>
		          <c:if test="${item.nationID==34  }">
		          <td>苗族</td>
		          </c:if>
		          <c:if test="${item.nationID==35  }">
		          <td>壮族</td>
		          </c:if>
		          <c:if test="${item.nationID==36  }">
		          <td>其他</td>
		          </c:if>
		           <c:if test="${item.passengerLevelID==52  }">
		          <td>首次</td>
		          </c:if>
		           <c:if test="${item.passengerLevelID==53  }">
		           <td>熟客</td>
		          </c:if>
		            <c:if test="${item.passengerLevelID==54  }">
		           <td>VIP</td>
		          </c:if>
<%-- 		           <c:if test="${item.passengerLevelID==55  }">
		           <td>散客</td>
		          </c:if>
		           <c:if test="${item.passengerLevelID==56  }">
		           <td>团队</td>
		          </c:if> --%>
		             <c:if test="${item.papersID==37  }">
		          <td>二代身份证</td>
		          </c:if>
		           <c:if test="${item.papersID==38  }">
		           <td>护照</td>
		          </c:if>
		          <c:if test="${item.papersID==39  }">
		           <td>其他</td>
		          </c:if>
		          <td>${item.papersNumber}</td>
		          <td>${item.contactPhoneNumber}</td>
		         
		        </tr>
	        </c:forEach>
	      </tbody>
	    </table>
    </div>

    <div class="span11">
      <div class="row-fluid">
        <div class="tcdPageCode" style="text-align:center;"></div>
      </div>
    </div>
  </div>
 <script type="text/javascript">
 // var path="/HotelManagement";
   /*function addfunction(){
     parent.document.getElementById('Mainid').src='${ctx}/Passenger/toadd.do';
   }*/
   
   function updatefunction(){
   var chk_value=[];
  	$('input[name="id"]:checked').each(function(){
  		chk_value.push($(this).val());
  	});
  	if(chk_value!=""){
		if(chk_value.toString().indexOf(",")>0){
		   alert("修改只能选择一条");
		}else{
		   window.location.href="${ctx}/update?id="+chk_value[0];
		}
	}else{
	  alert("请选择一条数据进行修改");
	}
  }
  function add(){
  window.location.href="${ctx}/adds";
  }
   function deletefunction(){
   var chk_value=[];
  	$('input[name="id"]:checked').each(function(){
  		chk_value.push($(this).val());
  	});
  	if(chk_value!=""){
  	var flag=window.confirm("注意：您确定要永久删除该信息吗?");
     if(flag){
     for(var i=0;i<chk_value.length;i++){
  	  alert(chk_value[i]);
  	  }
  	 
  	  window.location.href="${ctx}/delectassenger?id="+chk_value;
  	}
  	}else{
	  alert("请选择一条或多条数据进行删除");
	}
	
  }
  
    /* 分页要用的 */
  $(".tcdPageCode").createPage({
     pageCount:${a },
     current:${xyy},
     backFn:function(p){
     var txtname=document.getElementById("txtnameid").value;
     location.href="${ctx}/allPassenger.do?xyy="+p+"&txtname="+txtname;
     }
   });
 </script>
<%--  <div id="div01">
   <a id="button03">首页</a>
   <a id="button02">上一页</a>
   <a id="button01">下一页</a>
   <a id="button04">未页</a>
   <p>第${xyy+1}页/共<span id="sgdsy">${a }</span>页</p>
   <input type="hidden" name="xyy" class="xyy" value="${xyy }" />
   </div> --%>
  </body>
</html>
