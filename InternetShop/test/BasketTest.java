import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BasketTest {

	Basket basket = null;
	
	@Before
	public void setUp() {
		basket = new Basket();
	}
	
	@After
	public void tearDown() {
		basket = null;
	}
	
	@Test
	public void testConstructorOfBasket() {
		assertTrue(basket != null);
	}

	@Test
	public void testAddItem() {
		Item testItem = new Item("Cheap item", 1.0);
		basket.addItem(testItem.getName(), testItem.getPrice());
		assertTrue(basket.getItem(testItem.getName()) != null);
	}
	
	@Test 
	public void testAddItemsWithSameNames() {	
		String testItemName = "Cheap item";
		Item testItem1 = new Item(testItemName, 1.0);
		Item testItem2 = new Item(testItemName, 1.0);
		
		basket.addItem(testItem1.getName(), testItem1.getPrice());
		basket.addItem(testItem2.getName(), testItem2.getPrice());
		assertTrue(basket.getItem(testItemName).getCount() > 1);
	}
	@Test
	public void testRemoveItem() {
		fail("Not yet implemented");
	}

	@Test
	public void testShowBasket() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBasketItemsValue() {
		fail("Not yet implemented");
	}
	
	
}
