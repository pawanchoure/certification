package com.pawan.choure.ocjp7.chapter2;

public class StringInternExample {

	public static void main(String[] args) {
		String s1 = "Rakesh";
		String s2 = "Rakesh";
		String s3 = "Rakesh".intern();
		String s4 = new String("Rakesh");
		String s5 = new String("Rakesh").intern();

		if ( s1 == s2 )
		    System.out.println("s1 and s2 are same");  // 1.
		else
			System.out.println("s1 and s2 are not same");  // 1.


		if ( s1 == s3 )
		    System.out.println("s1 and s3 are same" );  // 2.
		else
			System.out.println("s1 and s3 are not same" );  // 2.
		

		if ( s1 == s4 )
		    System.out.println("s1 and s4 are same" );  // 3.
		else
			System.out.println("s1 and s4 are not same" );  // 3.

		if ( s1 == s5 )
		    System.out.println("s1 and s5 are same" );  // 4
		else
			System.out.println("s1 and s5 are not same" );  // 4
		
		if ( s4 == s5 )
		    System.out.println("s4 and s5 are same" );  // 4
		else
			System.out.println("s4 and s5 are not same" );  // 4

	}

}
