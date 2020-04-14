package by.htp.task.simpleclass.DataReader;

import java.util.Scanner;

public class BookReader {
	
	public String inputAuthor() {
		System.out.println("введете автора книги (издательство)");
		
		Scanner read = new Scanner(System.in);
		String r = read.nextLine();
		return r;
	}
	public int inputYear() {
		System.out.println("введете год");
		
		Scanner read = new Scanner(System.in);
		int r = read.nextInt();
		return r;
	}

}
