package com.banyuan.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class MyFactory {

	private static HashMap<String ,Object> objects=new HashMap<>();
	
	static {
		BufferedReader br=null;
		
		try {
			br=new BufferedReader(new FileReader("object.properties"));
			String line=null;
			while((line=br.readLine())!=null) {
				String[] arr=line.split("=");
				String key=arr[0];
				String value=arr[1];
				
				
				Class c1=Class.forName(value);
				Object obj=c1.newInstance();
			
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}
