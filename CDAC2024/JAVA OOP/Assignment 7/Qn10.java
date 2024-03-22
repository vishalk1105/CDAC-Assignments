/*

Given an array of integers, print whether the numbers are in ascending order or in descending order or in random order without sorting
 Input: [5,14,35,90,139] Output: Ascending 
 Input: [88,67,35,14,-12] Output: Descending
Input: [65,14,129,34,7] Output: Random 

*/

class Qn10{

public static void findOrder(int [] arr, int n){
boolean ascendOrder=true;
boolean descendOrder=true;

for(int i=1;i<n;i++){

if(arr[i]>arr[i-1]){
descendOrder=false;
}

if(arr[i]<arr[i-1]){
ascendOrder=false;
}
}

if(ascendOrder){
System.out.println("Ascending");
}
else if(descendOrder){
System.out.println("Descending");
}
else{
System.out.println("Random");
}



}

public static void main(String []args){
int [] arr1={5,14,35,90,139};
int [] arr2={88,67,35,14,-12};
int [] arr3={65,14,129,34,7};

findOrder(arr3, arr3.length);
}
}



