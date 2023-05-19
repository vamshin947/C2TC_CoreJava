package com.cg.exceptionhandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Throwkeywordd {

	public static void main(String[] args) throws Exception {
		File file = new File("./sample.txt");
		if(!file.exists())
			file.createNewFile();
		
		FileReader fr = new FileReader(file);
		FileInputStream fis = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		String test = new String();
		String line = new String();
		while((line = br.readLine())!= null) {
			test +=line+"\n";
		}
		System.out.println(test);
		fis.close();
		isr.close();
		fr.close();
		br.close();
		}

}
