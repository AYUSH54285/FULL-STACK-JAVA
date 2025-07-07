package com.pack4;

public class Book extends Library {
	void displayAvlBook() {
		for(int i=0 ; i<title.length ; i++) {
			if(title[i][3]=="Available") {
				System.out.println(title[i][0]+" , "+title[i][1]+" , "+title[i][2]+" , "+title[i][3]);
				System.out.println();
			}
		}
	}
	void displayBorrBook() {
		for(int i=0 ; i<title.length ; i++) {
			if(title[i][3]=="Checked Out") {
				System.out.println(title[i][0]+" , "+title[i][1]+" , "+title[i][2]+" , "+title[i][3]);
				System.out.println();
			}
		}
	}
	void checkAvailBook() {
//		System.out.println("Please enter your name for borrow the book");
//		String member_name = sc.nextLine();
		System.out.println("Enter the book name which you want to get:");
		String b = sc.nextLine();
		System.out.println("Thank you for entering book name, let me check this for you in Library");
		for(int i=0 ; i< title.length ;i++) {
			if((title[i][0].equals(b))&&(title[i][3]=="Available") ) {
				System.out.println("Congratulations this book is available");
				title[i][3]="Checked Out";
	
				break;
			}
			else if((title[i][0].equals(b))&&(title[i][3]=="Checked Out")) {
				System.out.println("Sorry this book is not available, Kindly wait!!");
				break;
			}
			else {
				System.out.println("Invalid input, Please try again!");
				break;
			}
		}
	}
	void returnBook() {
		System.out.println("Enter the book name which you want to return:");
		String b = sc.nextLine();
		System.out.println("Thank you for entering book name, Please wait!!");
		for(int i=0 ; i< title.length ;) {
			if((title[i][0].equals(b))&&(title[i][3]=="Checked Out") ) {
				System.out.println("Thank you for returning this book");
				title[i][3]="Available";
				break;
			}
			else if((title[i][0].equals(b))&&(title[i][3]=="Available")) {
				System.out.println("We already got this book!");
				break;
			}
			else {
				System.out.println("Invalid input, Kindly check the name");
				break;
			}
		}
	}
	
	
}
