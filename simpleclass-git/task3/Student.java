package by.htp.task.simpleclass;

import java.util.Arrays;

/*
 * 3. Создайте класс с именем Student, содержащий поля:
 *  фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов).
 * Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий 
 * и номеров групп студентов, имеющих оценки, равные только 9 или 10.
 * 
 */

public class Student {
	private String surname;
	private String name;
	private int group;
	private int[] marks = new int[5];

	

	public Student(String surname, String name, int group, int[] marks) {
	
		this.surname = surname;
		this.name = name;
		this.group = group;
		this.marks = marks;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	

	public int[] getMarks() {
		
			return marks;	
	
	}

	@Override
	public String toString() {
		return "Student [surname=" + surname + ", name=" + name + ", group=" + group + ", marks="
				+ Arrays.toString(marks) + "]";
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

}
