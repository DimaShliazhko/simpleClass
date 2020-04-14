package by.htp.task.simpleclass.bean;

import java.util.ArrayList;

public class Library {

	private String name;

	private ArrayList<Book> libraryBook = new ArrayList<Book>();

	public Library(String name, ArrayList<Book> libraryBook) {
		this.name = name;
		this.libraryBook = libraryBook;
	}

	public Library(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Book> getLibraryBook() {
		return libraryBook;
	}

	/*
	 * public void setLibraryBook(ArrayList<Book> libraryBook) { this.libraryBook =
	 * libraryBook; }
	 */
	public void addBookToLibrary(Book book) {
		libraryBook.add(book);
	}

}
