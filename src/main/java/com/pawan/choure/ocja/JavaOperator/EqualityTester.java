package com.pawan.choure.ocja.JavaOperator;

/**
 * Created by Pawan on 6/5/2016.
 */
public class EqualityTester {
    public static void main(String[] args) {
        EqualityTester b1 = new EqualityTester();
        EqualityTester b2 = new EqualityTester();
        EqualityTester b3 = b1;
        String s1 = "Bob";
        String s2 = "Bob";
        String s3 = "bob"; // lower case "b"
        System.out.println(b1.equals(b2)); // false, different objects
        System.out.println(b1.equals(b3)); // true, same objects
        System.out.println(s1.equals(s2)); // true, same values
        System.out.println(s1.equals(s3)); // false, values are case sensitive
    }
}
