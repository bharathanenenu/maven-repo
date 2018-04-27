package com.virphy.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropFileHandler {
	public static Properties OR;
	public static InputStream input;
	public static String Filepath=System.getProperty("user.dir")+"\\OR.properties";
	
	public static String fetchKey(String Key) throws IOException,FileNotFoundException {
		OR = new Properties();
		input= new FileInputStream(Filepath);
		OR.load(input);
		
		//Retrieve values through properties key
		
		String value= OR.getProperty(Key);
		return value;
				
		
	}
	

}
