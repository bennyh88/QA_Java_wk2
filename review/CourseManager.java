package review;

import java.util.HashMap;

public class CourseManager {
	HashMap<Course, Grades> courseMap = new HashMap<>();
	
	public void addCourse(String courseName) {
		courseMap.put(new Course(courseName), new Grades());
	}
	
}

