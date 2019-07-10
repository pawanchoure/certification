package com.pawan.choure.ocjp7.chapter2;

abstract class AbstractBook {
public String name;
}
interface Sleepy {
public String names = "undefined";
}

public class Book extends AbstractBook implements Sleepy {
	public Book(String name) {
		this.name = name; // LINE A
		}
		public static void main(String []args) {
		AbstractBook philosophyBook = new Book("Principia Mathematica");
		System.out.println("The name of the book is " + philosophyBook.name); // LINE B
		}

}
