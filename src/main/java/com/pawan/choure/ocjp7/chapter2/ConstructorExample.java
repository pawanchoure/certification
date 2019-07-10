package com.pawan.choure.ocjp7.chapter2;

public class ConstructorExample {

	private int x, y;
	public ConstructorExample(int x, int y) {
	this.x = x;
	}
	public String toString() {
	return "[" + x + ", " + y + "]";
	}
	public static void main(String[] args) {
		ConstructorExample point = new ConstructorExample(10, 20);
		System.out.println(point);

	}

}
