import java.util.*;
class buzzfun
{
   int check(int num)
    {
        if(num%10==7 || num%7==0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public static void main(String args[])
    {
         buzzfun obj=new buzzfun();
        Scanner in=new Scanner(System.in);
        int num,res;
        System.out.println("Enter number for checking for Buzz Number :");
        num=in.nextInt();
        res=obj.check(num);
        if(res==1)
        {
        System.out.println("Buzz Number.");
        }
        else
        {
        System.out.println("Not Buzz Number..");
        }
    }
}
