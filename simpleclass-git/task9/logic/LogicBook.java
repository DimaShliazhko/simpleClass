package by.htp.task.simpleclass.logic;

import java.util.ArrayList;

import by.htp.task.simpleclass.DataReader.BookReader;
import by.htp.task.simpleclass.bean.Book;
import by.htp.task.simpleclass.bean.Library;

public class LogicBook {
	
	BookReader bookReader = new BookReader();
	public ArrayList<Book> authorBook (Library library){
		
		
		
		String author = bookReader.inputAuthor();
		ArrayList<Book> newlibraryBook = new ArrayList<Book>();
		
		for( int i= 0 ; i < library.getLibraryBook().size(); i++ ) {
			
			if (library.getLibraryBook().get(i).getAuthor().compareTo(author) == 0 ) {
				
				newlibraryBook.add(library.getLibraryBook().get(i));
			}
		}
		
		return newlibraryBook;
	}
	
public ArrayList<Book> publishingНouseBook (Library library){
		
		
		
		String publish = bookReader.inputAuthor();
		ArrayList<Book> newlibraryBook = new ArrayList<Book>();
		
		for( int i= 0 ; i < library.getLibraryBook().size(); i++ ) {
			
			if (library.getLibraryBook().get(i).getPublishHous().compareTo(publish) == 0 ) {
				
				newlibraryBook.add(library.getLibraryBook().get(i));
			}
		}
		
		return newlibraryBook;
	}

public ArrayList<Book> yearPublishBook (Library library){
	
	
	
	int year = bookReader.inputYear();
	ArrayList<Book> newlibraryBook = new ArrayList<Book>();
	
	for( int i= 0 ; i < library.getLibraryBook().size(); i++ ) {
		
		if (library.getLibraryBook().get(i).getYearPublish() > year  ) {
			
			newlibraryBook.add(library.getLibraryBook().get(i));
		}
	}
	
	return newlibraryBook;
}

}
