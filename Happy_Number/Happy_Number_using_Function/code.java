import java.util.*;
class happyfun
{
    int check(int num)
    {
        int sum=0,rem;
        do
        {
            sum=0;
            while(num!=0)
            {
            rem=num%10;
            sum=sum+(rem*rem);
            num=num/10;
            }
            num=sum;
        }while(sum>6);
        return sum;
    }
    public static void main(String args[])
    {
        happyfun obj=new happyfun();
        Scanner in=new Scanner(System.in);
        int num,sum=0;
        System.out.println("Enter number for checking for Happy Number :");
        num=in.nextInt();
        sum=obj.check(num);
        if(sum==1)
        {
        System.out.println("Happy Number.");
        }
        else
        {
        System.out.println("Not Happy Number..");
        }
    }
}
