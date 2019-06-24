
//確認姓名
function check_user_id() {
	var name = document.getElementById("user_id_in").value;  
	var word = document.getElementById("user_id_show"); 
	
	//限制帳號的範圍 
	// 正規表示式
	// [a-z0-9] 表示 小寫a-z 數字 0-9
	// [a-zA-Z0-9] 表示 小寫a-z 大寫A-Z 數字 0-9 皆可行
	// [\u4e00-\u9fa5] 代表unicode的中文編碼(共20901個)
	var reg = /^([\u4e00-\u9fa5]|[a-zA-Z0-9]){2,15}|[\r\t\n\f]$/i;      
	
	//判斷式
	if(reg.test(name)){
		word.innerHTML = "".fontcolor("green");
		document.getElementById("a").className = "glyphicon glyphicon-ok green";   
		return true;
	}else{
		word.innerHTML = "<br>請輸入2-15位字母，不得使用特殊符號".fontcolor("red");
		document.getElementById("a").className = "glyphicon glyphicon-remove red";    
		return false;  
	}
}


//確認密碼
function check_user_password(){  
		//讀取接收的值
	    var password = document.getElementById("user_password_in").value;  
		var word = document.getElementById("user_password_show");  
	    
		//限制密碼的範圍
	    var reg = /^([a-zA-Z0-9]){8,16}$/i;
		
		//判斷式
	    if(reg.test(password)){  
	        word.innerHTML = "".fontcolor("green");  
			document.getElementById("a1").className = "glyphicon glyphicon-ok green";   
			return true;
	    }else{  
	        word.innerHTML = "<br>密碼長度限於8-16位，僅能輸入英文字母及數字".fontcolor("red");  
			document.getElementById("a1").className = "glyphicon glyphicon-remove red";    
			return false;  
	    }     
	}   
	
function check_password2(){  
		
	    var password = document.getElementById("user_password").value;  
		var password2 = document.getElementById("user_password2").value;
		var word = document.getElementById("password2_show");  
	    

	    if(reg.test(password)){  
		        pwcheck.innerHTML = "".fontcolor("green");  
				document.getElementById("a").className = "glyphicon glyphicon-ok green";   
				return true;
		    }else{  
		        pwcheck.innerHTML = "密碼長度限於8-16位，僅能輸入英文字母及數字".fontcolor("red");  
				document.getElementById("a").className = "glyphicon glyphicon-remove red";    
				return false;  
		    }     
		}  
	
	
function checkAll(){  
	var username = check_user();
	var password = check_password();  

		        if(username && password ){  
		            return true;  
		        }else{  
		            return false;  
		        }  

		    } 