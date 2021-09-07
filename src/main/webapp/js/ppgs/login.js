window.onload = function(){
	
	var btnLogin = document.getElementById('btn-login');
	
	btnLogin.onclick = function(){

        var userID = document.getElementById('user-id').value;
        var userPW = document.getElementById('user-pw').value;

		$.ajax({ url :'/login.do'
			   , type : 'POST'
			   , dataType : 'text'//json 으로 받을꺼면 json 으로
		       , data : { userID : userID , 
		    	          userPW : userPW }
		       , success : function(data) {
		            console.log("success", data);
		       }
		       , error:function(request,status,error){
		    	   console.log("code = "+ request.status + " message = " + request.responseText + " error = " + error); // 실패 시 처리
		       }
		});
	}
}