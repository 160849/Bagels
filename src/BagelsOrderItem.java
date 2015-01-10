
public class BagelsOrderItem implements OrderItem{
	private double price;
	private int quantity;
	public BagelsOrderItem(double aPrice, int aQuantity)
	{
		price=aPrice;
		quantity=aQuantity;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	public double getCost()
	{
		return price*quantity;
	}
	
}
