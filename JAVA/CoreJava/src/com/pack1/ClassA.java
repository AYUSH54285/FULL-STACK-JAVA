// 9/4/25
// class loader 
//package com.pack1;
//public class ClassA{
//	void meth1() {
//		System.out.println("meth1() is called");
//	}
//}
//







// ----------------------------------------------------------------------------------------------

// 11/4/25
//package com.pack1;
//
//public class ClassA{
//	void meth1() {
//		System.out.println("ClassA meth1() called");
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		
//		aobj.meth1();
////		aobj.msg();
////		
//		aobj.hashCode();
////		aobj.nextInt();
//	}
//}

//
//package com.pack1;
//public class ClassA{
//	public static void main(String[] args) {
//		ClassA aobj1 = new ClassA(); //1st object
//		ClassA aobj2 = new ClassA(); //2nd Object
//		
//		System.out.println("aobj1 : "+aobj1.hashCode());
//		System.out.println("aobj2 : "+aobj2.hashCode());
//		
//		System.out.println("-------------------------------------");
//		
//		System.out.println(aobj1.equals(aobj2));
//		System.out.println(aobj1.equals(aobj1));
//		System.out.println(aobj2.equals(aobj2));
//		System.out.println(new ClassA().equals(new ClassA()));
//		System.out.println(aobj1.equals(new ClassA()));
//	}
//}

/*/.,m n
 * 
hashCode():
	
1) The return type for hashCode() is int.
2) hashCode() does not provides the address locations of an object.
3) It is going to provide a unique identification number for your object
	which is used to distinguish 2 different objects seperately
*/


/*
equals():
	
1) The return type for equals() is boolean(true/false)
2) equals() is going to compare the address locations of the objects
3) If BOTH the objects are present in the same address location then equals()
	is going to return true otherwise false
*/



// 12/4/25

//public class ClassA{
//	public static void main(String[] args) {
//		ClassA aobj1 = new ClassA(); // 1st object
//		ClassA aobj2 = new ClassA(); // 2nd object
//		
//		System.out.println("aobj1 : "+aobj1.getClass());
//		System.out.println("aobj2 : "+aobj2.getClass());
//		
//		System.out.println("\n aobj1 : "+aobj1.toString()); // com.pack1.Class@------
//		System.out.println("aobj2 : "+aobj1.toString()); // com.pack1.Class@------
//		
//	}
//}

/*

getClass() => It is going to return the fully Qualified Class name
		
toString() => It is going to convert an Object into a String format
				The return type for toString() is String
						
			public String toString() {
					return getClass().getName() + '@' + Integer.toHexString(hashCode());
				}
*/


//package com.pack1;
//
//public class ClassA{
//	void meth1() {
//		System.out.println("meth1() is called");
//	}
//	protected void finalize() {
//		System.out.println("Garbage has been collected");
//	}
//	public static void main(String[] args) {
//		ClassA aobj1 = new ClassA(); // 1st object
//		ClassA aobj2 = new ClassA(); // 2nd object
//		
//		aobj1.meth1(); 
//		aobj1.null; // nullifying the reference
//		System.gc(); // used to call the Garbage Collector manually
//		// aobj1.meth1(); // It generated NullPointerException
//	}
//}

/*
Finalize():
1) finalize will be called internally by the garbage collector
2) Garbage collector is going to call finalize() if there is an Object eligible for destruction
*/









// --------------------------------------------------------------------------------------



//package com.pack1;
//
//public class ClassA{
//	void meth1(){
//		System.out.println("Hi Java here meth1()");
//	}
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("Hi Java here");
//	}
//}


//package com.pack1;
//
//public class ClassA{
//	void meth1(){
//		System.out.println("meth1() is called");
//		System.out.println(10);
//		System.out.println(20);
//		System.out.println(30);
//		return;
//	}
//	int meth2() {
//		System.out.println("meth2() is called");
//		return 100;
////		System.out.println("Hello world"); // Code error due to unreachable code
//	}
//	int meth3(){
//		System.out.println("meth3() is called");
//		System.out.println("int & char both are compaitable datatypes");
//		return 'A';
//	}
//	ClassA meth4() {
//		System.out.println("meth4() is called");
//		return new ClassA();
//	}
//	int meth5(int i) { //i=5
//		System.out.println("meth() is called");
//		if(i<=10) {
//			System.out.println("If block executed");
//			return 1000;
////			System.out.println("hello"); //Code error due to unreachable code
//		}
//		else {
//			System.out.println("else block is executed");
//			return 5000;
////			System.out.println("hello"); //Code error due to unreachable code
//		}
//	}
//	public static void main(String[] args) {
//		System.out.println("Start");
//		ClassA aobj = new ClassA();
//		System.out.println("Java is awesome");
//		aobj.meth1();
//		System.out.println("----------------");
//		System.out.println("meth2() is returning : " +aobj.meth2());
//		System.out.println("------------------------");
//		System.out.println("meth3() is returning : " +aobj.meth3());
//
//		System.out.println("meth4() is returning : " +aobj.meth2());
//
//		System.out.println("meth5() is returning : " +aobj.meth2());
//
//		System.out.println("Start");
//		System.out.println("Start");
//		System.out.println("Start");
//		
//	}
//}



// 16/4 -  Understanding java main method
// Public

//package com.pack1;
//
//public class ClassA{
//	public void meth1() {  // here access modifier is public so it can be access from anyhwere but if it is private then we  can not access this method form anyother class.
//		System.out.println("Class A method");
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		aobj.meth1();
//	}
//}


//static

//package com.pack1;
//
//public class ClassA{
//	void meth1() {  
//		System.out.println("meth1 method");
//	}
//	static void meth2() {
//		System.out.println("meth2 called");
//	}
//	public static void main(String[] args) {
//		new ClassA().meth1();
//		ClassA.meth1();
//		
//		new ClassA().meth2(); // 
//		ClassA.meth2(); // not getting any error because static method can be called directly without using any object(static method is used for memory management)
//		
//	}
//}


// void

//package com.pack1;
//
//public class ClassA{
//	static int meth1() {
//		System.out.println("meth1() is called");
//		return 100;
//	}
//	public static int main(String[] args) {
//		System.out.println("main method");
//		ClassA.meth1();
//		return 1000;
//	}
//}



//17/4/25

//package com.pack1;
//public class ClassA{
//	public final static void main(String[] args) {
//		System.out.println("Java is awesome");
//	}
//}


// Assignment question
//package com.pack1;
//
//public class ClassA{
//	int meth1(int a, int b) {
//		return a+b+ meth2(a,b,1);
//	}
//	int meth2(int a, int b, int c) {
//		return meth3(a,b,c,2);
//	}
//	int meth3(int a, int b, int c, int d) {
//		return meth4(a,b,c,d,3);


//	}
//	int meth4(int a, int b, int c, int d, int e) {
//		return a+b+c+d+e;
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		int sum = aobj.meth1(3,4);
//		System.out.println(sum);
//	}
//}


// 19/4/25 -> datatypes

//package com.pack1;
//public class ClassA{
//	int i;
//	byte b;
//	short s;
//	long l;
//	
//	float f;
//	double d;
//	
//	char c;
//	boolean flag;
//	
//	void meth1() {
//		System.out.println("printing the default values of the datatypes\n");
//		System.out.println("int default value : "+i);
//		System.out.println("byte default value : "+b);
//		System.out.println("short default value : "+s);
//		System.out.println("long default value : "+l);
//		System.out.println("float default value : "+f);
//		System.out.println("double default value : "+d);
//		System.out.println("char default value : "+c); // \u0000 NPC -> it is depend upon the system where we execeute the code
//		System.out.println("Boolean default value : "+flag); // default value is false
//	}
//	void meth2() {
//		System.out.println("meth2() is called\n");
//		int i1=100;
//		int i2 = 50;
//		int i3 = i1+i2;
//		System.out.println("i3 :"+i3);
//		
//		byte b1=5;
//		byte b2 =10;
//		byte b3 = (byte)(b1+ b2);  //5+10 => 15 => default datatype is int hence we will do TYPE CASTING
//		// Arithmetical operations in java will be giving the result in either int or long
//		System.out.println("b3 : "+b3);
//		
//		float f=10.9F; // we use F or f for making it float because it is by default double
//		System.out.println("f : "+f);
//		// Every number in Java is by default considered as int by the compiler
//		// Every decimal value in Java is by default considered as double
//		
//		long x=2147483648L ; // the range of ordinary int  is -2147483638 to 2147483647
//		System.out.println("x :"+x);
//		
//		
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//    //aobj.meth1();
//		aobj.meth2();
//	}
//}


// 21/4/25

//package com.pack1;
//public class ClassA{
//	int x=10; // Instance variable or Non-static variable
//	static int y=20; // static variable or class Variable
//	
//	int a;
//	static boolean flag;
//	
//	String s;
//	
//	// static int x=1000; // instance and static variable name should not be same, hence it will give compile time error 
//	void meth1() {
//		int z=30;  // Local variable
//		
//		System.out.println("Instance vaiable : "+new ClassA().x); // accessing INstrance variable using object
//		System.out.println("Instance Variable: "+ x);// accessing instance variable using identifier name
//		
//		System.out.println("Static variable: "+new ClassA().y); // accessing static variable using Class object name
//		System.out.println("Static variable: "+y); // accessing static variable using identifier name
//		System.out.println("Static variable : "+ ClassA.y); //Accessing static variable using Class Name and this is recommended approach
//		
//		System.out.println("Local variable: "+z); // Local variable
//	}
//	void meth2() {
//		System.out.println("meth2 is called: ");
//		
//		int x=111; // priority given to local variable hence it will print
//		int y=222; // priority given to local variable hence it will print
//		System.out.println("Instance Variable: "+ x);// accessing instance variable using identifier name
//		System.out.println("Static variable: "+y); // accessing static variable using identifier name
//		
//		// System.out.println("Local variable: "+z); // it will give error due to local variable scope is where it declare
//		
//		
//		System.out.println("Instance vaiable : "+new ClassA().x);
//		System.out.println("Static variable: "+new ClassA().y);
//		System.out.println("Local variable: "+"x: "+x+"y: "+y);
//	}
//	void meth3() {
//		System.out.println("meth3() is called: ");
//		float f;
//		System.out.println("Instance variable: "+a);
//		System.out.println("Static variable: "+flag);
//		
//		System.out.println("Instance variable: "+s); 
//
//		
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
////		aobj.meth1();
////		aobj.meth2();
//		aobj.meth3();
//	}
//}
//
//






// 22/04/2025

//package com.pack1;
//
//public class ClassA{
//	void meth1() {
//		System.out.println("meth1() is called");
//		new ClassA(100); // parameterized constructor is called
//	}
//	ClassA(){
//		new ClassA(1000);
//		System.out.println("Non Parameterized constructor called ");
//	}
//	ClassA(int i){
//		System.out.println("Parameterized constructor called :"+i);
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();	// it will call the non parameterized constructor	
//		aobj.meth1();
//		new ClassA(500);
//	}
//}


// Task 1
//package com.pack1;
//
//public class ClassA{
//	public ClassA() {
//		System.out.println("Sunday");
//		ClassA obj = new ClassA(10);
//		System.out.println("Tuesday");
//		String s=obj.display("Challange Accepted");
//		System.out.println(s);
//	}
//	public ClassA(int temp) {
//		System.out.println("Saturday");
//		ClassA aobj = new ClassA(10,20);
//		int a=aobj.meth1() + temp;
//		System.out.println("==>"+(a+aobj.meth2()));
//		System.out.println("monday");
//	}
//	String display(String s) {
//		System.out.println("In the next statement I am returning String value");
//		return s;
//	}
//	int meth1() {
//		return 100;
//	}
//	int meth2() {
//		return 99;
//	}
//	public ClassA(int data,int temp) {
//		System.out.println("Thursday");
//		System.out.println("===>" + (data+new ClassA("Hi").meth2()-temp));
//	}
//	ClassA(String s){
//		System.out.println(s);
//	}
//	public static void main(String[] args) {
//		ClassA obj = new ClassA();
//		System.out.println("Output Verified");
//    }
//}
//




// Task 2
//package com.pack1;
//public class Programming{
//	Programming(){
//		System.out.println("I love Programming languages");
//	}
//	Programming(String s){
//		System.out.println("I love "+ s);
//	}
//	public static void main(String[] args) {
//		new Programming();
//		new Programming("java");
//		
//	}
//}


//Task 3
// Task 4





// 23/4/25

//package com.pack1;
//public class ClassA{
//	void meth1() {
//		System.out.println("ClassA called");
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		aobj.display();
//	}
//}


//package com.pack1;
//
//public class ClassA{
//	void meth1() {
//		System.out.println("meth1() is called");
//	}
//	void meth2() {
//		System.out.println("meth2() is called");
//	}
//	void meth3() {
//		System.out.println("meth3() is called");
//	}
//	private ClassA(){ // if we made const private then it restrict the use of class method for another class
//		System.out.println("const is called");
//	}
//}

// Task
//package com.pack1;
//public class ClassA{
//	int calculate(int x) {
//		System.out.println("Insisde calculate: "+x);
//		return x*3;
//	}
//	int compute(int a, int b) {
//		System.out.println("Inside compute: " + a + "," + b );
//		return a+b;
//	}
//	int process(int m, int n) {
//		System.out.println("Inside process: "+m+","+n);
//		return m-n;
//	}
//	int analyze(int p, int q, int r) {
//		System.out.println("Inside analyze: "+p+","+q+","+r);
//		return p*q+r;
//	}
//	int evaluate(int x) {
//		System.out.println("Inside evaluate: "+x);
//		return x/2;
//	}
//	ClassA(){
//		System.out.println(10);
//	}
//	ClassA(int a, String s){
//		System.out.println(a);
//		System.out.println(s);
//	}
//	ClassA(String s, int x){
//		System.out.println(s);
//		System.out.println((x*2)+100);
//	}
//	public static void main(String[] args) {
//		int result = new ClassA().calculate(new ClassA(new ClassA().evaluate(6),"hi").compute(10,new ClassA().process(8, 4))
//				+ new ClassA("hi",20).analyze(5, 3, new ClassA().evaluate(6)));
//		System.out.println("Final Result: "+result);
//	}
//}
//
//10
//10
//Inside evaluate: 6
//3
//hi
//10
//Inside Process: 8,4
//Inside Compute: 10,4
//Hi
//140
//10
//Inside evaluate: 6
//Inside analyze: 5,3,3
//Inside Calculate: 32
//Final result: 96


// 24/4/25

//package com.pack1;
//public class ClassA{
//	String empName;
//	int empSal;
//	String empDept;
//	
//	
//	static String empCompany="TCS"; // static variable is used for Memory management because TCS company is common for ALL EMPLOYEE hence we use it as a static variable
//	ClassA(String name, int sal, String dept){
//		empName = name;
//		empSal = sal;
//		empDept = dept;
//	}
//	public static void main(String[] args) {
//		ClassA emp1 = new ClassA("Kishan",10000,"Java");
//		ClassA emp2 = new ClassA("John Wick",50000,"AWS");
//		ClassA emp3 = new ClassA("Winston",30000,"Spring");
//		
//		System.out.println("Employee 1:"+emp1.empName+" "+emp1.empSal+" "+emp1.empDept+" "+emp1.empCompany);
//		System.out.println("Employee 2:"+emp2.empName+" "+emp2.empSal+" "+emp2.empDept+" "+emp2.empCompany);
//		System.out.println("Employee 3:"+emp3.empName+" "+emp3.empSal+" "+emp3.empDept+" "+emp3.empCompany);
//		
//		emp1.empSal = 90000;
//		emp1.empCompany = "HCL"; //it is always advisable to use static with Class not object
//		
//		System.out.println("Employee 1:"+emp1.empName+" "+emp1.empSal+" "+emp1.empDept+" "+emp1.empCompany);
//		System.out.println("Employee 2:"+emp2.empName+" "+emp2.empSal+" "+emp2.empDept+" "+emp2.empCompany);
//		System.out.println("Employee 3:"+emp3.empName+" "+emp3.empSal+" "+emp3.empDept+" "+emp3.empCompany);
//		
//	}
//}



// Task
//package com.pack1;
//
//public class ClassA{
//	String team;
//	int win;
//	int loose;
//	
//	static String matchGround="Delhi";
//	
//	ClassA(String team_name, int win_match, int loose_match){
//		team = team_name;
//		win = win_match;
//		loose = loose_match;
//	}
//	
//	public static void main(String[] args) {
//		ClassA team1 = new ClassA("MI",4,4);
//		ClassA team2 = new ClassA("HYD",2,1);
//		ClassA team3 = new ClassA("GT",1,3);
//		
//		System.out.println("Team1 : "+team1.team+" "+team1.win+" "+team1.loose+" "+team1.matchGround);
//		System.out.println("Team2 : "+team2.team+" "+team2.win+" "+team2.loose+" "+team2.matchGround);
//		System.out.println("Team3 : "+team3.team+" "+team3.win+" "+team3.loose+" "+team3.matchGround);
//	} 
//	
//}
//


// 25/4/25

//package com.pack1;
//
//public class ClassA{
//	void meth1() {
//		System.out.println("meth1() called");
//		
//		int i=100;
//		System.out.println(i); // 100 i=100
//		System.out.println(i++); // 100 print in console after that the i value will increase by 1(post-increment)
//		System.out.println(i); // 101
//		System.out.println(++i); //102 (post-increment)
//		System.out.println("------------------------");
//		System.out.println(--i); // 101  i=101  pre-decrement
//		System.out.println(i--); // 101   i=100  post-decrement
//		System.out.println(i);  // 100 i=100
//		
//	}
//	void meth2() {
//		System.out.println("meth2() is called");
//		int x=10;
//		System.out.println(x++); //10  x= 11
//		System.out.println(++x);//12  x= 12
//		System.out.println(x++);//12   13
//		System.out.println(x++);//13   14
//		x--; //     13
//		System.out.println(++x);//14   14
//		System.out.println(x--);//14    13
//		++x;//      14
//		x++;//      15
//		System.out.println(x--);//15     14   
//		System.out.println(--x);// 13    13 
//		--x;//       12
//		System.out.println(x--);// 12    11
//		System.out.println(x);// 11
//	}
//	void meth3() {
//		int a=1;
//		int b=2;
//		int c;
//		int d;
//		c=++b;
//		d=a++;
//		c++;
//		System.out.println("a ="+a);
//		System.out.println("b ="+b);
//		System.out.println("c ="+c);
//		System.out.println("d ="+d);
//	}
//	void meth4() {
//		int x =10;
//		System.out.println("Before x: "+x);
//		x = x++;
//		System.out.println("After x: "+x);
//		
//		int y=20;
//		System.out.println("Before y:"+y);
//		int z=y++;
//		System.out.println("After y: "+y);
//		System.out.println("z value :"+z);
//		
//		int i=50;
//		System.out.println("Before i: "+i);
//		i = i++ + ++i;
//		System.out.println("After i: "+i);
//		
//		
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		// aobj.meth1();
//		// aobj.meth2();
//		aobj.meth3();
//	}
//}



// 26/4/25

// Task
//package com.pack1;
//
//public class ClassA{
//	int meth1() {
//		int a =10;
//		a++;
//		System.out.println(a++);
//		a++;
//		System.out.println(++a);
//		System.out.println(a++);
//		System.out.println(a++);
//		a--;
//		System.out.println(--a);
//		a= a++ + 3;
//		System.out.println("a value ==> "+a);
//		
//		System.out.println(a++);
//		--a;
//		System.out.println(--a);
//		System.out.println(a--);
//		a =a-- +3;
//		return a++ + ++a;
//	}
//	void meth2() {
//		int a=10;
//		int x= new ClassA().meth1() + a++;
//		System.out.println(x++ + a++);
//		System.out.println(a++);
//		System.out.println(a);
//		System.out.println(x);
//	}
//	public static void main(String[] args) {
//		System.out.println("start");
//		new ClassA().meth2();
//		System.out.println("Java is awesome");
//	}
//}
//
//



// Task
//package com.pack1;
//
//public class ClassA{
//	int e=4;
//	int d=2;
//	void meth1(int a, int b, int z) {
//		int c = a+b+z;
//		System.out.println("Addition: "+c);
//		new ClassA().meth2(a,b);
//	}
//	void meth2(int a, int b) {
//		int c = a-b;
//		System.out.println("Subtraction :"+c);
//	}
//	ClassA(){
//		int f = e/d;
//		System.out.println("Division: "+f);
//	}
//	ClassA(int a, int b){
//		int c = a*b;
//		System.out.println("Multiplication: "+c);
//		meth1(a,b,4);
//	}
//	public static void main(String[] args) {
//		new ClassA(5,3);
//	}
//}

