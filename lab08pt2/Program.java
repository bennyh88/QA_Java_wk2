package lab08pt2;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager man = new Manager("Louis", "Manager");
		
		SkilledWorker sk1 = new SkilledWorker("Peter", "Welder");
		sk1.addSkill("Welding");
		sk1.addSkill("Grinding");
		sk1.addSkill("Cutting");
		man.addEmployee(sk1); 
		
		SkilledWorker sk2 = new SkilledWorker("David", "Machinist");
		sk2.addSkill("Welding");
		sk2.addSkill("Grinding");
		sk2.addSkill("Cutting");
		man.addEmployee(sk2);

		man.addEmployee(new Employee("Gordon", "Fitter")); 
		man.addEmployee(new Employee("Jerry", "Fitter")); 
		man.addEmployee(new Employee("Luke", "Electrician"));
		
		System.out.println(man.getInfo());
	}
	

}
