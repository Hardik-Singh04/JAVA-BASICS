import java.util.*;
class buzz
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num;
        System.out.println("Enter number for checking for Buzz Number :");
        num=in.nextInt();
        
        if(num%10==7 || num%7==0)
        {
        System.out.println("Buzz Number.");
        }
        else
        {
        System.out.println("Not Buzz Number..");
        }
    }
}