// relational operators and Logical operators
//package com.pack1;
//public class ClassA{
//	void meth1() {
//		System.out.println("meth1() is called");
//		
//		int i =10;
//		if (i<=10) {
//			System.out.println("if block executed");
//		}
//		else {
//			System.out.println("else block executed");
//		}
//	}
//	void check_vote_eligibility(String s, int age) {
//		System.out.println("Checking the vote eligibility: ");
//		if (age>=18 && age<=35) { // (age>=18 || age<=35) if condition one is not true then only it goes to second condition in logical or operator
//			System.out.println(s+" you are elgible to vote ");
//		}
//		else {
//			System.out.println(s+" you are not elgible to vote after ");
//		}
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		// aobj.meth1();
//		aobj.check_vote_eligibility("Ayush", 23);
//	}
//}


//package com.pack1;
//public class ClassA{
//	void meth1() {
//		System.out.println("Meth1() is called");
//		int x=7 , y=3;
//		boolean isEqual = x ==y;     
//		boolean isGreaterThan = x>y;
//		boolean isLessThan = x<y;
//		boolean isNotEqual = x!=y;
//		
//		System.out.println("Is Equal: "+isEqual);
//		System.out.println("Is Greater Than: "+ isGreaterThan);
//		System.out.println("Is Less Than: "+ isLessThan);
//		System.out.println("Is Not Equal: "+ isNotEqual);
//	}
//	void meth2() {
//		System.out.println("meth2() is called");
//		boolean p = true,q=false;
//		boolean logicalAnd = p&&q;
//		boolean logicalOr = p||q;
//		boolean logicalNotP = !p;
//		boolean logicalNotQ = !q;
//		
//		System.out.println("Logical And: "+logicalAnd);
//		System.out.println("Logical Or: "+ logicalOr);
//		System.out.println("Logical NOT of P: "+ logicalNotP);
//		System.out.println("Logical NOT of q: "+ logicalNotQ);
//	}
//	void meth3() {
//		System.out.println("meth3() is called");
//		int a = 10;
//		int b = 5;
//		//Assignment operator
//		int equalAssignment=a ;
//		int additionAssignement = a+=b;
//		int subtractionAssignment = a-=b;
//		int multiplicationAssignment = a*=b;
//		int divisionAssignment = a/=b;
//		
//		System.out.println("Equal Assignment: "+equalAssignment);
//		System.out.println("Addition Assignement: "+ additionAssignement);
//		System.out.println("subtraction Assignment: "+ subtractionAssignment);
//		System.out.println("multiplication Assignment: "+ multiplicationAssignment);
//		System.out.println("Division Assignment: "+ divisionAssignment);
//	}
//	void meth4() {
//		System.out.println("meth4() is called");
//		boolean a = true, b=false,c=true,d=false;
//		boolean flag1 = (a&&b) && (c||d);
//		boolean flag2 = (a||b) && (c||d);
//		boolean flag3 = !(a&&b) && !(c&&d);
//		
//		boolean flag4 = a&& (b || (c&&d));
//		boolean flag5 = (a&&b) || (c&&d);
//		
//		System.out.println("flag1 :"+flag1);
//		System.out.println("flag2 :"+flag2);
//		System.out.println("flag3 :"+flag3);
//		System.out.println("flag4 :"+flag4);
//		System.out.println("flag5 :"+flag5);
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		aobj.meth1();
//		System.out.println("--------------------");
//		aobj.meth2();
//		System.out.println("--------------------");
//		aobj.meth3();
//		System.out.println("--------------------");
//		aobj.meth4();
//		System.out.println("--------------------");
//	}
//	
//}


// 28/4/25

// topics will study
//static -> today and tomorrow
//type casting
//mistery concept
//control statements
//entire next week -> control statement
//project 



// static variable

//package com.pack1;
//public class ClassA{
//	int x;  // it is instance variable and its default value is 0 assigned by JVM
//	static int y; // it is static variable and its default value is 0
//	ClassA(){
//		x++;
//		y++;
//		System.out.println("Instance variable x: "+x);
//		System.out.println("Static variable y: "+y);
//		System.out.println("--------------------------");
//		
//	}
//	public static void main(String[] args) {
//		new ClassA();
//		new ClassA();
//		new ClassA();
//	}
//}


// static method

//package com.pack1;
//public class ClassA{
//	int x=10;
//	static int y=20; // Static or Class variable
//	
//	ClassA aobj = new ClassA(); // instance variable
//	static ClassA bobj = new ClassA(); // static variable
//	void meth1() // Normal OR Concrete OR Non-static OR Instance Method 
//	{
//		System.out.println("meth1() is called: \n");
//		System.out.println("Instance variable x: "+x);
//		System.out.println("Static variable y: "+y);
//
//	}
//	static void meth2() // static method
//	{
//		System.out.println("meth2() is called: \n");
//		// System.out.println("Instance variable x: "+x);// we can not access instance variable using identifier name
//		System.out.println("Instance variable x: "+new ClassA().x); // We can access instance variable using class object 
//		System.out.println("Static variable y: "+y);
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		aobj.meth1();
//		
//		meth2();
//		aobj.meth2();
//		ClassA.meth2();
//	}
//}




// Static Block

//package com.pack1;
//
//public class ClassA{
//	static int x;
//	final static int y=10; // whenever we are making variable final 
//	
//	static {
//		System.out.println("1st static block called"+x);
//	}
//	public static void main(String[] args) {
//		System.out.println("main() is called"+x);
//	}
//	static {
//		System.out.println("2nd static block is called"+x);
//	}
//}


// 29/4/25

//package com.pack1;
//
//public class ClassA{
//	static int i = ClassA.meth1();
//	
//	static int meth1() {
//		System.out.println("meth1() is called : ");
//		return 100;
//	}
//	public static void main(String[] args) {
//		System.out.println("main() is called");
//		System.out.println("i :"+i);
//	}
//	static {
//		System.out.println("static block called : ");
//	}
//}

// 1. static variable & static block will be having same priorities
// 2. both will be executed even before main()
// 3. In our java program if we are having multiple multiple static variables and static blocks
//   they will be executed even before main() in the top to bottom approach
// 4. static methods will be executed ONLY whenever we are calling. 


// Task
//package com.pack1;
//public class ClassA{
//	public static void main(String[] args) {
//		int x=20;
//		System.out.println(x);
//	}
//	static{
//		int x=10;
//		System.out.println(x+" ");
//	}
//}

// Task
//package com.pack1;
//public class ClassA{
//	int x=10;
//	public static void main(String[] args) {
//		int x=20;
//		System.out.println(x);
//	}
//	static {
//		int x=30;
//		System.out.println(x+" ");
//	}
//}

// Task
//package com.pack1;
//public class ClassA{
//	int x=10;
//	public static void main(String[] args) {
//		System.out.println(new ClassA().x);
//	}
//	static {
//		int x=30;
//		System.out.println(x+" ");
//	}
//}

// Task
//package com.pack1;
//public class ClassA{
//	static int x=10;
//	public static void main(String[] args) {
//		ClassA t1 = new ClassA();
//		ClassA t2 = new ClassA();
//		
//		t1.x =20;
//		System.out.println(x+" ");
//		System.out.println(t2.x);
//	}
//}

// Task
//package com.pack1;
//public class ClassA{
//	static int x=10;
//	static int y=20;
//	
//	static {
//		System.out.println("----test11 sb1 called----");
//		System.out.println("x :"+x);
//		System.out.println("y :"+y);
//	}
//	static void m1() {
//		int x=100;
//		System.out.println("static method called");
//		System.out.println("x :"+x);
//		System.out.println("y :"+y);
//		
//	}
//	public static void main(String[] args) {
//		m1();
//	}
//	static{
//		System.out.println("----test11 sb2 called----");
//		System.out.println("x :"+x);
//		System.out.println("y :"+y);
//	}
//}


// Task
//package com.pack1;
//public class ClassA{  
//	static int x=m1();
//	public static void main(String[] args) {
//		System.out.println(ClassA.x);
//	}
//	static {
//		System.out.println(x);
//		ClassA.x =x+20;
//	}
//	static int m1() {
//		ClassA.x =50;
//		return m2();
//	}
//	static int m2() {
//		System.out.println(ClassA.x);
//		return 100;
//	}
//}

// Task
//package com.pack1;
//
//public class ClassA{
//	static int a=0;
//	int b=0;
//	
//	ClassA(){
//		a++;
//		b++;
//		System.out.println("Static variable==> "+a);
//		System.out.println("Instance variable==> "+b);
//		System.out.println("----------------------");
//	}
//	void display() {
//		System.out.println("*******Accessing static variable*****");
//		System.out.println(ClassA.a);
//		System.out.println(a);
//		System.out.println(new ClassA().a);
//	}
//	public static void main(String[] args) {
//		new ClassA();
//		new ClassA();
//		new ClassA();
//		System.out.println("###########################################");
//		new ClassA().display();
//	}	
//}


// Task
//package com.pack1;
//public class ClassA{
//	int c;
//	static int e;
//	ClassA(){
//		System.out.println(++c);
//		System.out.println(++e);
//	}
//	public static void main(String[] args) {
//		int a=34;
//		int b=21;
//		new ClassA().c = a++ + ++b;
//		int d = --a + --b + new ClassA().c--;
//		e=a + +b + +new ClassA().c + d--;
//		int f = -a + b-- + -new ClassA().c - d++;
//		int sum = a + b + new ClassA().c  + d+ e+f;
//		System.out.println("sum : "+sum);
//	}
//}



// 30/4/25

//package com.pack1;
//
//public class ClassA{
//	// Implicit TypeCasting
//	void meth1() {
//		System.out.println("Performing Implicit Typecasting");
//		byte b1=20;
//		int i1=b1;
//		System.out.println("byte Primitive datatype b1 :"+b1);
//		System.out.println("int PDT i1 :"+i1);
//		
//		char c = 'A';
//		int i2 = c;
//		float f1 = c;
//		System.out.println("char PDT :"+c);
//		System.out.println("int PDT :"+i2);
//		System.out.println("float PDT :"+f1);
//		
//	}
//	// Explicit Type Casting
//	void meth2() {
//		System.out.println("Performing Explicit TypeCasting\n");
//		int i1=10;
//		byte b1 = (byte)i1;
//		System.out.println("int PDT: "+i1);
//		System.out.println("byte PDT: "+b1);
//		
//		int i2=500; // storing the value which is out of range of byte 
//		byte b2 = (byte)i2;
//		System.out.println("\n byte PDT: "+b2);
//		System.out.println("int PDT: "+i2);
//
//
//		/*
//		[minimumRange + (Result - maximumRange - 1)]
//				
//		[-128 + (500 - 127 -1)]	=> 244
//		[-128 + (244 - 127 - 1)] => -12
//		*/
//		
//		
//		final int i3 =5; // Final variable are compile time constants and we are making it as final because if we change the value of i3 between the program like i3 = i3*50 then it will got out of range so for avoiding this we make it final
//		byte b3 =i3;
//		System.out.println("\n int PDT i3: "+i3);
//		System.out.println("byte PDT b3: "+b3);
//		
//		
//		float f =10.999f; // in this type casting loss of the information
//		byte b4 = (byte)f;
//		System.out.println("\n flaot PDT f:"+f);
//		System.out.println("byte PDT b4"+b4); // 10
//	}
//	void meth3(byte b) {
//		System.out.println("\n meth3() called");
//		System.out.println("b :"+b);
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		//aobj.meth1();
//		aobj.meth2();
//		aobj.meth3((byte)5);  // default number is int datatype hence explicit type casting while passing the argument
//	}
//}


// TASK

//package com.pack1;
//
//public class ClassA{
//	void Implicit() {
//		byte b=10;
//		System.out.println("byte value is "+b);
//		short s=b;
//		System.out.println("short value is "+s);
//		s++;
//		int i=s++; // i=11 s=12
//		System.out.println("int value is "+i);
//		System.out.println("short value is "+s);
//		long l=i;
//		System.out.println("long value is "+(--l)); // l=10
//		float f=l;
//		System.out.println("the value of float is "+(f+b));
//		double d=(--f); // d=9.0 f=9.0
//		System.out.println("the value of double is "+d);
//		show();
//		if(!(d==f)) {
//			System.out.println("equal");
//		}
//		else {
//			System.out.println("not equal");
//		}
//	}
//	public static void main(String[] args) {
//		ClassA a = new ClassA();
//		a.Implicit();
//	}
//	static void show() {
//		char c='A';
//		int a= ++c; //a=66
//		System.out.println(a);
//		ClassA obj = new ClassA();
//		String s = obj.meth1();
//		System.out.println(s);
//	}
//	String meth1() {
//		String S="Implicit casting is done by the compiler autommatically";
//		return S;
//	}
//}



// 1/5/25



// 2/5/25
//Wrapper Class
//package com.pack1;
//
//public class ClassA{
//	void meth1() {
//		System.out.println("Peforming Auto-Boxing");
//		int i=100;
//		Integer ival1 = i; //1st way
//		Integer ival2 = new Integer(i); //2nd way
//		Integer ival3 = Integer.valueOf(i); //3rd way
//		
//		System.out.println("\n int PDT i "+i);
//		
//		System.out.println("Integer WCO ival1 "+ival1);
//		System.out.println("Integer WCO ival2 "+ival2);
//		System.out.println("Integer WCO ival3 "+ival3);
//		
//		char c='A';
//		Character cval = Character.valueOf(c);
//		System.out.println("\n char PDT c "+c);
//		System.out.println("char WCO cval "+cval);
//
//		float f= 10.9f;
//		float fval = new Float(f);
//		System.out.println("\n float PDT c "+f);
//		System.out.println("Float WCO fval "+fval);
//		
//	}
//	void meth2() {
//		System.out.println("\n Performing Auto-Unboxing");
//		
//		Byte bval = new Byte((byte)20);
//		byte b1 = bval; //1st way
//		byte b2 = bval.byteValue(); //2nd way
//		System.out.println("\n Byte WCO bval");
//		System.out.println("byte PDT b1 :"+b1);
//		System.out.println("byte PDT b2 :"+b2);
//		
//		Boolean booleanval = new Boolean(true);
//		boolean flag = booleanval.booleanValue();
//		System.out.println("\nBoolean WCO booleanval :"+b1);
//		System.out.println("boolean PDT flag :"+flag);
//		
//		
//	}
//	void meth3() {
//		System.out.println("uses of wrapper classes: ");
//		String age = "36";
//		// System.out.println(age-6); //C.E
//		
//		int userAge1 = Integer.parseInt(age);
//		System.out.println(userAge1-6);
//		
//		byte userAge2 = Byte.parseByte(age);
//		System.out.println(userAge2-20);
//		
//		Boolean flag1=Boolean.parseBoolean(age);
//		System.out.println(flag1);
//		
//		Boolean flag2 = Boolean.parseBoolean("TrUe");
//		System.out.println(flag2);
//
//		Boolean flag3 = Boolean.parseBoolean("FalSe");
//		System.out.println(flag3);
//		
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		aobj.meth1();
//		aobj.meth2();
//		aobj.meth3();
//	}
//}


//Task
//package com.pack1;
//
//public class ClassA{
//	int a=0; // instance variable
//	static int b; // static variable
//	final static int h;//final static variable
//	void para1(int c)
//	{
//		int a=2;
//		a = a + para2(c);
//		System.out.println("parameterized with no return type : "+a);
//		return;
//	}
//	int para2(int c)
//	{
//		a = a+ c;
//		System.out.println("parameterized with return type  ");
//		return a;
//	}
//	
//	void Npara1() 
//	{
//		int a=2; // local variable 
//		a=a+Npara2();
//		System.out.println("Non-parameterized with no return type : "+a);
//		return;
//	}
//	int Npara2() 
//	{
//		int d=2;
//		System.out.println("Non-parameterized with return type ");
//		return d;
//	}
//	ClassA(){
//		System.out.println("Default constructor is called");
//	}
//	ClassA(int e){
//		System.out.println("Parameterized constructor is called and its value is : "+e);
//	}
//	private ClassA(int k, int j){ 
//	System.out.println("private const is called \n");
//	}
//	
//	//Object Class functions
//	protected void finalize() {
//		System.out.println("Gabarge has been collected after dereference");
//	}
//	void meth2() {
//		System.out.println("meth2() is called \n");
//	}
//	void ObjectClassFunc() {
//		ClassA aobj1 = new ClassA();
//		ClassA aobj2 = new ClassA();
//		//hashCode()
//		System.out.println("\n aobj1 hashCode() : "+aobj1.hashCode());
//		System.out.println("aobj2 hashCode() : "+aobj2.hashCode()+"\n");
//		
//		//equals()
//		System.out.println(new ClassA().equals(new ClassA())+"\n"); // false
//		
//		// getClass()
//		System.out.println("aobj1 getClass() : "+aobj1.getClass());
//		System.out.println("aobj2 getClass() : "+aobj2.getClass()+"\n");
//		
//		// toSting()
//		System.out.println("aobj1 toString() : "+aobj1.toString()); // com.pack1.classA@8____
//		System.out.println("aobj2 toString() : "+aobj2.toString()); 
//		
//		//finalize()
//		aobj1.meth2();
//		aobj1=null;// changing the reference by nullifying
//		System.gc(); // calling the garbage collector manually so that the finalize will executed, and So System.gc() can be executed at any time, or not at all — it's up to the JVM.
//		// aobj1.meth2(); // it will give NullPointerException error
//	}
//	void operators(int f, int g){
//		//increment and decrement Operators
//		++f;
//		--f;
//		System.out.println("f value after pre increment and decrement : "+f);
//		g=g++;
//		System.out.println("g is :"+ g++);
//		System.out.println("new g is  :"+g);
//		System.out.println("g is :"+ g--);
//		g=g--;
//		System.out.println("g value after post increment and decrement : "+g);
//		
//		// Arithmetic Operators
//		int sum=f+g; //2
//		int sub=f-g; //0
//		int mul=f*g; // 1
//		int div=f/g;  //1
//		int mod=(f+6)%(g+3);  //reminder =3
//		System.out.println("sum is : "+sum);
//		System.out.println("sub is : "+sub);
//		System.out.println("mul is : "+mul);
//		System.out.println("div is : "+div);
//		System.out.println("mod is : "+mod);
//		
//		//Relational Operators
//		if(mul==div) {
//			System.out.println("\n print Equal to '==' ");
//		}
//		if(sum!=sub) {
//			System.out.println(" print Not equal to '!=' ");
//		}
//		if(sum>sub) {
//			System.out.println("sum is Greater than sub");
//		}
//		if(sub<sum) {
//			System.out.println("sub is Less than sum ");
//		}
//		if(mul>=div) {
//			System.out.println("mul is Greater than or Equal to div");
//		}
//		if(mul<=div) {
//			System.out.println("mul is Less than or Equal to div");
//		}
//		
//		
//		// Logical operators
//		if ((sum>sub)&&(mul>sub)) {
//			System.out.println("This is Logical And operator '&&' ");
//		}
//		if((sum>sub)||(mul<sub)) {
//			System.out.println("This is Logical Or operator '||' ");
//		}
//		if(!(mul<sub)) {
//			System.out.println("This is Logical Not operator '!' ");
//		}
//
//	}
//	static void meth1() {
//		System.out.println("STATIC mehtod is called from STATIC BLOCK");
//		System.out.println("printing static variable b value : "+b+"\n");
//	}
//	static{
//		System.out.println("STATIC BLOCK IS EXECUTED FIRSTLY ");
//		System.out.println("default static vaiable value is : "+b+"\n");
//		b+=10;
//		h=12;
//		meth1();
//		new ClassA().meth1(); //calling using class object
//		ClassA.meth1(); // calling using class Name
//	}
//	void typeCasting(){
//		//implicit type casting
//		System.out.println("\n Performing Implicit Typecasting");
//		char c = 'A';
//		int i = c;
//		double d = c;
//		System.out.println("char PDT :"+c);
//		System.out.println("int PDT :"+i);
//		System.out.println("double PDT :"+d);
//		// Explicit Type Casting
//		int i1=10;
//		short s1 = (short)i1;
//		System.out.println("int PDT: "+i1);
//		System.out.println("short PDT: "+s1);
//		
//		int i2=500; // storing the value which is out of range of byte 
//		char c1 = (char)i2;
//		System.out.println(" \n int PDT: "+i2);
//		System.out.println("char PDT: "+c1);
//		
//		/*
//		[minimumRange + (Result - maximumRange - 1)]
//				
//		[-128 + (400 - 127 -1)]	=> 144
//		[-128 + (144 - 127 - 1)] => -112
//		*/
//		System.out.println("Performing Explicit TypeCasting\n");
//		final int i3 =5; // Final variable are compile time constants and we are making it as final because if we change the value of i3 between the program like i3 = i3*50 then it will got out of range so for avoiding this we make it final
//		short s3 =i3;
//		System.out.println("\n int PDT i3: "+i3);
//		System.out.println("short PDT s3: "+s3);
//		
//		
//		float f =20.001f; // in this type casting loss of the information
//		byte b1 = (byte)f;
//		System.out.println("\n flaot PDT f:"+f);
//		System.out.println("byte PDT b1 "+b1); // 20
//		
//	}
//	void wrapper(){
//        //		Auto-boxing
//		System.out.println("Peforming Auto-Boxing");
//		// using valueOf()
//		char c='Z';
//		Character cval = Character.valueOf(c);
//		System.out.println("\n char PDT c "+c);
//		System.out.println("char WCO cval "+cval);
//		// Auto-Unboxing
//		System.out.println("\n Performing Auto-Unboxing");
//		
//		Character characterval = new Character('A');
//		Character c1 = characterval.charValue();
//		System.out.println("\nCharacter WCO booleanval :"+characterval);
//		System.out.println("Character PDT flag :"+c1);
//		
//		//more uses cases of wrapper classes
//		System.out.println("uses of wrapper classes:");
//
//        String price = "199.99";
//        double priceD = Double.parseDouble(price);
//        System.out.println("Price after discount: " + (priceD - 50.00));
//	}
//	
//	public static void main(String[] args) {
//		ClassA obj1 = new ClassA();
//		ClassA obj2 = new ClassA(5);
//		ClassA obj3 = new ClassA(5,6);
//		obj1.para1(5);
//		obj2.Npara1();
//		
//		obj1.ObjectClassFunc();
//		
//		obj1.operators(1,1);
//		
//		obj1.typeCasting();
//		
//		obj1.wrapper();
//	}
//}



