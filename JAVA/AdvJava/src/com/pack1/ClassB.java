// 21/8/25

package com.pack1;

public class ClassB {
	public static void main(String[] args) {
		InterfaceA iobj = ClassA.meth1("Hi","Hello","Java");
		iobj.msg();
		iobj.greeting();
	}
}