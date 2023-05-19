package com.cg.exceptionhandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;

public class MultipleExceptions {

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
				
				int[] arr = {1,2};
				System.out.println(arr[2]/0);
			}
			catch(FileNotFoundException | ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
//			catch(ArrayIndexOutOfBoundsException ar) {
//				ar.printStackTrace();
//			}
				
	}
	}
