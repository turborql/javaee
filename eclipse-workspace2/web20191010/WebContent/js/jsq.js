function test1(){
	var num1=$('num1').value;
	a=parseInt(num1);
//	alert(typeof a);
	var num2=$('num2').value;
	b=parseInt(num2);
	var oper=$('oper').value;
//	alert(typeof oper);
	
//	var c=document.getElementById("result");
//	alert(c.length);
	if(! isNaN(a) && ! isNaN(b)){
	switch(oper){
	case '+': document.getElementById("result").innerHTML=a+b;break;
	case '-': document.getElementById("result").innerHTML=a-b;break;
	case '*': document.getElementById("result").innerHTML=a*b;break;
	case '/': document.getElementById("result").innerHTML=a/b;break;
	}
	}else{
		alert("请输入数值");
	}
}
function $(id){
	return document.getElementById(id);
}
