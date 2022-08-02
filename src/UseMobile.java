
public class UseMobile {
	public static void main (String[]args) {
		Battery bat = new Battery();
		bat.setBrand("alvo");
		bat.setPrice(1300);
		bat.setCapacity(3500);
		
		Mobile mob = new Mobile();
		mob.setBrand("redmi");
		mob.setPrice(10000);
		mob.setColor("white");
		mob.setBattery(bat);
		
		System.out.println(bat.getBrand()+", "+bat.getPrice()+", "+bat.getCapacity());
		System.out.println(mob.getBrand()+", "+mob.getPrice()+", "+mob.getColor());
	}

}
