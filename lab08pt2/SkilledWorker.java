package lab08pt2;

import java.util.ArrayList;

public class SkilledWorker extends Employee {
	
	public SkilledWorker(String name, String jobTitle) {
		super(name, jobTitle);
		// TODO Auto-generated constructor stub
	}
	
	ArrayList<String> skills = new ArrayList<String>();
	
	public void addSkill(String skill) {
		skills.add(skill);
	}
	
	
}
