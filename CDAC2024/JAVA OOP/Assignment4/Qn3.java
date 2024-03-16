
public class Employee {

	private String name;
	private int id;
	private double salary;
	private String dept;
	
	public void acceptData(String name, int id, double salary, String dept ) {
		this.name=name;
		this.id=id;
		this.salary=salary;
		this.dept=dept;	
	}
	public void acceptData(String name, int id, double salary ) {
		this.name=name;
		this.id=id;
		this.salary=salary;
		this.dept="IT";	
	}
	
	public void acceptData(String name, int id ) {
		this.name=name;
		this.id=id;
		this.salary=60000;
		this.dept="Frontend Development";	
	}
	
	public void displayData() {
		System.out.println("Hello My name is "+ this.name + " id: " + this.id + " Salary: " + salary + " Department " + this.dept);
	}
	public static void main(String[] args) {
	Employee emp1=new Employee();
	Employee emp2=new Employee();
	Employee emp3= new Employee();
	emp1.acceptData("Vishal",11,400000,"Finance");
	//emp1.acceptData("Vishal",11,50000);
    emp1.displayData();
    emp2.acceptData("Vishal",11,50000);
    emp2.displayData();
    emp3.acceptData("ABC",24);
    emp3.displayData();
	}

}
