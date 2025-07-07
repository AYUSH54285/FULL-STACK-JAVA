//package com.pack2;
//
//import com.pack1.ClassA;
//
//public class ClassX {
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		aobj.meth1();
//	}
//}


// 11/4/25
//package com.pack2;
//
//import com.pack1.ClassA;
//
//public class ClassX extends ClassA{
//	public static void main(String[] args) {
//		ClassX xobj = new ClassX();
//		xobj.meth1();
//	}
//}



//14/5/25

//package com.pack2;
//
//import com.pack1.ClassA; // 1st way to use class present in another package 
////import com.pack1.ClassB;
//
////import com.pack1.*; // 2nd way to use class present in diff package ( not recommended) 
//
//public class ClassX {
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		aobj.meth1();
//		
//		com.pack1.ClassB bobj = new com.pack1.ClassB(); // 3rd way using fully qualified class name
//		bobj.meth2();
//	}
//}

// understanding access modifiers
//package com.pack2;
//
//import com.pack1.ClassA; 
//
//
//public class ClassX extends ClassA {
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//			// aobj.meth1(); // CE because we can not access protected method with the parent class obj in child class so in the next line we use the child class object for access the parent class method
//			new ClassX().meth1();
//		}
//}
//ClassA => parent Class
//ClassX => child Class
//private>default>protected>public => remember this we will use this in OOPS(Polymorphism ==> Method Overriding)


//29/5/25
//Understanding of Inheritance
// multilevel inheritance

//package com.pack2;
//import com.pack1.ClassB;
//
//public class ClassX extends ClassB{
//	void meth3() {
//		System.out.println("ClassX method called");
//	}
//	public static void main(String[] args) {
//		ClassX xobj = new ClassX();
//		xobj.meth1();
//		xobj.meth2();
//		xobj.meth3();
//	}
//}


//30/5/25
// hierarchical Inheritance & Hybrid Inheritance
//package com.pack2;
//import com.pack1.ClassB;
//
//public class ClassX extends ClassB{
//	public static void main(String[] args) {
//		new ClassX().meth1();
//	}
//}
