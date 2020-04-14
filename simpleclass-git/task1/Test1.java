package by.htp.task.simpleclass;
/*
 * 1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран 
 * и методы изменения этих переменных.
 *  Добавьте метод, который находит сумму значений этих переменных,
 *  и метод, который находит наибольшее значение из этих двух переменных.
 * 
 */

public class Test1 {
	private int a;
	private int b;

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public int sum() {

		int sum = a + b;
		return sum;
	}

	public int maxab() {

		int max = Math.max(a, b);
		return max;
	}

}