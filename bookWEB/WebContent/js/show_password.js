	
	//glyphicon glyphicon-eye-open
	//glyphicon glyphicon-eye-close
function hideShowPsw(){
	var thisInput = document.getElementById("user_password");	
	if (thisInput.type == "password") {
		thisInput.type = "text";
		document.getElementById("eye").className = "glyphicon glyphicon-eye-close";
	} else {
		thisInput.type = "password";
		document.getElementById("eye").className = "glyphicon glyphicon-eye-open";
	}
}


/*

var x = document.getElementsByTagName("DIV")[2].className;  //找第三個DIV的className  (從0開始)
document.getElementById("demo").innerHTML = x;   //x帶入 demo

之後在jsp撰寫 「<p id="demo"></p>」 就會將className顯示在jsp上

*/