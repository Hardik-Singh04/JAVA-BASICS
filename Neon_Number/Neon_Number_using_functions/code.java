import java.util.*;
class neon
{
    int check(int num)
    {
        int sum=0,rem,square=0;
        square=num*num;
         while(square!=0)
        {
            rem=square%10;
            sum=sum+rem;
            square=square/10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        neon obj=new neon();
        Scanner in=new Scanner(System.in);
        int num,sum=0;
        System.out.println("Enter number for checking for Neon Number :");
        num=in.nextInt();
        sum=obj.check(num);
        if(num==sum)
        {
        System.out.println("Neon Number.");
        }
        else
        {
        System.out.println("Not Neon Number..");
        }
    }
}
