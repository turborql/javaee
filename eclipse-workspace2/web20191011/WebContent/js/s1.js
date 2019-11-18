function test1(){
//提示框
	alert('alert');
}
function test2(){
	//确定框
	var bool=confirm("confirm");
	alert(bool);//alert返回值true，确定效果；返回值是false，取消效果
}
function test3(){
//	有两个参数，
	var an=prompt('今天有晚自习吗？');//第一个参数：提问
	alert(an);//第二个参数，默认回答；如果第二个参数不写，默认没有回答；如果写了，就是写的文字
}