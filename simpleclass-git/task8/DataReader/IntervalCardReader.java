package by.htp.task.simpleclass.DataReader;

import java.util.Scanner;

public class IntervalCardReader {
	
	public int readA() {
		System.out.println("введете интервал кредитной карты");
		
		Scanner readA = new Scanner(System.in);
		int readIDa = readA.nextInt();
		return readIDa;
		
	}
	public int readB() {
		System.out.println("введете интервал кредитной карты");
		
		Scanner readB = new Scanner(System.in);
		int readIDb = readB.nextInt();
		return readIDb;
		
	}
	

}
