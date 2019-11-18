function testTimeOut(){
	window.setTimeout("alert('a')",3000);
	
}
function testInterval(){
	//每隔一秒执行一次（周期性的执行）
	window.setInterval('alert("b")',1000);
}