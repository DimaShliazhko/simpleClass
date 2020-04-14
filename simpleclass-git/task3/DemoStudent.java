package by.htp.task.simpleclass;

public class DemoStudent {

	public static void main(String[] args) {
		int n;
		n = 4;
		Student[] st = new Student[n];
		st[0] = new Student("Petrov", "Petr", 1, new int[] { 4, 3, 5, 4, 5 });
		st[1] = new Student("Petrov1", "Petr2", 1, new int[] { 4, 3, 5, 4, 5 });
		st[2] = new Student("Petrov2", "Petr2", 1, new int[] { 4, 3, 5, 4, 5 });
		st[3] = new Student("Petrov2", "Petr2", 1, new int[] { 9, 10, 9, 10, 9 });
		
	}

	public static void printStudents(Student[] sts) {

		for (Student students : sts) {

			students.toString();			}
	}

	public static Student[] findALevelStudents(Student[] students) {
		Student[] aLevelStudents = new Student[students.length];

		int i = 0;
		for (Student student : students) {
			if (isAStudent(student)) {
				aLevelStudents[i] = student;
				i++;
			}
		}

		if (i == students.length) {
			return aLevelStudents;
		}

		Student[] result = new Student[i];

		for (i = 0; i < result.length; i++) {
			result[i] = aLevelStudents[i];
		}

		return result;

	}

	public static boolean isAStudent(Student st) {
		int[] marks;

		marks = st.getMarks();
		for (int mark : marks) {
			if (mark != 9 || mark != 10) {
				return false;
			}
		}
		return true;
	}

}