//3/5/25

//package com.pack1;

//public class ClassA{
//	void meth1(int i) {
//		System.out.println("-----------meth1()--------------");
//		if(!(i<5)) {
//			System.out.println("If block executed");
//			System.out.println("hi");
//		}
//		System.out.println("meth1() execution completed");
//	}
//	void meth2(int i) {
//		System.out.println("-----------meth2()--------------");
//		if(i<=5) 
//			// int x=100; //CE we should not write any declarative statements in this line
//			System.out.println("If block executed");
//			System.out.println("hello");
//			System.out.println("meth2() execution completed");
//	}
//	void meth3(int i) {
//		System.out.println("-----------meth3()--------------");
//		if(i<=5) {
//			System.out.println("if block executed");
//		}
//		else {
//			System.out.println("else block executed");
//		}
//		System.out.println("meth3() execution completed");
//	}
//	void meth4(int i) {
//		System.out.println("-----------meth4()--------------");
//		if(i<=5) 
//			System.out.println("if block executed");
//			// System.out.println("hi"); //C.E
//		else
//			System.out.println("else block executed");
//			System.out.println("hello");
//			System.out.println("meth3() execution completed");
//	}
//	
//	boolean checkAge(int age) {
//		System.out.println("checking the age of the user");
//		if(age>-18) {
//			return true;
//		}
//		return false;
//	}
//	void checkEligibility(String name, int age) {
//		if(new ClassA().checkAge(age)) {
//			System.out.println(name+" you can vote");
//		}
//		else {
//			System.out.println(name+" you can vote after"+(18-age)+" years");
//		}
//	}
//	void meth5(int i) {
//		System.out.println("-----------meth5()--------------");
//		if(false) {
//			System.out.println("if block executed"); //Dead Code
//		}
//		else
//			System.out.println("else block executed");
//		System.out.println("meth5() execution completed");
//	}
//	void meth6(int i) {
//		System.out.println("-----------meth6()------------");
//		if(i>0) {
//			System.out.println(i+" is positive number");
//		}
//		else if(i<0) {
//			System.out.println(i+" is Negative number");
//		}
//		else {
//			System.out.println(i+" is equal to 0");
//			System.out.println("meth6() execution completed");
//		}
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		aobj.meth1(5);
//		aobj.meth2(50);
//		aobj.meth3('A');
//		aobj.meth4(10);
//		aobj.checkEligibility("Kishan",15);
//		aobj.meth5(20);
//		aobj.meth6(0);
//		
//	}
//}



// 5/5/25

//package com.pack1;
//public class ClassA{
//	String meth1(int i) {
//		String str=null;
//
//		/* if(i<=5) 
//			str="if block executed";
//		else
//			str="else block executed";
//		return str; 
//		*/
//		
//		str = (i<=5) ? "if block executed" : "else block executed"; // ternary operator
//		return str;
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		String result = aobj.meth1(2);
//		System.out.println("===>"+result);
//	}
//}


//package com.pack1;
//public class ClassA{
//	void meth1(int x, int y, int z) {
//		if(x>y) {
//			if(x>z) {
//				System.out.println("this is greater value : "+x);
//			}
//			else 
//				System.out.println("this is greater value : "+z);
//		}
//		else {
//			if(y>z) {
//				System.out.println("this is greater value : "+y);
//			}
//			else 
//				System.out.println("this is greater value : "+z);
//			
//			(y>z) ? System.out.println("this is greater value : "+y):System.out.println("this is greater value : "+z);
//
//		}
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		aobj.meth1(500,10,90);
//	}
//}

// Task
//package com.pack1;
//
//public class ClassA{
//	void meth1(int l, int b) {
//		if(l==b) {
//			System.out.println("it is a square");
//		}
//		else {
//			System.out.println("it is not a square");
//		}
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		aobj.meth1(50,100);
//	}
//}


// Task
//package com.pack1;
//
//public class ClassA{
//	void meth1(int unit) {
//		int unit_cost = 100;
//		int total_cost = unit*unit_cost;
//		if(total_cost>=1000) {
//			System.out.println("get discount :");
//			int discount = (total_cost/100)*10;
//			int final_cost = total_cost-discount;
//			System.out.println("final cost is : "+final_cost);
//		}
//		else {
//			System.out.println("No discount hence final cost is : "+total_cost);
//		}
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		aobj.meth1(12);
//	}
//}


//package com.pack1;
//
//public class ClassA{
//	void meth1(int marks) {
//		if(marks>=80) {
//			System.out.println("A");
//		}
//		else if(60<=marks&&marks<80) {
//			System.out.println("B");
//		}
//		else if(50<=marks&&marks<60) {
//			System.out.println("C");
//		}
//		else if(45<=marks&&marks<50) {
//			System.out.println("D");
//		}
//		else if(25<=marks&&marks<45) {
//			System.out.println("E");
//		}
//		else {
//			System.out.println("F");
//		}
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		aobj.meth1(59);
//	}
//}
//



//package com.pack1;
//
//public class ClassA{
//	void meth1(char ch) {
//		if(65<=ch && ch<=90) {
//			System.out.println("it is between A to Z");
//		}
//		else if(97<=ch && ch<=122) {
//			System.out.println("it is between a to z");
//		}
//		else {
//			System.out.println("invalid input");
//		}
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		aobj.meth1('H');
//	}
//}

//Task - not done yet
//package com.pack1;
//
//public class ClassA{
//	String meth1(int a, int b, int c) {
//		String result;
//		if(a>b) {
//			if(b>c) {
//				result = "a>b>c";
//			}
//			else if(a>c) {
//				result = "a>c>b";
//			}
//			else {
//				result = "c>a>b";
//			}
//		}
//		else {
//			if(a>c) {
//				result="b>a>c";
//			}
//			else if(b>c) {
//				result = "b>c>a";
//			}
//			else {
//				result = "c>b>a";
//			}
//		}
//		if(a==b) {
//			if(b==c) {
//				result = "a==b==c";
//			}
//			else if(a>c) {
//				result = "a==b>c";
//			}
//			else {
//				result = "c>a==b";
//			}
//		}
//		else if(b==c) {
//			if(a>b) {
//				result = "a>b==c";
//			}
//			else {
//				result = "b==c>a";
//			}
//		}
//		else if(a==c) {
//			if(b>a) {
//				result = "b>a==c";
//			}
//			else {
//				result = "a==c>b";
//			}
//		}
//		return result;
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		System.out.println(aobj.meth1(3, 2,1 ));
//		System.out.println(aobj.meth1(1, 2,3 ));
//		System.out.println(aobj.meth1(2, 3,1 ));
//		System.out.println(aobj.meth1(1, 1,1 ));
//		System.out.println(aobj.meth1(2, 2,3 ));
//		System.out.println(aobj.meth1(3, 1,1 ));
//		System.out.println(aobj.meth1(1, 3,2 ));
//		System.out.println(aobj.meth1(2, 1,2 ));
//	}
//}

//6/5/25

// switch statement

//package com.pack1;
//
//public class ClassA{
//	void meth1(String name, int age, char gender) {
//		System.out.println("Implementing switch case \n");
//		
//		final int i=50;
//		//i++; //C.E because final variables are COMPILE TIME CONSTANT
//		byte b=35;
//		switch(b+30) // 30+35=65=> int
//		{
//		  //System.out.println("hello world ");  // CE
//			case 10:
//				System.out.println("case 10 is executed");
//				break;
//			case 20:
//				System.out.println("case 20 is executed");
//				break;		
//			case 'A':
//				System.out.println("case 65 executed");
//				System.out.println("int & char both are compaitable datatypes");
//				switch(gender) {
//					case 'M','m':
//						System.out.println("user is male");
//						if(age>=29) {
//							System.out.println(name + "you can start searching your foreover partner");
//							System.out.println(name + new ClassA().getmarried());
//						}
//						else
//							System.out.println(name + "wait for"+(29-age)+"years for searching for your love partner ");
//						break;
//						
//					case 'F','f':
//						System.out.println("user is female");
//						if(age>=25) {
//							System.out.println(name + "you can start searching your foreover partner");
//							System.out.println(name + new ClassA().getmarried());
//						}
//						else
//							System.out.println(name + "wait for"+(25-age)+"years for searching for your love partner ");
//						break;
//					default:
//						System.out.println("unable to process the data!!!");
//						break;
//				}
//				break;
//			case 400-360:
//				System.out.println("case 40 executed");
//				break;
//			case i:
//				System.out.println("case 50 executed");
//				break;
//			default:
//				System.out.println("Invalid input");
//				break;
//		}
//		System.out.println("\n Compiler come out from switch case");	
//    }
//	String getmarried() {
//		return " Contact 9987379484 for marriage works";
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		aobj.meth1("Ankit", 30, 'M');
//	}
//}

//7/5/25

//while and do-while loop

// Task
//package com.pack1;
//
//public class ClassA{
//	void meth1() {
//		int input =4;
//		switch(input) {
//			default:
//				System.out.println("4");
//			case 1:
//				System.out.println("1");
//			case 2:
//				System.out.println("2");
//				break;
//		}
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		aobj.meth1();
//	}
//}

//task
//package com.pack1;
//public class ClassA{
//	void meth(char ope,int num1, int num2) {
//		switch(ope) {
//			case '+':
//				int sum=num1+num2;
//				System.out.println("this is sum : "+sum);
//				break;
//			case '-':
//				int sub =num1-num2;
//				System.out.println("this is sub : "+sub);
//				break;
//			case '*':
//				int mul = num1*num2;
//				System.out.println("this is mul : "+mul);
//				break;
//			case '/':
//				int div = num1/num2;
//				System.out.println("this is div : "+div);
//				break;
//			default:
//				System.out.println("Invalid input!!!");
//				break;
//		}
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		aobj.meth('*',3,4);
//	}
//}


// while and do-while
//package com.pack1;
//public class ClassA{
//	void meth1(int i) {
//		System.out.println("----------meth1()------------");
//		while(i<=5) {
//			System.out.println("i value : "+i++);
//		}
//		System.out.println("meth1() execution completed");
//	}
//	void meth2(int i) {
//		System.out.println("----------meth2()------------");
//		while(i<=10) {
//			System.out.println("i value : "+ i++);
//			++i;
//		}
//		System.out.println("meth2() execution completed");
//	}
//	void meth3(int i) {
//		System.out.println("----------meth3()------------");
//		while(i<=10) {
//			System.out.println("i value : "+i++ +" "+ ++i);
//			++i;
//		}
//		System.out.println("meth3() execution completed : "+i);
//	}
//	void meth4(int i) {
//		System.out.println("----------meth4()------------");
//		while(i<=5)
//			// int x = 50; // CE beacuse we should not write any declarative code
//			System.out.println("i value : "+i);
//			i++;
//			System.out.println("meth4() execution completed");
//	}
//	void meth5(int i) {
//		System.out.println("----------meth5()------------");
//		while(true) {
//			System.out.println("i value : "+i++);
//			break;
//		}
//		System.out.println("meth3() execution completed ");//CE because of unreachable code
//	}
//	void meth6(int i, int j) {
//		System.out.println("---------meth6()-------");
//		while(i<=5) {
//			while(j>=0) {
//				System.out.println(i++ + " " + j--);
//				while(new ClassA().msg()) {
//					break;
//				}
//			}
//			System.out.println("----------------------");
//		}
//		System.out.println("meth6() execution completed");
//	}
//	boolean msg() {
//		System.out.println("java is awesome");
//		return true;
//	}
//	void meth7(int i) {
//		System.out.println("---------meth7()-------");
//		do {
//			System.out.println("i value : "+i++);
//		}while(i<=5);
//		System.out.println("meth7() execution completed : "+i);
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		//aobj.meth1(1);
//		//aobj.meth2(1);
//		//aobj.meth3(1);
//		//aobj.meth4(1);
//		//aobj.meth5(1);
//		//aobj.meth6(1,5);	
//		aobj.meth7(100);
//	}
//}


// 8/5/25
// for loop

//package com.pack1;
//public class ClassA{
//	void meth1() {
//		System.out.println("--------meth1()---------");
//		for(int i=1;i<=5;i++) {
//			System.out.println("i value : "+i);
//		}
//		System.out.println("meth1() execution completed");
//	}
//	void meth2() {
//		System.out.println("--------meth1()---------");
//		for (int i=1; i<=10 ; i++) {
//			System.out.println("i value : "+i++);
//			i++;
//		}
//		System.out.println("meth2() execution completed");
//	}
//	void meth3() {
//		System.out.println("--------meth3()---------");
//		for(int i=1; i<=5;i++) {
//			for(int j=5; j>=0;j--,i++) {
//				System.out.println("j : "+j+"- i : "+i);
//			}
//			System.out.println("----------------");
//		}
//		System.out.println("meth3() execution completed");
//	}
//	int meth4() {
//		System.out.println("meth4() called");
//	}
//	void meth5() {
//		System.out.println("------------------");
//	}
//	void meth6() {
//		System.out.println("--------meth6()---------");
//		for(int i=new ClassA().meth4()-64;i<=5;new ClassA().meth5()) {
//			System.out.println("i value : "+i);
//			i++;
//		}
//		System.out.println("meth6() execution completed");
//	}
//	void meth7() {
//		int i=1;
//		for(System.out.println("--------meth7()"),System.out.println("------");i<=5;) {
//			System.out.println("i value : "+i++);
//		}
//		System.out.println("meth7() execution completed");
//	}
//	void meth8() {
//		System.out.println("--------meth8()---------");
//
//		int i=1;
//		for(;;) {
//			System.out.println("i value : "+i);
//			i++;
//			break;
//		}
//		System.out.println("meth8() execution completed");
//	}
//	void meth9() {
//		System.out.println("--------meth8()---------");
//		for(int i=1;i<=10;) {
////			System.out.println("i value : "+ ++i+" "+i++);
////			System.out.println("i value : "+ i+++" "+i++);
////			System.out.println("i value : "+ ++i+" "+ ++i);
//			i++;
//		}
//		System.out.println("meth9() execution completed");
//	}
//	public static void main(String[] args) {
//		ClassA aobj=new ClassA();
//		aobj.meth1();
//		aobj.meth2();
//		aobj.meth3();
//		aobj.meth4();
//		aobj.meth5();
//		aobj.meth6();
//		aobj.meth7();
//		aobj.meth8();
//		aobj.meth9();		
//	}
//}

// task
//switch - day to day life example
//if else

//
//package com.pack1;
//
//public class ClassA{
//	void meth() {
//		int number_of_cars=3 ;
//		
//		if(number_of_cars<5) {
//			System.out.println("car number : "+number_of_cars+"rd");
//			switch("3rd") {
//			case 
//			}
//			
//		}
//		else {
//			
//		}
//	}
//	public static void main(String[] args) {
//		ClassA aobj=new ClassA();
//		aobj.meth1();
//		aobj.meth2();
//		aobj.meth3();
//		aobj.meth4();
//		aobj.meth5();
//		aobj.meth6();
//		aobj.meth7();
//		aobj.meth8();
//		aobj.meth9();		
//	}
//}
//


// 9/5/25

// for each loop or ENHANCED loop

//package com.pack1;
//public class ClassA{
//	void meth1() {
//		System.out.println("meth1() is called");
//		int arr[]= {10,20,30,40,50};
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//		// System.out.println(arr[5]);  // it will give Runtime error and it generates array index out of bound exception
//		
//		System.out.println("\nRetriving the data by using for loop \n");
//		for(int i=0; i<=4 ; i++) {
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
//		for(int i=4; i>=0 ; i--) {
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println("\nRetriving the data by using for each loop \n");
//		for(int x:arr) {
//			System.out.println(x+" ");
//		}
//		/*
//		 1) for loop is working on index position of the array for retrieving the data 
//		 2) So by using for loop we can retrieve the data in both forward direction and backward direction
//		 3) for each loop which is also known as ENHANCED for loop, will not working on index positions
//		 4) for-each loop working on streaming data.
//		 5) Streaming data means in which order the data is entered in the same order the data
//		 	will be retrieved, so we cannot retrieve the data in reverse order by using for each loop.
//		 6)The only use of the for-each loop is to retrieve the data from array or from collection classes
//		 */
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		aobj.meth1();
//	}
//}


//jump statements

//package com.pack1;
//public class ClassA{
//	void meth1() {
//		System.out.println("Implementing Jump statement\n");
//		for(int i=1; i<=10;i++) {
//			if(i==5) {
//        		//break;
//				//continue;
//				//return;
//			}
//			System.out.println("i value : "+i);
//		}
//		System.out.println("\ncompiler come out from for loop");
//	}
//	public static void main(String[] args){
//		ClassA aobj = new ClassA();
//		System.out.println("START");
//		aobj.meth1();
//		System.out.println("END");
//	}
//}

// Task
//package com.pack1;
//public class ClassA{
//	void meth1(int num) {
//		for (int i=1; i<=10 ; i++) {
//			System.out.println(num + "*" + i + "=" + (num*i));
//		}
//	}
//	void meth2(int n, int m) {
//		for(int i=n ; i<=m ; i++ ) {
//			for(int j=1; j<=10; j++) {
//				System.out.println(i + "*" + j + "=" + (i*j));
//			}
//			System.out.println("\n");
//		}
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		aobj.meth2(3, 7);
//	}
//}


//Task

//package com.pack1;
//public class ClassA{
//	void meth1(int n, int m) {
//		for(;n<=)
//	}
//}


//10/5/25
//package com.pack1;
//public class ClassA{
//	void meth1(int num) {
//		int fact =1;
//		for(;num>=1;num--) {
//			fact=fact*num;
//		}
//		System.out.println("Factorial is: "+fact);
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		aobj.meth1(5);
//	}
//}


// Task
//package com.pack1;
//public class ClassA{
//	void meth1() {
//		int i=0,j=0;
//		while(i<3) {
//			do {
//				j++;
//				System.out.print(j+" ");
//			}while(j<2);
//			i++;
//		}
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		aobj.meth1();
//	}
//}


//package com.pack1;
//public class ClassA{
//	void meth1(int i) {
//		System.out.println(i);
//		if(i<100) {
//			new ClassA().meth1(i+1);
//		}
//		else {
//			return;
//		}
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		aobj.meth1(1);
//	}
//}

//if(){
//	if() {
//		
//	}
//	else {
//		switch() {
//			case A:
//				while() {
//					do {
//						for(;;) {
//							
//						}
//						
//					}while();
//				}
//			case B:
//		}
//	}
//}


