
public class UseCar {
	public static void main (String[]args) {
		Engine engine = new Engine();
		engine.brand = "ford";
		engine.price = 12000;
		engine.enginecc = 200;
		
		Car car = new Car();
		car.brand = "ford";
		car.color = "ash";
		car.price = 2500000;
		car.engine = engine;
		
		System.out.println(car.engine.brand+", "+car.engine.price);
	}

}
