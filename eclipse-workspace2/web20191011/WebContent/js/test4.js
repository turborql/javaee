function test1(){
	var a=window.confirm("hello");
	window.document.write(a);
}
function test2(){
	var a=window.prompt("请输入你的名字","abc");
	document.write(a);
}
function test3(){
	window.open("http://www.baidu.com","",'width=20,heigth=10');
}
function test4(){
	var a=document.getElementsByTagName("h1");
	for(var b of a){
		alert(b,innerHTML);
		
	}
}

function test5(){
	var a=document.getElementsByName("username");
	for(var b of a){
		alert(b.value);
		
	}
}
function test6(){
	if(a==1){
		history.back();
		
	}else if(a==2){
		history.forward();
	}else if(a==3){
		history.go(2);
	}
}