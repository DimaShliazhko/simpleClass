package by.htp.task.simpleclass;

/*
 * 6. Составьте описание класса для представления времени. 
 * Предусмотрте возможности установки времени и изменения его отдельных полей
 *  (час, минута, секунда) с проверкой допустимости вводимых значений.
 *   В случае недопустимых значений полей поле устанавливается в значение 0. 
 * Создать методы изменения времени на заданное количество часов, минут и секунд.
 * 
 */

public class Time {
	
	private int sec;
	private int min;
	private int hour;

	Time(int sec, int min, int hour) {
		this.sec = sec;
		this.min = min;
		this.hour = hour;
		if (hour > 24 || hour < 0) {
			this.hour = 0;
		}
		if (min > 60 || min < 0) {
			this.min = 0;
		}
		if (sec > 3600 || sec < 0) {
			this.sec = 0;
		}

	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) {
		this.sec = sec;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int changeAddSec(int sec) {
		int s = this.hour * 3600 + this.min * 60 +this.sec+ sec;
		while (s >= 24*3600) {
			s =s - 24*3600; 
		}
		if (s < 0) {
			this.hour=0;
			this.min=0;
			this.sec=0;
			return this.sec;
		}
		
		System.out.println("s = "+s);
		this.hour = (int) s /3600;
		this.min = (int)(s -(  this.hour *3600 )) / 60; 
		
		this.sec = s - this.hour * 3600 - this.min  * 60;
		
		return this.sec;
	}
	
	public int changeAddMin(int min) {
		int s = this.hour * 3600 + this.min * 60 +this.sec+ min*60;
		while (s >= 24*3600) {
			s =s - 24*3600; 
		}
		if (s < 0) {
			this.hour=0;
			this.min=0;
			this.sec=0;
			return this.min;
		}
		
		System.out.println("s = "+s);
		this.hour = (int) s /3600;
		this.min = (int)(s -(  this.hour *3600 )) / 60; 
		
		this.sec = s - this.hour * 3600 - this.min  * 60;
		
		return this.min;
	}
	
	public int changeAddHour(int hour) {
		
		
		
		int s = this.hour * 3600 + this.min * 60 +this.sec+ hour*3600;
		while (s >= 24*3600) {
			s =s - 24*3600; 
		}
		if (s < 0) {
			this.hour=0;
			this.min=0;
			this.sec=0;
			return this.hour;
			
		}
		
		System.out.println("s = "+s);
		this.hour = (int) s /3600;
		this.min = (int)(s -(  this.hour *3600 )) / 60; 
		
		this.sec = s - this.hour * 3600 - this.min  * 60;
		
		return this.hour;
	}
	

}
