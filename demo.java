import java.util.*;
interface shape
{
void input();
void area();
void perimeter();
}
class circle implements shape
{
int r=0;
double pi=3.14;
double area=0,peri=0;
public void input()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the radius of the circle");
r=s.nextInt();
}
public void area()
{
input();
area=pi*r*r;
System.out.println("Area = "+area);
}
public void perimeter()
{
input();
peri=2*pi*r;
System.out.println("Perimeter ="+peri);
}
}
class rectangle implements shape
{
int l=0;
int b=0;
int area=0,peri=0;
public void input()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the length and breadth of the rectangle");
l=s.nextInt();
b=s.nextInt();
}
public void area()
{
input();
area=l*b;
System.out.println("Area = "+area);
}
public void perimeter()
{
input();
peri=2*(l+b);
System.out.println("Perimeter = "+peri);
}
}
class demo
{
public static void main(String arg[])
{

Scanner s=new Scanner(System.in);
circle c=new circle();
rectangle r=new rectangle();
do
{
System.out.println("************************************************");
System.out.println("1:Area of circle\n2:Perimeter of circle\n3:Area of rectangle\n4:Perimeter of rectangle\n5:Exit");
System.out.println("Enter your choice...\n");
int ch=s.nextInt();
switch(ch)
{
case 1: c.area();
break;
case 2: c.perimeter();
break;
case 3:r.area();
break;
case 4:r.perimeter();
break;
case 5:System.exit(0);
default:System.out.println("Invalid");
}
}while(true);
}
} 
