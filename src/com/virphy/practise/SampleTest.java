package com.virphy.practise;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.virphy.utils.PropFileHandler;

public class SampleTest {
	public static  WebBrowser driver;

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		System.out.println(PropFileHandler.fetchKey("username"));
	}

}
