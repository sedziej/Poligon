import java.util.HashMap;
import java.util.Map;

public class Basket {
	private Map<String, Item> orderedItem;
	
	Basket(){
		orderedItem = new HashMap<String, Item>();
	}
	public void addItem(String name, double price) {
		Item item = new Item(name, price);
		Item existingItem = orderedItem.get(name); 
		//objescie dla mapy, do ktorej nie da sie dodac elementu o tym samym kluczu
		if (existingItem != null) {
			//zwiekszenie wartosci licznika, jesli jest juz element w koszyku o tej samej nazwie
			existingItem.setCount(existingItem.getCount() + 1);
			orderedItem.remove(name);
			item = existingItem;
		}
		orderedItem.put(name, item);
	}
	public void removeItem(String name) {
		
		Item item = orderedItem.get(name); 
		
		if (item != null) {
			if (item.getCount() > 1) {
				item.setCount(item.getCount() - 1);
				orderedItem.remove(name);
				orderedItem.put(name, item);
			} else if (item.getCount() == 1) {
				orderedItem.remove(name);
			}
		}
	}
	public void showBasket() {
		
		int i = 0;
		for(Item item : orderedItem.values()) {
			System.out.println("[" + ++i + "] " + item.getName() + ", " + item.getPrice() + ", " + item.getCount());
		}
		
	}
	
	public double getBasketItemsValue(){
		double basketValue = 0;
		
		for(Item item : orderedItem.values()) {
			//uzwglednienie ilosci produktow o tej samej nazwie
			basketValue += item.getPrice() * (item.getCount() > 1 ? item.getCount() : 1);
		}
		return basketValue;
	}
	
	public Item getItem(String name) {
		return orderedItem.get(name);
	}
}
