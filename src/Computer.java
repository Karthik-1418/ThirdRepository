
public class Computer {
	private String brand;
	private int price;
	private Cpu cpu;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return this.brand;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return this.price;
	}
	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}
	public Cpu getCpu() {
		return this.cpu;
	}

}
