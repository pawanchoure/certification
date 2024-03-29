package com.pawan.choure.ocjp7.chapter2;

public class Waiter extends Thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Waiter().start();
	}
	public void run() {
		try {
		System.out.println("Starting to wait");
		wait(1000);
		System.out.println("Done waiting, returning back");
		}
		catch(InterruptedException e) {
		System.out.println("Caught InterruptedException ");
		}
		catch(Exception e) {
		System.out.println("Caught Exception ");
		}
		}

}
