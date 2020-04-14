package by.htp.task.simpleclass.train.main;

import java.util.ArrayList;

import by.htp.task.simpleclass.train.bean.TrainBeans;
import by.htp.task.simpleclass.train.dataReader.TrainDataReader;
import by.htp.task.simpleclass.train.logic.TrainLogic;
import by.htp.task.simpleclass.train.view.TrainView;

public class TrainMain {
	public static void main(String[] args) {
		
		TrainView view = new TrainView();
		TrainLogic logic  = new TrainLogic();
		//TrainDataReader reader = new  TrainDataReader();

		
		ArrayList <TrainBeans> train = new ArrayList<TrainBeans>();
		train.add(new TrainBeans("Брест2",18,11));
		train.add(new TrainBeans("Брест2",11,12));
		train.add(new TrainBeans("Брест4",110,13));
		train.add(new TrainBeans("Брест2",15,14));
		train.add(new TrainBeans("Брест3",112,15));
		train.add(new TrainBeans("Брест4",112,10));
		train.add(new TrainBeans("Брест4",112,11));
		
		view.PrintAllTrain(train);
		System.out.println();
		view.PrintAllTrain(logic.sortTrain(train));
		//System.out.println(reader.read());
		view.PrintAllTrain(logic.InputInfoTrain(train));
		view.PrintAllTrain(logic.sortTrainDestination(train));
		
		
		view.PrintAllTrain(logic.sortTrainDestination(train));
		
		

	}

}
