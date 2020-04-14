package by.htp.task.simpleclass;

import static java.lang.Math.pow;

import static java.lang.Math.sqrt;
/*
 * 7. Описать класс, представляющий треугольник.
 *  Предусмотреть методы для создания объектов,
 *  вычисления площади, периметра и точки пересечения медиан.
 * 
 */

public class Triangle {
	private int x1;
	private int x2;
	private int x3;
	private int y1;
	private int y2;
	private int y3;

	Triangle() {
		this.x1 = 1;
		this.x2 = 4;
		this.x3 = 4;
		this.y1 = 1;
		this.y2 = 4;
		this.y3 = 1;

	}

	Triangle(int x1, int x2, int x3, int y1, int y2, int y3) {

		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
		this.y1 = y1;
		this.y2 = y2;
		this.y3 = y3;
		rule();
		/*
		 * if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1)
		 * { System.out.println("Треугольник существует"); } else { this.side1 = 3;
		 * this.side2 = 4; this.side3 = 5;
		 * 
		 * }
		 */
	}

	public void rule(){
		if (side1() + side2() > side3() &&  side1()+side3() > side2() && side2() + side3() > side1())
		 { System.out.println("Треугольник существует");
		 } else { 
			new Triangle();
			 System.out.println("Треугольник не существует");
		 }
			
		
	}

	public double side1() {

		double side1;
		side1 = sqrt(pow((x2 - x1), 2) + pow((y2 - y1), 2));
		return side1;

	}

	public double side2() {

		double side2;
		side2 = sqrt(pow((x3 - x1), 2) + pow((y3 - y1), 2));
		return side2;

	}

	public double side3() {

		double side3;
		side3 = sqrt(pow((x3 - x2), 2) + pow((y3 - y2), 2));
		return side3;

	}

	public double findP05() {
		double side1 = side1();
		double side2 = side2();
		double side3 = side3();
		double p;
		p = (side1 + side2 + side3) * 0.5;
		return p;
	}

	public double findArea() {
		double side1 = side1();
		double side2 = side2();
		double side3 = side3();
		double s;
		double p;
		p = findP05();
		s = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));

		return s;
	}

	public double findP() {
		double side1 = side1();
		double side2 = side2();
		double side3 = side3();
		double p;
		p = side1 + side2 + side3;
		return p;
	}

	public double crossX() {
		double x = (1 / 3.0) * (this.x1 + this.x2 + this.x3);
		return x;
	}

	public double crossY() {
		double y = (1 / 3.0) * (this.y1 + this.y2 + this.y3);
		return y;
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getX3() {
		return x3;
	}

	public void setX3(int x3) {
		this.x3 = x3;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	public int getY3() {
		return y3;
	}

	public void setY3(int y3) {
		this.y3 = y3;
	}

}
