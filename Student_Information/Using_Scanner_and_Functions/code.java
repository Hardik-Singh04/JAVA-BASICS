import java.util.*;
class Student
{
    void display(String name,int roll,String university,String branch)
    {
        System.out.println("Name :"+name);
        System.out.println("Roll Number:"+roll);
        System.out.println("University:"+university);
        System.out.println("Branch:"+branch);
    }
    public static void main(String args[])
    {
        int roll;
        String name,university,branch;
        
        Scanner in=new Scanner(System.in);
        Student ob=new Student();
        
        System.out.print("Enter Name :");
        name=in.next();
        
        System.out.print("Enter Roll Number :");
        roll=in.nextInt();
        
        System.out.print("Enter University Name :");
        university=in.next();
        
        System.out.print("Enter Branch :");
        branch=in.next();
        
        ob.display(name,roll,university,branch);
        
    }
}
