
//30/5/25
// hierarchical Inheritance & Hybrid Inheritance
//package com.pack1;
//
//public class ClassC extends ClassA{
//	public static void main(String[] args) {
//		new ClassC().meth1();
//	}
//}


//Multiple Inheritance 
//package com.pack1;
//
//public class ClassC extends ClassA, ClassB{
//	public static void main(String[] args) {
//		new ClassC().meth1(); //ambiguity problem in class for multiple inheritance so we use Interface
//	}
//}



//2/6/25
//Understanding Function overriding
//package com.pack1;
//public class ClassC extends Object
//{
//	@Override
//	public String toString() {
//		return "java is awesome";
//	}
//	public static void main(String[] args) {
//		ClassC cobj = new ClassC();
//		System.out.println(cobj);
//		System.out.println(cobj.toString());
//	}
//}


//5/6/25

// example-1
//package com.pack1;
//public class ClassC extends ClassB{
//	void meth1() {
//		System.out.println("Java is awesome");
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassB();
//		aobj.meth1();
//		ClassA aobj2 = new ClassC();
//		aobj2.meth1();
//	}
//}



//19/6/25 
//clone method
//package com.pack1;
//
//public class ClassC{
//	void meth1() throws CloneNotSupportedException{
//		System.out.println("Implementing Object Cloning");
//		
//		ClassA aobj1 = new ClassA();
//		System.out.println(aobj1.x +" "+aobj1.y);
//		
//		ClassA aobj2 = aobj1;
//		aobj2.y=999;
//		System.out.println(aobj1.x+" "+aobj1.y+" "+aobj2.y);  // here copy is not done
//		
//		ClassB bobj1 = new ClassB();
//		System.out.println("\n"+bobj1.a+" "+bobj1.b);
//		
//		ClassB bobj2 = bobj1.createClone(); // here copy is done so changes in copy not original object
//		bobj2.b=999;
//		System.out.println(bobj1.a+" "+bobj1.b+" "+bobj2.b);
//
//	}
//	public static void main(String[] args) throws CloneNotSupportedException{
//		ClassC cobj = new ClassC();
//		cobj.meth1();
//	}
//}


//23/6/25
//ObjectStream
//package com.pack1;
//import java.io.ObjectOutputStream;
//import java.io.ObjectInputStream;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//public class ClassC{
//	void meth1() throws Exception{
//		System.out.println("Implementation Serialization");
//		
//		ClassA aobj1 = new ClassA();
//		ClassB bobj1 = new ClassB();
//		System.out.println(aobj1.a+" "+aobj1.b);
//		System.out.println(bobj1.x+" "+bobj1.y);
//		
//		//remember file path should be in the format of ".ser"
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\STUDY\\JAVA FULL STACK\\file8.ser"));
//		System.out.println("\nConnection Created");
//		oos.writeObject(aobj1); // if we don't want to provide the access of instance variable(original value) then we need to make the variable as transient(default value variable stored in the object during serializable)
//		oos.writeObject(bobj1);
//
//		System.out.println("Serilization Completed");
//		oos.close();
//		
//		System.out.println("Implementing DeSerilization\n");
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\STUDY\\JAVA FULL STACK\\file8.ser"));
//		System.out.println("\nConnection created");
//		ClassA aobj2 = (ClassA)ois.readObject();
//		ClassB bobj2 = (ClassB)ois.readObject();
//		System.out.println(aobj2.a+" "+aobj2.b);
//		System.out.println(bobj2.x+" "+bobj2.y);
//
//		ois.close();
//	}
//	public static void main(String[] args) throws Exception {
//		ClassC cobj = new ClassC();
//		cobj.meth1();
//	}
//}
