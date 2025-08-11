package review;

import java.util.HashMap;

public class Course {
	String courseName;
	HashMap<Student, Integer> studentGrade = new HashMap<>();
	
	Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(Student s, int grade) {
		if (studentGrade.get(s) == null && grade > 0 && grade < 100) {
			studentGrade.put(s, grade);
		}
	}
	
	public void removeStudent(Student s, int grade) {
		studentGrade.remove(s);
	}
	
	public void printStudentList() {
		
		for(Student s : studentGrade.keySet()) {
			System.out.printf("%s, Course:%s, Grade:%s\n", 
						s.getDetails(), 
						this.courseName, 
						studentGrade.get(s)
					);
		}
		
		
	}
}
