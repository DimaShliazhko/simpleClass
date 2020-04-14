package by.htp.task.simpleclass.main;

import java.util.ArrayList;

import by.htp.task.simpleclass.bean.Book;
import by.htp.task.simpleclass.bean.Library;
import by.htp.task.simpleclass.logic.LogicBook;
import by.htp.task.simpleclass.view.BookView;

public class MainBook {
	
	public static void main(String[] args) {
		
		BookView view = new BookView(); 
		LogicBook logic = new LogicBook(); 
		
		
		
		Library library1 = new Library("Библиотека 1");	
		Library library2 = new Library("Библиотека 2");	
		
		
		Book book1 = new Book ("Космос1", "Петров", "Москва", 2001,193 , 43, "твердый");
		Book book2 = new Book ("Космос2", "Иванов", "Москва", 2002,193 , 43, "твердый");
		Book book3 = new Book ("Космос3", "Иванов", "Москва", 2003,193 , 43, "твердый");
		Book book4 = new Book ("Космос4", "Петров", "Минск", 2004,193 , 43, "твердый");
		Book book5 = new Book ("Космос5", "Петров", "Минск", 2005,193 , 43, "твердый");
		Book book6 = new Book ("Космос6", "Иванов", "Минск", 2006,193 , 43, "твердый");
		Book book7 = new Book ("Космос7", "Петров", "Минск", 2007,193 , 43, "твердый");
		Book book8 = new Book ("Космос8", "Петров", "Москва", 2008,193 , 43, "твердый");
		library1.addBookToLibrary(book2);
		library1.addBookToLibrary(book4);
		library1.addBookToLibrary(book6);
		library2.addBookToLibrary(book1);
		library2.addBookToLibrary(book3);
		library2.addBookToLibrary(book5);
		library2.addBookToLibrary(book7);
		library2.addBookToLibrary(book8);
		
	//	view.printLibraryBook(library1);
	//	view.printLibraryBook(library2);
	//	view.printLibraryBook(logic.authorBook(library1));
		//view.printLibraryBook(logic.publishingНouseBook(library1));
		view.printLibraryBook(logic.yearPublishBook(library1));
		
		

		
	}

}
