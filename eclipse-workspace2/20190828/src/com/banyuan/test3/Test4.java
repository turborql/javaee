package com.banyuan.test3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {
	public static void main(String[] args) {
		System.out.println("请输入：");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line = null;
			while (!(line = br.readLine()).equals("quit")) {
				System.out.println("line=" + line);		
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
