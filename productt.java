import java.util.*;
class product
{
 int pcode;
 String pname;
 int price;
 void display()
 {
  System.out.println(pcode+":"+pname+":"+price);
 }
 void getdata()
 {
  Scanner s=new Scanner(System.in);
  System.out.println("pcode:");
  pcode=s.nextInt();
  System.out.println("pname:");
  pname=s.next();
  System.out.println("price:");
  price=s.nextInt();
 }
}
class productt
{
 public static void main(String args[])
 {
  Scanner in=new Scanner(System.in);
  product p1=new product();
  p1.getdata();
  p1.display();
  product p2=new product();
  p2.getdata();
  p2.display();
  product p3=new product();
  p3.getdata();
  p3.display();
  if((p1.price<p2.price)&&(p1.price<p3.price))
  {
   System.out.println(p1.price+"is lowest");
  }
  else if(p2.price<p3.price)
  {
   System.out.println(p2.price+"is lowest");
  }
  else
  {
   System.out.println(p3.price+"is lowest");
  }
 }
}
