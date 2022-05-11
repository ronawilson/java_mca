import java.util.*;
class UsernameException extends Exception
{
 public UsernameException(String msg) 
 {  
  super(msg); 
 } 
}
class PasswordException extends Exception
{    
 public PasswordException(String msg)   
 {      
  super(msg);  
 } 
}
public class check
{
 public static void main(String[] agrs)
 { 
  Scanner s=new Scanner(System.in);
  String username,password;  
  System.out.println("Enter username:"); 
  username=s.nextLine();  
  System.out.println("Enter password:");
  password=s.nextLine();
  int length=username.length();  
  try
  {
   if(length < 6)
   throw new UsernameException("Username must be graeter than 6 characters");
   else if(!password.equals("xyz"))
   throw new PasswordException("Incorrect password");
   else System.out.println("LOGIN SUCCESSFUL");
  }
  catch (UsernameException u) 
  { 
   u.printStackTrace();
  }
  catch (PasswordException p) 
  { 
   p.printStackTrace(); 
  }        
  finally         
  {        
   System.out.println("The finally statement is executed");        
  }       
 }      
}

