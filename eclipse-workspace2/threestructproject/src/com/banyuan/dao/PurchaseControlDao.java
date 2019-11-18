package com.banyuan.dao;

import java.sql.ResultSet;
import java.util.Vector;

import com.banyuan.entity.Commodity;

public interface PurchaseControlDao {

	public Vector getData(ResultSet rs);

//		public Vector getDataByName(Commodity Commodity);
//		public void updateData(Commodity Commodity);
//		public void insertData(Commodity Commodity);
//		public void deleteData(Commodity Commodity) ;
	// 查看指定编号的商品
	Commodity findCommodity(String id);

}
