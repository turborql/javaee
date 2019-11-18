package com.banyuan.test1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test003 {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(new FileReader("ccc"));
			bw = new BufferedWriter(new FileWriter("ccc-copy"));
			String line = null;
			while ((line = br.readLine()) != null) {// 读一行
				bw.write(line);
				bw.newLine();
			}
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
					bw.close();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}

	}

}
