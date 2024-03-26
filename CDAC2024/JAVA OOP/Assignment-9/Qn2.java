//Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.

import java.util.*;
class Qn2{

public static void main(String args[]){

Scanner sc= new Scanner(System.in);

try{
int num1=sc.nextInt();
if(num1%2!=0){
throw new ArithmeticException("Odd Value Entered");
}
}catch(ArithmeticException ex){
ex.printStackTrace();
}catch(InputMismatchException ex){
System.out.println("Invalid Input");
//ex.printStackTrace();
}finally{
sc.close();
}


}

}