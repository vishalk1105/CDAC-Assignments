import java.math.BigDecimal;

class Average{
public static void main(String args[]){
double avg;
 
int arr[]={5,4,3,9,1,7,9};

int sum=0;
for(int i=0;i<7;i++){
sum=sum + arr[i];
}

 avg= (sum/7.0); 
System.out.println(avg);
}
}