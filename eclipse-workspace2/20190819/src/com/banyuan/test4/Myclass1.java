package com.banyuan.test4;

public abstract class Myclass1 implements Myinterface {
//定义排序
	public void sort(Object[] array) {//多态思想
		for(int i=0;i<array.length-1;i++) {
			for(int j=0;j<array.length-1-i;j++) {
				//从小到大
				if(compare(array[j],array[j+1])>0) {
					Object obj=array[j];
					array[j]=array[j+1];
					array[j+1]=obj;
				}
			}
		}
	}
	//定义比较规则
	//0 ,-，+
	public abstract int compare(Object obj1,Object obj2); 
	
}
