//Write a code for arithmetic exception using one try block & multiple catch block & check which catch block handle that exception.

class Qn4{

public static void main(String args[]){

try{
int a= args.length;
int b=42/a;
int c[]={2};
c[12]=41;
}catch(ArithmeticException ex){
System.out.println("Divided by 0"+ex);

}catch(ArrayIndexOutOfBoundsException ex){
System.out.println("ArrayIndex Greater than length"+ex);
}



}
}