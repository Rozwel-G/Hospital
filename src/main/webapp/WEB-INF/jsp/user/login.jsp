<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">  
	<head>
		<%@include file="../common/quote-login.jsp" %>
	</head>
  	
  	<body class="login1">
    	<!-- Login Screen -->
    	<div class="login-wrapper">
    		<input id="gritter-light" checked="" type="checkbox" class="ace-switch ace-switch-5" />
      		<div class="login-container">
        		<h1>用户登录</h1>
        		<form id="validation-form" action="/Login" method="post">
          			<div class="form-group">
		           		<input class="form-control" placeholder="用户名" type="text" name="accountId">
		         	</div>
          			<div class="form-group">
		            	<input class="form-control" placeholder="密码" type="password" name="accountPassword">
		          	</div>
          			<div class="form-options clearfix">
            			<a class="pull-right" href="#" onclick="spsw()">忘记密码?</a>
           				<div class="text-left">
              				<label class="checkbox"><input type="checkbox"><span>记住密码</span></label>
            			</div>
          			</div>   		                        
        		<div class="social-login clearfix">
          			<input class="position:relative btn btn-primary pull-left facebook" type="submit" value="登录" />
        		</div>
        		</form> 
      		</div>
    	</div>
    <!-- End Login Screen -->
  	</body>
  	<script type="text/javascript">
	  	
	  	function spsw(){
	  		hint("请联系管理员");
	  	}	
	  	
	  	//弹出框提示
		function hint(result){
			$.gritter.add({
				// (string | mandatory) the heading of the notification
				title: '温馨提示',
				// (string | mandatory) the text inside the notification
				text: result,
				class_name: 'gritter-success' + (!$('#gritter-light').get(0).checked ? 'gritter-light' : '')
			});
			return false;
		}
	  	
	  	//表单验证
		function formValidate(){
			$("#validation-form").validate({
			    rules: {
			   	  	employeecode:{
			   	  		required:true,
			   	  		codeChar:true,
			   	  		minlength:3,
			        	maxlength:16,
			        	
			   	  	},
			   	  	psw:{
				        required: true,
			   	  		passChar: true,
				        minlength:3,
				        maxlength:16
			   	  	}
			    },
			    messages:{
			    	employeecode:{
			    		required:"请输入用户名",
			    		remote:"用户名不存在"
			    	},
			    	psw: {
			        	required: "请输入密码"
			      	}
			    },
				//重写提交方式
				submitHandler:function(){
					formSubmit();
				}		    
		    });
		}
  	</script>
</html>