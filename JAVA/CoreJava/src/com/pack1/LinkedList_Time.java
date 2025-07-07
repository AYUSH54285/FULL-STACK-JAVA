// 27/6/25

//package com.pack1;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//
//public class LinkedList_Time {
//	private static Object arr[];
//	
//	static {
//		arr = new Object[100000];  //Instantiation means reserving the some storage in memory block,
//		for(int i=0 ; i<arr.length ; i++) {
//			arr[i] = new Object();
//		}
//	}
//	void ArrayListTime() {
//		long start;
//		long end;
//		
//		ArrayList<Object> al = new ArrayList<Object>();
//		start = System.currentTimeMillis(); // It is a static method gives the current system time in long millisec
//		for(Object obj1:arr) {
//			al.add(obj1);
//		}
//		end = System.currentTimeMillis();
//		System.out.println("ArrayList Construction TIme"+(end-start));
//	}
//	void LinkedListTime() {
//		long start,end;
//		LinkedList<Object> ll = new LinkedList<Object>();
//		start=System.currentTimeMillis();
//		for(Object obj2: arr) {
//			ll.add(obj2);
//		}
//		end=System.currentTimeMillis();
//		System.out.println("LinkedList construction TIme"+(end-start));
//	}
//	void meth1() {
//		for(Object o:arr) {
//			System.out.println(o);
//		}
//	}
//	public static void main(String[] args) {
//		LinkedList_Time it = new LinkedList_Time();
//		it.ArrayListTime();
//		it.LinkedListTime();
//		it.meth1();
//	}
//}
