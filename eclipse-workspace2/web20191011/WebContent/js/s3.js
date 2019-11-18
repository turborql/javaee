function test(){
	        
	//创建一个事件（日期）对象
	var date=new Date();
//	alert(date);
	//获取年月日时分秒
	var str=date.getFullYear()+"年"+(date.getMonth()+1)+"月"+date.getDate()+"日"+date.getHours()+"时"+date.getMinutes()+"分"+date.getSeconds()+"秒";
//     alert(str);
     //将上面的日期放到div中
     document.getElementById("mydiv").innerHTML=str;
     window.setTimeout(test,1000);
}
