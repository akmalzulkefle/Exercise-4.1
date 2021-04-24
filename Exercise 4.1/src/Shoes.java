import java.util.Scanner;

public class Shoes {

	Scanner s = new Scanner(System.in);
	private String colour;
	private double size, weight;
	
	Shoes(){		
		
		System.out.println("Enter Colour : ");
		this.colour = s.nextLine();
		System.out.println("Enter Size : ");
		this.size = s.nextDouble();
		System.out.println("Enter Weight : ");
		this.weight = s.nextDouble();
		
	}
	
	public String getcolour(){
		return colour;
	}
	
	public double getsize() {
		return size;
	}
	
	public double getweight() {
		return weight;
	}
	
}
