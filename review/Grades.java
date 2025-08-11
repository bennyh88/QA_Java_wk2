package review;

import java.util.HashMap;

public class Grades {
	HashMap<Student, Integer> studentGrade = new HashMap<>();
	
	public void addStudentGrade(Student s, int grade) {
		if (studentGrade.get(s) == null && grade > 0 && grade < 100) {
			studentGrade.put(s, grade);
		}
	}
}
