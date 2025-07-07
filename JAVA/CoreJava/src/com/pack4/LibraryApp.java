package com.pack4;

import java.util.Scanner;
public class LibraryApp extends Library{
	static Scanner sc=new Scanner(System.in);

	void menu() {
		System.out.println("--------WELCOME TO MAIN MENU--------");
		System.out.println("1. Add a book to the library.");
		System.out.println("2. Display all available books.");
		System.out.println("3. Display all borrowed books.");
		System.out.println("4. Allow a member to borrow a book.(If Avaiable)");
		System.out.println("5. Allow a member to return a book.");
		System.out.println("6. Display all members and the books they have borrowed.");
		
		System.out.println("Please enter the number to choose option:");
		int option = sc.nextInt();
		switch(option) {
		case 1:
			Library lib = new Library();
			lib.AddBook();
			break;
		case 2:
			Book b1 = new Book();
			b1.displayAvlBook();
			break;
		case 3:
			Book b2 = new Book();
			b2.displayBorrBook();
			break;
		case 4:
			Book b3 = new Book();
			b3.checkAvailBook();
			break;
		case 5:
			Book b4 = new Book();
			b4.returnBook();
			break;
		case 6:
			Member m1 = new Member();
			m1.haveBook(member_book);
			break;
		default:
			System.out.println("Invalid Input, Try Again!!");
			this.menu();
		}
	}
	public static void main(String[] args) {
		LibraryApp obj1 = new LibraryApp();
		obj1.menu();
	}
}
