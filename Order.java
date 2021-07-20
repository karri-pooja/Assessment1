package material;

public class Order {

	public static void main(String[] args) {
		
		Laptops l1= new Laptops(50000,10,"HP",5,3);
		System.out.println(l1);
		Laptops l2= new Laptops(45000,12,"DELL",2,1);
		System.out.println(l2);
		Laptops l3= new Laptops(52000,11,"HP",6,4);
		System.out.println(l3);
		Laptops l4= new Laptops(48000,14,"Apple",5,2);
		System.out.println(l4);
		
		Accessories a1= new Accessories(5000,10,"HP",5,3);
		System.out.println(l1);
		Accessories a2= new Accessories(4500,12,"DELL",5,1);
		System.out.println(l2);
		Accessories a3= new Accessories(5200,11,"HP",4,4);
		System.out.println(l3);
		Accessories a4= new Accessories(4800,14,"Apple",3,2);
		System.out.println(l4);
	}

}
