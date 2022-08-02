
public class UseComputer {
	public static void main (String[]args) {
		Cpu cp = new Cpu();
		cp.setBrand("lenovo");
		cp.setRom(20);
		
		Computer com = new Computer();
		com.setBrand("dell");
		com.setPrice(12000);
		com.setCpu(cp);
		
		System.out.println(cp.getBrand()+", "+cp.getRom());
		System.out.println(com.getBrand()+", "+com.getPrice());
	}

}
