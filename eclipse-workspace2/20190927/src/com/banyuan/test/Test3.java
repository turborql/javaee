package com.banyuan.test;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test3 {

	private static final Logger logger = Logger.getLogger("com.banyuan.test.Test3");

	public static void main(String[] args) {
		Test3 t = new Test3();
		t.function2();
		t.function1();
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
		logger.setLevel(Level.ALL);
		logger.setUseParentHandlers(false);
		Handler handler = new ConsoleHandler();
		try {
			Handler handeler2 = new FileHandler("ql.log");
		} catch (SecurityException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		handler.setLevel(Level.ALL);
		logger.addHandler(handler);
		logger.log(Level.CONFIG, "hellocofig");

	}

	public void function3() {
		logger.log(Level.FINE, "hellofine");
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
