package com.pack4;
import java.util.Scanner;
import java.util.Arrays;
public class Library {
	static Scanner sc = new Scanner(System.in);
	static String title[][] = new String[][] {
		{"The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", "Available",},
		{"To Kill a Mockingbird", "Harper Lee", "9780061120084", "Checked Out"},
		{"1984", "George Orwell", "9780451524935", "Available"},
		{"Pride and Prejudice", "Jane Austen", "9781503290563", "Available"},
		{"The Catcher in the Rye", "J.D. Salinger", "9780316769488", "Checked Out"},
		{"The Hobbit", "J.R.R. Tolkien", "9780547928227", "Available"},
		{"A Brief History of Time", "Stephen Hawking", "9780553380163", "Available"},
		{"The Alchemist", "Paulo Coelho", "9780061122415", "Checked Out"},
		{"The Da Vinci Code", "Dan Brown", "9780307474278", "Available"},
		{"Thinking, Fast and Slow", "Daniel Kahneman", "9780374533557", "Available"}
	};
	static String member_book[][] = new String[][] {};
	
	void AddBook() {
		System.out.println("Enter the count of book which you want to add in library");
		int n = Integer.parseInt(sc.nextLine());
		
		String temp[][] = new String[n][4];
		for(int i=0 ; i<n ;i++) {
			System.out.println("Enter the Title of Book");
			temp[i][0]=sc.nextLine();
			System.out.println("Enter the Author of Book");
			temp[i][1]=sc.nextLine();
			System.out.println("Enter the ISBN of Book");
			temp[i][2]=sc.nextLine();
			System.out.println("Enter the Availability Status: Avaiable/Checked Out");
			temp[i][3]=sc.nextLine();
		}
		
		String[][] newTitle = new String[title.length+n][4];
		
		//copy of data in new title array
		for(int i=0; i<title.length ; i++) {
			newTitle[i]=title[i];
		}
		
		//copy of new books data in the array
		for(int i=title.length,j=0;i<newTitle.length;i++,j++) {
			newTitle[i]=temp[j];
		}
		
		//reassign to original array
		title=newTitle;
		
		
		//System.out.println(Arrays.deepToString(title)); //for multi dimensional array
		
	}
	
}
