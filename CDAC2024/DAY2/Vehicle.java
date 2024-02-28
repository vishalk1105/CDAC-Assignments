class Vehicle{  

double price;
String color;
String model;


Vehicle(double p , String c, String m){
price=p;
color=c;
model=m;
}

void displayDetails(){
System.out.println("The price of the vehicle is "+ price);
System.out.println("The color of the vehicle is "+ color);
System.out.println("The model of the vehicle is "+ model);
}

public static void main(String args[]){

Vehicle v1= new Vehicle(125478.0, "Red", "BAZ6");

v1.displayDetails();

}


}