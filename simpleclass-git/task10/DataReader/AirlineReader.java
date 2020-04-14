package by.htp.task.simpleclass.DataReader;

import java.util.Scanner;

public class AirlineReader {
	
	public String inputDestination() {
		System.out.println("введете пункт назначения/ день полета");
		
		Scanner read = new Scanner(System.in);
		String r = read.nextLine();
		return r;
	}
	
	public int inputTime() {
		System.out.println("введете время вылета");
		
		Scanner read = new Scanner(System.in);
		int r = read.nextInt();
		return r;
	}

}
