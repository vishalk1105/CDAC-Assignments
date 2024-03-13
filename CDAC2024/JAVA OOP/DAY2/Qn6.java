import java.util.*;

class Qn6{

static public void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter height in meters");
float h= sc.nextFloat();
System.out.println("Enter weight in Kg");
float w= sc.nextFloat();

float BMI= w/(h*h);

if(BMI <=18.4){
System.out.println("UnderWeight");
}
else if (BMI<=24.9 && BMI>=18.5){
System.out.println("Normal");
}
else if (BMI<=39.9 && BMI>=25.0){
System.out.println("Normal");
}
else if (BMI>=40.0){
System.out.println("Obese");
}
else System.out.println("Something went wrong");

}


}