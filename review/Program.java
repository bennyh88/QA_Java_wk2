package review;

import java.util.ArrayList;

public class Program {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Course> courseList = new ArrayList<Course>();
		
		courseList.add(new Course("Maths"));
		courseList.add(new Course("Chemistry"));
		courseList.add(new Course("Physics"));
		courseList.add(new Course("Biology"));
		
		Student s1 = new Student("Tom", "Tom@QA.com", "TOMID1");
		courseList.get(0).addStudent(s1, 1);
		courseList.get(1).addStudent(s1, 1);
		courseList.get(3).addStudent(s1, 1);
		
		Student s2 = new Student("Richard", "Richard@QA.com", "RICID1");
		courseList.get(1).addStudent(s2, 9);
		courseList.get(2).addStudent(s2, 9);
		courseList.get(3).addStudent(s2, 9);
		
		Student s3 = new Student("Harry", "Harry@QA.com", "HARID1");
		courseList.get(0).addStudent(s3, 5);
		courseList.get(2).addStudent(s3, 3);
		courseList.get(3).addStudent(s3, 2);
		
		for(Course course : courseList) {
			course.printStudentList();
			System.out.println("");
		}
		
	}
	

}
