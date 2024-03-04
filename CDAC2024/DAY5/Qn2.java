import java.util.*;

class Qn2{


public static void main(String args[]){

Scanner sc= new Scanner(System.in);
System.out.println("Enter number");

int n= sc.nextInt();

for(int i=0;i<=n;i++){
 for(int j=0; j<n-i;j++){

System.out.print(n-j+" ");
}
System.out.println();
}


}
}

/*

5 4 3 2 1
5 4 3 2
5 4 3
5 4
5
*/