import java.util.ArrayList;

public class ShoppingCart extends ArrayList<OrderItem>{

	public double totalDue()
	{
		double sum=0;
		for (int i=0; i<this.size(); i++)
		{
			sum+=this.get(i).getCost();
		}
		return sum;
		
	}
}
