import java.util.*;
class string
{
public static void main(String args[])
{
String str1;
String str2;
Scanner s=new Scanner(System.in);
System.out.print("Enter the first string : ");
str1=s.next();
System.out.print("Enter the second string : ");
str2=s.next();
System.out.print("first string is : ");
System.out.println(str1);
System.out.print("length of first string is : ");
System.out.println(str1.length());
System.out.print("Concatination of two strings is : ");
System.out.println(str1.concat(str2));
System.out.print("second positon character in first string: ");
System.out.println(str1.charAt(2));
System.out.print("The two strings is equal : ");
System.out.println(str1.equals(str2));
System.out.print("Replace 'a' to 'e' in first string : ");
System.out.println(str1.replace('a','e'));
System.out.print("positon of 's' in second string : ");
System.out.println(str2.lastIndexOf('s'));
}
} 
