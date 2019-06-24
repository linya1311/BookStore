
//確認帳號
function check_userID() {
	//document.form名稱.input名稱
	var name = document.getElementById("user_id").value;  
	var namecheck = document.getElementById("userID_show"); 
	
	//限制帳號的範圍 
	// 正規表示式
	// [\r\t\n\f] 表示 空格
	// [a-z0-9] 表示 小寫a-z 數字 0-9
	// [a-zA-Z0-9] 表示 小寫a-z 大寫A-Z 數字 0-9 皆可行
	// [a-zA-Z0-9-] 表示 英文大小寫+數字+ 「-」
	// [a-zA-Z0-9_] 表示 英文大小寫+數字+ 「_」
	// [\u4e00-\u9fa5] 代表unicode的中文編碼(共20901個)
	// /i表示不分大小寫
	// [\u0040] 代表@
	/*
	([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/
	代表 使用者名稱@某某名稱.ooo(.ooo)，代替大多數的email	
	 */
	var reg0 = /[\u0040]/;    
	var reg1 = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/;
	var reg = /^([a-z0-9_]){2,15}$/i;
	
	//判斷式
	if(reg0.test(name)){
		if(reg1.test(name)){
			namecheck.innerHTML = "信箱格式正確".fontcolor("green");
			document.getElementById("nameclass").className = "icon ticker";
			return true;
		}else{
			namecheck.innerHTML = "信箱格式錯誤，請重新輸入".fontcolor("red");
			document.getElementById("nameclass").className = "icon into";    
			return false;  
		}
	}
	else{
		if(reg.test(name)){
			namecheck.innerHTML = "格式正確".fontcolor("green");
			document.getElementById("nameclass").className = "icon ticker";
			return true;
		}else{
			namecheck.innerHTML = "請輸入2-15位字母(包含底線)，<br>不得使用特殊符號".fontcolor("red");
			document.getElementById("nameclass").className = "icon into";    
			return false;  
		}
		
	}



//確認密碼
function check_password(){  
		//讀取接收的值
	    var password = document.getElementById("user_password").value;  
		var pwcheck = document.getElementById("password_show");  
	    
		//限制密碼的範圍
	    var reg = /^([a-zA-Z0-9]){8,16}$/i;
		
		//判斷式
	    if(reg.test(password)){  
	        pwcheck.innerHTML = "格式正確".fontcolor("green");  
	        document.getElementById("passwordclass").className = "icon ticker";   
	        return true;  
	    }else{  
	        pwcheck.innerHTML = "密碼長度限於8-16位，<br>僅能輸入英文字母及數字".fontcolor("red");  
	        document.getElementById("passwordclass").className = "icon into";    
	        return false;  
	    }     
	}   
	
	
function checkAll(){  
	var username = check_userID();
	var password = check_password();  

		        if(username && password ){  
		            return true;  
		        }else{  
		            return false;  
		        }  
	}
}

