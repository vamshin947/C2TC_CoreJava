package com.cg.exceptionhandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Trywithresources {
	
	
	//every thing cannot be used in try block to close using try block 
	//which ever condition satisfy the Auto closable used in try block.
		public static void main(String[] args) throws Exception {
			File file = new File("./sample.txt");
			if(!file.exists())
				file.createNewFile();
			
			try(
					FileReader fr = new FileReader(file);
					FileInputStream fis = new FileInputStream(file);
					InputStreamReader isr = new InputStreamReader(fis);
					BufferedReader br = new BufferedReader(isr);
					){
				String test = new String();
				String line = new String();
				while((line = br.readLine())!= null) {
					test +=line+"\n";
				}
				System.out.println(test);
			}catch(Exception e) {
				e.printStackTrace();
			}

	}

}
