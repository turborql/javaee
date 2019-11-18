package com.banyuan.test2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test1 {
	public static void main(String[] args) {
		try {
			BufferedReader br=new BufferedReader(new FileReader("ccc"));
			BufferedWriter bw=new BufferedWriter(new FileWriter("ddd"));
			String line;
			while((line=br.readLine())!=null) {
				System.out.println(line);
				System.out.println();
			}
		}catch(FileNotFoundException e) {
			e.getMessage();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
