package com.banyuan.test2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
	OutputStream os=null;
		try {
		    os=new FileOutputStream("one");
			//1.写一个字节
			os.write(97);//结果：a。有可能文件写满了写不进去，所以要抛异常
		    //2.输出100，需要写3个字节才能表示100
			os.write(49);
		    os.write(48);
		    os.write(48);
		    /*一次写多个字节：
		     * 如果写的第一个字节是正数，那么显示的时候会查询ASCII编码表
		     * 如果写的第一个字节是负数，那么第一个字节和第二个字节，两个字节组成一个中文显示，查询系统默认码表（GBK）
		     * 
		     * */
		    //3.写字节数组(一次写多个字节)
		    byte[] b= {65,66,67};
		    byte[] b1= {-65,-66,-67,68,69};
		    os.write(b);//ABC
		    os.write(b1);//���DE
		    //4.写字节数组的一部分,开始的索引，写几个
		    os.write(b, 0, 2);
		    //5.写字符串,使用String类中的方法，将字符串转换为字符数组
//		    os.write("hello".getBytes());//hello
		    byte[] b2="你好".getBytes();
		    	os.write(b2);//你好
		    
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
		    if(os!=null){
		        try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		}
	}
}