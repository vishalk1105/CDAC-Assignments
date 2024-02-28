class Qn5{


public static void main(String args[]){
int i=5;

while(i<10){
i++;
int j=i;

if(j==0)break;
else if(j==1){
continue;}
System.out.println(i);

}

System.out.println("Finished");

}
}

/*
If number entered by user is greater than 10, it will print only "Finished".
     else if number is less than 10 it will print number+1 to 10 and then it will print "Finished"
*/