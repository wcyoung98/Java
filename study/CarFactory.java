package study;

public class CarFactory {
	static int serialNumber = 0;
	String model;
	String color;
	int mySerialNumber;
	
	public CarFactory(String model, String color){
		this.model = model;
		this.color = color;
		this.mySerialNumber = ++serialNumber;
	}
	public String toString(){
		return model + "(" + color + ", SerialNumber : AA031671B" + mySerialNumber + ")";
	}
}
