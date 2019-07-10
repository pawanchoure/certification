package com.pawan.choure.ocjp7.chapter2;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;


@SuppressWarnings("ALL")
public class DequeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Deque<Integer> deque= new ArrayDeque<Integer>();
		deque.addAll(Arrays.asList(1, 2, 3, 4, 5));
		System.out.println("The removed element is: " + deque.remove()); // ERROR?

	}

}
