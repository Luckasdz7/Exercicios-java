package Exxherança;

import java.util.Date ;

public class UsedProduct extends Product {
	private Date manufacture;
	

	public UsedProduct(String name, Double price, Date manufacture) {
		super(name, price);
		this.manufacture = manufacture;
	}

	public Date getManufacture() {
		return manufacture;
	}

	public void setManufacture(Date manufacture) {
		this.manufacture = manufacture;
	}
	
	@Override
	public String priceTag() {
		return getName() + " (used) $ " + price + " (Manufacture date: " + manufacture + ")" ;
	}
	
	

}
