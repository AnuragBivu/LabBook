package com.cg.home;

import java.util.Scanner;

public class Testbook {

	public static void main(String[] args) {
		Book b= new Book();
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the book name");
		String bookName=sc.nextLine();
		System.out.println("Enter book price:");
	    String bookPrice=sc.nextLine();
	    System.out.println("Enter author name:");
	    String authorName=sc.nextLine();
	    b.setBookName(bookName);          
	    b.setBookPrice(bookPrice);
	    b.setAuthorName(authorName);
	        System.out.println("Book Details");
	        System.out.println("Book Name: "+b.getBookName());
	        System.out.println("Book price: "+b.getBookPrice());
	        System.out.println("Author name: "+b.getAuthorName());
	}

}
