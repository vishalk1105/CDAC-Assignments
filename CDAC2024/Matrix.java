

import java.util.Scanner;

public class Matrix {

  public static void main(String[] args) {
int row;
int col;

Scanner sc= new Scanner(System.in);
   System.out.println("Enter number of rows");
row =sc.nextInt();
 System.out.println("Enter number of cols");
col =sc.nextInt();
int matrix1[][]=new int[row][col];
int matrix2[][]=new int[row][col];
int matrix3[][]=new int[row][col];
 System.out.println("Enter values for Matrix1");
for(int i=0;i<row;i++){
   for(int j=0;j<col;j++){
matrix1[i][j]=sc.nextInt();
}
}

 System.out.println("Enter values for Matrix2");
for(int i=0;i<row;i++){
   for(int j=0;j<col;j++){
matrix2[i][j]=sc.nextInt();
}
}


for(int i=0;i<row;i++){
  for(int j=0;j<col;j++){
matrix3[i][j]=matrix1[i][j] + matrix2[i][j];
}
}

for(int i=0;i<row;i++){
  for(int j=0;j<col;j++){
System.out.print(matrix3[i][j]+" "); 
}
System.out.println(); 
}


  }
}