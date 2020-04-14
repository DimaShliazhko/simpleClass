package by.htp.task.simpleclass.train.view;

import java.util.ArrayList;

import by.htp.task.simpleclass.train.bean.TrainBeans;
import by.htp.task.simpleclass.train.dataReader.TrainDataReader;

public class TrainView {

	public void PrintAllTrain(ArrayList <TrainBeans> tr) {
		
		for(TrainBeans train : tr) {
			System.out.println(train.getDestination()+" "+train.getTrainNumder()+" "+train.getDepartureTime());
			
		}		
	}
}