//package com.pack1;
//public class ClassA{
//	void meth(int marks, String sub1, String sub[]) {
//		
//		if(true) {
//			System.out.println("Welcome to exam result website");
//			System.out.print("After giving exam ");
//			if(marks>33) {
//				System.out.println("you are pass you don't need to do anything");
//			}
//			else {
//				System.out.print("you are fail and the subject in which you are fail is: ");
//				switch(sub1) {
//					case "OS":
//						System.out.println("OS");
//						while(marks<33) {
//							int day=1;
//							int total_days=33-marks;
//							System.out.println("you need to do the "+(total_days)+" days course");
//							System.out.println();
//							do {
//								System.out.println("day : "+day);
//								day++;
//								marks++;
//								System.out.println("subject which you have study today is : ");
//								for(int i=0;i<3;i++) {
//									System.out.println(sub[i]+" ");
//								}
//								System.out.println();
//							}while(day<=total_days);
//						}
//						break;
//					case "CN":
//						System.out.println("CN");
//						while(marks<33) {
//							int day=1;
//							System.out.println("you need to do the "+(33-marks)+" days course");
//							System.out.println();
//							int total_days=33-marks;
//							do {
//								System.out.println("day : "+day);
//								day++;
//								System.out.println("subject which you have study today is : ");
//								for(int i=0;i<3;i++) {
//									System.out.println(sub[i]+" ");
//								}
//								System.out.println();
//							}while(day<=total_days);
//						}
//						break;
//					default:
//						System.out.println("DBMS");
//						while(marks<33) {
//							int day=1;
//							System.out.println("you need to do the "+(33-marks)+" days course");
//							System.out.println();
//							
//							int total_days=33-marks;
//							do {
//								System.out.println("day : "+day);
//								day++;
//								System.out.println("subject which you have study today is : ");
//								for(int i=0;i<3;i++) {
//									System.out.println(sub[i]+" ");
//								}
//								System.out.println();
//							}while(day<=total_days);
//						}
//						break;
//				}
//			}
//		}
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		String sub[]= {"OS","CN","DBMS"};
//		aobj.meth(30,"OS",sub);
//	}
//}



//12/5/25
// understanding the Scanner classes
//
//package com.pack1;
//import java.util.Scanner;
//
//public class ClassA{
//	static Scanner sc = new Scanner(System.in);
//
//	void meth1() {
//			System.out.println("meth1() called \n");
//			System.out.println("Please enter 1st number");
//			int x = sc.nextInt();
//			/*
//			 sc.nextInt()
//			 -> Reads only an integer value.
//			->It does not consume the newline character (\n) left in the input buffer after pressing Enter.
//			-> Common issue: when followed by nextLine(), it may cause problems.
//			*/
//			System.out.println("x :"+x);
//			
//			System.out.println("Please enter 2nd number");
//			int y = sc.nextInt();
//			System.out.println("y :"+y);
//			int z =x+y;
//			System.out.println("\n z value :"+z);
//			//sc.close(); -. if the sc is declare and it is local variable
//		}
//		String checkAge() {
//			System.out.println("Welcome to age validation portal");
//			System.out.println("What is your age?");
//			int age = Integer.parseInt(sc.nextLine());
//			
//			/*
//			 sc.nextLine()
//			 ->Reads the entire line of text, including spaces, until a newline character is found.
//			->Commonly used for reading strings with spaces or full lines.
//			 */
//			if(age>=18) {
//				System.out.println("User age is >=18");
//				System.out.println("Give your opinion");
//				//sc.nextLine();
//				return sc.nextLine();
//			}
//			else {
//				System.out.println("User age is <=18");
//				System.out.println("Give your opinion");
//				//sc.nextLine();
//				return sc.nextLine();
//			}
//		}
//		void checkVehicleType(String name,int tyres) {
//			System.out.println("Welcome "+name+"!!!");
//			switch(tyres) {
//			case 2:
//				System.out.println(name+" as you are having 2 wheller");
//				System.out.println("Your National_permit is approved");
//				break;
//			case 4,10,12,16:
//				System.out.println(name+" as you are having a heavy vehicle");
//				System.out.println("Your International_permit is approved");
//			default:
//				System.out.println("Invalid data");
//			}
//		}
//		public static void main(String[] args) {
//			ClassA aobj = new ClassA();
//			//aobj.meth1();
//			//String result = aobj.checkAge();
//			//System.out.println("Result : "+result);
//			
//			System.out.println("Enter your Name");
//			String User_name = sc.nextLine();
//			System.out.println("Enter your vehicle tyres");
//			int no_tyres = Integer.parseInt(sc.nextLine());
//			aobj.checkVehicleType(User_name,no_tyres);
//		}
//}


// Task
//package com.pack1;
//import java.util.Scanner;
//public class ClassA{
//	static Scanner sc=new Scanner(System.in);
//	void meth() {
//		String EmpName;
//		int EmpId;
//		int EmpSal;
//		String EmpAddress;
//		
//		System.out.println("Enter the EmpName : ");
//		EmpName = sc.nextLine();
//		System.out.println("Enter the EmpId : ");
//		EmpId = Integer.parseInt(sc.nextLine());
//		System.out.println("Enter the EmpSal : ");
//		EmpSal = Integer.parseInt(sc.nextLine());
//		System.out.println("Enter the EmpAddress : ");
//		EmpAddress = sc.nextLine();
//		
//		System.out.println("EmpName is : "+EmpName);
//		System.out.println("EmpId is : "+EmpId);
//		System.out.println("EmpSal is : "+EmpSal);
//		System.out.println("EmpAddress is : "+EmpAddress);
//		
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		System.out.println("Detailed entered by the user: ");
//		aobj.meth();
//	}
//}

// 14/5/25
// package and access modifier

//understanding package
//package com.pack1;
//
//public class ClassA{
//	public void meth1() {
//		System.out.println("class-A method");
//	}
//	public static void main(String[] args) {
//	}
//}


//understanding access modifier
//package com.pack1;
//
//public class ClassA{
//	protected void meth1() {
//		System.out.println("class-A method");
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		aobj.meth1();
//	}
//}


// 15/5/25
// this keyword
//1st point
//package com.pack1;
//public class ClassA{
//	int x=10;
//	static int y=20;
//	
//	void meth1() {
//		int x=111;
//		int y=222;
//		
//		System.out.println("Instance variable x :"+this.x);
//		System.out.println("Static variable y :"+ClassA.y);
//
//		System.out.println("in meth1() : "+this.hashCode());
//	}
//	public static void main(String[] args) {
//		ClassA aobj1 = new ClassA(); //1st object
//		aobj1.meth1();
//		System.out.println("\n in main aobj1 : "+aobj1.hashCode());
//		System.out.println("-----------------------");
//		ClassA aobj2 = new ClassA(); //2nd object
//		aobj2.meth1();
//		System.out.println("\n in main aobj2 : "+aobj2.hashCode());
//	}
//	
//}

//2nd point
//package com.pack1;
//public class ClassA{
//	int x=10;
//	static int y=20;
//	
//	void meth1() {
//		System.out.println("meth1() is called");
//	}
//	void meth2() {
//		this.meth1(); // there is no error but it is recommended to call a static method with the help of its class name
//		System.out.println("meth2() is called");
//	}
//	void meth3() {
//		meth2();// by default compiler will add 'this' keyword
//		System.out.println("meth3() is called");
//	}
//	public static void main(String[] args) {
//		new ClassA().meth3();
//		//this.meth3(); // C.E because we cannot use this keyword inside a static area
//	}	
//}


//3rd point
//package com.pack1;
//public class ClassA{
//	ClassA meth1() {
//		System.out.println("meth1() is called");
//		return this;
//	}
//	ClassA meth2() {
//		System.out.println("meth2() is called");
//		return this;
//	}
//	void meth3() {
//		System.out.println("meth3() is called");
//	}
//	public static void main(String[] args) {
//		new ClassA().meth1().meth2().meth3(); //it is Method chaining
//	}
//}

// 4th point
//package com.pack1;
//public class ClassA{
//	void meth1() {
//		System.out.println("meth1() called");
//	}
//	ClassA(){
//		this(1000); // constructor call is first statement here
//		this.meth1();
//		System.out.println("Default Constructor");
//		//new ClassA(1000); // we don't want to use object
//	}
//	ClassA(int x){
//		System.out.println("parameterized constructor : "+x);
//	}
//	public static void main(String[] args) {
//		new ClassA();
//	}
//}


//Task
//package com.pack1;
//
//public class ClassA{
//	String name;
//	ClassA(){
//		this("Abdul Kalam sir");
//		this.display();
//	}
//	ClassA(String name){
//		this.name = name;
//	}
//	void display() {
//		System.out.println("Person Name is = "+name);
//	}
//	public static void main(String[] args) {
//		new ClassA();
//	}
//}


//Task
//package com.pack1;
//public class ClassA{
//	public int meth1(int a, int b) {
//		System.out.println("meth1() called");
//		System.out.println(b);
//		System.out.println(100);
//		return (a+b)+10+(a-b);
//	}
//	public int meth2() {
//		System.out.println("meth2() is called");
//		return this.meth3()+8;
//	}
//	public ClassA() {
//		this("java is awesome");
//		System.out.println(50);
//	}
//	int meth3() {
//		System.out.println("meth3 called");
//		return 10;
//	}
//	public String meth4(int a, String s) {
//		System.out.println("meth4 called");
//		a=a+4;
//		System.out.println("a value==> "+a);
//		System.out.println("s value==> "+s);
//		return s+" is Object oriented programming language";
//	} 
//	
//	
//	public int meth5(int a) {
//		System.out.println("meth5() is called");
//		return 10-a;
//	}
//	public ClassA(String s) {
//		String result = this.meth4(this.meth1(this.meth2(), this.meth5(5)+'A'-('a')), "Java"); //46 java
//		System.out.println(result);
//		System.out.println(s);
//	}
//	public static void main(String[] args) {
//		new ClassA();
//	}
//}


//16/5/25
//understanding the arrays
//package com.pack1;
//public class ClassA{
//	void meth1() {
//		int arr1[]; // declaration of an array
//		arr1 = new int[5]; // instatiation of an array

//		int arr2[]=new int[4];
//		int arr3[]= {100,200,300};  // initialisation of an array
//		int arr4[]=new int[] {11,12,13,14,15};
//		
//		String s= "Java";
//		//getting the length of an array
//		System.out.println("arr1 length : "+arr1.length);//5
//		System.out.println("arr2 length : "+arr2.length);//4
//		System.out.println("arr3 length : "+arr3.length);//3
//		System.out.println("arr4 length : "+arr4.length);//5
//		
//		System.out.println("String length : "+s.length());//4
//		System.out.println("------------------------------------------");
//		
//		//Reteriving the data from an array
//		System.out.println(arr1[2]);
//		
//		//If I am printing arr1 data ==> 0 25 0 35 45
//		arr1[1]= 25;
//		arr1[3] = 35;
//		arr1[arr1.length-1] = 45;
//		
//		//Reteriving the data from arr1 using for-loop
//		for (int i =0 ; i<=arr1.length -1;i++) {
//			System.out.print(arr1[i]+" ");
//		}
//		System.out.println();
//		//Reteriving the data in reverse order from arr1 using for-loopgth
//		for(int i=arr1.length-1; i>=0 ; i--) {
//			System.out.print(arr1[i] + " ");
//		}
//		System.out.println();
//		// using for each loop
//		for(int data:arr1) {
//			System.out.print(data+" ");
//		}
//		System.out.println();
//		System.out.println("-----------------------");
//		
//		System.out.println(arr3[arr1.length-arr2.length]);//200
//		// System.out.println(arr3[3]);//AIOB
//		// If we are trying to access the index which is not available in our array then we will be getting AIOB exception
//		
//	}
//	public static void main(String[] args) {
//		new ClassA().meth1();
//	}
//}


//19/5/25
// key points of array
//package com.pack1;
//
//import java.util.Arrays;
//
//public class ClassA{
//	void meth1() {
//		System.out.println("meth1() called");
//		//int arr1[5];// at the time of declaration of an array we should not give the size of an array.
//		//int arr1[]=new int[-5]; // at the time of instantiation of an array we should 100% give the size of an array.  
//		//System.out.println("arr1 length : "+arr1.length); // It generates the NegativeArraySizeException
//	
//		//int arr2[] = new int[0];
//		//arr2[0]=100;
//		//System.out.println("arr2 : "+arr2[0]); // it generates Array Index out of bound exception
//		
//		int arr2[] = new int[0];
//		System.out.println("arr2 length : "+arr2.length); // at 0 length it will give only size not assigned a value
//		
//		boolean arr3[]=new boolean[3];
//		System.out.println("arr3 : "+arr3); // It provides internal implementation of toString()
//		System.out.println("arr3 : "+Arrays.toString(arr3)); // [false,false,false]
//		
//		String arr4[] = new String['A']; // size of array only can be : int, byte, short, char
//		System.out.println("arr4 length : "+ arr4.length);
//		
//		double arr5[] = new double[2147483647]; // Max size of an array
//		System.out.println("arr5 length : "+arr5.length);
//	}
//	public static void main(String[] args) {
//		new ClassA().meth1();
//	}
//}


//package com.pack1;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class ClassA{
//	void meth1() {
//		System.out.println("meth1() called");
//		int arr[]= {10,20,30,40,50};
//		System.out.println("\nretriving the data from an array by using for loop");
//		for(int i=0 ; i<=arr.length-1 ;i++) {
//			System.out.print(arr[i]+" ");
//		}
//	}
//	void ticket_booking() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("welcome to e_booking");
//		System.out.println("Enter the name of the Movie");
//		String movie_name = sc.nextLine();
//		System.out.println("please enter how many tickets you need for "+movie_name);
//		String names[]=new String[Integer.parseInt(sc.nextLine())];
//		System.out.println("Please enter "+names.length+" names");
//		
//		for(int i=0 ; i <=names.length-1 ;i++) {
//			names[i] = sc.nextLine();
//		}
//		System.out.println("You have entered "+names.length+" names : "+Arrays.toString(names));
//		
//		System.out.println("Please choose your row between A to Z");
//		String row = sc.nextLine();
//		
//		System.out.println("Please choose your 1st seat number between 1 to 50");
//		int seat_No = Integer.parseInt(sc.nextLine());
//		
//		System.out.println("Your tickets are successfully booked");
//		for(String data:names) {
//			System.out.println(data+"-"+row+" "+seat_No++);
//		}
//		System.out.println("enjoy your "+movie_name);
//		sc.close();
//	}
//	public static void main(String[] args) {
//		// new ClassA().meth1();
//		new ClassA().ticket_booking();
//	}
//}



// 20/5/25
//Task
//package com.pack1;
//import java.util.Scanner;
//import java.util.Arrays;
//
//public class ClassA{
//	void meth() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("What is your name? ");
//		String person_name = sc.nextLine();
//		System.out.println("How many product you want to buy? ");
//		int products_no = Integer.parseInt(sc.nextLine());
//		String products[]=new String[products_no];
//		System.out.println("Please enter the " + products.length +" products names");
//		for(int i=0;i<=products.length-1;i++) {
//			products[i]=sc.nextLine();
//		}
//		
//		System.out.println("products : "+Arrays.toString(products)); 
//		
////		for(String data: products) {
////			System.out.print(data+" ");
////		}
//		
//		System.out.println("These are the products if you want to purchase type 'Y' or type 'N'");
//		String a=sc.nextLine();
//		switch(a){
//		case "Y":
//			System.out.println("Your order is successfully completed");
//			break;
//		case "N":
//			System.out.println("Your order is successfully cancelled");
//			break;
//		}
//		
//	}
//	public static void main(String[] args) {
//		new ClassA().meth();
//	}
//}


//package com.pack1;
//public class ClassA{
//	void meth1() {
//		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
//		for(int i=0;i<3;i++) {
//			for(int j=0;j<3;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
//	}
//	
//	public static void main(String[] args) {
//		new ClassA().meth1();
//	}
//}

//package com.pack1;
//
//import java.util.Arrays;
//
//public class ClassA{
//	String[] meth1(int arr1[], char arr2[]) {
//		
//		//task 1
//		System.out.println("---------task1-----------");
//
//		int size = arr1.length;
//		int arr3[] = new int[size];
//		int j=0;
//		for(int i=arr1.length-1 ; i>=0 ; i--,j++) {
//			arr3[j]=arr1[i];
//		}
////		for(int i=0; i<arr1.length ; i++) {
////			System.out.print(arr1[i]);
////		}
////		System.out.println();
////		for(int i=0; i<arr3.length ; i++) {
////			System.out.print(arr3[i]);
////		}
//		
//		System.out.println("arr1 : "+Arrays.toString(arr1));
//		System.out.println("arr3 : "+Arrays.toString(arr3));
//		
//		//task 2
//		
//		System.out.println("---------task2-----------");
//		for(int i=0; i<arr2.length ; i++) {
//			System.out.print(arr2[i]);
//		}
//		for(int i=arr2.length-1; i>=0 ; i--) {
//			System.out.print(arr2[i]);
//		}
//		for(char c:arr2) {
//			System.out.print(c);
//
//		}
//		return new String[] {"India","Canada","Russia","Paris","Japan"};
//	}
//	
//	public static void main(String[] args) {
//		int arr1[] = {1,2,3,4,5,6,7,8,9};
//		char arr2[]= {'a','b','c','d','e','f','g','h','i'};
//		
//		/*
//		 //OR
//		 String result[] = new ClassA().meth1(new int[]{10,20,30),new char[]{'A','B','C'}};
//		 */
//		String result[]=new ClassA().meth1(arr1,arr2);
//		
//		//task 3
//		System.out.println("-----------task3-----------");
//		if(result.length%2==0) {
//			for(int i=0;i<result.length/2 ;i++) {
//				System.out.println(result[i]+" ");
//			}
//		}
//		else {
//			System.out.println(result[result.length-2]+" "+result[result.length-1]);
//		}
//	}
//}

// 21/05/24

//Task 1
// given an int array length 3, if there is 2 in the array immediately followed by a 3,
// change the element 3 to 0, and return the changed array.
// 123----120
// 234----204
// 122----122

//package com.pack1;
//import java.util.Arrays;
//public class ClassA{
//	int[] meth1() {
//		int arr[]= {1,2,2};
//		for(int i=0; i<=arr.length-2;i++) {
//			if(arr[i]==2 && arr[i+1]==3 ) {
//				arr[i+1]=0;
//			}
//		}
//		return arr;
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		int result[] = aobj.meth1();
//		System.out.println(Arrays.toString(result));//[2,7,3]
//	}
//}


//Task 2
// Given an array of integer, return the sum of the first 2 elements in the array.
// If the array length is less than 2, just sum up the elements that exist, return 0 if the array length is 0.
//1,2,3----3
//5,5-----10
//8,2,1,4----10

//package com.pack1;
//
//public class ClassA{
//	int meth1(int[] arr) {
//		if (arr.length>=2) {
//			return arr[0]+arr[1];
//		}
//		else if(arr.length==1) {
//			return arr[0];
//		}
//		else {
//			return 0;
//		}
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		int arr[] = {4};
//		int result = aobj.meth1(arr);
//		System.out.println("answer is :"+result);
//	}
//}


// Task 3
// Given an array of ints, return true if 6 appears as either the
// first or last element in the array. The array will be length 1 or more.
//firstLast6([1,2,6])? true
//firstLast6([6,1,2,3])? true
//firstLast6([13,6,1,2,3])? false

//package com.pack1;
//import java.util.Scanner;
//public class ClassA{
//	boolean meth1(int arr[]) {
//		if(arr[0]==6 || arr[arr.length-1]==6) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter size of the array");
//		int size;
//		size = Integer.parseInt(sc.nextLine());
//		int arr[] = new int[size];
//		System.out.println("enter elements in array");
//		for(int i=0 ; i<size ; i++) {
//			arr[i]=Integer.parseInt(sc.nextLine());
//		}
//		boolean result = aobj.meth1(arr);
//		if(result) {
//			System.out.println("true");
//		}
//		else {
//			System.out.println("false");
//		}
//	}
//}


// Task 4
// Given an array of ints, return true if the array is length 1 or more and the first 
// element and the last element are equal.
// sameFirstLast([1,2,3]) ? false
// sameFirstLast([1,2,3,1]) ? true
// sameFirstLast([1,2,1]) ? true

//package com.pack1;
//
//public class ClassA{
//	boolean sameFirstLast(int[] arr) {
//		if(arr.length==1 || (arr[0]==1 && arr[arr.length-1]==1)) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
////		int arr[] = {1,2,1};
//		boolean result = aobj.sameFirstLast(new int[] {1,2,1});
//		System.out.println(result);
//	}
//}


// Task 5
// Return an int array length 3 containing the first 3 digits of pi ,{3,1,4}.
// makePi() ? [3,1,4]

//package com.pack1;
//
//import java.util.Arrays;
//
//public class ClassA{
//	int[] makePi() {
//		return new int[] {3,1,4};
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		int []result = aobj.makePi();
//		System.out.println(Arrays.toString(result));
//	}
//}

