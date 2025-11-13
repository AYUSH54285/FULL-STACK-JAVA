//18/8/25  
//package com.pack1;
//
//public class ClassA {
//	InterfaceA meth1() {
//		System.out.println("meth1() called");
//		return new InterfaceA() {
//			@Override
//			public void msg() {
//				System.out.println("Java is awesome");
//			}
//			@Override
//			public void greeting() {
//				System.out.println("Good Evening!!!");
//			}
//		};
//	}
//	public static void main(String[] args) {
//		ClassA obj = new ClassA();
//		InterfaceA aobj = obj.meth1();
//		aobj.msg();
//		aobj.greeting();
//	}
//}


// 21/8/25
package com.pack1;
public class ClassA{
	// 1. we are using static here because we don't want to create an object of classA in classB for accessing the meth1,  by using static we can access the meth1 with the class name of ClassA
	// 2. we can also implement the msg and greeting inside the ClassA directly but then ClassA obj works for only interfaceA, so we create a meth1 of interfaceA type such that we can use ClassA for other works also using different method
	// 3. here we use anonymous inner class and returning object
	static InterfaceA meth1(String s1, String s2, String s3) {
		System.out.println("ClassA meth1() called");
		return new InterfaceA() {
			@Override
			public void msg() {
				System.out.println("msg() overridden");
			}
			public void greeting() {
				System.out.println("greeting() overridden");
			}
		};
	}
}
