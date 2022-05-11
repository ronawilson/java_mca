import java.io.IOException;
import java.util.Scanner;
class MyException extends Exception
{
 public MyException(String str)
 {
  System.out.println(str);
 }     
}  
public class signexception
{ 
 public static void main(String [] agrs) 
 throws IOException
 {
  System.out.println("Enter the number of input numbers");
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int k=0,sum=0;Integer Mynumbers[]=new Integer[n];
  while(n>0)
  { 
   try
   {
    System.out.println("Enter the numbers");
    int num=sc.nextInt();
    if(num<0) 
    throw new MyException ("Number is negative"); 
    else  
    {  
     Mynumbers[k]=num;  
     sum=sum+num;  
     k++;  
    }  
    n--;   
   }
   catch(MyException m)    
   {
    System.out.println(m);    
   }   
  }   
  System.out.println("Average is"+sum/k);  
 }
}

