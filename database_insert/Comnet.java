package database_insert;

public class Comnet {
	String name;
	int height;
	int weight;
	
	public Comnet(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	public String toString(){
		return name + "," + height + "," + weight;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
}
