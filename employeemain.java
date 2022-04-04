import java.util.*;
class emp
{
	 int eno;
	 String ename;
	 float esalary;
	 emp(int no,String n,float s)
	 {
		this.eno=no;
		this.ename=n;
		this.esalary=s; 
	 }
	 void eprint()
	 {
	  System.out.println("ENO:"+this.eno+"\nNAME:"+this.ename+"\nSALARY:"+this.esalary);
	 } 
}	 
class employeemain
{
	 public static void main(String args[])
	 {
	 	Scanner s=new Scanner(System.in);
 	    int f=0;
	 	System.out.println("Enter the number :");
	 	int n=s.nextInt();
	 	emp e[]=new emp[n];
	 	int i;
	 	for(i=0;i<n;i++)
	 	 {	
	 	 	System.out.println("Enter the details of employee :");
	 	 	System.out.println("Employee no : ");
	 	  	int no=s.nextInt();
	 	  	System.out.println("Employee name : ");
	 	  	String na=s.next();
	 	  	System.out.println("Employee salary : ");
	 	  	float sa=s.nextFloat();
	 	  	e[i]=new emp(no,na,sa); 
	 	 }
		 System.out.println("Enter the employee no to be searched :");
		 int se=s.nextInt();
		 for(i=0;i<n;i++)
		  {
			   if(e[i].eno==se)
			   {
				e[i].eprint();
				f=1;
				break;	   
			   }
		  }
		  if(f==0)
		  System.out.println("NOT FOUND");
	 }   
}	  
	 


