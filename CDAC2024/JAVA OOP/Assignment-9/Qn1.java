//Write a Java program that throws an arithmetic exception and catch it using a try-catch block.

import java.util.*;
import java.util.Scanner;

class Qn1{
public static void main(String args[]){
int d,a;

try{
d=0;
a=42/d;
System.out.println("This will not be Printed");

}catch(ArithmeticException ex){
System.out.println("Division by Zero");
}
}

}