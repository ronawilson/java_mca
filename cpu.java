import java.util.*;
class cpu1
{
    int price;   
    public class Processor
    {   
     void processor()
     {
        int cores;
        String manufacturer;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number of cores:");
        cores= s.nextInt();   
        System.out.println("enter the manufacturer:");
        manufacturer = s.next();  
     	System.out.println("CORES:"+ cores + "\tMANUFACTURER: "+manufacturer);
     }
    }  
    static class RAM{  
    void ram()
    {
        int memory;
        String manufacturer;
        Scanner s = new Scanner(System.in);
   	System.out.println("\nenter the number of memory:");
        memory = s.nextInt();   
        System.out.println("\nenter the manufacturer:");
        manufacturer = s.next(); 
	System.out.println("\nMEMORY :"+ memory + "\tMANUFACTURER: "+manufacturer);
	}
    }
}
public class cpu
{
 public static void main(String args[]) 
 {     
        cpu1 c =new cpu1();
	cpu1.Processor pro=c.new Processor();
	pro.processor();
	cpu1.RAM r=new cpu1.RAM();
	r.ram();
    }
}

