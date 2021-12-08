import java.util.*;
class duckfun
{
    int check(int num)
    {
        int rem,count=0;
         while(num>0)
        {
            rem=num%10;
            if(rem==0)
            {
                count=1;
                
            }
            num=num/10;
        }
        return count;
    }
    public static void main(String args[])
    {
        duckfun obj=new duckfun();
        Scanner in=new Scanner(System.in);
        int num,count=0;
        System.out.println("Enter number to check for Duck Number :");
        num=in.nextInt();
        count=obj.check(num);
        if(count==1)
        {
            System.out.println("Duck Number.");
        }
        else
        {
            System.out.println("Not Duck Number.");
        }
    }
}
