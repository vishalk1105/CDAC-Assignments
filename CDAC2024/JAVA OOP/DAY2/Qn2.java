import java.util.*;

class Qn2{

static public void main(String args[]){
Scanner yr = new Scanner(System.in);
System.out.println("Enter Year");

int year= yr.nextInt();

if((year%4==0) && (year%100 !=0 || year%400==0)){
System.out.println("Leap Year");

}
else System.out.println("Not a Leap Year");
}
}