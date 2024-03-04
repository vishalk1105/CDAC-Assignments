class Qn6{

public static void main(String args[]){

int arr[] = {1, 2, 3, 4, 5,7};
int n=6;
for(int i=0;i<n/2;i++){
int temp=arr[n-i-1];
arr[n-i-1]=arr[i];
arr[i]=temp;
}


for(int j=0;j<n;j++){
System.out.print(arr[j]+ " ");
}

}
}

/*
 {5, 4, 3, 2, 1}
*/