package com.banyuan.test3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*子类中的构造方法：作用：绑定数据的输出目的
参数：File 封装文件
     String 字符串的文件名
流对象的构造方法可以根据路径创建文件，如文件已经存在会覆盖
流对象的使用步骤：1.创建流子类的对象，绑定数据目的
               2.调用流对象的方法write写
               3.close释放资源
*/

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		try {
			OutputStream os=new FileOutputStream("one");
			//输出d
			os.write(100);//有可能文件写满了写不进去，所以要抛异常
		    //输出100
			os.write(49);
		    os.write(48);
		    os.write(48);
		    //写字节数组
		    byte[] b= {65,66,67};
		    //写字节数组的一部分,开始的索引，写几个
		    os.write(b, 0, 2);
		    //写字符串
		    os.write("hello".getBytes());
		    
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
