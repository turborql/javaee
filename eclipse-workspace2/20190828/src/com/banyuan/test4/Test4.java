package com.banyuan.test4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {
	public static void main(String[] args) {
		System.out.println("请输入：");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = null;
		try {
			 bw=new BufferedWriter(new FileWriter("ee"));
			String line = null;
			for(int i=1;i<=10;i++) {
				line=br.readLine();
					bw.write(i+"--"+line);
					bw.newLine();				
			}		
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
