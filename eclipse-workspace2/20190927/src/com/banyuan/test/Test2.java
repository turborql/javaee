package com.banyuan.test;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Test2 {
	private static final Logger logger=Logger.getLogger("com.banyuan.test.Test2");
	
	
public static void main(String[] args) {
	Test2 t=new Test2();
	
	t.function1();
	t.function2();
	t.function3();
	t.function4();
	t.function5();
	t.function6();
	t.function7();
}

public void function1() {
	logger.log(Level.SEVERE, "hellosevre");
}

public void function2() {
	logger.log(Level.CONFIG, "hellocofig");
}
public void function3() {
	logger.log(Level.FINE,"hellofine");
}
public void function4() {
	logger.log(Level.FINER, "hellofiner");
}

public void function5() {
	logger.log(Level.FINEST, "hellofinest");
}
public void function6() {
	logger.log(Level.WARNING, "hellowarning");
}
public void function7() {
	logger.log(Level.INFO, "helloinfo");
}

}
