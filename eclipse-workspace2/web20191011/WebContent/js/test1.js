alert("a>3"+("a">3));//false
alert(" 5 "==5);//ture

var num1=1;
var num2=2;
var a=num1<num2?num1:num2;//求两数的小值

var arr=new Array(3);
arr[0]=1;
arr[1]=2;
arr[2]=3;
for(var a in arr){
	document.write(arr[a]+"<br>");
	
}
//error
//for(var b on arr){
//	document.write(arr[b]+"<br>");
//	
//}