import java.util.*;
class Person
{
   String name,gender,add;
   int age;
   Person(String n,String g,String a,int ag)
   {
      name=n;
      gender=g;
      add=a;
      age=ag;
   }
}
class Employee extends Person
{
   int empid,salary;
   String cmp,quali;
   Employee(String name,String gender,String add,int age,int e,int s,String c,String q)
   {
      super(name,gender,add,age);
      empid=e;
      salary=s;
      cmp=c;
      quali=q;
   }
}
class Teacher extends Employee
{
   String subject,dept;
   int tid;
   Teacher(String name,String gender,String add, int age,int empid,int salary,String cmp,String quali,String sub,String d,int id)
   {
      super(name,gender,add,age,empid,salary,cmp,quali);
      subject=sub;
      dept=d;
      tid=id;
   }
   void display()
   {
   System.out.println("Name       : "+name);
   System.out.println("Gender     : "+gender);
   System.out.println("Address    : "+add);
   System.out.println("Age        : "+age);
   System.out.println("Emp id     : "+empid);
   System.out.println("Salary     : "+salary);
   System.out.println("Company    : "+cmp);
   System.out.println("Qualification  : "+quali);
   System.out.println("Subject     : "+subject);
   System.out.println("Department  : "+dept);
   System.out.println("Teacher id  : "+tid);
   
   }
}
class detail
{
   public static void main(String args[])
   {
      Scanner in=new Scanner(System.in);
      System.out.println("Enter the number of employees:");
      int n=in.nextInt();
      Teacher obj[]=new Teacher[n];
      int i;
      for(i=0;i<n;i++)
      {
          System.out.println("Enter Name:");
          String name=in.next();
          System.out.println("Gender:");
          String gen=in.next();
	  System.out.println("Address:");
          String add=in.next();
	  System.out.println("Age:");
	  int ag=in.nextInt();
	  System.out.println("Empid:");
	  int id=in.nextInt();
	  System.out.println("Salary:");
	  int sal=in.nextInt();
	  System.out.println("Company name:");
	  String c=in.next();
	  System.out.println("Qualification:");
	  String q=in.next();
	  System.out.println("Subject:");
	  String sub=in.next();
	  System.out.println("Department:");
	  String d=in.next();
	  System.out.println("Teacherid:");
	  int td=in.nextInt();
          obj[i]=new Teacher(name,gen,add,ag,id,sal,c,q,sub,d,td);
       }
       for(i=0;i<n;i++)
       {
          System.out.println("DETAILS OF EMPLOYEE "+i+1+" :");  
          obj[i].display();
      }
     }
}     
