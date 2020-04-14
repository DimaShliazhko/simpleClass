package by.htp.task.simpleclass;

public class DemoCounter {

	public static void main(String[] args) {

		Counter counter = new Counter(50,100,70);

		System.out.println(counter.getCount());
		System.out.println(counter.increase());
		System.out.println(counter.reduce());
		
	}

}
