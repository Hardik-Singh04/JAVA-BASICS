import java.util.*;
class neon
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num,temp,sum=0,rem,square=0;;
        System.out.println("Enter number for checking for Neon Number :");
        num=in.nextInt();
        square=num*num;
         while(square!=0)
        {
            rem=square%10;
            sum=sum+rem;
            square=square/10;
        }
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
