// 9/4/25

// class loader
//package com.pack1;
//
//public class ClassB{
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		aobj.meth1(); // dependency for linking
//	}
//	
//}




// 11/4/25

//package com.pack1;
//
//public class ClassB extends ClassA{
//	void meth2() {
//		System.out.println("ClassB meth2() called");
//	}
//	public static void main(String[] args) {
//		ClassB bobj = new ClassB();
//		bobj.meth1();
//		bobj.meth2();
//	}
//}


//14/5/25
//package com.pack1;
//public class ClassB{
//	public void meth2() {
//		System.out.println("class-B method");
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		aobj.meth1();
//	}
//}


// 16/4 -  Understanding java main method
//package com.pack1;
//
//public class ClassB{
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		aobj.meth1();
//	}
//}

//23/4/25
//package com.pack1;
//public class ClassB{
//	void meth2() {
//		
//	}
//	ClassB(String s){
//		System.out.println("ClassB parameterized constructor called: ", + s);
//	}
//	public static void main(String[] args) {
//		ClassB bobj = new ClassB();
//	}
//}

//package com.pack1;
//public class ClassB{
//
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		aobj.meth1();
//	}
//}






//28/5/25

//Understanding encapsulation -> NOTE: You don’t need inheritance (extends) just to use another class’s object, You're creating an instance (object) of ClassA inside ClassB

//package com.pack1;
//import java.util.Scanner;
//
//public class ClassB{
//	void meth1() {
//		System.out.println("implementing ENCAPSULATION \n");
//		
//		Scanner sc = new Scanner(System.in);
//		ClassA aobj = new ClassA();
//		
//		System.out.println("Enter Employee Name");
////		aobj.empName = sc.nextLine(); // C.E because accessing a private variable 
//		aobj.setEmpName(sc.nextLine()); // using setters method
//		
//		System.out.println("Enter Employee Salary");
////		aobj.empSal=Integer.parseInt(sc.nextLine());
//		aobj.setEmpSal(Integer.parseInt(sc.nextLine()));
//
//		System.out.println("Enter Employee Department");
////		aobj.empDept = sc.nextLine();
//		aobj.setEmpDept(sc.nextLine());
//
//		
//		System.out.println("\n-----------Employee Data----------");
//		//System.out.println("Employee Name : "+aobj.empName);
//		System.out.println("Employee Name : "+aobj.getEmpName()); // using getters method
//		//System.out.println("Employee Salary : "+aobj.empSal);
//		System.out.println("Employee Name : "+aobj.getEmpSal());
//		//System.out.println("Employee Department : "+aobj.empDept);
//		System.out.println("Employee Name : "+aobj.getEmpDept());
//
//		
//		sc.close();
//	}
//	public static void main(String[] args) {
//		ClassB bobj = new ClassB();
//		bobj.meth1();
//	}
//	
//}

//Task-1
//package com.pack1;
//import java.util.Scanner;
//
//public class ClassB{
//	void meth1() {
//		System.out.println("implementing ENCAPSULATION \n");
//		
//		Scanner sc = new Scanner(System.in);
//		ClassA aobj = new ClassA();
//		
//		System.out.println("Enter Employee Name");
//		aobj.setEmpName(sc.nextLine()); // using setters method
//		
//		System.out.println("Enter Employee Experience");
//		aobj.setEmpExp(Integer.parseInt(sc.nextLine()));
//		
//		System.out.println("Enter Employee Salary");
//		aobj.setEmpSal(Integer.parseInt(sc.nextLine()));
//		
//		
//		
//		System.out.println("\n-----------Employee Data----------");
//		System.out.println("Employee Name : "+aobj.getEmpName()); // using getters method
//		System.out.println("Employee exp : "+aobj.getEmpExp());
//
//		System.out.println("Employee sal : "+aobj.getEmpSal());
//
//		
//		sc.close();
//	}
//	public static void main(String[] args) {
//		ClassB bobj = new ClassB();
//		bobj.meth1();
//	}	
//}


//29/5/25
//Understanding of Inheritance
/*
package com.pack1;

public class ClassB extends ClassA{
	void meth2() {
		System.out.println("ClassB method called");
	}
	public static void main(String[] args) {
		ClassA aobj1 = new ClassA(); // 1st point ==> Has-A-Relation
		aobj1.meth1();
		//aobj1.meth2();
		
		ClassA aobj2 = new ClassB(); //2nd point
		aobj2.meth1();
		//aobj2.meth2();  
		//Even though the real object is new ClassB() (Child), the reference type is ClassA (Papa). 
        //So the compiler only allows access to whatever Papa knows — even if the actual object is capable of more.
         // Note:The reference type controls what is accessible at compile time.
         //  To solve this -> aobj2.meth2();  we can do downcasting -> ((ClassB)aobj2).meth2();
		
		ClassB bobj1 =new ClassB(); // 3rd point ---> IS-A-Relation
		bobj1.meth1();
		bobj1.meth2();
		
		//ClassB bobj2 = new ClassA(); //4th point ---> C.E
	}
}
*/


