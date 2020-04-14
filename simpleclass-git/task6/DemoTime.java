package by.htp.task.simpleclass;

public class DemoTime {
	public static void main(String[] args) {
		Time time = new Time(30,30,10);
		//time.setHour(44);
		
		//System.out.println(time.getHour());
		//System.out.println(time.changeHour(14));
		//System.out.println(time.getHour());
		//System.out.println(time.changeAddMin(40));
		System.out.println(time.changeAddHour(10));
	//	System.out.println(time.changeAddSec(40));
		System.out.println(time.getSec());
		System.out.println(time.getMin());
		//System.out.println(time.getHour());
	}

}
