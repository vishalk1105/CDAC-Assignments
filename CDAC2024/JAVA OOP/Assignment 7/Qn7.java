/*
Write a program to merge two arrays of integers by reading one number at a time from each array until  one of the array is exhausted, and then concatenating the remaining numbers.
 Input: [23,60,94,3,102] and [42,16,74]
 Output: [23,42,60,16,94,74,3,102]
*/


class Qn7{

public static void main(String args[])
{
int []arr1={ 23,60,94,3,102}; 
int []arr2={ 42,16,74};
int [] arr=new int [arr1.length + arr2.length];

int size= arr1.length<arr2.length?arr1.length:arr2.length;

for(int i=0; i<arr.length; i++){ 
if(size>i){                            
arr[i*2]=arr1[i];   
}
if(size>i) 
{
arr[(2*i)+1]=arr2[i];       
}
}

int l=size; 
for(int k=(2*size);k<arr.length;k++){                                   
if(arr1.length>size){                    
arr[k] = arr1[l];                         
}
if(arr2.length>size){       
arr[k]=arr2[l];                           
}
l=l+1;
}

for(int j=0;j<arr.length;j++){
System.out.println(arr[j]);
}
}
}