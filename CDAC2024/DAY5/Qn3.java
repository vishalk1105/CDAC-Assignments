import java.util.*;

class Qn3{


public static void main(String args[]){

Scanner sc= new Scanner(System.in);
System.out.println("Enter number");

int n= sc.nextInt();

for(int i=0;i<n;i++){
  
for (int j=0;j<n-i-1;j++){
System.out.print(" ");
}

  
for (int j=0;j<i+1;j++){
System.out.print(i+1+" ");
}

System.out.println();
}

}
}

/*

    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5




*/