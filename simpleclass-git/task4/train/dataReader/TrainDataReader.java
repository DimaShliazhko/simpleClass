package by.htp.task.simpleclass.train.dataReader;

import java.util.Scanner;

import by.htp.task.simpleclass.train.bean.TrainBeans;

public class TrainDataReader {

	

	public int read() {
		System.out.println("введете номер поезда");
		
		Scanner trainNumberInput = new Scanner(System.in);
		int number = trainNumberInput.nextInt();
		return number;
	}
}
