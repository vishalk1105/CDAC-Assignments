import java.util.*;

class Qn1{




static public void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter Grade");
float grade = sc.nextFloat();

System.out.println(grade);
//boolean isFloat = sc.hasNextFloat();

//System.out.println(isFloat);

//if ( grade <=100.0 && isFloat){
 if(grade < 35){
System.out.println("F");
}
else if(grade < 50 )
{
System.out.println("C");
}
else if(grade < 60 )
{
System.out.println("B");
}
else if(grade < 70 )
{
System.out.println("A");
}
else if(grade < 90 )
{
System.out.println("A+");
}
else if(grade <= 100 )
{
System.out.println("O");
}
else System.out.println("Invalid Input");
}

}