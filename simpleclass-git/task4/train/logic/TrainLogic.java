package by.htp.task.simpleclass.train.logic;

import java.util.ArrayList;

import by.htp.task.simpleclass.train.bean.TrainBeans;
import by.htp.task.simpleclass.train.dataReader.TrainDataReader;

public class TrainLogic {

	public ArrayList<TrainBeans> sortTrain(ArrayList<TrainBeans> train) {

		for (int i = train.size() - 1; i >= 0; i--) {

			for (int j = 0; j < i; j++) {

				if (train.get(j).getTrainNumder() > train.get(j + 1).getTrainNumder()) {

					TrainBeans temp;
					temp = train.get(j);

					train.set(j, train.get(j + 1));
					train.set(j + 1, temp);

				}
				// System.out.println(train.get(i));
			}
		}
		return train;
	}

	public ArrayList<TrainBeans> InputInfoTrain(ArrayList<TrainBeans> train) {
		ArrayList<TrainBeans> newTrain = new ArrayList<TrainBeans>();
		TrainDataReader reader = new TrainDataReader();

		int read = reader.read();

		for (TrainBeans tr : train) {

			if (tr.getTrainNumder() == read) {
				newTrain.add(tr);
			}
		}
		return newTrain;
	}

	public ArrayList<TrainBeans> sortTrainDestination(ArrayList<TrainBeans> train) {

		for (int i = train.size() - 1; i >= 0; i--) {

			for (int j = 0; j < i; j++) {
				// .out.println(train.get(j).getDestination());
				int tempcompare;
				tempcompare = train.get(j).getDestination().compareTo(train.get(j + 1).getDestination());
				// System.out.println(tempcompare);
				if (tempcompare >= 0) {

					TrainBeans temp;
					temp = train.get(j);

					train.set(j, train.get(j + 1));
					train.set(j + 1, temp);

				}
				/*
				 * else if (tempcompare == 0) // System.out.println(train.get(i)); { TrainBeans
				 * temp; temp = train.get(j).departureTime();;
				 * 
				 * train.set(j, train.get(j + 1)); train.set(j + 1, temp);
				 * 
				 * System.out.println("строки равны"); }
				 */
			}
		}
		sortTrainDepartureTime(train);

		return train;

	}

	ArrayList<TrainBeans> sortTrainDepartureTime(ArrayList<TrainBeans> train) {

		int countend = 0;
		int count = 0;
		for (int i = 0; i < train.size() - 1; i++) {
			int tempcompare;
			tempcompare = train.get(i).getDestination().compareTo(train.get(i + 1).getDestination());

			if (tempcompare == 0) {
				countend = i;
				count++;
			} else {
				// count = 0;
				countend = i;

				sortcount(train, count, countend);
				count = 0;

			}
		}

		return train;
	}

	ArrayList<TrainBeans> sortcount(ArrayList<TrainBeans> train, int count, int countend) {

		ArrayList<TrainBeans> newTrain = new ArrayList<TrainBeans>();
		int tempcompare;
		for (int i = countend; i >= 0; i--) {

			for (int j = countend - count; j < i; j++) {

				tempcompare = train.get(j).getDepartureTime();
				if (tempcompare > train.get(j + 1).getDepartureTime()) {
					TrainBeans temp;
					temp = train.get(j);

					train.set(j, train.get(j + 1));
					train.set(j + 1, temp);

				}
			}
		}
		return newTrain;
	}

}
