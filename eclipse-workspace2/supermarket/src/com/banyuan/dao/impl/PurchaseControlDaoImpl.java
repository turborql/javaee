package com.banyuan.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Vector;

import com.banyuan.dao.PurchaseControlDao;
import com.banyuan.entity.Commodity;
import com.banyuan.util.BaseDB;
import com.banyuan.util.JDBCUtil;
import com.banyuan.util.ResultSetDB;

public class PurchaseControlDaoImpl implements PurchaseControlDao{
        BaseDB bd=new BaseDB();
        JDBCUtil jc=new JDBCUtil();
        ResultSetDB rs=new ResultSetDB() {//接口/匿名内部类
        		public Vector getData(ResultSet rs) {
        			Vector d = new Vector();
        			try {
        				while (rs.next()) {
        					Vector line = new Vector();
        					line.add(rs.getObject(1));
        					line.add(rs.getObject(2));
        					line.add(rs.getObject(3));
        					line.add(rs.getObject(4));
        					line.add(rs.getObject(5));

        					d.add(line);
        				}
        			}
        			catch (SQLException e) {
        				e.printStackTrace();
        			}
        			return d;

        		}

        		
};

	@Override
	public Commodity findCommodity(int id) {
		Commodity comm=null;
		try {
			Connection conn=bd.getConnection();
			String sql="select * from commodity where commodityid=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setObject(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				String commodityname=rs.getString(1);
				int commodityid=rs.getInt(2);
				String unit=rs.getString(3);
				double price=rs.getDouble(4);
				int  count=rs.getInt(5);
				java.sql.Date date=rs.getDate(6);
				String expirationtime= rs.getString(7);
				
				
				//将数据库查出来的信息封装成一个类
				 comm=new Commodity();
				comm.setCommodityid(commodityid);
				comm.setCommodityname(commodityname);
				comm.setCount(count);
				comm.setExpirationtime(expirationtime);
				comm.setPrice(price);
				comm.setUnit(unit);
				comm.setWarehousingtime(date);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return comm;
	}

	@Override
	public Vector getDataByName(Commodity Commodity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateData(Commodity Commodity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertData(Commodity Commodity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteData(Commodity Commodity) {
		// TODO Auto-generated method stub
		
	}
 
//	@Override
//	public Vector getData(ResultSet rs) {
//		Vector d=new Vector();
//				
//				Vector line=new Vector();
//				try {
//					line.add(rs.getObject(1));
//					line.add(rs.getObject(2));
//					line.add(rs.getObject(3));
//					line.add(rs.getObject(4));
//					line.add(rs.getObject(5));
//					line.add(rs.getObject(6));
//					line.add(rs.getObject(7));
//					line.add(rs.getObject(8));
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				
//				d.add(line);
//		return d;
//		
//		
//		
//	}

//	@Override
//	public Vector getDataByName(Commodity Commodity) {
//		
//		return null;
//	}
//
//	@Override
//	public void updateData(Commodity Commodity) {
//	
//		
//	}
//
//	@Override
//	public void insertData(Commodity Commodity) {
//		
//		
//	}
//
//	@Override
//	public void deleteData(Commodity Commodity) {
//		
//		
//	}
//
//	
	
	

}
