package lab08pt2;

import java.util.ArrayList;

public class Manager extends Employee {

	public Manager(String name, String jobTitle) {
		super(name, jobTitle);
		// TODO Auto-generated constructor stub
	}

	//ArrayList<Employee> employees;
	ArrayList<Employee> employees = new ArrayList<Employee>();
	
	public void addEmployee(Employee emp) {
		employees.add(emp);
	}
	
	@Override
	public String getInfo() {
		String managerInfo = super.getInfo();
		String empsInfo = "";
		for (Employee emp : employees) {
			empsInfo += emp.getInfo() + "\n";
		}
		return managerInfo + "\n" + empsInfo;
	}
}
