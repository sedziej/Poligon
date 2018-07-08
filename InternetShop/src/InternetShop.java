
public class InternetShop {

	public static void main(String[] args) {
	
		Basket basket = new Basket();
		
		basket.addItem("Klucz 15", 2.0);
		basket.addItem("Klucz 15", 2.0);
		basket.addItem("Klucz 13", 1.9);
		basket.addItem("Poduszka", 2.9);
		showBasket(basket);
		basket.addItem("Klucz 13", 1.9);
		basket.removeItem("Klucz 15");
		showBasket(basket);
		
	}
	private static void showBasket(Basket basket) {
		System.out.println("Zawartosc koszyka:");
		basket.showBasket();
		System.out.println("Suma koszyka:" + basket.getBasketItemsValue());
	}
}
