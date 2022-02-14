package ch1;

public class TV {
	public TV() {
		
	}
	public TV(int size) {
		this.size = size;
	}
	public TV(int size, String manufacturer) {
		this.size = size;
		this.manufacturer = manufacturer;
	}
	private int size;
	private String manufacturer;
	public String getManufacturer() {
		return manufacturer;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
}
