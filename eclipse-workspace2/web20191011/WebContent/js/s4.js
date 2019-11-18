
var id=0;
function demo(){
	 id=window.setInterval(test,1000);
}

function testpause(){
	alert("aaa");
	window.clearInterval(id);
}
function testgoon(){
	id=window.setInterval(test,1000);
}