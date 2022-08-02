
public class UseAirconditioner {
	public static void main (String[]args) {
		Compressor com = new Compressor();
		com.setBrand("croma");
		com.setPrice(2000);
		com.setCapacity(15);
		
		Airconditioner con = new Airconditioner();
		con.setBrand("volto");
		con.setPrice(20000);
		con.setCompressor(com);
		
		System.out.println(com.getBrand()+", "+com.getPrice());
		System.out.println(con.getBrand()+", "+con.getPrice());
	}

}
