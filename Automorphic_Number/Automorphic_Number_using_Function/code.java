import java.util.*;
class automorphicfun
{
    int check(int num)
    {
        int sq=0,last=0;
        sq=num*num;
        num=num%10;
        last=sq%10;
        if(num==last)
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
        automorphicfun obj=new automorphicfun();
        Scanner in=new Scanner(System.in);
        int num,res=0;
        System.out.println("Enter number to check for automorphic :");
        num=in.nextInt();
        res=obj.check(num);
        if(res==1)
        {
            System.out.println("Automorphic Number.");
        }
        else
        {
            System.out.println("Not Automorphic Number.");
        }
    }
}import java.util.*;
class automorphicfun
{
    int check(int num)
    {
        int sq=0,last=0;
        sq=num*num;
        num=num%10;
        last=sq%10;
        if(num==last)
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
        automorphicfun obj=new automorphicfun();
        Scanner in=new Scanner(System.in);
        int num,res=0;
        System.out.println("Enter number to check for automorphic :");
        num=in.nextInt();
        res=obj.check(num);
        if(res==1)
        {
            System.out.println("Automorphic Number.");
        }
        else
        {
            System.out.println("Not Automorphic Number.");
        }
    }
}
