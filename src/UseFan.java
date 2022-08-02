
public class UseFan {
	public static void main (String[]args) {
		Coil coil = new Coil("avc",120,"copper");
		Fan fan = new Fan("usha",1500 ,coil);
		
		System.out.println(coil);
		System.out.println(fan);
	}

}
