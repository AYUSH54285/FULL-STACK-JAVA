//4/6/25
//Understanding Interface

//package com.pack1;
//
//public interface InterfaceA {
//	public static final int x=10;
//	int y=20;
//	
//	public abstract void meth1();
//	
//	void meth2(String s);
//	
//	default void meth3() //Java 1.8v
//	{
//		System.out.println("interface-A default meth3() called");
//		this.meth5();
//	}
//	static void meth4() { //Java 1.8v
//		System.out.println("Interface A static meth4() called");
//		//this.meth5(); // C.E we can not use 'this' keyword inside the static area
//	}
//	private void meth5() { //Java 1.9v
//		System.out.println("Interface A private meth5() called");
//	}
//	public static void main(String[] args) {
//		System.out.println("Interface A main() called");
//		InterfaceA.meth4();
//		System.out.println("x : "+InterfaceA.x+" Y : "+InterfaceA.y);
//	}
//	
//}



//5/6/25
//remove the ambiguity using interface

//package com.pack1;
//public interface InterfaceA{
//	default void meth1() {
//		System.out.println("Interface-A method called");
//	}
//}


//2/7/25
//lambda expression
//package com.pack1;
//@FunctionalInterface
//public interface InterfaceA{
//	void meth1();
//}


//lambda expression(concept 2)
//package com.pack1;
//@FunctionalInterface
//public interface InterfaceA{
//	void meth1(int num1);
//}


//lambda expression(concept 3)
//package com.pack1;
//
//import java.util.ArrayList;
//
//@FunctionalInterface
//public interface InterfaceA{
//	int[] meth1(ArrayList<String> al);
//}


// method referencing
//package com.pack1;
//@FunctionalInterface
//public interface InterfaceA{
//	void meth1();
//}



//5/7/25
//Creating an object for interface 
//package com.pack1;
//public interface InterfaceA{
//	void msg1();
//	void msg2();
//}