package com.banyuan.test7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("a")));
		int len = 0;
		char[] b = new char[3];
		String s = "";
		int i = 1;
		while ((len = br.read(b)) != -1) {
			if (i == 1) {

			} else {
				s += ',';
			}
			s += new String(b, 0, len);
			i++;
		}
		System.out.println(s);
		br.close();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("a")));
		bw.write(s);
		bw.close();
    
	}

}
