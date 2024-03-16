import java.util.Scanner;

public class Vehicle {
	private String brand;
	private float price;
	private String color;
	
	public void acceptRecord(String brand, float price, String color) {
	/*	try(Scanner sc = new Scanner(System.in)){
			System.out.print("Brand   	: ");
			brand = sc.next();
			System.out.print("Price  	: ");
			price = sc.nextFloat();
			System.out.print("Color  	: ");
			color = sc.next();
		}*/
		this.brand=brand;
		this.price=price;
		this.color=color;
	}
	public void acceptRecord(String brand, float price) {
			this.brand=brand;
			this.price=price;
			this.color="Black";
	}

	public void displayVehicle() {
	System.out.println(this.brand+" "+ this.price+" "+ this.color);
	}
		
	public static void main(String[] args) {
	Vehicle car1= new Vehicle();
	Vehicle car2= new Vehicle();
	car1.acceptRecord("BMW", 100000, "Red");
	car1.acceptRecord("Maruti", 10000);
	car1.displayVehicle();
	car2.acceptRecord("Thar",250000,"Black");
	car2.displayVehicle();
	}
}