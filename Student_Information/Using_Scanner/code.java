import java.util.*;
class Student
{
    public static void main(String args[])
    {
    int roll;
    String name,university,branch;
    
    Scanner in=new Scanner(System.in);
    
    System.out.print("Enter Name :");
    name=in.next();
    
    System.out.print("Enter Roll Number :");
    roll=in.nextInt();
    
    System.out.print("Enter University Name :");
    university=in.next();
    
    System.out.print("Enter Branch :");
    branch=in.next();
    
    System.out.println("Name :"+name);
    System.out.println("Roll Number:"+roll);
    System.out.println("University:"+university);
    System.out.println("Branch:"+branch);    
    }
}
