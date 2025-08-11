package lab08;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car[] cars = {
				new Car("Honda"),
				new Car("Tesla"),
				new Car("Skoda"),
				new RacingCar("Mclaren", "Lando", 5),
				new RacingCar("RedBull", "Max", 6),
				new RacingCar("Lotus", "Kimi", 4),
				new RacingCar("Ferrari", "Lewis", 3)
		};
		
		processCars(cars);
		
	}
	
	public static void processCars(Car[] cars) {
		for (Car car : cars) {
			car.getToSixty();
			car.accelerate(2);
			
			if (car instanceof RacingCar) {
				RacingCar rc = (RacingCar) car;
				System.out.printf("Driver:%s\t", rc.getDriver());
			}
			
			System.out.println(car.toString());
			
		}
	}

}
