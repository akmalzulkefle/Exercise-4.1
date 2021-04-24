import java.util.Scanner;

public class Asics extends Shoes {

	Scanner a = new Scanner(System.in);
	
	private String brand, type;
	private int quantity;
	private double price, totalPrice;
	
	Asics(){
		
		this.brand = "--------ASICS--------";
		System.out.println("Enter Type : ");
		this.type = a.nextLine();
		System.out.println("Enter Quantity : ");
		this.quantity = a.nextInt();
		System.out.println("Enter Price : RM");
		this.price = a.nextDouble();
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
