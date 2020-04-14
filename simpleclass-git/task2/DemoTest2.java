package by.htp.task.simpleclass;

public class DemoTest2 {

	public static void main(String[] args) {

		Test2 test1 = new Test2();
		Test2 test2 = new Test2(5,4);
		System.out.println(test1.getA());
		System.out.println(test1.getB());
		System.out.println(test2.getA());
		System.out.println(test2.getB());
		test1.setA(6);
		test1.setB(7);
		System.out.println(test1.getA());
		System.out.println(test1.getB());
		
		
	}

}
