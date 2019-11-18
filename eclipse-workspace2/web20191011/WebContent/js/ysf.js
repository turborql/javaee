function test1(){
	var iNum1=25;
	var iNum2=~iNum1;
	alert(iNum2);
}
function test2(){
	var iResult = 25 & 3;
	alert(iResult);	
}
function test3(){
	var iResult = 25 | 3;
	alert(iResult);
}
function test4(){
	var iResult = 25 ^ 3;
	alert(iResult);	
}
function test5(){
	var iOld = 2;		
	var iNew = iOld << 5;
	alert(iNew);	
}
function test6()
{
	var iOld = 64;		//等于二进制 1000000
	var iNew = iOld >>> 5;
	alert(iNew);
	}