//Task 6
// Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element.
// Both array will be length 1 or more.
//	
//package com.pack1;
//public class ClassA{
//	boolean commonEnd(int arr1[], int arr2[]) {
//		if((arr1[0]==arr2[0]) || (arr1[arr1.length-1]==arr2[arr2.length-1])) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		boolean result = aobj.commonEnd(new int[] {1,2,3},new int[] {7,3});
//		System.out.println(result);
//	}
//}


//Task 7
//Given an array of ints length 3, return the sum of all the elements.
// sum3([1,2,3]) ? 6
// sum3([5,11,2]) ? 18
// sum3([7,0,0]) ? 7

//package com.pack1;
//public class ClassA{
//	int sum3(int []arr) {
////		int result=0;
////		for(int i=0 ; i<arr.length; i++) {
////			result = result + arr[i];
////		}
////		return result;
//		
//		return arr[0]+arr[1]+arr[2];
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		int result = aobj.sum3(new int[] {7,0,0});
//		System.out.println(result);
//	}
//}

//Task 8
// Given an array of ints length 3, return an array with the 
// elements "rotated left" so {1,2,3} yields {2,3,1}.
//rotateLeft3([1,2,3])?[2,3,1]
//rotateLeft3([5,11,9])?[11,9,5]
//rotateLeft3([7,0,0]) ? [0,0,7]

//package com.pack1;
//import java.util.Arrays;
//public class ClassA{
//	int[] rotateLeft3(int []arr) {
//		int arr1[] =new int[3];
//		arr1[0]=arr[1];
//		arr1[1]=arr[2];
//		arr1[2]=arr[0];
//		return arr1;
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		int arr[] =  {7,0,0};
//		int[]  ans = aobj.rotateLeft3(arr);
//		System.out.println(Arrays.toString(ans));
//	}
//}

// Task 9
// Given an int array, return a new array with double the length where its 
// last element is the same as the original array, and all the other elements are 0.
// the original array will be length 1 or more.
//makeLast([4,5,6]) ? [0,0,0,0,0,6]
//makeLast([1,2]) ? [0,0,0,2]
//makeLast([3]) ? [0,3]

//package com.pack1;
//import java.util.Arrays;
//public class ClassA{
//	int[] makeLast(int [] arr) {
//		int size = arr.length*2;
//		int arr1[] = new int[size];
//		arr1[arr1.length-1]=arr[arr.length-1];
//		return arr1;
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		int[] result = aobj.makeLast(new int[]{3});
//		System.out.println(Arrays.toString(result));
//	}
//}


// Task 10
//package com.pack1;
//import java.util.Scanner;
//import java.util.Arrays;
//
//public class ClassA{
//	Scanner sc = new Scanner(System.in);
//	void meth1(int []arr) {
//		System.out.println();
//		System.out.println();
//		System.out.println("Menu:");
//		System.out.println();
//		System.out.println("1. View all grades");
//		System.out.println("2. View the average grade");
//		System.out.println("3. View the highest grade");
//		System.out.println("4. View the lowest grade");
//		System.out.println("5. Exit");
//		System.out.print("Enter your choice: ");
//		int option = Integer.parseInt(sc.nextLine());
//		switch(option) {
//		case 1:
//			System.out.println(Arrays.toString(arr));
//			this.meth1(arr);
//			break;
//		case 2:
//			int sum =0;
//			for(int i=0 ; i<arr.length ; i++) {
//				sum = sum + arr[i];
//			}
//			double avg = sum/arr.length;
//			System.out.println("Averge grade is: "+avg);
//			this.meth1(arr);
//			break;
//		case 3:
//			int highest=arr[0];
//			for(int i=0 ; i<arr.length ; i++) {
//				if(arr[i]>highest) {
//					highest=arr[i];
//				}
//			}
//			System.out.println("The highest grade is: "+highest);
//			this.meth1(arr);
//			break;
//		case 4:
//			int lowest=arr[0];
//			for(int i=0 ; i<arr.length ; i++) {
//				if(arr[i]<lowest) {
//					lowest=arr[i];
//				}
//			}
//			System.out.println("The lowest grade is: "+lowest);
//			this.meth1(arr);
//			break;
//		case 5:
//			System.out.println("Existing the program, Goodbye!");
//			return;
//		default:
//			System.out.println("Invalid option selected, Try again!");
//			this.meth1(arr);
//			break;
//		}
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Welcome to the student Grade Management System!");
//		int number;
//		System.out.print("Enter the number of students:");
//		number = Integer.parseInt(sc.nextLine());
////		System.out.println();
//		int arr[] = new int[number];
//		for(int i=0; i<=arr.length-1 ;i++) {
//			System.out.print("Enter the grade for student "+(i+1)+":");
//			arr[i]=Integer.parseInt(sc.nextLine());
//		}
//		aobj.meth1(arr);
//	}
//}


//22/5/25
// Understanding String Handling
//package com.pack1;
//public class ClassA{
//	void meth1() {
//		System.out.println("meth1() called");
//		String s1= "Java";
//		String s2 = new String("Java");
//		char arr[] = {'J','a','v','a'};
//		String s3 = new String(arr);
//		
//		String s4 = new String(arr,1,2); //av
//		System.out.println("s1 : "+s1+"("+s1.length()+")");
//		System.out.println("s2 : "+s2+"("+s2.length()+")");
//		System.out.println("s3 : "+s3+"("+s3.length()+")");
//		System.out.println("s4 : "+s4+"("+s4.length()+")");	
//	}
//	void meth2() {
//		System.out.println("meth2() called");
//		System.out.println("Strings which were created using String Class are immutable");
//		String s="Java";
//		System.out.println("Before concatination s: "+s);
//		System.out.println("After concatination s : "+s.concat(" is awesome")); // new object created
//		System.out.println("After concatination s: "+s);
//		s=s.concat(" is awesome"); // it will create a new obj and pointer point that new object and old object is destroyed by garbage collector
//		System.out.println("Now s is: "+s);
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		//aobj.meth1();
//		aobj.meth2();
//
//	}
//}



//23/5/25

//package com.pack1;
//import java.util.Arrays;
//import java.util.Scanner;
//public class ClassA{
//	void meth1() {
//		System.out.println("meth1 called");
//		String s1="Java";
//		String s2=new String("java");
//		String s3="Java";
//		String s4= new String("Java");
//		System.out.println("-------------equals()-------------");
//		System.out.println(s1.equals(s2)); //false
//		System.out.println(s2.equals(s3)); //false
//		System.out.println(s4.equals("Java")); // true
//		System.out.println(s4.equals("java")); //false   if s4.equalsIgnoreCase("java") then o/p is true
//		System.out.println(s4.equalsIgnoreCase("java")); //true
//		System.out.println("Java".equals("Java")); //true
//		System.out.println(new String("Java").equals("java")); // false
//		System.out.println(new String("Java").equals(new String("Java"))); //true
//
//		
//		
//		System.out.println("------------- = = ----------------------");
//		System.out.println(s1==s2); //false
//		System.out.println(s2==s3); //false
//		System.out.println(s1==s3); //true
//		System.out.println(s2==s4); //false
//		System.out.println(s1=="Java");  //true
//		System.out.println(new String("Java")==s2); //false
//		System.out.println("Java"=="Java"); //true
//		System.out.println(new String("Java")==new String("Java")); //false
//		System.out.println("Java"==new String("Java"));		 //false
//	}
//	void meth2() {
//		System.out.println("Implementing String Class Methods\n");
//		String s1="Java";
//		System.out.println("length() :"+s1.length());
//		System.out.println("s1 :"+s1);
//		System.out.println("concat() : "+s1.concat(" is awesome"));
//		System.out.println("s1 : "+s1);
//		System.out.println("length() :"+s1.concat(" is awesome").length());
//		System.out.println("charAt() : "+s1.charAt(0));
//		System.out.println("charAt() : "+s1.charAt(s1.length()-2));
		
	/*	
		System.out.println("Please enter your gender (M/F)");
		Scanner sc = new Scanner(System.in);
		char gender = sc.next().charAt(0);   //we are taking as string and taking first index using charAt()
		switch(gender) {
		case 'M','m':
			System.out.println("User is male");
			break;
		case 'F','f':
			System.out.println("user is female");
			break;
		default:
			System.out.println("Invalid data");
			break;
		}	
	*/
		/*
		System.out.println("startsWith() : "+s1.startsWith("Ja"));
		System.out.println("toLowerCase() : "+s1.toLowerCase());
		System.out.println("toUpperCase() : "+s1.toUpperCase());
		System.out.println("s1 : "+s1);
		
		String s2 = "Java is awesome";
		System.out.println("substring() : "+s2.substring(8));
		System.out.println("substring() : "+s2.substring(9,11));
		System.out.println("substring() : "+s2.substring(3,9)); //3 is starting index and 9 is upper bound so index will print at 8
		
		System.out.println("replace() : "+s2.replace('a', 'A')); 
		String s3=" Hello World ";
		System.out.println("trim() : "+s3.trim().length()); // remove first and last position of string
		
		System.out.println("indexOf() : "+s3.indexOf('o')); // first occurance
		System.out.println("lastIndexOf() : "+s3.lastIndexOf('o')); //last occurance
		
		String s4 = "23-May-2025";
		String arr1[] = s4.split("-");
		System.out.println("arr1 :"+Arrays.toString(arr1));
		
		String arr2[] =s3.split("");
		System.out.println("arr2 :"+Arrays.toString(arr2));
		
		String data = "ABCDEF";
		byte arr3[]=data.getBytes(); // we will be use getBytes in streams
		for(byte b:arr3) {
			System.out.println((char)b);
		}
		System.out.println();
		
		System.out.println("A".compareTo("C"));
		System.out.println("D".compareTo("A"));
		System.out.println("A".compareTo("A"));
		*/
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		// aobj.meth1();
//		aobj.meth2();
//		
//		
//	}
//}

/*

equals():
1) equals() whenever we are using this with string Class, it is going to compare the CONTENTS 
present inside the strings.
2) If both the Strings are having same CONTENTS then equals() is going to return true otherwise false.

== :
------
1) == Operators is going to compare the address locations of the Strings.(Not the contents)
2) if the address is same then it return true otherwise false.

*/




//24/5/25
//package com.pack1;
//
//public class ClassA{
//	public void meth1(String name) {
//		String rev="";
//		for(int i=name.length()-1;i>=0;i--) {
//			rev=rev+name.charAt(i);
//		}
//		if(name.equals(rev)) {
//			System.out.println(name+" is a palindrome");
//		}
//		else {
//			System.out.println(name+" is Not a palindrome");
//		}
//	}
//}



//package com.pack1;
//
//public class ClassA{
//	String makeOutWord(String out,String middle) {
//		int putIndex=out.length()/2-1;
//		return out.substring(0,2)+middle+out.substring(2);
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		String new_str =aobj.makeOutWord(new String("<<>>"),new String("yay"));
//		System.out.println(new_str);
//	}
//}




//package com.pack1;
//
//public class ClassA{
//	String extraEnd(String s) {
//		int size = s.length();
//		int last_2 = size-2;
//		String ans="";
//		for(int i=0 ; i<=2 ; i++) {
//			for(int j=last_2 ;i<s.length();i++) {
//				ans= ans+s[j];
//			}
//		}
//		return ans;
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		String new_str =aobj.extraEnd("Hello");
//		System.out.println(new_str);
//	}
//}





//package com.pack1;
//
//public class ClassA{
//	String extraEnd(String s) {
//		int size = s.length();
//		if(size<=2) {
//			return s;
//		}
//		else {
//			return ""+s.charAt(0)+s.charAt(1);
//		}
/*
 OR
 
 if(str.length()>=2)
  return str.substring(0,2);
 return str;

 */

//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		String new_str =aobj.extraEnd("Hello");
//		System.out.println(new_str);
//	}
//}



//package com.pack1;
//
//public class ClassA{
//	String firstHalf(String s) {
//		int size = s.length()/2;
//		return s.substring(0,size);
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		String new_str =aobj.firstHalf("ayushk");
//		System.out.println(new_str);
//	}
//}



// 26/5/25
//String Vs StringBuffer Vs StringBuilder
//package com.pack1;
//
//import java.nio.file.spi.FileSystemProvider;
//
//public class ClassA{
//	void meth1() {
//		
////		String s = "java";
////		StringBuffer s = "java";   
////		StringBuilder s="java";   
////  Note :   we can not create sting using StringBuffer and StringBuilder because 
////		String constant is not available for both hence we use new keyword
//		
//		 System.out.println("meth1() called");
//		 
//		 
//		 // showing mutability of string   
//		 String s1= new String("Java");
//		 StringBuffer buffer1 = new StringBuffer("Java");
//		 StringBuilder builder1 = new StringBuilder("Java");
//		 
//		 System.out.println("------------------before----------");
//		 System.out.println("s1 : "+s1);
//		 System.out.println("buffer1 : "+buffer1);
//		 System.out.println("builder1 : "+builder1);
//		 
//		 s1.concat(" is awesome");
////		 buffer1.concat(" is awesome"); concat() is not present in StringBuffer class so we use append()
////		 builder1.concat(" is awesome");    concat() is not present in StringBuilder class so we use append()
//		 buffer1.append(" is awesome");
//		 builder1.append(" is awesome");
//		 
//		 System.out.println("------------after--------------");
//		 System.out.println("s1 : "+s1);
//		 System.out.println("buffer1 : "+buffer1);
//		 System.out.println("builder1 : "+builder1);
//	}
//	void meth2() {
//		System.out.println("meth2() called");
//		 
//		 
//		 // showing mutability of string   
//		 String s1= new String("Java");
//		 StringBuffer buffer1 = new StringBuffer("Java");
//		 StringBuilder builder1 = new StringBuilder("Java");
//		 
//		 String s2= new String("Java");
//		 StringBuffer buffer2 = new StringBuffer("Java");
//		 StringBuilder builder2 = new StringBuilder("Java");
//		 
//		 System.out.println(s1.equals(s2));
//		 System.out.println(buffer1.equals(buffer2));
//		 System.out.println(builder1.equals(builder2));
//		 
//		 
//		 System.out.println("--------------------");
//		 
//		 System.out.println(s1==s2);
//		 System.out.println(buffer1==buffer2);
//		 System.out.println(builder1==builder2);
//		 System.out.println("--------------------");
//		 
//
//		 //NOTE : how to compare the content inside the StringBuffer and in StringBuilder class?
//		 System.out.println(buffer1.toString().equals(buffer2.toString()));
//		 System.out.println(builder1.toString().equals(builder2.toString()));
//		 builder2.append(" is awesome");
//		 System.out.println(builder1.toString().equals(builder2.toString()));
//	}
//	void meth3() {
//		System.out.println("meth3() called");
//		StringBuffer sb = new StringBuffer();
//		
//		System.out.println("capacity() : "+sb.capacity()); // Default capacity of StringBuffer is 16 characters (when initialized empty).
//		sb.append("abcdefghijklm");
//		System.out.println("length() : "+sb.length()); // it will give the length of the string
//		System.out.println(sb);
//		sb.append("nope");
//		System.out.println("length() : "+sb.length());
//		System.out.println("capacity() : "+sb.capacity()); // capacity is not fixed, it will increase according to this formula -> (old_capacity +1) * 2
//		System.out.println(sb);
//		
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		aobj.meth1();
//		aobj.meth2();
//		aobj.meth3();
//	}
//}


//package com.pack1;
//
//public class ClassA{
//	void meth1() {
//		int iterations =100000;
//		String data ="a";
//		
//		long startTime = System.currentTimeMillis();  //currentTimeMillis() is a static method and it is present 
//		// in System Class. it is static that's why we can call it directly with the help of Class name and
//		// its return type is long. and it will give current runtime in milliseconds.
//		String str ="";
//		for(int i=0 ; i<iterations ; i++) {
//			str+=data;
//		}
//		long endTime = System.currentTimeMillis();
//		long stringDuration = endTime - startTime;
//		
//		startTime = System.currentTimeMillis();
//		StringBuffer stringBuffer = new StringBuffer();
//		for(int i=0; i<iterations ; i++) {
//			stringBuffer.append(data);
//		}
//		endTime = System.currentTimeMillis();
//		long stringBufferDuration = endTime -startTime;
//		
//		startTime = System.currentTimeMillis();
//		StringBuilder stringBuilder = new StringBuilder();
//		for(int i=0 ; i<iterations ; i++) {
//			stringBuilder.append(data);
//		}
//		endTime = System.currentTimeMillis();
//		long stringBuilderDuration = endTime - startTime;
//		
//		System.out.println("Time taken for string concatenation : "+stringDuration+" ms");
//		System.out.println("Time taken for stringBuffer concatenation : "+stringBufferDuration +" ms");
//		System.out.println("Time taken for StingBuilder concatenation : "+stringBuilderDuration +" ms");
//	}
//	public static void main(String[] args) {
//		new ClassA().meth1();
//	}
//}
 
//Note : If in our project more time the string or object is changing then not prefer String
//       If you want consistent result then go with StringBuffer 
//       If you want fast result then go with StringBuilder/




//28/5/25
//Understanding encapsulation 
// check ClassB
//package com.pack1;
//
//public class ClassA{
//	private String empName;
//	private int empSal;
//	private String empDept;
//	
//	// alt+shift+s -> for creating getters and setters
//	
//	public String getEmpName() {
//		return empName;
//	}
//	public void setEmpName(String empName) {
//		this.empName = empName;
//	}
//	public int getEmpSal() {
//		return empSal;
//	}
//	public void setEmpSal(int empSal) {
//		this.empSal = empSal;
//	}
//	public String getEmpDept() {
//		return empDept;
//	}
//	public void setEmpDept(String empDept) {
//		this.empDept = empDept;
//	}	
//}



//Task-1
//package com.pack1;
//
//public class ClassA{
//	private String empName;
//	private int empExp;
//	private int empSal;
//	
//	
//	public String getEmpName() {
//		return empName;
//	}
//	public void setEmpName(String empName) {
//		this.empName = empName;
//	}
//	public int getEmpExp() {
//		return empExp;
//	}
//	public void setEmpExp(int empExp) {
//		this.empExp = empExp;
//		
//	}	
//	public int getEmpSal() {
//		return empSal;
//	}
//	public void setEmpSal(int empSal) {
//		if(empExp>=10) {
//			this.empSal = empSal + (int)(empSal*.3);
//		}
//		else {
//			this.empSal = empSal + (int)(empSal*.05);
//		}
//	}	
//}



//29/5/25
//Understanding of Inheritance

/*
package com.pack1;
public class ClassA{
	void meth1() {  // even we are using inheritance we can not access the methods private methods, so while using inheritance we need to focus on access modifier also. 
		System.out.println("ClassA method called");
	}
}*/


// multilevel inheritance
//package com.pack1;
//public class ClassA{
//	public void meth1() { // made it public for accessing from different package 
//		System.out.println("ClassA method called");
//	}
//}


//30/5/25
// hierarchical Inheritance & Hybrid Inheritance
//package com.pack1;
//public class ClassA{
//	public void meth1() {
//		System.out.println("ClassA method");
//	}
//}

//  Multiple Inheritance 
//package com.pack1;
//public class ClassA{
//	public void meth1() {
//		System.out.println("ClassA method");
//	}
//}

//Note: Constructor does not participate in Inheritance
//package com.pack1;
//public class ClassA{
//	void meth1() {
//		System.out.println("meth1()");
//	}
//	ClassA(){
//		this.meth1();
//		System.out.println("ClassA default Constructor");
//	}
//	ClassA(int x){
//		System.out.println("ClassA parameterized constructor : "+x);
//		this.meth1();
//	}
//}



//Task-1
//package com.pack1;
//public class ClassA{
//	void meth1() {
//		System.out.println(10);
//		System.out.println(this.meth2()+56);
//	}
//	int meth2() {
//		System.out.println(75);
//		System.out.println(96);
//		return this.meth3();
//	}
//	int meth3() {
//		System.out.println(74);
//		System.out.println(92);
//		return 74-92;
//	}
//	void meth4() {
//		System.out.println(56);
//	}
//	ClassA(){
//		this(52);
//		this.meth1();
//		System.out.println(85);
//	}
//	ClassA(int a){
//		System.out.println(a+7);
//	}
//}



