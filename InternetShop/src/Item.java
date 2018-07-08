
public class Item {
	private double price;
	private String name;
	private int count;
	
	Item(String name, double price){
		this.price = price;
		this.name = name;
		this.count = 1;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setCount(int value) {
		count = value;
	}
	
	public int getCount() {
		return count;
	}
}
