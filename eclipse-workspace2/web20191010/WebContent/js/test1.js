function test1() {
	a = 1;
	alert(typeof a);
	a = "abc";
	alert(a);
	// 变量未定义
	var b;
	alert(b);
	var c = null;
	alert(c);
	var d = true;
	alert(d);
	alert(isNaN(d));
}

function test2() {
	var person = {
		firstName : "zhang",
		lastName : "san"
	};
	alert(person.firstName);
	// 清空之前的赋值
	person = null;
	alert(person);
}
function test3() {
	// var a=new Array;括号可加可不加
	var a = new Array(3);
	// a[0]=1;
	// a[1]=null;
	// a[2]=3;
	alert(a);
	alert(a.length);
}
function test4() {
	var a = new Array;
	var b = new Array;
	var c = new Array;
	a[0] = b;
	a[1] = c;

	b[0] = 1;

	c[0] = "hello";

	alert(a);
}
function test04() {
	var a = new Array();
	var k = 0;
	for (var i = 1; i <= 9; i++) {
		for (var j = 1; j <= i; j++) {
			a[k++] = j + "*" + i + "=" + (i * j);
		}
	}
	// ？
	var div = document.getElementById("div1");
	// a[0] //1
	// a[1] a[2] //2
	// a[3] a[4] a[5] //3
	var content = "";
	var x = 1;// 行数
	var y = 0;
	for (var i = 0; i < a.length; i++) {
		content += a[i] + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
		if (i == 0 || i == y) {
			content += "<br>";
			x++;
			y += x;
		}

	}
	div.innerHTML = content;
}
function test05() {
	var num1 = document.getElementById("num1");
	var num2 = document.getElementById("num2");
	var n1=num1.value;
//	alert(n1);
	var n2=num2.value;
	
//	alert(typeof n1);
	//强制类型转换
	var a=parseInt(n1);
//	alert(typeof a);
	var b=parseInt(n2);
	document.getElementById("result").innerHTML=a+b;
}
function test06(){
	var num3=document.getElementById("num3");
	var num4=document.getElementById("num4");
	var n3=num3.value;
	var n4=num4.value;
	
	var c=parseInt(n3);
	var d=parseInt(n4);
	
	document.getElementById("result1").innerHTML=c*d;
	
}
function test07(){
	var num5=document.getElementById("num5");
	var num6=document.getElementById("num6");
	var n3=num5.value;
	var n4=num6.value;
	
	var c=parseInt(n3);
	var d=parseInt(n4);
	
	document.getElementById("result2").innerHTML=c/d;
}
function test08(){
	var oper=document.getElementById("oper");
	alert(oper.value.match(/\+/g))
}
function test09(){
	//注意空格
	//new的string和不new的是不一样的数据类型
	var a="hello";
//	var b="hello ";
//	var d=new String(" hello");
//	var e=new String(" hello");
//	var c=(a==b);
//	alert(c);//false
//	alert(a==d);//true只有==，没有equals和Java不一样
//	alert(d==e);//false
	//斜杠之间是要匹配的东西
	alert(a.match(/^hello$/g));
	
}
