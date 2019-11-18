package com.banyuan.test;

import java.util.Vector;

import com.banyuan.dao.impl.PurchaseControlDaoImpl;
import com.banyuan.entity.Commodity;
import com.banyuan.service.impl.PurcharseControlServiceimpl;

public class Test1 {
public static void main(String[] args) {
	PurchaseControlDaoImpl pc=new PurchaseControlDaoImpl();
	 PurcharseControlServiceimpl ps=new PurcharseControlServiceimpl();
	//通过输入的商品编号，查询该商品的所有信息
	Commodity comm=ps.getData(1);
	
	if(comm==null) {
		System.out.println("没有此商品信息");
	}else {
		System.out.println(comm);
	}
}
}
