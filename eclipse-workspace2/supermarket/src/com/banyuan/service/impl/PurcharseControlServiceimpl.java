package com.banyuan.service.impl;

import com.banyuan.dao.impl.PurchaseControlDaoImpl;
import com.banyuan.entity.Commodity;
import com.banyuan.service.PurcharseControlService;

public class PurcharseControlServiceimpl implements PurcharseControlService{
	
	PurchaseControlDaoImpl p=new PurchaseControlDaoImpl();

	@Override
	public Commodity getData(int id) {
//		Vector data=new Vector();
		Commodity comm=p.findCommodity(id);
//		data.add(comm);	
		
		return comm;
	}
	
	
	

}
