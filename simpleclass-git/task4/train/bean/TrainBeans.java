package by.htp.task.simpleclass.train.bean;
/*
		  Создайте класс Train, содержащий поля: название пункта назначения,
		   номер поезда, время отправления. 
		
		Создайте коллекцию из пяти элементов типа Train,
		 добавьте возможность сортировки элементов коллекции 
		 по номерам поездов (вручную). 
		
		Добавьте возможность вывода информации о поезде,
		 номер которого введен пользователем. 
		
		Добавьте возможность сортировки элементов
		 коллекции по пункту назначения, причем поезда 
		 с одинаковыми пунктами назначения должны быть
		  упорядочены по времени отправления (сортировка делается вручную).

 * 
 */

public class TrainBeans {
	private String destination;
	private int trainNumder;
	private int departureTime;

	public TrainBeans() {}
	
	public TrainBeans(String destination, int trainNumder, int departureTime) {
		this.destination = destination;
		this.trainNumder = trainNumder;
		this.departureTime = departureTime;

	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getTrainNumder() {
		return trainNumder;
	}

	public void setTrainNumder(int trainNumder) {
		this.trainNumder = trainNumder;
	}

	public int getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(int departureTime) {
		this.departureTime = departureTime;
	}

}