// multilevel inheritance
//package com.pack1;
//
//public class ClassB extends ClassA{
//	public void meth2() { // made it public for accessing from different package 
//		System.out.println("ClassB method called");
//	}
//}


//30/5/25
// hierarchical Inheritance & Hybrid Inheritance
//package com.pack1;
//public class ClassB extends ClassA{
//	public static void main(String[] args) {
//		new ClassB().meth1();
//	}
//}

//  Multiple Inheritance 
//package com.pack1;
//public class ClassB{
//	public void meth1() {
//		System.out.println("ClassB method");
//	}
//}

//Note: Constructor does not participate in Inheritance-> here super() is using explicitly for constructor call of parent class
//package com.pack1;
//public class ClassB extends ClassA{
//	void meth2() {
//		System.out.println("meth2()");
//		super.meth1();  //super
//	}
//	ClassB(){
//		this.meth2();  // before this line execution super() is call the parent class constructor
//		System.out.println("ClassB default Constructor");
//	}
//	ClassB(int x){
//		super(2000);  //super() with parameter
//		System.out.println("ClassB parameterized constructor : "+x);
//	}
//	public static void main(String[] args) {
//		ClassB bobj = new ClassB(5000);
//		bobj.meth2();
//		new ClassB();
//	}
//}



//Task-1
//package com.pack1;
//public class ClassB extends ClassA{
//	void display() {
//		System.out.println("hi");
//		super.meth4();
//	}
//	static int show(int a) {
//		System.out.println(a+a);
//		return a+a++;
//	}
//	ClassB(){
//		//NOTE- If you use this(), it must be the first statement, and in that case, 
//		// super() will be called in the target constructor of this(), not immediately.
//		this(show(50)); //Note: this will execute first before the super()
//		for(int i=1;;i++) {
//			super.meth4();
//			break;
//		}
//		System.out.println("hi");
//		System.out.println(show(50));
//	}
//	ClassB(int a){
//		System.out.println("===>"+(a+++show(50)));
//	}
//	public static void main(String[] args) {
//		new ClassB().display();
//	}
//}




//2/6/25
//Understanding Function overriding
//package com.pack1;
//public class ClassB extends ClassA{
//	@Override  // Writing annotation here is not mandatory, annotations provides 
//	//additional informations both for the compiler and for the programmer
//	void meth1() { // it is overriding method
//		System.out.println(10);
//	}
//	@Override
//	String meth2(int num) {
//		System.out.println(20);
//		return "java is awesome";
//	}
//	public void meth3(int i, String msg) {
//		System.out.println(30);
//	}
//	static void meth4() { //we can not override the static method
//		System.out.println(40);
//	}
//	@Override
//	ClassB meth5() { //here we can override because the return type is not primitive it is object of different class and it is called co-varient concept
//		System.out.println(50);
//		return new ClassB();
//	}
//	public static void main(String[] args) {
//		
//		ClassA aobj1 = new ClassA();
//		aobj1.meth1(); //parent class method executed (early binding — compile time decision)
//		
//		ClassA aobj2 = new ClassB();
//		aobj2.meth1(); // child class mehtod execute due to function overridden
//		aobj2.meth2(100);
//		aobj2.meth3(100,"Java");
//		aobj2.meth4();
//		aobj2.meth5();
//	}
//}


//3/6/25
//Understanding Abstraction
//package com.pack1;
//public class ClassB extends ClassA{
//	@Override
//	void meth1() {
//		System.out.println("meth1() is Overridden");
//	}
//	@Override
//	String msg() {
//		System.out.println("msg() Overridden");
//		return "Java is awesome!";
//	}
//	@Override
//	boolean display(int x) {
//		System.out.println("display() Overridden");
//		return "Java".equalsIgnoreCase("java");
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassB(); 
//		aobj.meth2();
//		aobj.meth1();
//		System.out.println("msg() is returning : "+aobj.msg());
//		System.out.println("display() is returning : "+aobj.display(100));
//	}
//}


//4/6/25
//Understanding Interface

//package com.pack1;
//
//public class ClassB{
//	void greet() {
//		System.out.println("\nGood evening everyone!!");
//	}
//}



//5/6/25

// example-1
//package com.pack1;
//public class ClassB extends ClassA{
//	@Override
//	void meth1() {
//		System.out.println("Hello from ClassB");
//	}
//}



//14/6/25
//Methods use to control the flow of thread
//join(),sleep(),yield(), interrupt()

//join()
//package com.pack1;
//public class ClassB{
//	public static void main(String[] args) throws InterruptedException{
//		ClassA aobj = new ClassA();
//		aobj.start();  // we don't need to use inheritance here , we are just using the ClassA object here.
//		
//		aobj.join();//we want to execute the ClassA thread before ClassB thread hence we are using Join()
//		 // write join() only after start(), so it will useful otherwise useless
//		
//		for(int i=1 ; i<=5 ; i++) {
//			System.out.println("ClassB main(): "+i);
//		}
//	}
//}