//31/5/25
//Understanding Polymorphism
//package com.pack1;
//public class ClassA{
//	 public void meth1() {
//		 System.out.println(10);
//	 }
//	 void meth1(int x) {
//		 System.out.println(20);
//	 }
//	 static private void meth1(String s) {
//		 System.out.println(30);
//	 }
//	 void meth1(int x, String s) {
//		 System.out.println(40);
//	 }
//	 static protected void meth1(String s, int x) {
//		 System.out.println(50);
//	 }
//	 void meth1(StringBuffer sb) {
//		 System.out.println(60);
//	 }
//	 private void meth1(byte b) {
//		 System.out.println(70);
//	 }
//	 public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		aobj.meth1();
//		aobj.meth1(100);
//		aobj.meth1("java");
//	aobj.meth1(100,"java");
//	aobj.meth1("java",100);		
//	aobj.meth1(new StringBuffer("Java")); //for passing StringBuffer we have to use new keyword
//	aobj.meth1((byte)100); // default type is int hence downcast into byte
//	
//	main();
//	main("Java is awesome");
//	 }
//	 public static void main() {
//		System.out.println("1st main()");
//	 }
//	 public static void main(String s) {
//		System.out.println("2nd main()");
//	 }
//	ClassA(){
//		this(1000);
//		System.out.println("ClassA default constructor");
//	}
//	ClassA(int x){
//		System.out.println("ClassA parameterized constructor"+x);
//
//	}
//}



//2/6/25
//Understanding Function overriding
//package com.pack1;
//public class ClassA{
//	void meth1() { // it is Overidden method
//		System.out.println("ClassA meth1()");
//	}
//	String meth2(int x) {
//		System.out.println("ClassA meth2()");
//		return "java";
//	}
//	public void meth3(int x, String s) {
//		System.out.println("ClassA meth3()");
//	}
//	static void meth4() {
//		System.out.println("ClassA meth4()");
//	}
//	ClassA meth5() {
//		System.out.println("ClassA meth5()");
//		return new ClassA();
//	}
//}



//3/6/25
//Understanding Abstraction
//package com.pack1;
//public abstract class ClassA{
//	abstract void meth1();
//	abstract String msg();
//	abstract boolean display(int i);
//	
//	void meth2() {
//		System.out.println("meth2() called");
//	}
//	static void meth3() {
//		System.out.println("meth3() called");
//	}
//	ClassA(){
//		System.out.println("ClassA default constructor");
//	}
//	public static void main(String[] args) {
//		System.out.println("ClassA main() executed");
//		//new ClassA(); //C.E because an abstract class cannot be instantiated directly
//		ClassA.meth3();
//	}
//}



//4/6/25
//Understanding Interface
//package com.pack1; 
//
//public class ClassA extends ClassB implements InterfaceA, InterfaceB{  // here the order is extends and then implements from interfaces
//	@Override
//	public void meth1() {
//	  	System.out.println("Interface-A meth1 overridden");
//	}
//	@Override
//	public void meth2(String msg) {
//		System.out.println("Interface-A meth2() overridden");
//	}
//	@Override
//	public void display() {
//		System.out.println("\nInterface-B display() overridden");
//	}
//	public static void main(String[] args) {
//		InterfaceA aobj = new ClassA();
//		aobj.meth1();
//		aobj.meth2("Java");
//		aobj.meth3();
//		// aobj.meth5(); //C.E because of private access modifier
//		
//		InterfaceB bobj = new ClassA();
//		bobj.display();
//		new ClassA().greet();
//	}
//}


//5/6/25
//remove the ambiguity using interface
//package com.pack1;
//public class ClassA implements InterfaceA, InterfaceB{
//	@Override
//	public void meth1() { // as we know multiple inheritance is not possible in classes in java. the reason behind this is ambiguity and to resolve this ambiguity problem
//		// we are using interface -> InterfaceA.super.meth1(); and InterfaceB.super.meth1(); used for remove the ambiguity
//		System.out.println("Class-A method");
//		InterfaceA.super.meth1();
//		InterfaceB.super.meth1();
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		aobj.meth1();
//	}
//}

// example-1
//package com.pack1;
//public class ClassA{
//	void meth1() {
//		System.out.println("Hi from ClassA");
//	}
//}



//9/6/25
//Exception Handling
//package com.pack1;
//public class ClassA{
//	void meth1() {
//		System.out.println(10);
//		try {
//			System.out.println("try block executed");
//			System.out.println(20/0); //-> ArithemeticException
//		}
//		catch(ArithmeticException e) {
//			System.out.println("catch block executed");
//		}
//		finally {
//			System.out.println("Finally block executed");
//		}
//		System.out.println(30);
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		aobj.meth1();
//	}
//}



//10/6/25
//Methods for throw exception
//package com.pack1;
//public class ClassA{
//	void meth1() {
//		System.out.println(10);
//		try {
//			System.out.println("try block executed");
//			System.out.println(20/0); //-> ArithemeticException
//		}
//		catch(ArithmeticException ae) {
//			System.out.println("catch block executed");
////			System.out.println(ae.getMessage());//Reason of the exception
////			System.out.println(ae.toString());//Name & reason of the exception
//			ae.printStackTrace();//It gives complete info about the exception
//		}
//		finally {
//			System.out.println("Finally block executed");
//		}
//		System.out.println(30);
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		aobj.meth1();
//	}
//}

//Key points in Exception Handling
//package com.pack1;
//import java.util.Scanner;
//import java.io.FileInputStream;
//
//public class ClassA{
//	Scanner sc = new Scanner(System.in);
//	void meth1() {
//		System.out.println(10);
//		String arr[] = new String[5];
//		arr[1] ="Java";
//		arr[2] = "Kishan";
//		try {
//			System.out.println("try block executed");
//			System.out.println("enter a number");
//			System.out.println("===>"+20/sc.nextInt()); 
//			System.out.println("length() : "+arr[0].length());
//			System.out.println("Hello World"); //Always try to write less code in "try" block because if any exception occur then automatically our code go to the catch block and remaining line not executed 
//		}
//		/*
//		catch(ArithmeticException ae) {
//			System.out.println("1st catch block executed");
//			ae.printStackTrace();
//		}
//		catch(NullPointerException ae) {
//			System.out.println("2nd catch block executed");
//			ae.printStackTrace();
//		}
//		*/
//		catch(ArithmeticException | NullPointerException e) { //By java 1.7 we can handle multiple exception with single catch block
//			System.out.println("catch block executed");
//			e.printStackTrace();
//		}
//		finally {
//			System.out.println("Finally block executed");
//			sc.close(); // we know finally will execute so we write the sc.close() here.
//		}
//		System.out.println(30);
//	}
//	
//	void meth2() throws Exception{
//		System.out.println("meth2() called");
//		try(FileInputStream fis=new FileInputStream("D:\\STUDY\\JAVA FULL STACK\\file1.txt")){ //try with resources can write solely
//			System.out.println("connection Created");
//		}
//	}
//	public static void main(String[] args)throws Exception {
//		ClassA aobj = new ClassA();
////		aobj.meth1();
//		aobj.meth2();
//
//	}
//}


//11/6/25
// 15 examples of exception handling ( task )
// check Test1 class in com.pack1



//throw and throws
//package com.pack1;
//import java.io.FileInputStream;
//public class ClassA{
//	int avl_amt=1000;
//	void withdraw(int wd_amt) {
//		if(avl_amt<wd_amt) {
//			throw new RuntimeException("Insufficient Funds!!");
//		}
//		else {
//			System.out.println("transaction success");
//		}
//	}
//	void meth2() throws Exception{ //it is used for "escaping" from exception and if any exception occur in our program then for this we need to use blocks(try-catch-finally) 
//		System.out.println("meth2 called");
//		FileInputStream fis = new FileInputStream("D:\\\\STUDY\\\\JAVA FULL STACK\\\\file1.txt"); // compiler don't know the file is present so it detecting an exception,
//		// this is an checked exception and compiler will not proceed until it will handle, for escaping this exception we can use throws Exception in method name
//		System.out.println("connection created");
//	}
//	public static void main(String[] args) throws Exception { // for escaping from exception here also we use throws
//		ClassA aobj = new ClassA();
//		// aobj.withdraw(4000);
//		aobj.meth2();
//	}
//}


//creating own exception 
// check UserDefinedException and MinimumAccountBalanceException


//12/6/25
//Multi-processing and Multi-Threading
//NOTE: If we are using threads then we will not able to guess the output
//package com.pack1;
//public class ClassA implements Runnable{ // or extends Thread
//	public void run() {
//		for(int i=1 ; i<=5 ; i++) {
//			System.out.println("run() executed: "+i);
//		}
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		Thread t1 = new Thread(aobj);
//		Thread t2 = new Thread();
//
//		t1.start(); 
//		t1.run(); 
//		
//		t2.start();
//		t2.run();
//		
//	       //t1.start();
//		   /*    In this case a new thread will be created and that
//		       new thread is responsible for running the run()
//		       present in ClassA because of overriding concept
//		   */    
//		       //t1.run();
//		/*    In this Case No new thread will be created we are
//		calling run() method which is present in thread class
//		just like a normal method call but as we are using
//		overriding concept Instead of thread class run()
//		ClassA run() will be executed
//		   */    
//		       
//		       //t2.start();
//		/*    In this case a new thread will be created and that
//		       new thread is responsible for running the run()
//		       present in Thread Class
//		   */    
//		       //t2.run();
//		/*    In this Case No new thread will be created we are
//		calling run() method which is present in thread class
//		just like a normal method call.
//		   */ 
//	}
//}


//13/6/25
//single thread and multi thread and thread life cycle
//package com.pack1;
//public class ClassA extends Thread{
//	@Override
//	public void run() {
//		String name=Thread.currentThread().getName();
//		int priority = Thread.currentThread().getPriority();
//		
//		System.out.println(name+" has entered run()");
//		
//		for(int i=1 ; i<=5 ; i++) {
//			System.out.println(name+"("+priority+")"+"==>"+i);
//		}
//		System.out.println(name+" completed its execution");
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		
//		Thread t1=new Thread(aobj);
//		Thread t2=new Thread(aobj);
//		
//		t1.setName("First Thread");
//		t1.setName("Second Thread");
//
//		t1.setPriority(Thread.MIN_PRIORITY);//t1.setPriority(1);
//		t2.setPriority(10);//t1.setPriority(MAX_PRIORITY);
//		
//		t1.start();
//		t2.start();
//	}
//}

/*
 Thread Schedular:
 -----------------
 
 Thread schedular is going to start the thread basing upon 2 aspects
 
   ==> Thread Priorities
   ==> Underlying OS
   
 Thread Priorities:
 -----------------
 
 Thread Priorities varies between 1 to 10
 
 Maximum Priority for a Thread is 10.(We can't give more than that.)
 Normal/Default priority for a Thread is 5
 Minimum Priority for a Thread is 1.
  
 */


//14/6/25
//Methods use to control the flow of thread
//Join(),sleep(),yield(), interrupt()
//check ClassB

//join()
//package com.pack1;
//public class ClassA extends Thread{
//	@Override
//	public void run() {
//		for(int i=1 ; i<=5 ; i++) {
//			System.out.println("ClassA run(): "+i);
//		}
//	}
//}

//sleep()
//package com.pack1;
//public class ClassA{
//	public static void main(String[] args) throws InterruptedException{
//		System.out.println("J");
//		Thread.sleep(5000);
//		System.out.println("A");
//		Thread.sleep(5000);
//		System.out.println("V");
//		Thread.sleep(5000,500); //sleep time of thread are also depend upon system. So they are not gurranted to be precise
//		System.out.println("A");
//	}
//}


//interrupt()
//package com.pack1;
//public class ClassA extends Thread
//{
//	@Override
//	public void run() {
//		System.out.println("I am ready for interview");
//		for(int i=1; i<=5 ; i++) {
//			System.out.println("this is my "+i+" interview");
//		}
//		System.out.println("I got placed, Now I can relax");
//		try {
//			Thread.sleep(20000);
//		}
//		catch(Exception e) {
//			System.out.println("My sleep has been disturbed");
//		}
//		System.out.println("time to go to office");
//	}
//	public static void main(String[] args) {
//		Thread t = new ClassA();
//		t.start();
//		t.interrupt();
//	}
//}


//yield()
//package com.pack1;
//public class ClassA extends Thread{
//	@Override
//	public void run() {
//		for(int i=1 ; i<=5 ; i++) {
//			System.out.println("ClassA run(): "+i);
//		}
//	}
//}


//16/6/25
//synchronous
//check classB
//package com.pack1;
//public class ClassA extends Thread{
//	public void run() {
//		criticalResource();
//	}
//	synchronized void criticalResource() {
//		String name = Thread.currentThread().getName();
//		System.out.println(name+" has entered criticalResource()");
//		for(int i=1 ;i<=5 ;i++) {
//			System.out.println(name+"===>"+i);
//		}
//		System.out.println(name + " completed its execution");
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		Thread t1 = new Thread(aobj,"Tom-Thread");
//		Thread t2 = new Thread(aobj,"Jerry-Thread");
//		
////		t1.setName("Tom-Thread");
////		t2.setName("Jerry-Thread");
//		
//		t1.start();
//		t2.start();
//	}
	
//}	
	
	

//NOTE : Inner Classes and its types -> nested, static, method local and anonymous InnerClass
//package com.pack1;
//public class ClassA{
//	public class InnerClassA //Nested-InnerClass
//	{
//		
//	}
//	public static class InnerClassB //Static-InnerClass
//	{
//		
//	}
//	void meth1() {
//		class InnerClassC{ //Method local-InnerClass
//			
//		}
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA() 
//		{ //Anonymous Inner Class and it is child class of ClassA
//			
//		};
//	}
//}



//Deadlock
//Thread 1 holding obj-1 and it need obj-2 for complete its execution so that it can release current object(obj-1) and vice versa.
//package com.pack1;
//public class ClassA {
//	public static void main(String[] args) {
//		final String A="Java";
//		final String B="Python";
//			
//		Thread t1 = new Thread()
//		{
//			//Anonymous Inner Class starts here
//			@Override
//			public void run() {
//				synchronized(A){//Thread 1 is holding java
//					System.out.println("Thread 1 locked on A");
//					try {
//						Thread.sleep(100);
//					}
//					catch(Exception e) {
//						e.printStackTrace();
//					}
//					synchronized(B) //Thread 1 will be waiting for B(Python)
//					{
//						System.out.println("Thread 1 locked on B");
//					}
//					System.out.println("no dead Lock");
//
//				}
//
//			} 
//		};//Anonymous Inner Class Ends Here
//
//		Thread t2 = new Thread()
//		{
//			@Override
//			public void run() {
//				synchronized(B){//Thread 2 is holding Python
//					System.out.println("Thread 2 locked on B");
//					try {
//						Thread.sleep(100);
//					}
//					catch(Exception e) {
//						e.printStackTrace();
//					}
//					synchronized(A) //Thread 2 will be waiting for A(Java)
//					{
//						System.out.println("Thread 2 locked on A");
//					}
//				}
//				System.out.println("no dead Lock");
//			}	
//		}; 
//		t1.start();
//		t2.start();
//	}
//}


//17/6/25
//Interthread Communication : wait(),notify(),notifyAll()

//package com.pack1;
//public class ClassA{
//	int amount=10000;
//	synchronized void with_draw(int amount) throws InterruptedException{
//		if(this.amount<amount) {
//			System.out.println("Insufficient balcance");
//			//wait(30000); // always use insisde the synchronised context otherwise got exception not an error
//			//Thread.sleep(30000); //30sec
//			
//			System.out.println("Amount credited");
//			this.amount-=amount;
//			System.out.println("with draw successful \nBalance is "+this.amount);
//		}
//		else {
//			this.amount-=amount;
//			System.out.println("with draw successful \nBalance is "+this.amount);
//		}
//	}
//	synchronized void deposit(int amount) {
//		this.amount+=amount;
//		System.out.println("Deposited successfuly \nBalance is "+this.amount);
//		//notify();
//		//notifyAll();
//	}
//}

//check  class ThreadGroupTest



//18/6/25
//Understanding Thread Pool : we have to provide threads in thread pool before task assign.
// check ThreadPoolDemo class

//daemon thread
//package com.pack1;
//public class ClassA extends Thread{
//	public void run() {
//		int i=1;
//		while(true) {
//			System.out.println("run() "+i);
//			i++;
//		}
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		Thread t= new Thread(aobj);
//		
//		t.setDaemon(true);
//		
//		t.start();
//		
//		for(int i=1; i <=20 ; i++) {
//			System.out.println("main Thread : "+i);
//		}
//	}
//}



//19/6/25 -> check classB and classC

//clone method

//package com.pack1;
//public class ClassA{
//	int x=10;
//	int y=20;
//}


//Garbage Collector -> mark and sweep algorithm used by garbage collector, whenever an object is going to be destroyed before destroying the garbage collector call finalise method internally for terminate all connections with object

//package com.pack1;
//public class ClassA{
//	void meth1(){
//		System.out.println("meth1 called");
//		ClassA obj = new ClassA(); // third way for start garbage colection-> once the method is completed every object inside that method will destroyed whether it is reference or not reference
//		// four types of storage -> (field, object)->destroyed  , (file and database)-> not destroyed
//	}
//	@Override
//	protected void finalize() {
//		System.out.println("\n Garabge has been collected");
//	}
//	public static void main(String[] args) {
//		ClassA aobj1 = new ClassA(); // 1st object
//		ClassA aobj2 = new ClassA(); // 2nd object
//		
//		aobj1.meth1();
//		//System.out.println("aobj1 :"+aobj1.hashCode());
//		//System.out.println("aobj2 :"+aobj2.hashCode());
//		
//		//aobj1=aobj2; // first way for start garbage collection->reassigning the reference variable
//		//aobj1 = null; //second way for start garbage collection->Nullyfying the reference variable
//		
//		
//		System.gc(); // system-> class or we use run class , gc -> method
//		
//		aobj1.meth1();
//
//		//System.out.println("\n aobj1 :"+aobj1.hashCode());
//		//System.out.println("aobj2 :"+aobj2.hashCode());
//	}
//}


//Final keyword
//check classB
//package com.pack1;
//public final class ClassA{
//	final int i=10;
//	final void meth1() {
//		System.out.println(i);
//	}
//	public static void main(String[] args) {
//		new ClassA().meth1();
//	}
//}


//20/6/25
// I/O streams
// byte streams
//package com.pack1;
//
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//
//public class ClassA{
//	void fileOpertion1() throws Exception{
//		System.out.println("Reading the data from a file");
//		FileInputStream fis = new FileInputStream("D:\\STUDY\\JAVA FULL STACK\\file1.txt"); // it wll throw exception so we have to use either try-catch-finally or throws
//		System.out.println("Connection created");
//		int i;
//		while(((i=fis.read())!=-1)) {
//			System.out.println((char)i);
//		}
//		System.out.println("\n Data Reterived");
//		fis.close(); // good practice
//	}
//	void fileOpertaions2() throws Exception{
//		System.out.println("writing the data into a file");
//		FileOutputStream fos = new FileOutputStream("D:\\\\STUDY\\\\JAVA FULL STACK\\file2.txt",true); // if we don't use true then it will overwrite the new data, for appending the data we use true
//		System.out.println("Connection created");
//		String msg = ",because it is awesome";
//		byte arr[] = msg.getBytes(); //write only accept getbytes and int parameter
//		fos.write(arr);
//		System.out.println("Data Entered");
//		fos.close();
//	}
//	void fileOpertaions3() throws Exception{
//		System.out.println("Coping the into a file");
//		
//		//FileInputStream fis = new FileInputStream("D:\\STUDY\\JAVA FULL STACK\\file2.txt");
//		//FileOutputStream fos = new FileOutputStream("D:\\STUDY\\JAVA FULL STACK\\file3.txt");
//		FileInputStream fis = new FileInputStream("D:\\STUDY\\JAVA FULL STACK\\image.png"); // here we copy the image
//		FileOutputStream fos = new FileOutputStream("D:\\STUDY\\JAVA FULL STACK\\image1.jpeg"); 
//		System.out.println("Connection created");
//		
//		int i;
//		while((i=fis.read())!=-1) {
//			fos.write(i);
//		}
//		System.out.println("Data Copied");
//		fis.close();
//		fos.close();
//	}
//	public static void main(String[] args) throws Exception {
//		ClassA obj = new ClassA();
//		//obj.fileOpertion1();
//		//obj.fileOpertaions2();
//		obj.fileOpertaions3();
//
//	}
//}


