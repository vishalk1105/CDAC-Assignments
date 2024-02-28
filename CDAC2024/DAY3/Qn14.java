import java.io.*;
import java.util.Scanner;

class Qn14{

public static void main(String args[]){
   int num;
   System.out.println("Enter the Number: ");
   Scanner s = new Scanner(System.in);
   num = s.nextInt();
int fact=1;

for(int i=1;i<=num;i++){
fact=fact*i;

}
  System.out.println("Factorial of number: " + num + " is "+ fact);
}
}