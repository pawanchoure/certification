package com.pawan.choure.ocjp7.chapter2;

public class StringEquals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "hi";
		String s2 = new String("hi");
		String s3 = "hi";
		String s4= new String("hi");
		if (s1 == s2) {
			System.out.println("s1 and s2 equal");
		} else {
			System.out.println("s1 and s2 not equal");
		}
		if (s1 == s3) {
			System.out.println("s1 and s3 equal");
		} else {
			System.out.println("s1 and s3 not equal");
		}
		if (s3.equals(s4)) {
			System.out.println("s1 and s3 equal");
		} else {
			System.out.println("s1 and s3 not equal");
		}

	}

}
