package review;

public class Student extends Person {
	
	String studentId;
	
	Student(String name, String email, String studentId) {
		super(name, email);
		this.studentId = studentId;
	}
	
}