//21/6/25  
//character stream, buffered byte stream, buffered character stream
//character stream -> not transfer multimedia 
//package com.pack1;
//import java.io.FileReader;
//import java.io.FileWriter;
//
//public class ClassA {
//	void fileOpertion1()throws Exception{
//		System.out.println("reading the data from file");
//		FileReader fr = new FileReader("D:\\\\STUDY\\\\JAVA FULL STACK\\\\file4.txt");
//		System.out.println("connection created");
//		int i;
//		while((i=fr.read())!=-1) {
//			System.out.print((char)i);
//		}
//		System.out.println("data Reterived");
//		fr.close();
//	}
//	void fileOpertion2()throws Exception{
//		System.out.println("writing the data into file");
//		FileWriter fw = new FileWriter("D:\\\\STUDY\\\\JAVA FULL STACK\\\\file5.txt",true);
//		System.out.println("connection created");
//		String msg = "and date is 21th june";
//		fw.write(msg);
//		System.out.println("\n data writeen");
//		fw.close();
//	}
//	void fileOpertion3()throws Exception{
//		System.out.println("Coping the data into file");
//		FileReader fr = new FileReader("D:\\\\STUDY\\\\JAVA FULL STACK\\\\file5.txt");
//		FileWriter fw = new FileWriter("D:\\\\STUDY\\\\JAVA FULL STACK\\\\file6.txt");
//
//		System.out.println("connection created");
//		int i;
//		while((i=fr.read())!=-1) {
//			fw.write(i);
//		}
//		System.out.println("\n data copied");
//		fr.close();
//		fw.close();
//	}
//	public static void main(String[] args) throws Exception{
//		ClassA obj = new ClassA();
//		obj.fileOpertion1();
//		//obj.fileOpertion2();
//		//obj.fileOpertion3();
//	}
//}


//BufferedStream
//package com.pack1;
//import java.io.BufferedInputStream;
//import java.io.FileInputStream;
//public class ClassA {
//	void fileOpertion1()throws Exception{
//		System.out.println("reading the data from file");
//		BufferedInputStream bis = new BufferedInputStream( new FileInputStream("D:\\STUDY\\JAVA FULL STACK\\file2.txt"));
//		System.out.println("connection created");
//		int i;
//		while((i=bis.read())!=-1) {
//			System.out.print((char)i);
//		}
//		System.out.println("\ndata Reterived");
//		bis.close();
//	}
//	public static void main(String[] args) throws Exception{
//		ClassA obj = new ClassA();
//		obj.fileOpertion1();
//	}
//}


//23/6/25

//DataStream -> maintain the order of data

//package com.pack1;
//import java.io.DataInputStream;
//import java.io.DataOutputStream;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//public class ClassA{
//	void fileOperations() throws Exception{
//		System.out.println("Implementing DataStreams");
//		DataOutputStream dos = new DataOutputStream(new FileOutputStream("D:\\STUDY\\JAVA FULL STACK\\file7.txt"));
//		System.out.println("Connection created");
//		
//		dos.writeInt(1000);
//		dos.writeChar('A');
//		dos.writeBoolean(true);
//		dos.writeInt(2000);
//		
//		System.out.println("Data Entered");
//		dos.close();
//		
//		DataInputStream dis = new DataInputStream(new FileInputStream("D:\\\\STUDY\\\\JAVA FULL STACK\\\\file7.txt"));
//		System.out.println("\nConnection created\n");
//		
//		//NOTE: order of the reteriving should be same like the data present in the file
//		System.out.println(dis.readInt());   
//		System.out.println(dis.readChar());
//		System.out.println(dis.readBoolean());
//		System.out.println(dis.readInt());
//		
//		System.out.println("\nData reterived");
//		dis.close();
//		
//	}
//	public static void main(String[] args) throws Exception {
//		ClassA obj = new ClassA();
//		obj.fileOperations();
//	}
//}


//ObjectStream -> maintain the order of obejct while reteriving the data

//Check classB and ClassC
//package com.pack1;
//import java.io.Serializable;
//public class ClassA implements Serializable{
//	transient int a =10;  // if we are using transient keyword then the original value of the variable will be ignored and the default value is taken
//	int b= 20;
//}


//24/6/25
//Collection Frameworks only introduction


//25/6/25
//package com.pack1;
//import java.util.ArrayList;
//import java.util.Iterator; //Interface
//
//public class ClassA {
//	void  meth1() {
//		System.out.println("impleenting ArrayList");
//		ArrayList<Integer> al = new ArrayList<Integer>(); // generics (all types of data is integer)
//		
//		
//		// these yellow lines shows your array list getting any types of data, for solving this we use generics 
//		al.add(10); //Insertion order is maintained
//		al.add(33); //Hetrogenous data is allowed
//		al.add(null); // null value is alowed
//		al.add(10); // deuplicate elements are allowed
//		al.add(32); // it is available from java 1.2v
//		al.add(2); //its default capacity is 10
//		al.add(55); // it size increases b y HALF ===> (current capactiy*3/2)+1
//		al.add(1); // It is not synchronized
//		
//		System.out.println("\nArrayList :"+al);
//		
//		System.out.println("\nsize : "+al.size());
//		System.out.println("get() : "+al.get(0));
//		System.out.println("get() : "+al.get(al.size()-1));
//		
//		System.out.println("\nReteriving the data by using for loop");
//		for(int i=0 ; i<=al.size()-1 ; i++) {
//			System.out.println(al.get(i)+" ");
//		}
//		System.out.println();
//		for(int i=al.size()-1 ; i>0 ; i--) { //reverse the ArrayList
//			System.out.println(al.get(i)+" ");
//		}
//		
//		System.out.println("\n Tereiving the data by using for each loop");
//		for(Object data:al) { //for(Integer data:al) or for(int data:al)
//			System.out.println(data + " ");
//		}
//		System.out.println("\n\nReteriving the data by using Itertor Interface");
//		Iterator<Integer> i = al.iterator();
//		while(i.hasNext()) {  //check is there any next element or not if yes returns true or false
//			System.out.println(i.next()+" "); // print the element and move the cursor
//		}
//		
//		System.out.println("\n\n ----------------------METHODS----------------------");
//		System.out.println("isEmpty() : "+al.isEmpty()+al);
//		//al.clear();
//		System.out.println("isEmpty : "+al.isEmpty()+al);
//		
//		ArrayList<Integer> nums = new ArrayList<Integer>();
//		nums.add(33);
//		nums.add(100);
//		
//		System.out.println("containsAll() : "+al.containsAll(nums));
//		
//		al.addAll(nums);
//		System.out.println("al : "+al);
//		System.out.println("containsAll() : "+al.containsAll(nums));
//		
//		
//		System.out.println("aremove() : "+al.remove((Object)55));
//		System.out.println("al : "+al);
//		System.out.println("remove() : "+al.remove(5));
//		System.out.println("al : "+al);
//		System.out.println("retainAll() : "+al.retainAll(nums));
//		System.out.println("al : "+al);
//		
//		al.add(1,100);
//		System.out.println("al : "+al);
//		al.set(2, 100);
//		System.out.println("al : "+al);
//		
//		}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		aobj.meth1();
//	}
//}


//Task 1
//package com.pack1;
//import java.util.ArrayList;
//public class ClassA{
//	void meth1() {
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		al.add(3);
//		al.add(4);
//		al.add(5);
//		al.add(10);
//		al.add(44);
//		System.out.println(al);
//	}
//	public static void main(String[] args) {
//		ClassA obj = new ClassA();
//		obj.meth1();
//      sc.close();
//	}
//}


//Task 2
//package com.pack1;
//import java.util.ArrayList;
//import java.util.Scanner;
//public class ClassA{
//	static Scanner sc = new Scanner(System.in);
//	void meth1() {
//		ArrayList<String> al = new ArrayList<String>();
//		int n;
//		System.out.println("Enter the number of String you want to enter");
//		n = sc.nextInt();
//		sc.nextLine();
//		for(int i=0 ; i<n ; i++) {
//			al.add(sc.nextLine());
//		}
//		System.out.println(al);
//      sc.close();
//	}
//	public static void main(String[] args) {
//		ClassA obj = new ClassA();
//		obj.meth1();
//	}
//}



//Task 3
//package com.pack1;
//import java.util.ArrayList;
//import java.util.Scanner;
//import java.util.Iterator;
//public class ClassA{
//	Scanner sc = new Scanner(System.in);
//	void meth1() {
//		ArrayList<Integer> al= new ArrayList<Integer>();
//		System.out.println("enter number of integer you want to enter");
//		int n;
//		n=sc.nextInt();
//		sc.nextLine();
//		for(int i=0 ; i<n ; i++) {
//			al.add(sc.nextInt());
//			sc.nextLine();
//		}
//		System.out.println(al);
//		
//		//You cannot safely remove elements from a list inside an enhanced for-each loop. Java will throw a ConcurrentModificationException.
//		Iterator<Integer> it = al.iterator();
//		while(it.hasNext()) {
//			int data = it.next();
//			if(data%2 == 0) {
//				it.remove(); 
//			}
//		}
//		System.out.println(al);
//		sc.close();
//	}
//	public static void main(String[] args) {
//		ClassA obj = new ClassA();
//		obj.meth1();
//	}
//}

//Task 4
//package com.pack1;
//import java.util.ArrayList;
//import java.util.Scanner;
//import java.util.Iterator;
//public class ClassA{
//	Scanner sc= new Scanner(System.in);
//	void meth1() {
//		ArrayList<Integer> al1 = new ArrayList<Integer>();
//		ArrayList<Integer> al2 = new ArrayList<Integer>();
//		
//		System.out.println("enter number of integer you want to enter in first ArrayList");
//		int n1;
//		n1=sc.nextInt();
//		sc.nextLine();
//		System.out.println("Enter numbers:");
//		for(int i=0 ; i<n1 ; i++) {
//			al1.add(sc.nextInt());
//			sc.nextLine();
//		}
//		
//		System.out.println("enter number of integer you want to enter in Second ArrayList");
//		int n2;
//		n2=sc.nextInt();
//		sc.nextLine();
//		System.out.println("Enter numbers:");
//		for(int i=0 ; i<n2 ; i++) {
//			al2.add(sc.nextInt());
//			sc.nextLine();
//		}
//		
//		
//		al1.addAll(al2); //merging
//		
//		//System.out.println(al1);
//		Iterator<Integer> it =al1.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		
//		sc.close();
//	}
//	public static void main(String[] args) {
//		ClassA obj = new ClassA();
//		obj.meth1();
//	}
//}


//26/6/25
//How to pass used defined class object into the ArrayList
//check Employee class
//package com.pack1;
//import java.util.ArrayList;
//import java.util.Iterator;
//
//public class ClassA{
//	void meth1() {
//		System.out.println("Passing Userdefined ClassObject in to the Array List");
//		
//		ArrayList<Employee> al = new ArrayList<Employee>();
//		
//		Employee emp1 = new Employee("John",101,"Java");
//		Employee emp2 = new Employee("ayush",102,"AWS");
//		Employee emp3 = new Employee("rohan",103,"Oracle");
//		
//		al.add(emp1);
//		al.add(emp2);
//		al.add(emp3);
//		al.add(new Employee("raju",103,"reactJs"));
//		
//		System.out.println("al : "+al+"\n");
//		
//		Iterator<Employee> i = al.iterator();
//		while(i.hasNext()){
//			System.out.println(i.next());
//		}	
//	}
//	public static void main(String[] args) {
//		ClassA obj = new ClassA();
//		obj.meth1();
//	}
//}



//Task 1,2,3,4
// check class Student
//package com.pack1;
//import java.util.ArrayList;
//import java.util.Iterator;
//
//public class ClassA{
//	ArrayList<Student> meth1(ArrayList<String> al1, boolean arr[], ArrayList<Integer> al2){
//		ArrayList<Student> al = new ArrayList<Student>();
//		
//		al.add(new Student("ayush","CSE",121));
//		al.add(new Student("Praful","IT",122));
//		al.add(new Student("Anshul","CSE",123));
//		// Task 1: print all the elements which are present in all in a reverse order
//		System.out.println("--------------------Task1---------------------");
//		for(int i=al1.size()-1 ; i>=0 ; i--) {
//			System.out.print(al1.get(i)+" ");
//		}
//		System.out.println();
//		// Task 2: use for each loop to print the data in arr
//		System.out.println("--------------------Task2---------------------");
//		for(boolean data:arr) {
//			System.out.println(data+" ");
//		}
//		System.out.println();
//		// Task 3 pass all the elements present in al2 into another ArrayList in a reverse order & print the new ArrayList
//		System.out.println("--------------------Task3---------------------");
//
//		ArrayList<Integer> al3 = new ArrayList<Integer>();
//		
//		for(int i=al2.size()-1 ; i>=0 ; i--) {
//			al3.add(al2.get(i));
//		}
//		
//		System.out.println(al3);
//		
//		return al;
//	}
//	public static void main(String[] args) {
//		
//		ClassA obj = new ClassA();
//		
//		ArrayList<String> input1 = new ArrayList<String>();
//		input1.add("java");
//		input1.add("AWS");
//		input1.add("Oracle");
//		
//		boolean input2[] = {true,false,true};
//		
//		ArrayList<Integer> input3 = new ArrayList<Integer>();
//		input3.add(11);
//		input3.add(22);
//		input3.add(33);
//		input3.add(44);
//		
//		ArrayList<Student> ans = obj.meth1(input1, input2, input3);
//		
//		// Task 4: print only student name and marks from the data which is returned by meth1()
//		System.out.println("--------------------Task4---------------------");
//		for(Student s: ans) {
//			System.out.println(s);
//		}
//	}
//}



// Vector

//package com.pack1;
//import java.util.Vector;
//import java.util.ArrayList;
//import java.util.Enumeration;

//public class ClassA{
//	void meth1() {
//		System.out.println("Implementing vector");
//		Vector<Object> v=new Vector<Object>();
//		
//		v.add(10); //Insetion order is maintained
//		v.add("java"); //Heterogenous data is allowed
//		v.add(null); //null value is allowed
//		v.add(10); //Deuplicates are allowed
//		v.add('A'); //It is available from java 1.0v[it is a legacy class]
//		v.add(false); //Its default capacity is 10
//		v.add(66); //Its size increase by DOUBLE
//		v.add(2); //It is dynchronized by default
//		
//		
//		System.out.println(v);
//		
//		System.out.println("\nsize() : "+v.size());
//		System.out.println("capacity() : "+v.capacity());
//		
//		v.add(100);
//		v.add(200);
//		v.add(300);
//		
//		System.out.println("\nsize() : "+v.size());
//		System.out.println("capacity() : "+v.capacity());
//		
//		System.out.println("\nReteriving the data by using Enumeration Interface");
//		Enumeration<Object> e=v.elements();
//		while(e.hasMoreElements()) {
//			System.out.println(e.nextElement()+" ");
//		}
//		
        // Note: Every collection class object can be passed as a parameter for other collection class constructor
//		System.out.println("\n\nVector : "+v);
//		System.out.println("ArrayList :"+new ArrayList<Object>(v));
//	}
//	public static void main(String[] args) {
//		ClassA obj = new ClassA();
//		obj.meth1();
//	}
//}




//Task-> vactorList
//pending
//Check ClasssB
//package com.pack1;
//
//public class ClassA{
//	private String empName;
//	private int empId;
//	private String empDept;
//	
//	public ClassA(String empName, int empId, String empDept) {
//		this.empName = empName;
//		this.empId = empId;
//		this.empDept = empDept;
//	}
//	@Override
//	public String toString() {
//		
//	}
//}


//27/6/25
//LinkedList -> construction time is more to create, but manipulating is easy
//package com.pack1;
//import java.util.ArrayList;
//import java.util.LinkedList; 
//import java.util.Iterator;
//import java.util.ListIterator;
//import java.util.Vector;
//public class ClassA{
//	void meth1() {
//		System.out.println("Implementing Linkedlist");
//		LinkedList<Object> ll = new LinkedList<Object>();
//		ll.add(10); //Insertion order is maintained
//		ll.add("Java"); //Hetrogenous data is allowed
//		ll.add(null); //null value is allowed
//		ll.add(10); // duplicates are allowed
//		ll.add('A'); // It is available from Java 1.2v(Elements will be strored in the from of nodes)
//		ll.add(true); //Its default capacity is 0
//		ll.add(14); //it size increase by double
//		ll.add(88); //it is not synchronized
//		
//		
//		System.out.println(ll);
//		System.out.println("\nsize() : "+ll.size());
//		System.out.println("get() : "+ll.get(0));
//		
//		System.out.println("\nreteriving by using Iterator");
//		Iterator<Object> i = ll.iterator();
//		while(i.hasNext()) {
//			System.out.print(i.next()+" ");
//		}
//		System.out.println();
//		System.out.println("\nreteriving by using listIterator in original order");
//		ListIterator<Object> li = ll.listIterator();
//		while(li.hasNext()) {
//			System.out.print(li.next()+" ");
//		}
//		System.out.println();
//		System.out.println("\nreteriving by using listIterator in reverse Order");
//		ListIterator<Object> li2 = ll.listIterator(ll.size());  // for making it reverse we need to use "ll.size()" in constructor parameter
//		while(li2.hasPrevious()) {  // previous will see is there any element before the present element
//			System.out.print(li2.previous()+" ");
//		}
//
//		System.out.println();
//		System.out.println("\n LinkedList : "+ ll );
//		System.out.println("\n ArrayList : "+ new ArrayList<Object>(ll) );
//		System.out.println("\n Vector : "+ new Vector<Object>(ll) );
//
//	}
//	public static void main(String[] args) {
//		ClassA obj = new ClassA();
//		obj.meth1();
//	}
//}


//->check LinkedList_Time class for speed comparison of linkedList and arrayList

//sets -> HashSet and LinkedHashSet
//package com.pack1;
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.LinkedHashSet;
//import java.util.ArrayList;
//import java.util.ListIterator;
//
//public class ClassA{
//	void meth1() {
//		System.out.println("Implementing Set Interface");
//		//HashSet<Object> set = new HashSet<Object>(); //Insertion order is not maintained and comes in java 1.2v
//		LinkedHashSet<Object> set = new LinkedHashSet<Object>(); //Insetion order is maintained(java 1.4v)
//		set.add(10);  
//		set.add("java"); // heterogenous data is
//		set.add("null"); // null value is
//		set.add(10); //duplicates are not allowed
//		set.add('A'); 
//		set.add(false); //its default capacity is 16(LOAD FACTOR:0.75)
//		set.add(11); //size increase by double
//		set.add(5); //It is not synchronized
//
//		System.out.println(set);
//		System.out.println("\nsize() : "+set.size());
//		//System.out.println("get() : "+set.get(0)); //There are no index positions for set Implemented Classes
//		//NOTE: we will not be able to retrive the data from all set implemented classes by using for loop becaause it has no index value , it has hashcode
//		
//		System.out.println("Reteriving the data by using for_each loop");
//		for(Object data:set) {
//			System.out.print(data+" ");
//		}
//		
//		System.out.println("\nRetering the data by using Itertor Interface");
//		Iterator<Object> i = set.iterator();
//		while(i.hasNext()) {
//			System.out.print(i.next()+" ");
//		}
//		
//		System.out.println();
//		//listIterator directly not worked on it because as name suggest it is for list not others container
//		System.out.println("\nReteriving the data using ListItertor Interface");
//		ArrayList<Object> al = new ArrayList<Object>(set);
//		ListIterator<Object> li = al.listIterator(al.size());
//		while(li.hasPrevious()) {
//			System.out.println(li.previous()+" ");
//		}
//		
//		//checking inserting the arraylist data (duplicate) inside the HashSet(
//		ArrayList<String> al2 = new ArrayList<String>();
//		al2.add("Java");
//		al2.add("Java");
//		al2.add("Java");
//		
//		HashSet<String> set2 = new HashSet<String>(al2);
//		System.out.println("\n\nal2 size is : "+al2.size()+"==>"+al2);
//		System.out.println("set2 size is : "+set2.size()+"==>"+set2);
//		
//		
//	}
//	public static void main(String[] args) {
//		new ClassA().meth1();
//	}
//}

// pass user defined object and reterived it back in collections-> pending

