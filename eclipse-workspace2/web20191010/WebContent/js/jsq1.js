function insert(num){
	document.form.count.value=document.form.count.value+num
//	document.form.count.value=document.form.count.valuexnum
//	document.form.count.value=document.form.count.value÷num
//	document.getElementById("result").innerHTML=a-b
	
}
function result(){
	var exp=document.form.count.value
	
		document.form.count.value=eval(exp)	
	
}
function clean(){
	document.form.count.value=null;//或者=""
}
function sign(){
	math.abs(document.form.count.value) 
}


