package com.pawan.choure.ocjp7.chapter2;
class Base {
	public static void foo(Base bObj) {
		System.out.println("In Base.foo()");
		bObj.bar();
	}

	public void bar() {
		System.out.println("In Base.bar()");
	}
}

class Derived extends Base {
	public static void foo(Base bObj) {
		System.out.println("In Derived.foo()");
		bObj.bar();
	}

	public void bar() {
		System.out.println("In Derived.bar()");
	}
}

public class OverrideTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Base bObj = new Derived();
		bObj.foo(bObj);
		
		Derived bObj2 = new Derived();
		bObj2.foo(bObj);

	}

}