//yield()
//package com.pack1;
//public class ClassB{
//	public static void main(String[] args) throws InterruptedException{
//		ClassA aobj = new ClassA();
//		aobj.start();  // we don't need to use inheritance here , we are just using the ClassA object here.
//		
//		Thread.yield();
//		for(int i=1 ; i<=5 ; i++) {
//			System.out.println("ClassB main(): "+i);
//		}
//	}
//}



//16/6/25
//synchronous
//package com.pack1;
//public class ClassB extends Thread{
//	@Override
//	public void run() {
//		String name = Thread.currentThread().getName();
//		System.out.println(name+" has entered criticalResource()");
//		synchronized (this) { //from here only one thread execute and this(locked current object that is bobj)
//			for(int i=1 ;i<=5 ;i++) {
//				System.out.println(name+"===>"+i);
//			}
//		}
//		System.out.println(name + " completed its execution");
//	}
//	
//	public static void main(String[] args) {
//		ClassB bobj = new ClassB();
//		Thread t1 = new Thread(bobj,"Thread-1");
//		Thread t2 = new Thread(bobj,"Thread-2");
//				
//		t1.start();
//		t2.start();
//	}
//}



//17/6/25
//Interthread Communication : wait(),notify(),notifyAll()
//package com.pack1;
//public class ClassB{
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		new Thread() { //FIrst thread
//			//anonymous Inner Class Starts here
//			@Override
//			public void run() {
//				try {
//					aobj.with_draw(4000);
//				}
//				catch(InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//		}.start(); //Anonymous Inner Class Ends here
//		
//		
//		new Thread() { //Second Thread
//			//Anonymous Inner Class Starts here
//			@Override
//			public void run() {
//				aobj.deposit(90000);
//			}
//		}.start(); //Anonymous Inner Class Ends here
//		
//	}
//}


//19/6/25 

//clone method
//package com.pack1;
//public class ClassB implements Cloneable{
//	int a=100;
//	int b=200;
//	
//	ClassB createClone() throws CloneNotSupportedException {
//		ClassB obj = (ClassB)super.clone(); // calling parent class Object
//		return obj;
//	}
//}


//final method
//package com.pack1;
//public class ClassB extends ClassA{
//	@Override
//	void meth1() {
//		System.out.println("hi");
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassB();
//		aobj.meth1();
//	}
//}



//23/6/25
//ObjectStream
//package com.pack1;
//import java.io.Serializable;;
//public class ClassB implements Serializable{
//	int x=111;
//	int y=222;
//}



//26/6/25
//package com.pack1;
//import java.util.ArrayList;
//import java.util.Vector;
//
//public class ClassB{
//	Vector<ClassA> meth1(ArrayList<Object> al){
//		//Print the elements in ArrayList by using Vector
//		return new Vector<ClassA>();
//	}
//	public static void main(String[] args) {
//		//If there is any employee name matches which is palindrome 
//		//then count how many names are like that and Print them
//		ClassB obj = new ClassB();
//		ArrayList<Object> al= new ArrayList<Object>();
//		
//		Object ol1 = new Object("ayush",101,"CSE");
//		al.add(al);
//		obj.meth1(al);
//	}
//}


//1/7/25
////Comparator Interface
//package com.pack1;
//
//import java.util.Comparator;
//
//public class ClassB implements Comparator<Employee>{
//	@Override
//	public int compare(Employee o1,Employee o2) {
//		//return o1.getEmpId()-o2.getEmpId();
//		//return o1.getEmpName()-compareTo(o2.getEmpName());
//		return o1.getEmpDept().compareTo(o2.getEmpDept());
//	}
//}



//2/7/25
//method referencing
//package com.pack1;
//public class ClassB{
//	void show() {
//		System.out.println("non-static method referencing\n");
//		System.out.println(10);
//		System.out.println(20);
//		System.out.println(30);
//		
//	}
//	static void msg() {
//		System.out.println("static method referencing\n");
//		
//	}
//	ClassB(){
//		System.out.println("Constructor Referencing");
//	}
//}


// 4/7/25 
//Optional Class 
/*
 when we are dealing with NULL then we may be get NullPointerException then 
we have to find the Null pointer exception by searching in nested Classes.
So avoiding this we are Using "Optional Class"
*/
//import java.util.Optional;
//public class ClassB{
//	void meth1() {
//		String arr[] = new String[5];
//		arr[1] = "Kishan";
//		arr[2] = "Java";
//		
//		//System.out.println(arr[0].toUpperCase()); //it will give NullPointerException
//		
//		Optional<String> o=Optional.ofNullable(arr[0]);
//		System.out.println(o);
//		if(o.isPresent()) {
//			System.out.println("Data is Present");
//			System.out.println(o.get());
//		}
//		else {
//			System.out.println("Its empty");
//		}
//		
//	}
//	public static void main(String[] args) {
//		new ClassB().meth1();
//	}
//}