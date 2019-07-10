package com.pawan.choure.ocjp7.chapter2;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public class StringSplitVsPatternSplit {
	static Pattern pattern = Pattern.compile(" ");

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long begin = System.nanoTime();
		
		ArrayList<String[]> list = new ArrayList<String[]>(1000000);
		for (int i = 0; i < 1000000; i++)
		{
		  String[] split = "Hello World".split(" ");
		  list.add(split);
		}
		
		/*
		 * 1000000
		 * 1655
		 */
		 
		for (int i = 0; i < 1000000; i++)
		{
			String[] split = pattern.split("Hello World", 0);
			list.add(split);
		}
	 
		long end = System.nanoTime();
		System.out.println(list.size());
	 
		System.out.println(TimeUnit.MILLISECONDS.convert(end-begin,TimeUnit.NANOSECONDS));
		
		/*
		 * 1000000
		 * 1171
		 */


	}

}
