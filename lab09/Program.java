package lab09;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Animal> animals = new ArrayList<Animal>();
		
		animals.add(new Duck("Daffy"));
		animals.add(new Penguin("Pingu"));
		animals.add(new Fish("Flounder"));
		animals.add(new Duck("Donald"));
		
		for (Animal animal : animals) {
			System.out.println(animal.name);
			if (animal instanceof Bird b) {
				//Bird bird = (Bird) animal;
				b.makeNest();
			}
		}
		
	
	}

}
