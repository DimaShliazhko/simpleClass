package by.htp.task.simpleclass;

public class DemoTest1 {
	public static void main(String[] args) {
		Test1 test = new Test1();

		test.setA(5);
		test.setB(4);
		System.out.println(test.getA());
		System.out.println(test.getB());
		System.out.println(test.sum());
		System.out.println(test.maxab());

		test.setA(10);
		test.setB(15);
		System.out.println(test.getA());
		System.out.println(test.getB());
		System.out.println(test.sum());
		System.out.println(test.maxab());
	}

}
