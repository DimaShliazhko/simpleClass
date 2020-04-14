package by.htp.task.simpleclass.view;

import by.htp.task.simpleclass.bean.Airport;

public class AirlineVeiw {

	public void printAirline(Airport airport) {
		for (int i = 0; i < airport.getAirlineInAirport().size(); i++) {
			System.out.println(airport.getAirlineInAirport(i));
		}
	}

}
