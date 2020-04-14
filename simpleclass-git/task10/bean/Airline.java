package by.htp.task.simpleclass.bean;
/*
 * 
 * Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 *
 */

import java.util.ArrayList;

public class Airline {
	private String destination;
	private int flightNumber;
	private String typeAir;
	private int departureTime;
	private ArrayList<String> daysWeek;

	public Airline(String destination, int flightNumber, String typeAir, int departureTime,
			ArrayList<String> daysWeek) {
		
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.typeAir = typeAir;
		this.departureTime = departureTime;
		this.daysWeek = daysWeek;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getTypeAir() {
		return typeAir;
	}

	public void setTypeAir(String typeAir) {
		this.typeAir = typeAir;
	}

	public int getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(int departureTime) {
		this.departureTime = departureTime;
	}

	public ArrayList<String> getDaysWeek() {
		return daysWeek;
	}
	public String getDaysWeek(int i) {
		return daysWeek.get(i);
	}

	public void setDaysWeek(ArrayList<String> daysWeek) {
		this.daysWeek = daysWeek;
	}
	
	public void setDaysWeek(String daysWeek) {
		this.daysWeek.add(daysWeek) ;
	}

	@Override
	public String toString() {
		return getClass().getName()+" [destination=" + destination + ", flightNumber=" + flightNumber + ", typeAir=" + typeAir
				+ ", departureTime=" + departureTime + ", daysWeek=" + daysWeek + "]";
	}
	
	

}
