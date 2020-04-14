package by.htp.task.simpleclass.bean;

import java.util.ArrayList;

public class Airport {

	private String name;
	private ArrayList<Airline> AirlineInAirport = new ArrayList<Airline>();

	public Airport() {
	}

	public Airport(String name) {

		this.name = name;

	}

	public Airport(String name, ArrayList<Airline> airlineInAirport) {

		this.name = name;
		this.AirlineInAirport = airlineInAirport;
	}

	@Override
	public String toString() {
		return getClass().getName() + " [name=" + name + ", AirlineInAirport=" + AirlineInAirport + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Airline> getAirlineInAirport() {
		return AirlineInAirport;
	}

	public Airline getAirlineInAirport(int i) {
		return AirlineInAirport.get(i);
	}

	public void setAirlineInAirport(ArrayList<Airline> airlineInAirport) {
		AirlineInAirport = airlineInAirport;
	}

	public void setAirlineInAirport(Airline airline) {
		AirlineInAirport.add(airline);
	}

}
