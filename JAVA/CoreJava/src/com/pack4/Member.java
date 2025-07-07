package com.pack4;

public class Member extends Library{
	void haveBook(String member_book[][]) {
		for(int i=0 ; i<member_book.length ; i++) {
			System.out.println("Book name is: "+member_book[i][0]+" and member name is "+member_book[i][1]);
		}
	}
}
