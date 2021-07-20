package material;

import stock.Inventory;

public class Laptops extends Inventory {
	
	int price;
	int uniqueID;
	String company_name;
	public Laptops(int price, int uniqueID, String company_name, int lowOrderLevelQuantity,int quantity) {
		super();
		this.price = price;
		this.uniqueID = uniqueID;
		this.company_name = company_name;
		this.lowOrderLevelQuantity=lowOrderLevelQuantity;
		this.quantity=quantity;
		
		if(this.lowOrderLevelQuantity <3)
		{
			requestForMaterial();
		}
		else {
			System.out.println("your invoice is successfully generated");
		}
	}
	public void requestForMaterial () {
		System.out.println("Request for Material Generated");
	}

	@Override
	public String toString() {
		return "Laptops [price=" + price + ", uniqueID=" + uniqueID + ", company_name=" + company_name + ", quantity="
				+ quantity + ", lowOrderLevelQuantity=" + lowOrderLevelQuantity + "]";
	}

	
}
