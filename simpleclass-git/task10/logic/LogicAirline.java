package by.htp.task.simpleclass.logic;

import by.htp.task.simpleclass.DataReader.AirlineReader;
import by.htp.task.simpleclass.bean.Airline;
import by.htp.task.simpleclass.bean.Airport;

public class LogicAirline {

	AirlineReader reader = new AirlineReader();

	public Airport destinationFlight(Airport airport) {

		Airport newAirport = new Airport();
		String read = reader.inputDestination();
		for (int i = 0; i < airport.getAirlineInAirport().size(); i++) {
			String temp = airport.getAirlineInAirport(i).getDestination();
			if (temp.compareTo(read) == 0) {

				newAirport.setAirlineInAirport(airport.getAirlineInAirport(i));
			}
		}

		return newAirport;
	}
	
	public Airport dayFlight(Airport airport) {

		Airport newAirport = new Airport();
		String read = reader.inputDestination();
		for (int i = 0; i < airport.getAirlineInAirport().size(); i++) {
			for (int j =0 ; j < airport.getAirlineInAirport(i).getDaysWeek().size(); j++) {
			
			String temp = airport.getAirlineInAirport(i).getDaysWeek(j);
			if (temp.compareTo(read) == 0) {

				newAirport.setAirlineInAirport(airport.getAirlineInAirport(i));
			}
			}
		}

		return newAirport;
	}
	
	
	public Airport timeFlight(Airport airport) {

		Airport newAirport = new Airport();
		int read = reader.inputTime();
		for (int i = 0; i < airport.getAirlineInAirport().size(); i++) {
			
			
			int temp = airport.getAirlineInAirport(i).getDepartureTime();
			if (temp > read) {

				newAirport.setAirlineInAirport(airport.getAirlineInAirport(i));
			}
			
		}

		return newAirport;
	}
	
	

}
