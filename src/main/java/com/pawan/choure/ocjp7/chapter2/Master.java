package com.pawan.choure.ocjp7.chapter2;

class Worker extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName()+"WWWW");
	}
}

public class Master {

	public static void main(String[] args) throws InterruptedException {
		Thread.currentThread().setName("Master ");
		Thread worker = new Worker();
		worker.setName("Worker ");
		worker.start();
		Thread.currentThread().join();
		System.out.println(Thread.currentThread().getName());

	}

}
