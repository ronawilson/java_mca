import java.util.*;
class matrixmain
{
 public static void main(String args[])
 {
  int row,col,r,c,i,j;
  Scanner s=new Scanner(System.in);
  System.out.println("enter the number of row1:");
  row=s.nextInt();
  System.out.println("enter the number of column1:");
  col=s.nextInt();
  System.out.println("enter the number of row2:");
  r=s.nextInt();
  System.out.println("enter the number of column2:");
  c=s.nextInt();
  int matrix1[][]=new int[row][col];
  int matrix2[][]=new int[r][c];
  int matrix3[][]=new int[row][col];
  System.out.println("enter the elements of matrix1:");
  for(i=0;i<row;i++)
  {
   for(j=0;j<col;j++)
   {
    matrix1[i][j]=s.nextInt();
   }
  }
  System.out.println("enter the elements of matrix2:");
  for(i=0;i<row;i++)
  {
   for(j=0;j<col;j++)
   {
    matrix2[i][j]=s.nextInt();
   }
  }
  if(row==r&&col==c)
  {
  for(i=0;i<row;i++)
  {
   for(j=0;j<col;j++)
   {
    matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
   }
  }
  System.out.println("sum of matrices:");
  for(i=0;i<row;i++)
  {
   for(j=0;j<col;j++)
   {
    System.out.println(matrix3[i][j]+"\t");
   }
   System.out.println();
  }
 }
 else
 {
  System.out.println("addition is not possible");
 }
}
}
    