//28/6/25
//package com.pack1;
//
//import java.util.TreeSet; // TreeSet use balance binary search alogrithm for sorting the data
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.ListIterator;
//public class ClassA{
//	void meth1() {
//		System.out.println("implementing TreeSet");
//		
//		TreeSet<Object> ts = new TreeSet<Object>();
//		ts.add(10); //Insertion order is NOT maintianed, BUT sorting oder is maintainer(Ascending)
//		ts.add(6); //Heterogenous data is not allowed
//		//ts.add(null); //Null value is not allowed
//		ts.add(10); //Duplicated are not allowed
//		ts.add(25); //It is available from java 1.2v
//		ts.add(9); //Its default capacity is 0
//		ts.add(1); //Its size increase by double
//		ts.add(99); //It is NOT synchronized
//		
//		System.out.println(ts);
//		
//		System.out.println("\nReteriving the data in ascending order");
//		for(Object o:ts) {
//			System.out.println(o+" ");
//		}
//	
//		
//		//for reteriving the data, we know that there is no index in the case of set so we can't use for loop
//		System.out.println("\n\nReteriving the data in descending order");
//		ArrayList<Object> al = new ArrayList<Object>(ts);
//		ListIterator<Object> li = al.listIterator(al.size());
//		while(li.hasPrevious()) {
//			System.out.println(li.previous()+" ");
//		}
//		
//		//descendingIterator() is only available for TreeSet
//		Iterator<Object> i = i.descendingIterator();
//		while(i.hasNext()) {
//			System.out.println(i.next()+" ");
//		}
//		
//
//		// headSet(x) -> return type for this is Set, and all the elements which are less than specified element(x) will be reterived
//		System.out.println("\n\nheadSet() : "+ts.headSet(10)); 
//		//tailSet(x) -> return along with the "x" and rest of element will be reterived
//		System.out.println("\n\ntailSet() : "+ts.tailSet(10)); 
//	
//	}
//	public static void main(String[] args) {
//		new ClassA().meth1();
//	}
//	
//}



//-> for using offer method in LinekedList the object and reference  
//package com.pack1;
//import java.util.LinkedList;
//import java.util.List;
//
//public class ClassA{
//	void meth1() {
//		System.out.println("Implementing Queue Interface");
//		
//		List<Object> li = new LinkedList<Object>();
//		
//		li.add(10);
//		//li.offer(20); //C.E beacuse offer() is available in QUEUE interface
//		
//		LinkedList<Object> ll = new LinkedList<Object>();
//		ll.add(10);
//		ll.offer(20);
//	}
//	public static void main(String[] args) {
//		new ClassA.meth1();
//	}
//}


//PriorityQueue
//package com.pack1;
//import java.util.Iterator;
//import java.util.PriorityQueue;
//public class ClassA{
//	void meth1(){
//		System.out.println("Implementing PriorityQueue");
//		PriorityQueue<Object> pq = new PriorityQueue<Object>();
//		pq.offer(10); //Insertion order is not maintained, but first element is smallest
//		pq.offer(0); // heterogenous data is not allowed
//		//pq.offer(null); // null value si not allowed
//		pq.offer(25); //duplicate value is not allowed
//		pq.offer(98); // available from java 1.5v
//		pq.offer(76); //default capacity is 11
//		pq.offer(100); //size increase by double
//		pq.offer(85); //It's not synchronized
//		pq.add(2); 
//				
//		System.out.println(pq);
//		System.out.println("peek() : "+pq.peek());
//		System.out.println(pq);
//
//		System.out.println("poll() : "+pq.poll());
//		System.out.println(pq);
//
//		System.out.println("remove() : "+pq.remove());
//		System.out.println(pq);
//
//		pq.clear();
//		System.out.println("poll() : "+pq.poll());
//		//System.out.println("remove() : "+pq.remove());
//		
//		Iterator<Object> i = pq.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next()+" ");
//		}
//	}
//	public static void main(String[] args) {
//		new ClassA().meth1();
//	}
//}



//30/6/25
//MAP -> HashMap,LinkedHashMap,TreeMap, 

//package com.pack1;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Hashtable;
//import java.util.Iterator;
//import java.util.LinkedHashMap;
//import java.util.LinkedList;
//import java.util.ListIterator;
//import java.util.Map.Entry;
//import java.util.TreeMap;
//public class ClassA{
//	void meth1() { 
//		System.out.println("Implementing HashMap and LinkedHashMap\n");
//		
//		//HashMap<Object,Object> map = new HashMap<Object, Object>(); //Insertion order is NOT maintained(Java 1.2v)
//		LinkedHashMap<Object,Object> map = new LinkedHashMap<Object,Object>(); //Insertion order is maintained(Java 1.4v)
//		map.put(101, "java"); 
//		map.put("java", "java"); // Heterogenous key & heterogenous values are allowed
//		map.put(null, null); //null key and null values are Allowed
//		map.put(104, 1000); // duplicate values are allowed 
//		map.put('A', "Oracle"); //it is available from java 1.2v
//		map.put(105, 2000); //default capacity is 16
//		map.put(true, "HTML"); // size increase by double
//		map.put(107, "Spring"); // it is NOT synchonized
//		
//		System.out.println(map);
//		
//		System.out.println("\nget() : "+ map.get(104)); // for getting the values we use get() with key
//		
//		System.out.println("\nReteriving the data using for-each loop");
//		//For reterving the data from map we need to use different containers, because as we know map has 2 object that is
//        //key and value any we can't simply get both at same time in for-each loop
//		HashSet<Object> hs = new HashSet<Object>(map.keySet()); //keySet() is used for getting only key from map
//		for(Object key:hs) {
//			System.out.println(key+" => "+map.get(key));
//		}
//		
//		System.out.println("\nReteriving the data by using Entry Interface"); // we can use any container here
//		ArrayList<Object> al = new ArrayList<Object>(map.entrySet()); //entrySet() is used for taking each key-value pair
//		Iterator<Object> i=al.iterator();
//		while(i.hasNext()) {
//			//System.out.println(i.next()); // it will print key=value pairs
//			Entry e = (Entry)i.next(); //for getting individual data use Entry
//			System.out.println(e.getKey()+" => "+e.getValue());
//		}	
//	}
//	void meth2() {
//		System.out.println("\nImplementing TreeMap");
//		TreeMap<Object,Object> tm = new TreeMap<Object,Object>();
//		
//		tm.put(101,"java"); //Insertion order is 
//		tm.put(106,"java"); //Heterogenous keys are NOT allowed( when we use another datatype object then it will give ClassCastException ) but heterogenous values are allowed
//		tm.put(108,null); //null key are NOT allowed but null values are allowed
//		tm.put(104,"java"); //Duplicate values are allowed only
//		tm.put(103,"Oracle");//it is available from java 1.2v
//		tm.put(105,2000); //it default capacity is 0
//		tm.put(102,"HTML"); //it size increase by 
//		tm.put(107,"Spring"); //It is NOT synchronized
//		
//		System.out.println(tm);
//		
//		System.out.println("\nReteriving the data by using Entry Interface");
//		LinkedList<Object> ll = new LinkedList<Object>(tm.entrySet());
//		ListIterator<Object> li = ll.listIterator(ll.size()); //for traversing in reverse
//		while(li.hasPrevious()) {
//			//System.out.println(li.previous());
//			Entry e =(Entry)li.previous();
//			System.out.println(e.getKey()+" "+e.getValue());
//		}
//	}
//	void meth3() {
//		System.out.println("Implementing Hashtable");
//		Hashtable<Object,Object> ht = new Hashtable<Object,Object>();
//		
//		ht.put(101,"java"); //Insertion order is NOT maintained
//		ht.put("Java","java"); //Heterogenous keys & values are allowed
//		ht.put(103,5000); //null key and null values are NOT allowed 
//		ht.put(104,"java"); //only Duplicate values are allowed 
//		ht.put('A',"Oracle");//it is available from java 1.0v[Legacy Class]
//		ht.put(105,2000); //it default capacity is 11
//		ht.put(true,"HTML"); //it size increase by 0.75 load factor
//		ht.put(107,"Spring"); //It is synchronized(only vector and Hashtable is synchronized)
//		
//		System.out.println(ht);
//		
//		//do reamaining part
//	}
//	public static void main(String[] args) {
//		ClassA obj = new ClassA();
//		//obj.meth1();
//		//obj.meth2();
//		obj.meth3();
//	}
//}


//1/7/25
//sorting
//package com.pack1;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.LinkedHashSet;
//import java.util.TreeSet;
//
//
//public class ClassA{
//	void meth1() {
//		System.out.println("Implementing sorting");
//		
//		int arr1[] = {1,3,6,2,8,4,9,5,7};
//		System.out.println("Before : "+Arrays.toString(arr1));
//		Arrays.sort(arr1); //using sort method for sorting in array
//		System.out.println("\nAfter : "+Arrays.toString(arr1));
//		
//		//parallel array sorting it is avialable in java 1.8v and it used for sort the array from a particular index to upto which index we want to sort
//		// parallel sort is only applicable for array
//		int arr2[] = {8,3,6,2,1,4,9,5,7};
//		System.out.println("\nBefore : "+Arrays.toString(arr2));
//		Arrays.parallelSort(arr2,1,4);
//		Arrays.parallelSort(arr2,5,8);
//		System.out.println("\nAfter : "+Arrays.toString(arr2));
//		
//		
//		//If we want to sort the data present in ArrayList or collection then we need to use Collections
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		al.add(10);
//		al.add(50);
//		al.add(20);
//		al.add(40);
//		al.add(30);
//		System.out.println("\nBefore : "+al);
//		Collections.sort(al);		//Collection.sort only worked for List implemented classes
//		System.out.println("After :"+al);
//		
//		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
//		lhs.add(111);
//		lhs.add(222);
//		lhs.add(333);
//		lhs.add(444);
//		lhs.add(555);
//		System.out.println("\nBefore : "+lhs);
//		//Collections.sort(lhs); //sort() will work for List implemented Classes
//		System.out.println("After : "+new TreeSet<Integer>(lhs)); //we know TreeSet is already sorted hence we use this for sort the LinkedHashSet
//	
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		aobj.meth1();
//	}
//}



//implement sorting in userdefined classes and used in collections
//check Employee Class
//package com.pack1;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Iterator;
//public class ClassA{
//	void meth1() {
//		System.out.println("Implementing sorting or Userdefined ClassObjects");
//		ArrayList<Employee> al = new ArrayList<Employee>();
//		Employee emp1 = new Employee("Kishan" ,103, "Java");
//		Employee emp2 = new Employee("Raju" ,101, "Oracle");
//		Employee emp3 = new Employee("Ahmed" ,102, "Spring");
//		
//		al.add(emp1);
//		al.add(emp2);
//		al.add(emp3);
//		
//		System.out.println("-------------Before------------");
//		Iterator<Employee> i1 = al.iterator();
//		while(i1.hasNext()) {
//			System.out.println(i1.next());
//		}
//		
//		Collections.sort(al,new ClassB());
//		System.out.println("---------------After--------------");
//		Iterator<Employee> i2 = al.iterator();
//		while(i2.hasNext()) {
//			System.out.println(i2.next());
//		}
//		
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		aobj.meth1();
//	}
//}



//2/7/25
//Java 8 Features

//Lambda expression
//check InterfaceA,interfaceB, interfacec
//package com.pack1;
//public class ClassA{
//	void display() {
//		System.out.println("Implementing Lambda Expressions\n");
//		InterfaceA x = () -> System.out.println("Hello World!\n");
//		x.meth1();
//		
//		InterfaceB y = (int a,int b)->System.out.println("Addition : "+(a+b));
//		y.meth2(5, 10);
//		
//		InterfaceC z = (int a,int b)->{
//										if(a<=10) {
//											System.out.println("If block executed");
//											return a+100;
//										}
//										else {
//											System.out.println("If block executed");
//											return b+100;
//										}
//									};
//		int result = z.meth3(5, 100);
//		System.out.println("result : "+result);
//		
//	} 
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		aobj.display();
//	}
//}


//Lambda expression
//check InterfaceA(concept 2)
//package com.pack1;
//public class ClassA{
//	void display() {
//		System.out.println("Implementing Lambda Expressions\n");
//		//InterfaceA x = (int i) -> System.out.println("value is : "+i); //1st way
//		//InterfaceA x = (i) -> System.out.println("value is : "+i); //2nd way
//		InterfaceA x = i -> System.out.println("value is : "+i); //3rd way
//		//3rd way not applicable for multiple parameters
//		x.meth1(100);
//		
//	} 
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		aobj.display();
//	}
//}


//Lambda expression
//check InterfaceA(concept 3)
//package com.pack1;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class ClassA{
//	void display() {
//		InterfaceA x = (data)->{
//			System.out.println("ArrayList : "+data);
//			return new int[] {11,22,33};
//		};
//		ArrayList<String> al2 = new ArrayList<String>();
//		al2.add("java");
//		al2.add("Spring");
//		al2.add("Oracle");
//		int result[] = x.meth1(al2);
//		System.out.println("meth1() is returning : "+Arrays.toString(result));
//		
//	} 
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		aobj.display();
//	}
//}



//method referencing , check classB ,check InterfaceA 
//package com.pack1;
//
//public class ClassA{
//	void display() {
//		//there are 3 types of method referencing, and we use method reference as an alternative of lambda expression
//		//InterfaceA x = new ClassB()::show; // static method referenceing that is :: , if we don't want to write lambda expression again so we use method referncing , NOTE: it is not calling, it is method referencing
//		//InterfaceA x = ClassB::msg; // static-method referenceing that is :: , if we don't want to write lambda expression again so we use method referncing , NOTE: it is not calling, it is method referencing
//		InterfaceA x = ClassB::new; // method referenceing that is :: , if we don't want to write lambda expression again so we use method referncing , NOTE: it is not calling, it is method referencing
//		x.meth1();
//	} 
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		aobj.display();
//	}
//}


//4/7/25
//Stream API
//package com.pack1;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class ClassA{
//	void meth1() {
//		System.out.println("Implementing forEach() in Stream API and ForEach() is a JAVA 8 Feature\n");
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		al.add(10);
//		al.add(20);
//		al.add(30);
//		al.forEach(data->System.out.println(data)); //here we use stream API, here we pass the the implementation(Lambda Expression) of consumer Interface in ForEach() and we are reducing the number of lines of code
//		//forEach is predefined method and it accept only Consumer Interface
//	}
//	void meth2() {
//		System.out.println("Implementing filter() in Stream API\n");
//		ArrayList<String> al = new ArrayList<String>();
//		al.add("pooja");
//		al.add("Athena");
//		al.add("Sujatha");
//		al.add("rani");
//		al.add("Arti");
//		
//		
//		/*	Stream<String> s1 = al.stream(); //stream() only read the input
//		Stream<String> s2 = s1.filter(data->data.length()<=5); //filter method only accept PREDICATE FUNCTIONAL INTERFACE
//		long x = s2.count(); //for counting the data
//		*/
//		System.out.println("There are "+al.stream().filter(data->data.length()<=5).count()+" objects whose length <=5");
//		
//	}
//	void meth3() {
//		System.out.println("Implementing map() in Stream API\n");
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		al.add(15);
//		al.add(16);
//		al.add(17);
//		System.out.println("Before : "+al);
//		Stream<Integer> s1 = al.stream();
//		Stream<Integer> s2 = s1.map((data)->
//		{
//			if(data%2==0)
//				return data*2;
//			return data;
//		});
//		
//		List<Integer> li = s2.collect(Collectors.toList());
//		System.out.println("After : "+li);
//	}
//	void meth4() {
//		System.out.println("Implementing sorted() in Stream API\n"); // we can also do sort with TreeSet but here we have to use Stream API
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		al.add(3);
//		al.add(1);
//		al.add(2);
//		System.out.println("Before : "+al);
//		List<Integer> li = al.stream().sorted().collect(Collectors.toList()); 
//		System.out.println("After : "+li); 
//		/* 
//		 => We can apply sort in two ways 
//		1.Collections.sort()	
//			and it works on only List
//		2.Using Stream API
//			it can work on anytype of collections but first we have to convert into List.
//		*/
//
//		}
//	public static void main(String[] args) {
//		ClassA obj = new ClassA();
//		obj.meth1();
//		obj.meth2();
//		obj.meth3();
//		obj.meth4();
//	}
//}

//Check ClassB - Optional Class

//date and time 
//package com.pack1;
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.LocalTime;
//import java.time.ZoneId;
//import java.time.ZonedDateTime;
//
//public class ClassA{
//	void meth1() {
//		for(String s:ZoneId.getAvailableZoneIds())
//			System.out.println(s);
//		System.out.println();
//		System.out.println();
//		System.out.println("====>"+ZoneId.getAvailableZoneIds().size());
//	}
//	public static void main(String[] args) {
//		System.out.println(LocalDate.now()); //here now is a static method
//		System.out.println(LocalTime.now());
//		System.out.println(LocalDateTime.now());
//		System.out.println(ZonedDateTime.now());
//		System.out.println(LocalTime.now(ZoneId.of("Jamaica")));
//		
//		new ClassA().meth1();
//	}
//}


//5/7/25
//Nested inner class
//package com.pack1;
//public class ClassA{
//	private void meth1() {
//		System.out.println("OC meth1()");
//	}
//	static{
//		System.out.println("OC static Block"); //NOTE: staic block only execute one time
//	}
//	ClassA(){
//		System.out.println("OC constructor");
//	}
//	{
//		System.out.println("OC Instance Block");
//	}
//	class InnerClassA{
//		void msg() {
//			System.out.println("IC msg()");
//			meth1();
//		}
//		InnerClassA(){
//			System.out.println("IC constructor");
//		}
//		{
//			System.out.println("IC Instance Block"); //NOTE: Instance block executed as much as times object is created and instance block execute after static -> main -> Instance block -> constructor
//		}
//	}
//	public static void main(String[] args) {
//		System.out.println("OC main()");
//		ClassA.InnerClassA iobj = new ClassA().new InnerClassA();
//		iobj.msg();
//	}
//}


//static inner Class
//package com.pack1;
//public class ClassA{
//	int x=10; //Instance Variable
//	static int y=20; //Static variable
//	private void meth1() {
//		System.out.println("OC meth1()");
//	}
//	static{
//		System.out.println("OC static Block");
//	}
//	ClassA(){
//		System.out.println("OC constructor");
//	}
//	{
//		System.out.println("OC Instance Block");
//	}
//	static class InnerClassA{
//		void msg() {
//			System.out.println("IC msg()");
//			System.out.println("OC instance variable : "+new ClassA().x);
//			System.out.println("OC static vairble : "+y);
//		}
//		InnerClassA(){
//			System.out.println("IC constructor");
//		}
//		{
//			System.out.println("IC Instance Block");
//		}
//		static {
//			System.out.println("IC static Block");
//		}
//		public static void main(String[] args) {
//			System.out.println("IC main()");
//			new InnerClassA().msg();
//		} 	
//	}
//	public static void main(String[] args) {
//		System.out.println("OC main()");
//		ClassA.InnerClassA iobj = new ClassA.InnerClassA();
//		iobj.msg();
//	}
//}



//Method Local Inner Class

//package com.pack1;
//public class ClassA{
//	void meth1() {
//		String s = "java";
//		class InnerClassA{
//			void msg1() {
//				System.out.println(s.concat(" is awesome"));
//			}
//		}
//		class InnerClassB{
//			void msg2() {
//				System.out.println(s.concat(" is amazing!"));
//			}
//		}
//		new InnerClassA().msg1();
//		new InnerClassB().msg2();
//	}
//	public static void main(String[] args) {
//		new ClassA().meth1();
//	}
//}

//anonymous inner class
/*
How it works:
1.new ClassA() { ... } creates an anonymous subclass of ClassA.
2.Inside it, you override the meth1() method.
3. When you call aobj.meth1(), the overridden version runs.
*/
//package com.pack1;
//
//public class ClassA {
//	void meth1() {
//		System.out.println("Hello World!");
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA()
//		
//		{
//			@Override
//			void meth1(){
//				System.out.println("java is awesome");
//			}
//		};
//		aobj.meth1();
//	}
//}



//Creating an object for interface -> practically it is not possible but we are using anonymous inner class and using their object
//check InterfaceA
//package com.pack1;
//public class ClassA{
//	InterfaceA meth1() {
//		System.out.println("meth1() called");
//		return new InterfaceA() { // here we are creating object with the help of anonymous inner class
//			@Override
//			public void msg1() {
//				System.out.println("This is msg1()");
//			}
//			@Override
//			public void msg2() {
//				System.out.println("This is meth2()");
//			}
//		};
//	}
//	public static void main(String[] args) {
//		ClassA aobj = new ClassA();
//		InterfaceA iobj = aobj.meth1();
//		iobj.msg1();
//		iobj.msg2();
//	}
//}



// check enum days
//package com.pack1;
//public class ClassA{
//	void meth1() {
//		System.out.println("Implementing enum");
//		
//		Days d= Days.saturday;  
//		System.out.println(d);
//		
//		switch(d) {
//		case saturday:
//			System.out.println("Today is last class for Java");
//			
//		case sunday:
//			System.out.println("Today there is no class");
//		default:
//			System.out.println("Invalid data!!");
//		}
//		
//		Days arr[] = Days.values();
//		for(Days x:arr) {
//			System.out.println(x);
//		}
//		
//	}
//	public static void main(String[] args) {
//		ClassA obj = new ClassA();
//		obj.meth1();
//	}
//}