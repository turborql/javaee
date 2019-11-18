package cmo.banyuan.test6;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class RundomNum implements Callable<Integer>{

	@Override
	public Integer call()/* throws Exception */{
		return new Random().nextInt(10);
	}
public static void main(String[] args) {
	//创建线程对象
	RundomNum r=new RundomNum();
	FutureTask rt= new FutureTask(r);
	Thread t=new Thread(rt);
	t.start();
	
}
}
