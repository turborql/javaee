package com.banyuan.Innerclass;

//import com.banyuan.Innerclass.OuterDemo.Inner;

public class Test {
public static void main(String[] args) {
	OuterDemo o=new OuterDemo();
	//Inner i=o.new Inner();//这步为什么需要导包？
	OuterDemo.Inner i=o.new Inner();//这种方法不需要导包
	i.fun();
	
}
}
