package com.pawan.choure.ocjp7.chapter2;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

@SuppressWarnings("ALL")
public class SetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List list = Arrays.asList(10, 5, 10, 20); // LINE A
		System.out.println(list);
		System.out.println(new HashSet(list));
		System.out.println(new TreeSet(list));
		System.out.println(new ConcurrentSkipListSet(list));
	}

}
