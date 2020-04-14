package by.htp.task.simpleclass;

/*
 * 5. Опишите класс, реализующий десятичный счетчик, 
 * который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне.
 *  Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
 *   Счетчик имеет методы увеличения и уменьшения состояния, 
 *   и метод позволяющее получить его текущее состояние. 
 * Написать код, демонстрирующий все возможности класса.
 * 
 */

public class Counter {
	private int start;
	private int end;
	private int count;

	Counter() {
		this.start = 0;
		this.end = 100;
		this.count = 50;

	}

	Counter(int start, int end, int count) {
		this.start = start;
		this.end = end;
		this.count = count;
		if ( count > start && count > end) {
			this.count =start; 	
		}

	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int increase() {
		if (count >= start && count < end) {
			count++;
		} else {
			count = start;
		}
		return count;

	}

	public int reduce() {
		if (count > start && count <= end) {
			count--;
		} else {
			count = end;
		}
		return count;

	}
	
	
	
}
