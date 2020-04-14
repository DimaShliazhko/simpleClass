package by.htp.task.simpleclass.view;

import java.util.ArrayList;

import by.htp.task.simpleclass.bean.Book;
import by.htp.task.simpleclass.bean.Library;

public class BookView {
	
	public void printLibraryBook(Library library) {
		for (Book book : library.getLibraryBook()) {
		System.out.println(book.toString());
		}
	}
	public void printLibraryBook(ArrayList <Book> book) {
	for(Book b: book) {
		System.out.println(b);
	}	
	} 

}
