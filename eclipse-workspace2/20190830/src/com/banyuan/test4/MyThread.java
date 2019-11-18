package com.banyuan.test4;

import java.util.Date;

public class MyThread implements Runnable{
   public void run() {
	   for(;;) {
		   Date date=new Date();
//		   System.out.println(date);
		   
		   try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
   }
}
