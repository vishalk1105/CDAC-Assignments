import java.util.Scanner;
class MultipleOf3{
public static void main(String args[]){

int n;
int size=0;
int sum=0;
Scanner num=new Scanner(System.in);
n=num.nextInt();

for(int i=0;i<n;i++){
int t= 2*(i-1);
if (t%3==0){
sum=sum+i;
}
}
System.out.println(sum);
}
}

/*

0      -2	        	
1	0	1	
2	2		
3	4		
4	6	4    =	5
5	8		
6	10		
7	12	7    =	12
8	14		
9	16		
10	18	10   =	22
11	20		
12	22		
13	24	13   =	35
14	26		


*/