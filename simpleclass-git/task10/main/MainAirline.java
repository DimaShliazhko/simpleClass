package by.htp.task.simpleclass.main;

import java.util.ArrayList;

import by.htp.task.simpleclass.bean.Airline;
import by.htp.task.simpleclass.bean.Airport;
import by.htp.task.simpleclass.logic.LogicAirline;
import by.htp.task.simpleclass.view.AirlineVeiw;

public class MainAirline {
	
	public static void main(String[] args) {
		
		LogicAirline logic = new LogicAirline();
		AirlineVeiw view = new AirlineVeiw ();
		
		Airport airport= new Airport("Минск");
		
		ArrayList<String> airLine1Day = new ArrayList<String> () ;
		airLine1Day.add("понедельник");
		airLine1Day.add("среда");
		Airline airLine1 = new Airline("Москва", 1078, "боинг", 11, airLine1Day );
		
		ArrayList<String> airLine2Day = new ArrayList<String> () ;
		airLine2Day.add("вторник");
		airLine2Day.add("пятница");
		Airline airLine2 = new Airline("Москва", 1079, "боинг", 15, airLine2Day );
		
		ArrayList<String> airLine3Day = new ArrayList<String> () ;
		airLine3Day.add("понедельник");
		airLine3Day.add("воскресенье");
		Airline airLine3 = new Airline("Киев", 1079, "боинг", 17, airLine3Day );
		
		airport.setAirlineInAirport(airLine1);
		airport.setAirlineInAirport(airLine2);
		airport.setAirlineInAirport(airLine3);
		//view.printAirline(logic.destinationFlight(airport));
//		view.printAirline(logic.dayFlight(airport));
		view.printAirline(logic.timeFlight(airport));

	
		
	}

}
