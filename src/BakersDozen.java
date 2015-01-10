
public class BakersDozen extends BagelsOrderItem{

	
	public BakersDozen(double aPrice) {
		super(aPrice, 13);
	}
	
	public double getCost()
	{
		return super.getPrice()*12;
	}

	
}

