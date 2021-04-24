import java.util.Scanner;

public class Puma extends Shoes {
	
	Scanner p = new Scanner(System.in);
	
	private String brand, type;
	private int quantity;
	private double price, totalPrice;
	
	Puma(){
		
		this.brand = "--------PUMA--------";
		System.out.println("Enter Type : ");
		this.type = p.nextLine();
		System.out.println("Enter Quantity : ");
		this.quantity = p.nextInt();
		System.out.println("Enter Price : RM");
		this.price = p.nextDouble();
		this.totalPrice = this.quantity * this.price;
		
	}
	
	public String getbrand() {
		return brand;
	}
	
	public String gettype() {
		return type;
	}
	
	public int getquantity() {
		return quantity;
	}
	
	public double getprice() {
		return price;
	}
	
	public double gettotalPrice() {
		return totalPrice;
	}

}
