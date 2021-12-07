import java.util.*;
class armstrong
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num,temp,sum=0,rem;
        System.out.println("Enter number for checking for armstrong :");
        num=in.nextInt();
        temp=num;
         while(temp!=0)
        {
            rem=temp%10;
            sum=sum+(rem*rem*rem);
            temp=temp/10;
        }
        if(num==sum)
        {
        System.out.println("Armstrong number.");
        }
        else
        {
        System.out.println("Not Armstrong Number..");
        }
    }
}
